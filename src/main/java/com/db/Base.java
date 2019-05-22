package com.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import com.agile.ws.service.collaboration.v1.jaxws.CollaborationPortType;
import com.agile.ws.service.collaboration.v1.jaxws.CollaborationService;
import com.agile.ws.service.table.v1.jaxws.TablePortType;
import com.agile.ws.service.table.v1.jaxws.TableService;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Base {
	  @FXML
	  Label label_User, label_Version;
	  @FXML
	  Button buttonExceptions;

	  private static final String VERSION = "V 1.0";
	  private static String agileServerURL, agileUsername, userFullName, agileCognizant;
	  static EnterpriseConnection connection;
	  static String sfdcOwnerId;
	  private static String password;

	  static CollaborationPortType agileCollaborationStub;
	  static TablePortType agileTableStub;

	  ConnectorConfig config;

	  public void initialize () {

	    if (sfdcLogin()) {
	      if (agileLogin()) {

	      }
	      else {
	        label_User.setText("Agile login failed");
	        label_User.getStyleClass().add("label-failure");
	      }
	    }

	    else {
	      label_User.setText("Salesforce login failed");
	      label_User.getStyleClass().add("label-failure");
	    }

	  }

	  /**
	   * Salesforce Login using SOAP interface
	   */
	  private boolean sfdcLogin() {

	    String currentDirectory = System.getProperty("user.dir");
	    final String version = VERSION;
	    final String dataFile =  currentDirectory + "/UserData.txt";
	    final String manufacturerFile = currentDirectory + "/manData.txt";
	    try {
	      FileReader fr = new FileReader(dataFile);
	      BufferedReader br = new BufferedReader(fr);
	      userFullName = br.readLine();
	      String sfdcUsername = br.readLine();
	      password = br.readLine();

	      config = new ConnectorConfig();

	      sfdcOwnerId = br.readLine();

	      config.setUsername(sfdcUsername);
	      config.setPassword(password);

	      String authEndPoint = br.readLine();
	      config.setAuthEndpoint(authEndPoint);
	      connection = new EnterpriseConnection(config);

	      agileServerURL = br.readLine();
	      if (agileServerURL.contains("dv"))
	        label_Version.setText(version + "DV");
	      else
	        label_Version.setText(version);
	      agileUsername = br.readLine();
	      agileCognizant = br.readLine();

	      label_User.setText(userFullName + " Salesforce login success");
	      label_User.getStyleClass().add("label-success");

	      br.close();
	      fr.close();

	      return true;
	    }
	    catch ( ConnectionException  | IOException ce) {
	    	ce.printStackTrace();
	      label_User.setText("Salesforce login failed");
	      label_User.getStyleClass().add("label-failure");

	      return false;
	    }

	  }

	  private boolean agileLogin () {
	    try {

	      //  Collaboration
	      String COLLABORATION_URL = agileServerURL + "/" + "Collaboration";
	      URL url = new URL(COLLABORATION_URL + "?WSDL");
	      CollaborationService collaborationLocator = new CollaborationService(url);
	      if ((agileCollaborationStub = collaborationLocator.getCollaboration()) == null)
	        return false;
	      Map<String, Object> reqContextCollaboration = ((BindingProvider) agileCollaborationStub).getRequestContext();
	      reqContextCollaboration.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
	      reqContextCollaboration.put(BindingProvider.PASSWORD_PROPERTY, password);
	      
          //  Table
          String TABLE_URL = agileServerURL + "/" + "Table";
          url = new URL(TABLE_URL + "?WSDL");
          TableService tableLocator = new TableService(url);
          if ((agileTableStub = tableLocator.getTable()) == null)
              return false;
          Map<String, Object> reqContextTable = ((BindingProvider) agileTableStub).getRequestContext();
          reqContextTable.put(BindingProvider.USERNAME_PROPERTY, agileUsername);
          reqContextTable.put(BindingProvider.PASSWORD_PROPERTY, password);
          
	    } catch (IOException ce) {
	      label_User.setText("Agile login failed");
	      label_User.getStyleClass().add("label-failure");
	    }

	    label_User.setText(userFullName + " Salesforce + Agile login success");
	    label_User.getStyleClass().add("label-success");
	    return true;
	  }

	  public void ButtonBaseQuitOnAction() {
	    Platform.exit();
	  }

	  public void ButtonExceptionsOnAction() {

	    try {
	      FXMLLoader fxmlFormLoader = new FXMLLoader(getClass().getResource("exceptions.fxml"));
	      Parent partForm = fxmlFormLoader.load();
	      Stage exceptionStage = new Stage();
	      exceptionStage.setTitle("Sales Operations Exceptions");
	      exceptionStage.setScene(new Scene(partForm, 1820, 650));
	      exceptionStage.show();
	    } catch ( IOException ex) {
	      ex.printStackTrace();
	      label_User.setText("Exceptions FormLoader failed");
	      label_User.getStyleClass().add("label-failure");
	    }
	  }
	}