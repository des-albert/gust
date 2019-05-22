package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Exception__c extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public Exception__c() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : Agile_Opportunity_ID__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Agile_Opportunity_ID__c__is_set = false;

    private java.lang.String Agile_Opportunity_ID__c;

    public java.lang.String getAgile_Opportunity_ID__c() {
      return Agile_Opportunity_ID__c;
    }

    public void setAgile_Opportunity_ID__c(java.lang.String Agile_Opportunity_ID__c) {
      this.Agile_Opportunity_ID__c = Agile_Opportunity_ID__c;
      Agile_Opportunity_ID__c__is_set = true;
    }

    protected void setAgile_Opportunity_ID__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Agile_Opportunity_ID__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAgile_Opportunity_ID__c(__typeMapper.readString(__in, _lookupTypeInfo("Agile_Opportunity_ID__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAgile_Opportunity_ID__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Agile_Opportunity_ID__c", "urn:sobject.enterprise.soap.sforce.com","Agile_Opportunity_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Agile_Opportunity_ID__c, Agile_Opportunity_ID__c__is_set);
    }

    /**
     * element : Bid_Due_Date_Opportunity__c of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private boolean Bid_Due_Date_Opportunity__c__is_set = false;

    private java.util.Calendar Bid_Due_Date_Opportunity__c;

    public java.util.Calendar getBid_Due_Date_Opportunity__c() {
      return Bid_Due_Date_Opportunity__c;
    }

    public void setBid_Due_Date_Opportunity__c(java.util.Calendar Bid_Due_Date_Opportunity__c) {
      this.Bid_Due_Date_Opportunity__c = Bid_Due_Date_Opportunity__c;
      Bid_Due_Date_Opportunity__c__is_set = true;
    }

    protected void setBid_Due_Date_Opportunity__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Bid_Due_Date_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Bid_Due_Date_Opportunity__c","http://www.w3.org/2001/XMLSchema","date",0,1,true))) {
        setBid_Due_Date_Opportunity__c((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("Bid_Due_Date_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Bid_Due_Date_Opportunity__c","http://www.w3.org/2001/XMLSchema","date",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldBid_Due_Date_Opportunity__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Bid_Due_Date_Opportunity__c", "urn:sobject.enterprise.soap.sforce.com","Bid_Due_Date_Opportunity__c","http://www.w3.org/2001/XMLSchema","date",0,1,true), Bid_Due_Date_Opportunity__c, Bid_Due_Date_Opportunity__c__is_set);
    }

    /**
     * element : Configuration_Owner__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Configuration_Owner__c__is_set = false;

    private java.lang.String Configuration_Owner__c;

    public java.lang.String getConfiguration_Owner__c() {
      return Configuration_Owner__c;
    }

    public void setConfiguration_Owner__c(java.lang.String Configuration_Owner__c) {
      this.Configuration_Owner__c = Configuration_Owner__c;
      Configuration_Owner__c__is_set = true;
    }

    protected void setConfiguration_Owner__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Configuration_Owner__c", "urn:sobject.enterprise.soap.sforce.com","Configuration_Owner__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setConfiguration_Owner__c(__typeMapper.readString(__in, _lookupTypeInfo("Configuration_Owner__c", "urn:sobject.enterprise.soap.sforce.com","Configuration_Owner__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldConfiguration_Owner__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Configuration_Owner__c", "urn:sobject.enterprise.soap.sforce.com","Configuration_Owner__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Configuration_Owner__c, Configuration_Owner__c__is_set);
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    protected void setCreatedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCreatedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CreatedDate, CreatedDate__is_set);
    }

    /**
     * element : Exception_Decision_Due__c of type {http://www.w3.org/2001/XMLSchema}date
     * java type: java.util.Calendar
     */
    private boolean Exception_Decision_Due__c__is_set = false;

    private java.util.Calendar Exception_Decision_Due__c;

    public java.util.Calendar getException_Decision_Due__c() {
      return Exception_Decision_Due__c;
    }

    public void setException_Decision_Due__c(java.util.Calendar Exception_Decision_Due__c) {
      this.Exception_Decision_Due__c = Exception_Decision_Due__c;
      Exception_Decision_Due__c__is_set = true;
    }

    protected void setException_Decision_Due__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Exception_Decision_Due__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Decision_Due__c","http://www.w3.org/2001/XMLSchema","date",0,1,true))) {
        setException_Decision_Due__c((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("Exception_Decision_Due__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Decision_Due__c","http://www.w3.org/2001/XMLSchema","date",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldException_Decision_Due__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Exception_Decision_Due__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Decision_Due__c","http://www.w3.org/2001/XMLSchema","date",0,1,true), Exception_Decision_Due__c, Exception_Decision_Due__c__is_set);
    }

    /**
     * element : Exception_Number__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Exception_Number__c__is_set = false;

    private java.lang.String Exception_Number__c;

    public java.lang.String getException_Number__c() {
      return Exception_Number__c;
    }

    public void setException_Number__c(java.lang.String Exception_Number__c) {
      this.Exception_Number__c = Exception_Number__c;
      Exception_Number__c__is_set = true;
    }

    protected void setException_Number__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Exception_Number__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setException_Number__c(__typeMapper.readString(__in, _lookupTypeInfo("Exception_Number__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldException_Number__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Exception_Number__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Exception_Number__c, Exception_Number__c__is_set);
    }

    /**
     * element : Exception_Type__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Exception_Type__c__is_set = false;

    private java.lang.String Exception_Type__c;

    public java.lang.String getException_Type__c() {
      return Exception_Type__c;
    }

    public void setException_Type__c(java.lang.String Exception_Type__c) {
      this.Exception_Type__c = Exception_Type__c;
      Exception_Type__c__is_set = true;
    }

    protected void setException_Type__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Exception_Type__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setException_Type__c(__typeMapper.readString(__in, _lookupTypeInfo("Exception_Type__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldException_Type__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Exception_Type__c", "urn:sobject.enterprise.soap.sforce.com","Exception_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Exception_Type__c, Exception_Type__c__is_set);
    }

    /**
     * element : Id of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Id__is_set = false;

    private java.lang.String Id;

    public java.lang.String getId() {
      return Id;
    }

    public void setId(java.lang.String Id) {
      this.Id = Id;
      Id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setId(__typeMapper.readString(__in, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Id", "urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",0,1,true), Id, Id__is_set);
    }

    /**
     * element : Name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Name__is_set = false;

    private java.lang.String Name;

    public java.lang.String getName() {
      return Name;
    }

    public void setName(java.lang.String Name) {
      this.Name = Name;
      Name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), Name, Name__is_set);
    }

    /**
     * element : Opportunity_Name__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Opportunity_Name__c__is_set = false;

    private java.lang.String Opportunity_Name__c;

    public java.lang.String getOpportunity_Name__c() {
      return Opportunity_Name__c;
    }

    public void setOpportunity_Name__c(java.lang.String Opportunity_Name__c) {
      this.Opportunity_Name__c = Opportunity_Name__c;
      Opportunity_Name__c__is_set = true;
    }

    protected void setOpportunity_Name__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Opportunity_Name__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setOpportunity_Name__c(__typeMapper.readString(__in, _lookupTypeInfo("Opportunity_Name__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunity_Name__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Opportunity_Name__c", "urn:sobject.enterprise.soap.sforce.com","Opportunity_Name__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Opportunity_Name__c, Opportunity_Name__c__is_set);
    }

    /**
     * element : Product_Team_Lead__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Product_Team_Lead__c__is_set = false;

    private java.lang.String Product_Team_Lead__c;

    public java.lang.String getProduct_Team_Lead__c() {
      return Product_Team_Lead__c;
    }

    public void setProduct_Team_Lead__c(java.lang.String Product_Team_Lead__c) {
      this.Product_Team_Lead__c = Product_Team_Lead__c;
      Product_Team_Lead__c__is_set = true;
    }

    protected void setProduct_Team_Lead__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Product_Team_Lead__c", "urn:sobject.enterprise.soap.sforce.com","Product_Team_Lead__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setProduct_Team_Lead__c(__typeMapper.readString(__in, _lookupTypeInfo("Product_Team_Lead__c", "urn:sobject.enterprise.soap.sforce.com","Product_Team_Lead__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProduct_Team_Lead__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Product_Team_Lead__c", "urn:sobject.enterprise.soap.sforce.com","Product_Team_Lead__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Product_Team_Lead__c, Product_Team_Lead__c__is_set);
    }

    /**
     * element : Quoting_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Quoting_Instructions__c__is_set = false;

    private java.lang.String Quoting_Instructions__c;

    public java.lang.String getQuoting_Instructions__c() {
      return Quoting_Instructions__c;
    }

    public void setQuoting_Instructions__c(java.lang.String Quoting_Instructions__c) {
      this.Quoting_Instructions__c = Quoting_Instructions__c;
      Quoting_Instructions__c__is_set = true;
    }

    protected void setQuoting_Instructions__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Quoting_Instructions__c", "urn:sobject.enterprise.soap.sforce.com","Quoting_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setQuoting_Instructions__c(__typeMapper.readString(__in, _lookupTypeInfo("Quoting_Instructions__c", "urn:sobject.enterprise.soap.sforce.com","Quoting_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQuoting_Instructions__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Quoting_Instructions__c", "urn:sobject.enterprise.soap.sforce.com","Quoting_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Quoting_Instructions__c, Quoting_Instructions__c__is_set);
    }

    /**
     * element : RecordTypeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean RecordTypeId__is_set = false;

    private java.lang.String RecordTypeId;

    public java.lang.String getRecordTypeId() {
      return RecordTypeId;
    }

    public void setRecordTypeId(java.lang.String RecordTypeId) {
      this.RecordTypeId = RecordTypeId;
      RecordTypeId__is_set = true;
    }

    protected void setRecordTypeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RecordTypeId", "urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setRecordTypeId(__typeMapper.readString(__in, _lookupTypeInfo("RecordTypeId", "urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRecordTypeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RecordTypeId", "urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true), RecordTypeId, RecordTypeId__is_set);
    }

    /**
     * element : Sales_Enablement_User__c of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean Sales_Enablement_User__c__is_set = false;

    private java.lang.String Sales_Enablement_User__c;

    public java.lang.String getSales_Enablement_User__c() {
      return Sales_Enablement_User__c;
    }

    public void setSales_Enablement_User__c(java.lang.String Sales_Enablement_User__c) {
      this.Sales_Enablement_User__c = Sales_Enablement_User__c;
      Sales_Enablement_User__c__is_set = true;
    }

    protected void setSales_Enablement_User__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Sales_Enablement_User__c", "urn:sobject.enterprise.soap.sforce.com","Sales_Enablement_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setSales_Enablement_User__c(__typeMapper.readString(__in, _lookupTypeInfo("Sales_Enablement_User__c", "urn:sobject.enterprise.soap.sforce.com","Sales_Enablement_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSales_Enablement_User__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Sales_Enablement_User__c", "urn:sobject.enterprise.soap.sforce.com","Sales_Enablement_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true), Sales_Enablement_User__c, Sales_Enablement_User__c__is_set);
    }

    /**
     * element : Status__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Status__c__is_set = false;

    private java.lang.String Status__c;

    public java.lang.String getStatus__c() {
      return Status__c;
    }

    public void setStatus__c(java.lang.String Status__c) {
      this.Status__c = Status__c;
      Status__c__is_set = true;
    }

    protected void setStatus__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Status__c", "urn:sobject.enterprise.soap.sforce.com","Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStatus__c(__typeMapper.readString(__in, _lookupTypeInfo("Status__c", "urn:sobject.enterprise.soap.sforce.com","Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatus__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Status__c", "urn:sobject.enterprise.soap.sforce.com","Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Status__c, Status__c__is_set);
    }

    /**
     * element : Vendor_Quote_Task_Status__c of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Vendor_Quote_Task_Status__c__is_set = false;

    private java.lang.String Vendor_Quote_Task_Status__c;

    public java.lang.String getVendor_Quote_Task_Status__c() {
      return Vendor_Quote_Task_Status__c;
    }

    public void setVendor_Quote_Task_Status__c(java.lang.String Vendor_Quote_Task_Status__c) {
      this.Vendor_Quote_Task_Status__c = Vendor_Quote_Task_Status__c;
      Vendor_Quote_Task_Status__c__is_set = true;
    }

    protected void setVendor_Quote_Task_Status__c(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Vendor_Quote_Task_Status__c", "urn:sobject.enterprise.soap.sforce.com","Vendor_Quote_Task_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setVendor_Quote_Task_Status__c(__typeMapper.readString(__in, _lookupTypeInfo("Vendor_Quote_Task_Status__c", "urn:sobject.enterprise.soap.sforce.com","Vendor_Quote_Task_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldVendor_Quote_Task_Status__c(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Vendor_Quote_Task_Status__c", "urn:sobject.enterprise.soap.sforce.com","Vendor_Quote_Task_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true), Vendor_Quote_Task_Status__c, Vendor_Quote_Task_Status__c__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Exception__c");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[Exception__c ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAgile_Opportunity_ID__c(__out, __typeMapper);
      writeFieldBid_Due_Date_Opportunity__c(__out, __typeMapper);
      writeFieldConfiguration_Owner__c(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldException_Decision_Due__c(__out, __typeMapper);
      writeFieldException_Number__c(__out, __typeMapper);
      writeFieldException_Type__c(__out, __typeMapper);
      writeFieldId(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldOpportunity_Name__c(__out, __typeMapper);
      writeFieldProduct_Team_Lead__c(__out, __typeMapper);
      writeFieldQuoting_Instructions__c(__out, __typeMapper);
      writeFieldRecordTypeId(__out, __typeMapper);
      writeFieldSales_Enablement_User__c(__out, __typeMapper);
      writeFieldStatus__c(__out, __typeMapper);
      writeFieldVendor_Quote_Task_Status__c(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAgile_Opportunity_ID__c(__in, __typeMapper);
      setBid_Due_Date_Opportunity__c(__in, __typeMapper);
      setConfiguration_Owner__c(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setException_Decision_Due__c(__in, __typeMapper);
      setException_Number__c(__in, __typeMapper);
      setException_Type__c(__in, __typeMapper);
      setId(__in, __typeMapper);
      setName(__in, __typeMapper);
      setOpportunity_Name__c(__in, __typeMapper);
      setProduct_Team_Lead__c(__in, __typeMapper);
      setQuoting_Instructions__c(__in, __typeMapper);
      setRecordTypeId(__in, __typeMapper);
      setSales_Enablement_User__c(__in, __typeMapper);
      setStatus__c(__in, __typeMapper);
      setVendor_Quote_Task_Status__c(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Agile_Opportunity_ID__c", Agile_Opportunity_ID__c);
      toStringHelper(sb, "Bid_Due_Date_Opportunity__c", Bid_Due_Date_Opportunity__c);
      toStringHelper(sb, "Configuration_Owner__c", Configuration_Owner__c);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "Exception_Decision_Due__c", Exception_Decision_Due__c);
      toStringHelper(sb, "Exception_Number__c", Exception_Number__c);
      toStringHelper(sb, "Exception_Type__c", Exception_Type__c);
      toStringHelper(sb, "Id", Id);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "Opportunity_Name__c", Opportunity_Name__c);
      toStringHelper(sb, "Product_Team_Lead__c", Product_Team_Lead__c);
      toStringHelper(sb, "Quoting_Instructions__c", Quoting_Instructions__c);
      toStringHelper(sb, "RecordTypeId", RecordTypeId);
      toStringHelper(sb, "Sales_Enablement_User__c", Sales_Enablement_User__c);
      toStringHelper(sb, "Status__c", Status__c);
      toStringHelper(sb, "Vendor_Quote_Task_Status__c", Vendor_Quote_Task_Status__c);
    }


}