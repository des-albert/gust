package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class QuickText extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public QuickText() {}

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
     * element : Category of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Category__is_set = false;

    private java.lang.String Category;

    public java.lang.String getCategory() {
      return Category;
    }

    public void setCategory(java.lang.String Category) {
      this.Category = Category;
      Category__is_set = true;
    }

    protected void setCategory(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Category", "urn:sobject.enterprise.soap.sforce.com","Category","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCategory(__typeMapper.readString(__in, _lookupTypeInfo("Category", "urn:sobject.enterprise.soap.sforce.com","Category","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCategory(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Category", "urn:sobject.enterprise.soap.sforce.com","Category","http://www.w3.org/2001/XMLSchema","string",0,1,true), Category, Category__is_set);
    }

    /**
     * element : Channel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Channel__is_set = false;

    private java.lang.String Channel;

    public java.lang.String getChannel() {
      return Channel;
    }

    public void setChannel(java.lang.String Channel) {
      this.Channel = Channel;
      Channel__is_set = true;
    }

    protected void setChannel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Channel", "urn:sobject.enterprise.soap.sforce.com","Channel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setChannel(__typeMapper.readString(__in, _lookupTypeInfo("Channel", "urn:sobject.enterprise.soap.sforce.com","Channel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldChannel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Channel", "urn:sobject.enterprise.soap.sforce.com","Channel","http://www.w3.org/2001/XMLSchema","string",0,1,true), Channel, Channel__is_set);
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
     * element : Histories of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean Histories__is_set = false;

    private com.sforce.soap.enterprise.QueryResult Histories;

    public com.sforce.soap.enterprise.QueryResult getHistories() {
      return Histories;
    }

    public void setHistories(com.sforce.soap.enterprise.QueryResult Histories) {
      this.Histories = Histories;
      Histories__is_set = true;
    }

    protected void setHistories(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Histories", "urn:sobject.enterprise.soap.sforce.com","Histories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("Histories", "urn:sobject.enterprise.soap.sforce.com","Histories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldHistories(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Histories", "urn:sobject.enterprise.soap.sforce.com","Histories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), Histories, Histories__is_set);
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
     * element : LastReferencedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastReferencedDate__is_set = false;

    private java.util.Calendar LastReferencedDate;

    public java.util.Calendar getLastReferencedDate() {
      return LastReferencedDate;
    }

    public void setLastReferencedDate(java.util.Calendar LastReferencedDate) {
      this.LastReferencedDate = LastReferencedDate;
      LastReferencedDate__is_set = true;
    }

    protected void setLastReferencedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastReferencedDate", "urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastReferencedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastReferencedDate", "urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastReferencedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastReferencedDate", "urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastReferencedDate, LastReferencedDate__is_set);
    }

    /**
     * element : LastViewedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastViewedDate__is_set = false;

    private java.util.Calendar LastViewedDate;

    public java.util.Calendar getLastViewedDate() {
      return LastViewedDate;
    }

    public void setLastViewedDate(java.util.Calendar LastViewedDate) {
      this.LastViewedDate = LastViewedDate;
      LastViewedDate__is_set = true;
    }

    protected void setLastViewedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastViewedDate", "urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastViewedDate", "urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastViewedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastViewedDate", "urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastViewedDate, LastViewedDate__is_set);
    }

    /**
     * element : Message of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Message__is_set = false;

    private java.lang.String Message;

    public java.lang.String getMessage() {
      return Message;
    }

    public void setMessage(java.lang.String Message) {
      this.Message = Message;
      Message__is_set = true;
    }

    protected void setMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Message", "urn:sobject.enterprise.soap.sforce.com","Message","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMessage(__typeMapper.readString(__in, _lookupTypeInfo("Message", "urn:sobject.enterprise.soap.sforce.com","Message","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Message", "urn:sobject.enterprise.soap.sforce.com","Message","http://www.w3.org/2001/XMLSchema","string",0,1,true), Message, Message__is_set);
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
     * element : Owner of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean Owner__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject Owner;

    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
      return Owner;
    }

    public void setOwner(com.sforce.soap.enterprise.sobject.SObject Owner) {
      this.Owner = Owner;
      Owner__is_set = true;
    }

    protected void setOwner(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setOwner((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldOwner(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Owner", "urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), Owner, Owner__is_set);
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
     * element : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
     * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
     */
    private boolean UserRecordAccess__is_set = false;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
      return UserRecordAccess;
    }

    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
      this.UserRecordAccess = UserRecordAccess;
      UserRecordAccess__is_set = true;
    }

    protected void setUserRecordAccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true))) {
        setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true), com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
      }
    }

    private void writeFieldUserRecordAccess(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserRecordAccess", "urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true), UserRecordAccess, UserRecordAccess__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "QuickText");
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
      sb.append("[QuickText ");
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
      writeFieldCategory(__out, __typeMapper);
      writeFieldChannel(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldHistories(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldLastReferencedDate(__out, __typeMapper);
      writeFieldLastViewedDate(__out, __typeMapper);
      writeFieldMessage(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldOwner(__out, __typeMapper);
      writeFieldOwnerId(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldUserRecordAccess(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCategory(__in, __typeMapper);
      setChannel(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setHistories(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setLastReferencedDate(__in, __typeMapper);
      setLastViewedDate(__in, __typeMapper);
      setMessage(__in, __typeMapper);
      setName(__in, __typeMapper);
      setOwner(__in, __typeMapper);
      setOwnerId(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setUserRecordAccess(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Category", Category);
      toStringHelper(sb, "Channel", Channel);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "Histories", Histories);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "LastReferencedDate", LastReferencedDate);
      toStringHelper(sb, "LastViewedDate", LastViewedDate);
      toStringHelper(sb, "Message", Message);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "Owner", Owner);
      toStringHelper(sb, "OwnerId", OwnerId);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "UserRecordAccess", UserRecordAccess);
    }


}
