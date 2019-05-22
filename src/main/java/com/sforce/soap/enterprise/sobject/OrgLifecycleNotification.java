package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class OrgLifecycleNotification extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public OrgLifecycleNotification() {}

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
     * element : LifecycleRequestId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean LifecycleRequestId__is_set = false;

    private java.lang.String LifecycleRequestId;

    public java.lang.String getLifecycleRequestId() {
      return LifecycleRequestId;
    }

    public void setLifecycleRequestId(java.lang.String LifecycleRequestId) {
      this.LifecycleRequestId = LifecycleRequestId;
      LifecycleRequestId__is_set = true;
    }

    protected void setLifecycleRequestId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LifecycleRequestId", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLifecycleRequestId(__typeMapper.readString(__in, _lookupTypeInfo("LifecycleRequestId", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLifecycleRequestId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LifecycleRequestId", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestId","http://www.w3.org/2001/XMLSchema","string",0,1,true), LifecycleRequestId, LifecycleRequestId__is_set);
    }

    /**
     * element : LifecycleRequestType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean LifecycleRequestType__is_set = false;

    private java.lang.String LifecycleRequestType;

    public java.lang.String getLifecycleRequestType() {
      return LifecycleRequestType;
    }

    public void setLifecycleRequestType(java.lang.String LifecycleRequestType) {
      this.LifecycleRequestType = LifecycleRequestType;
      LifecycleRequestType__is_set = true;
    }

    protected void setLifecycleRequestType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LifecycleRequestType", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLifecycleRequestType(__typeMapper.readString(__in, _lookupTypeInfo("LifecycleRequestType", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLifecycleRequestType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LifecycleRequestType", "urn:sobject.enterprise.soap.sforce.com","LifecycleRequestType","http://www.w3.org/2001/XMLSchema","string",0,1,true), LifecycleRequestType, LifecycleRequestType__is_set);
    }

    /**
     * element : OrgId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean OrgId__is_set = false;

    private java.lang.String OrgId;

    public java.lang.String getOrgId() {
      return OrgId;
    }

    public void setOrgId(java.lang.String OrgId) {
      this.OrgId = OrgId;
      OrgId__is_set = true;
    }

    protected void setOrgId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OrgId", "urn:sobject.enterprise.soap.sforce.com","OrgId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOrgId(__typeMapper.readString(__in, _lookupTypeInfo("OrgId", "urn:sobject.enterprise.soap.sforce.com","OrgId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOrgId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OrgId", "urn:sobject.enterprise.soap.sforce.com","OrgId","http://www.w3.org/2001/XMLSchema","string",0,1,true), OrgId, OrgId__is_set);
    }

    /**
     * element : ReplayId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ReplayId__is_set = false;

    private java.lang.String ReplayId;

    public java.lang.String getReplayId() {
      return ReplayId;
    }

    public void setReplayId(java.lang.String ReplayId) {
      this.ReplayId = ReplayId;
      ReplayId__is_set = true;
    }

    protected void setReplayId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setReplayId(__typeMapper.readString(__in, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldReplayId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true), ReplayId, ReplayId__is_set);
    }

    /**
     * element : Status of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Status__is_set = false;

    private java.lang.String Status;

    public java.lang.String getStatus() {
      return Status;
    }

    public void setStatus(java.lang.String Status) {
      this.Status = Status;
      Status__is_set = true;
    }

    protected void setStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStatus(__typeMapper.readString(__in, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Status", "urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true), Status, Status__is_set);
    }

    /**
     * element : StatusCode of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean StatusCode__is_set = false;

    private java.lang.String StatusCode;

    public java.lang.String getStatusCode() {
      return StatusCode;
    }

    public void setStatusCode(java.lang.String StatusCode) {
      this.StatusCode = StatusCode;
      StatusCode__is_set = true;
    }

    protected void setStatusCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StatusCode", "urn:sobject.enterprise.soap.sforce.com","StatusCode","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStatusCode(__typeMapper.readString(__in, _lookupTypeInfo("StatusCode", "urn:sobject.enterprise.soap.sforce.com","StatusCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatusCode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StatusCode", "urn:sobject.enterprise.soap.sforce.com","StatusCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), StatusCode, StatusCode__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OrgLifecycleNotification");
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
      sb.append("[OrgLifecycleNotification ");
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
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldLifecycleRequestId(__out, __typeMapper);
      writeFieldLifecycleRequestType(__out, __typeMapper);
      writeFieldOrgId(__out, __typeMapper);
      writeFieldReplayId(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldStatusCode(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setLifecycleRequestId(__in, __typeMapper);
      setLifecycleRequestType(__in, __typeMapper);
      setOrgId(__in, __typeMapper);
      setReplayId(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setStatusCode(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "LifecycleRequestId", LifecycleRequestId);
      toStringHelper(sb, "LifecycleRequestType", LifecycleRequestType);
      toStringHelper(sb, "OrgId", OrgId);
      toStringHelper(sb, "ReplayId", ReplayId);
      toStringHelper(sb, "Status", Status);
      toStringHelper(sb, "StatusCode", StatusCode);
    }


}
