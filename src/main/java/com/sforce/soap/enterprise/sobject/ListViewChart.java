package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ListViewChart extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ListViewChart() {}

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
     * element : AggregateField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AggregateField__is_set = false;

    private java.lang.String AggregateField;

    public java.lang.String getAggregateField() {
      return AggregateField;
    }

    public void setAggregateField(java.lang.String AggregateField) {
      this.AggregateField = AggregateField;
      AggregateField__is_set = true;
    }

    protected void setAggregateField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AggregateField", "urn:sobject.enterprise.soap.sforce.com","AggregateField","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAggregateField(__typeMapper.readString(__in, _lookupTypeInfo("AggregateField", "urn:sobject.enterprise.soap.sforce.com","AggregateField","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAggregateField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AggregateField", "urn:sobject.enterprise.soap.sforce.com","AggregateField","http://www.w3.org/2001/XMLSchema","string",0,1,true), AggregateField, AggregateField__is_set);
    }

    /**
     * element : AggregateType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AggregateType__is_set = false;

    private java.lang.String AggregateType;

    public java.lang.String getAggregateType() {
      return AggregateType;
    }

    public void setAggregateType(java.lang.String AggregateType) {
      this.AggregateType = AggregateType;
      AggregateType__is_set = true;
    }

    protected void setAggregateType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AggregateType", "urn:sobject.enterprise.soap.sforce.com","AggregateType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAggregateType(__typeMapper.readString(__in, _lookupTypeInfo("AggregateType", "urn:sobject.enterprise.soap.sforce.com","AggregateType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAggregateType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AggregateType", "urn:sobject.enterprise.soap.sforce.com","AggregateType","http://www.w3.org/2001/XMLSchema","string",0,1,true), AggregateType, AggregateType__is_set);
    }

    /**
     * element : ChartType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ChartType__is_set = false;

    private java.lang.String ChartType;

    public java.lang.String getChartType() {
      return ChartType;
    }

    public void setChartType(java.lang.String ChartType) {
      this.ChartType = ChartType;
      ChartType__is_set = true;
    }

    protected void setChartType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ChartType", "urn:sobject.enterprise.soap.sforce.com","ChartType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setChartType(__typeMapper.readString(__in, _lookupTypeInfo("ChartType", "urn:sobject.enterprise.soap.sforce.com","ChartType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldChartType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ChartType", "urn:sobject.enterprise.soap.sforce.com","ChartType","http://www.w3.org/2001/XMLSchema","string",0,1,true), ChartType, ChartType__is_set);
    }

    /**
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User CreatedBy;

    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), CreatedBy, CreatedBy__is_set);
    }

    /**
     * element : CreatedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    protected void setCreatedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setCreatedById(__typeMapper.readString(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCreatedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), CreatedById, CreatedById__is_set);
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
     * element : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DeveloperName__is_set = false;

    private java.lang.String DeveloperName;

    public java.lang.String getDeveloperName() {
      return DeveloperName;
    }

    public void setDeveloperName(java.lang.String DeveloperName) {
      this.DeveloperName = DeveloperName;
      DeveloperName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDeveloperName(__typeMapper.readString(__in, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeveloperName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DeveloperName", "urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true), DeveloperName, DeveloperName__is_set);
    }

    /**
     * element : GroupingField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean GroupingField__is_set = false;

    private java.lang.String GroupingField;

    public java.lang.String getGroupingField() {
      return GroupingField;
    }

    public void setGroupingField(java.lang.String GroupingField) {
      this.GroupingField = GroupingField;
      GroupingField__is_set = true;
    }

    protected void setGroupingField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("GroupingField", "urn:sobject.enterprise.soap.sforce.com","GroupingField","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setGroupingField(__typeMapper.readString(__in, _lookupTypeInfo("GroupingField", "urn:sobject.enterprise.soap.sforce.com","GroupingField","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldGroupingField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("GroupingField", "urn:sobject.enterprise.soap.sforce.com","GroupingField","http://www.w3.org/2001/XMLSchema","string",0,1,true), GroupingField, GroupingField__is_set);
    }

    /**
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    protected void setIsDeleted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsDeleted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsDeleted, IsDeleted__is_set);
    }

    /**
     * element : Language of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Language__is_set = false;

    private java.lang.String Language;

    public java.lang.String getLanguage() {
      return Language;
    }

    public void setLanguage(java.lang.String Language) {
      this.Language = Language;
      Language__is_set = true;
    }

    protected void setLanguage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Language", "urn:sobject.enterprise.soap.sforce.com","Language","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLanguage(__typeMapper.readString(__in, _lookupTypeInfo("Language", "urn:sobject.enterprise.soap.sforce.com","Language","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLanguage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Language", "urn:sobject.enterprise.soap.sforce.com","Language","http://www.w3.org/2001/XMLSchema","string",0,1,true), Language, Language__is_set);
    }

    /**
     * element : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    protected void setLastModifiedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldLastModifiedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), LastModifiedBy, LastModifiedBy__is_set);
    }

    /**
     * element : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    protected void setLastModifiedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setLastModifiedById(__typeMapper.readString(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastModifiedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), LastModifiedById, LastModifiedById__is_set);
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    protected void setLastModifiedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastModifiedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastModifiedDate, LastModifiedDate__is_set);
    }

    /**
     * element : MasterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean MasterLabel__is_set = false;

    private java.lang.String MasterLabel;

    public java.lang.String getMasterLabel() {
      return MasterLabel;
    }

    public void setMasterLabel(java.lang.String MasterLabel) {
      this.MasterLabel = MasterLabel;
      MasterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MasterLabel", "urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMasterLabel(__typeMapper.readString(__in, _lookupTypeInfo("MasterLabel", "urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMasterLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MasterLabel", "urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), MasterLabel, MasterLabel__is_set);
    }

    /**
     * element : Owner of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean Owner__is_set = false;

    private com.sforce.soap.enterprise.sobject.User Owner;

    public com.sforce.soap.enterprise.sobject.User getOwner() {
      return Owner;
    }

    public void setOwner(com.sforce.soap.enterprise.sobject.User Owner) {
      this.Owner = Owner;
      Owner__is_set = true;
    }

    protected void setOwner(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setOwner((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldOwner(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), Owner, Owner__is_set);
    }

    /**
     * element : OwnerId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean OwnerId__is_set = false;

    private java.lang.String OwnerId;

    public java.lang.String getOwnerId() {
      return OwnerId;
    }

    public void setOwnerId(java.lang.String OwnerId) {
      this.OwnerId = OwnerId;
      OwnerId__is_set = true;
    }

    protected void setOwnerId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OwnerId", "urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setOwnerId(__typeMapper.readString(__in, _lookupTypeInfo("OwnerId", "urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOwnerId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OwnerId", "urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true), OwnerId, OwnerId__is_set);
    }

    /**
     * element : SobjectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SobjectType__is_set = false;

    private java.lang.String SobjectType;

    public java.lang.String getSobjectType() {
      return SobjectType;
    }

    public void setSobjectType(java.lang.String SobjectType) {
      this.SobjectType = SobjectType;
      SobjectType__is_set = true;
    }

    protected void setSobjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSobjectType(__typeMapper.readString(__in, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSobjectType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SobjectType", "urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), SobjectType, SobjectType__is_set);
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    protected void setSystemModstamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldSystemModstamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), SystemModstamp, SystemModstamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ListViewChart");
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
      sb.append("[ListViewChart ");
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
      writeFieldAggregateField(__out, __typeMapper);
      writeFieldAggregateType(__out, __typeMapper);
      writeFieldChartType(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldDeveloperName(__out, __typeMapper);
      writeFieldGroupingField(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLanguage(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldMasterLabel(__out, __typeMapper);
      writeFieldOwner(__out, __typeMapper);
      writeFieldOwnerId(__out, __typeMapper);
      writeFieldSobjectType(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAggregateField(__in, __typeMapper);
      setAggregateType(__in, __typeMapper);
      setChartType(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setDeveloperName(__in, __typeMapper);
      setGroupingField(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLanguage(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setMasterLabel(__in, __typeMapper);
      setOwner(__in, __typeMapper);
      setOwnerId(__in, __typeMapper);
      setSobjectType(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AggregateField", AggregateField);
      toStringHelper(sb, "AggregateType", AggregateType);
      toStringHelper(sb, "ChartType", ChartType);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "DeveloperName", DeveloperName);
      toStringHelper(sb, "GroupingField", GroupingField);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "Language", Language);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "MasterLabel", MasterLabel);
      toStringHelper(sb, "Owner", Owner);
      toStringHelper(sb, "OwnerId", OwnerId);
      toStringHelper(sb, "SobjectType", SobjectType);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
