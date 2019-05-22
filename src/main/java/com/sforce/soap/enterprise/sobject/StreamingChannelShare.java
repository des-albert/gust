package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class StreamingChannelShare extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public StreamingChannelShare() {}

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
     * element : AccessLevel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AccessLevel__is_set = false;

    private java.lang.String AccessLevel;

    public java.lang.String getAccessLevel() {
      return AccessLevel;
    }

    public void setAccessLevel(java.lang.String AccessLevel) {
      this.AccessLevel = AccessLevel;
      AccessLevel__is_set = true;
    }

    protected void setAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAccessLevel(__typeMapper.readString(__in, _lookupTypeInfo("AccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAccessLevel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), AccessLevel, AccessLevel__is_set);
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
     * element : Parent of type {urn:sobject.enterprise.soap.sforce.com}StreamingChannel
     * java type: com.sforce.soap.enterprise.sobject.StreamingChannel
     */
    private boolean Parent__is_set = false;

    private com.sforce.soap.enterprise.sobject.StreamingChannel Parent;

    public com.sforce.soap.enterprise.sobject.StreamingChannel getParent() {
      return Parent;
    }

    public void setParent(com.sforce.soap.enterprise.sobject.StreamingChannel Parent) {
      this.Parent = Parent;
      Parent__is_set = true;
    }

    protected void setParent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","StreamingChannel",0,1,true))) {
        setParent((com.sforce.soap.enterprise.sobject.StreamingChannel)__typeMapper.readObject(__in, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","StreamingChannel",0,1,true), com.sforce.soap.enterprise.sobject.StreamingChannel.class));
      }
    }

    private void writeFieldParent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Parent", "urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","StreamingChannel",0,1,true), Parent, Parent__is_set);
    }

    /**
     * element : ParentId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ParentId__is_set = false;

    private java.lang.String ParentId;

    public java.lang.String getParentId() {
      return ParentId;
    }

    public void setParentId(java.lang.String ParentId) {
      this.ParentId = ParentId;
      ParentId__is_set = true;
    }

    protected void setParentId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setParentId(__typeMapper.readString(__in, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ParentId", "urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true), ParentId, ParentId__is_set);
    }

    /**
     * element : RowCause of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean RowCause__is_set = false;

    private java.lang.String RowCause;

    public java.lang.String getRowCause() {
      return RowCause;
    }

    public void setRowCause(java.lang.String RowCause) {
      this.RowCause = RowCause;
      RowCause__is_set = true;
    }

    protected void setRowCause(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setRowCause(__typeMapper.readString(__in, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRowCause(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true), RowCause, RowCause__is_set);
    }

    /**
     * element : UserOrGroup of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean UserOrGroup__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject UserOrGroup;

    public com.sforce.soap.enterprise.sobject.SObject getUserOrGroup() {
      return UserOrGroup;
    }

    public void setUserOrGroup(com.sforce.soap.enterprise.sobject.SObject UserOrGroup) {
      this.UserOrGroup = UserOrGroup;
      UserOrGroup__is_set = true;
    }

    protected void setUserOrGroup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setUserOrGroup((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldUserOrGroup(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), UserOrGroup, UserOrGroup__is_set);
    }

    /**
     * element : UserOrGroupId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean UserOrGroupId__is_set = false;

    private java.lang.String UserOrGroupId;

    public java.lang.String getUserOrGroupId() {
      return UserOrGroupId;
    }

    public void setUserOrGroupId(java.lang.String UserOrGroupId) {
      this.UserOrGroupId = UserOrGroupId;
      UserOrGroupId__is_set = true;
    }

    protected void setUserOrGroupId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setUserOrGroupId(__typeMapper.readString(__in, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUserOrGroupId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true), UserOrGroupId, UserOrGroupId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "StreamingChannelShare");
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
      sb.append("[StreamingChannelShare ");
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
      writeFieldAccessLevel(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldParent(__out, __typeMapper);
      writeFieldParentId(__out, __typeMapper);
      writeFieldRowCause(__out, __typeMapper);
      writeFieldUserOrGroup(__out, __typeMapper);
      writeFieldUserOrGroupId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAccessLevel(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setParent(__in, __typeMapper);
      setParentId(__in, __typeMapper);
      setRowCause(__in, __typeMapper);
      setUserOrGroup(__in, __typeMapper);
      setUserOrGroupId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AccessLevel", AccessLevel);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "Parent", Parent);
      toStringHelper(sb, "ParentId", ParentId);
      toStringHelper(sb, "RowCause", RowCause);
      toStringHelper(sb, "UserOrGroup", UserOrGroup);
      toStringHelper(sb, "UserOrGroupId", UserOrGroupId);
    }


}