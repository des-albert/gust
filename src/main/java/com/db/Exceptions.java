package com.db;

import javax.xml.ws.*;

import com.agile.ws.schema.collaboration.v1.jaxws.*;
import com.agile.ws.schema.common.v1.jaxws.AgileRowType;
import com.agile.ws.schema.common.v1.jaxws.AgileTableType;
import com.agile.ws.schema.common.v1.jaxws.ResponseStatusCode;
import com.agile.ws.schema.table.v1.jaxws.LoadTableRequestType;
import com.agile.ws.schema.table.v1.jaxws.LoadTableResponseType;
import com.agile.ws.schema.table.v1.jaxws.RequestTableType;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.sobject.Exception__c;
import com.sforce.soap.enterprise.sobject.Opportunity;
import com.sforce.soap.enterprise.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.soap.enterprise.sobject.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.Element;

import static com.db.Base.connection;
import static com.db.Base.sfdcOwnerId;
import static com.db.Base.agileCollaborationStub;
import static com.db.Base.agileTableStub;

import static com.db.Shared.*;

import static org.apache.commons.lang3.StringUtils.chop;

public class Exceptions {
  @FXML
  Label labelStatus_Message;
  @FXML
  TableView<exDisplay> tableViewExceptions;
  @FXML
  Button buttonExceptionQuit;
  @FXML
  TableColumn<exDisplay, String> columnOpp, columnName, columnDate, columnStatus, columnNumber, columnAgileId,
      columnECO_MCO, columnApprovals, columnTask, columnCodes;

  private static ObservableList<exDisplay> exData = FXCollections.observableArrayList();
  private DateTimeFormatter dtf;

  public void initialize() {
    dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    columnOpp.setCellValueFactory(new PropertyValueFactory<>("exOpp"));
    columnName.setCellValueFactory(new PropertyValueFactory<>("exName"));
    columnDate.setCellValueFactory(new PropertyValueFactory<>("exDate"));
    columnStatus.setCellValueFactory(new PropertyValueFactory<>("exStatus"));
    columnNumber.setCellValueFactory(new PropertyValueFactory<>("exNumber"));
    columnAgileId.setCellValueFactory(new PropertyValueFactory<>("exAgileId"));
    columnECO_MCO.setCellValueFactory(new PropertyValueFactory<>("exECO_MCO"));
    columnApprovals.setCellValueFactory(new PropertyValueFactory<>("exApprovals"));
    columnTask.setCellValueFactory(new PropertyValueFactory<>("exTask"));
    columnCodes.setCellValueFactory(new PropertyValueFactory<>("exCodes"));

    if (load_exceptions()) {
      labelStatus_Message.setText("Exceptions Loaded");
    }

  }

  public void ButtonExceptionQuitOnAction() {
    Stage stage = (Stage) buttonExceptionQuit.getScene().getWindow();
    stage.close();
  }

  private boolean load_exceptions() {

    exData.clear();
    tableViewExceptions.setItems(exData);

    StringBuilder exQuery = new StringBuilder("SELECT Id, Name, Agile_Opportunity_ID__c, Exception_Decision_Due__c, ");
    exQuery.append("Opportunity_Name__c, Status__c, Exception_Number__c, Quoting_Instructions__c FROM Exception__c WHERE ");
    exQuery.append("RecordTypeId = '0120b000000lBV8AAM' AND Status__c <> 'Cancelled' AND Sales_Enablement_User__c = '");
    exQuery.append(sfdcOwnerId);
    exQuery.append("' AND Id in ('");

    StringBuilder taskQuery = new StringBuilder("SELECT Id, Exception_Agile_ECO_MCO__c, Status, Subject, WhatId ");
    taskQuery.append("FROM Task WHERE (Subject LIKE '%Preliminary' OR Subject LIKE '%FA' ");
    taskQuery.append("OR Subject LIKE '%Revision%' ) AND OwnerId = '");
    taskQuery.append(sfdcOwnerId);
    taskQuery.append("' AND (Status = 'Not Started' OR Status = 'In Progress') ");

    StringBuilder oppQuery = new StringBuilder("SELECT Id, Name FROM Opportunity WHERE Id IN ('");

    try {

      HashMap<String, String> mapOpportunity = new HashMap<>();
      HashMap<String, Integer> mapTask = new HashMap<>();

      /* Exception Task Query */

      Task[] task;
      QueryResult tq = connection.query(taskQuery.toString());
      SObject[] taskRecords = tq.getRecords();

      if (tq.getSize() > 0) {
        task = new Task[taskRecords.length];
        for (int i = 0; i < taskRecords.length; i++) {
          task[i] = (Task) taskRecords[i];
          mapTask.put(task[i].getWhatId(), i);
          if (i == 0)
            exQuery.append(task[0].getWhatId());
          else {
            exQuery.append("', '");
            exQuery.append(task[i].getWhatId());
          }
        }

        exQuery.append("')");

        /* Exception Query */

        QueryResult exqr = connection.query(exQuery.toString());
        SObject[] exRecords = exqr.getRecords();
        Exception__c[] exception = new Exception__c[exRecords.length];
        for (int i = 0; i < exRecords.length; i++) {
          exception[i] = (Exception__c) exRecords[i];
          if (i == 0)
            oppQuery.append(exception[0].getOpportunity_Name__c());
          else {
            oppQuery.append("', '");
            oppQuery.append(exception[i].getOpportunity_Name__c());
          }
        }

        oppQuery.append("')");

        /* Opportunity Query */

        QueryResult iq = connection.query(oppQuery.toString());
        SObject[] oppRecords = iq.getRecords();
        Opportunity[] opportunity = new Opportunity[oppRecords.length];


        for (int i = 0; i < oppRecords.length; i++) {
          opportunity[i] = (Opportunity) oppRecords[i];
          mapOpportunity.put(opportunity[i].getId(), opportunity[i].getName());

        }

        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        for (int i = 0; i < exRecords.length; i++) {
          String changeStatus = null;
          String approvers = null;	
          int taskIndex = mapTask.get(exception[i].getId());
          String taskSubject = task[taskIndex].getSubject();
          String taskStatus = task[taskIndex].getStatus();

          String taskECOMCO = task[taskIndex].getException_Agile_ECO_MCO__c();
          if (taskSubject.contains("Preliminary")) {
        	if(taskStatus.equals("In Progress"))  
        		taskECOMCO = taskECOMCO + "\n" + getKeyStatus(getChangeStatus(taskECOMCO.substring(4), "ECO"));
            taskStatus = "Prelim " + taskStatus;
          }
          else if (taskSubject.contains("FA")) {
            if(taskStatus.equals("In Progress")) {
            	changeStatus = getChangeStatus(taskECOMCO.substring(4), "MCO");
            	taskECOMCO = taskECOMCO + "\n" + getKeyStatus(changeStatus);
            	approvers = getChangeApprovers(getKeyId(changeStatus), "MCO");
            }
            taskStatus = "FA " + taskStatus;
          }
          else {

        	if(taskStatus.equals("In Progress")) {
        		changeStatus = getChangeStatus(taskECOMCO.substring(4), "ECO");
        		taskECOMCO = taskECOMCO + "\n" + getKeyStatus(changeStatus);
        		approvers = getChangeApprovers(getKeyId(changeStatus), "ECO");
        	}
        	taskStatus = "Revision " + taskStatus;
          }
            
          String instructions = exception[i].getQuoting_Instructions__c();
          if(instructions != null) {
            instructions = instructions.replaceAll("<br>", ",");
            instructions = chop(instructions);
          }
          
          exDisplay row = new exDisplay(
              mapOpportunity.get(exception[i].getOpportunity_Name__c()),
              exception[i].getName(),
              formatter.format(exception[i].getException_Decision_Due__c().getTime()),
              exception[i].getStatus__c(),
              exception[i].getException_Number__c(),
              exception[i].getAgile_Opportunity_ID__c(),
              taskECOMCO,
              approvers,
              taskStatus,
              instructions

          );
          exData.add(row);
        }
        tableViewExceptions.refresh();


      }
    } catch (ConnectionException ce) {
      ce.printStackTrace();
    }
  
    return true;
  }
  
  private String MakeKey(String id, String status) {
      return id + '~' + status;
  }
  private String getKeyId(String a) {
      return a.substring(0, a.indexOf('~'));
  }
  private String getKeyStatus(String a)
  {
      return a.substring(a.indexOf('~') + 1);
  }
  
  /* find status of Agile PLM Change */

  private String getChangeStatus (String changeNumber, String changeType) {
      String changeStatus, objId = null;
      GetStatusRequestType getStatusRequestType = new GetStatusRequestType();
      AgileGetStatusRequestType agileGetStatusRequestType = new AgileGetStatusRequestType();

      agileGetStatusRequestType.setClassIdentifier(changeType);
      agileGetStatusRequestType.setObjectNumber(changeNumber);

      getStatusRequestType.getStatusRequest().add(agileGetStatusRequestType);
      GetStatusResponseType getStatusResponseType = agileCollaborationStub.getStatus(getStatusRequestType);
      if (getStatusResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {
          AgileGetStatusResponseType response = getStatusResponseType.getStatusResponse().get(0);
          changeStatus = response.getCurrentStatus().getStatusDisplayName();

          AgileStatusType nextDefaultStatus = response.getNextDefaultStatus();
          if (nextDefaultStatus != null) {
              AgileStatusType[] nextValidStatuses = response.getNextStatus().toArray(new AgileStatusType[0]);
              for (AgileStatusType nextStatus : nextValidStatuses)
                  changeStatus = nextStatus.getStatusDisplayName();
          }
          return MakeKey(objId, changeStatus);
      }
      labelStatus_Message.setText("Change Status Request Error");
      labelStatus_Message.getStyleClass().add("label-failure");
      return null;
  }
  
  private String getChangeApprovers (String objNumber, String change) {
      String current, approvers;
      StringBuilder appStatus = new StringBuilder();

      RequestTableType table = new RequestTableType();
      table.setClassIdentifier(change);
      table.setObjectNumber(objNumber);
      table.setTableIdentifier("Workflow");

      LoadTableRequestType loadTableRequestType = new LoadTableRequestType();
      loadTableRequestType.getTableRequest().addAll(Arrays.asList(table));
      LoadTableResponseType loadTableResponseType = agileTableStub.loadTable(loadTableRequestType);

      if(loadTableResponseType.getStatusCode().equals(ResponseStatusCode.SUCCESS)) {

          AgileTableType workflow = loadTableResponseType.getTableContents().get(0);
          try {
              AgileRowType[] rows = workflow.getRow().toArray(new AgileRowType[0]);
              for (int j = 0; j < rows.length; j++) {
                  List<Element> messages = rows[j].getAny();
                  if (messages.size() > 6) {
                      current = getMessageElementValue(messages.get(3));
                      if (current != null && current.length() > 8)
                          if (current.contains("Awaiting")) {
                              approvers = getMessageElementValue(messages.get(5));
                              appStatus.append(approvers);
                              appStatus.append("\n");
                          }
                  }
              }
          } catch (NullPointerException e) {
              labelStatus_Message.setText("Change workflow error");
              labelStatus_Message.getStyleClass().add("label-failure");
          }
          return appStatus.toString();
      }
      else
          return null;
  }
}
