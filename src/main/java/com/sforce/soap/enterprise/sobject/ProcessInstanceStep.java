package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ProcessInstanceStep extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ProcessInstanceStep() {}

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
     * element : Actor of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean Actor__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject Actor;

    public com.sforce.soap.enterprise.sobject.SObject getActor() {
      return Actor;
    }

    public void setActor(com.sforce.soap.enterprise.sobject.SObject Actor) {
      this.Actor = Actor;
      Actor__is_set = true;
    }

    protected void setActor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Actor", "urn:sobject.enterprise.soap.sforce.com","Actor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setActor((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("Actor", "urn:sobject.enterprise.soap.sforce.com","Actor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldActor(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Actor", "urn:sobject.enterprise.soap.sforce.com","Actor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), Actor, Actor__is_set);
    }

    /**
     * element : ActorId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ActorId__is_set = false;

    private java.lang.String ActorId;

    public java.lang.String getActorId() {
      return ActorId;
    }

    public void setActorId(java.lang.String ActorId) {
      this.ActorId = ActorId;
      ActorId__is_set = true;
    }

    protected void setActorId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ActorId", "urn:sobject.enterprise.soap.sforce.com","ActorId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setActorId(__typeMapper.readString(__in, _lookupTypeInfo("ActorId", "urn:sobject.enterprise.soap.sforce.com","ActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldActorId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ActorId", "urn:sobject.enterprise.soap.sforce.com","ActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), ActorId, ActorId__is_set);
    }

    /**
     * element : Comments of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Comments__is_set = false;

    private java.lang.String Comments;

    public java.lang.String getComments() {
      return Comments;
    }

    public void setComments(java.lang.String Comments) {
      this.Comments = Comments;
      Comments__is_set = true;
    }

    protected void setComments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Comments", "urn:sobject.enterprise.soap.sforce.com","Comments","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setComments(__typeMapper.readString(__in, _lookupTypeInfo("Comments", "urn:sobject.enterprise.soap.sforce.com","Comments","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldComments(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Comments", "urn:sobject.enterprise.soap.sforce.com","Comments","http://www.w3.org/2001/XMLSchema","string",0,1,true), Comments, Comments__is_set);
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
     * element : ElapsedTimeInDays of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInDays__is_set = false;

    private java.lang.Double ElapsedTimeInDays;

    public java.lang.Double getElapsedTimeInDays() {
      return ElapsedTimeInDays;
    }

    public void setElapsedTimeInDays(java.lang.Double ElapsedTimeInDays) {
      this.ElapsedTimeInDays = ElapsedTimeInDays;
      ElapsedTimeInDays__is_set = true;
    }

    protected void setElapsedTimeInDays(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInDays((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInDays(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInDays", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInDays, ElapsedTimeInDays__is_set);
    }

    /**
     * element : ElapsedTimeInHours of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInHours__is_set = false;

    private java.lang.Double ElapsedTimeInHours;

    public java.lang.Double getElapsedTimeInHours() {
      return ElapsedTimeInHours;
    }

    public void setElapsedTimeInHours(java.lang.Double ElapsedTimeInHours) {
      this.ElapsedTimeInHours = ElapsedTimeInHours;
      ElapsedTimeInHours__is_set = true;
    }

    protected void setElapsedTimeInHours(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInHours((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInHours(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInHours", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInHours, ElapsedTimeInHours__is_set);
    }

    /**
     * element : ElapsedTimeInMinutes of type {http://www.w3.org/2001/XMLSchema}double
     * java type: java.lang.Double
     */
    private boolean ElapsedTimeInMinutes__is_set = false;

    private java.lang.Double ElapsedTimeInMinutes;

    public java.lang.Double getElapsedTimeInMinutes() {
      return ElapsedTimeInMinutes;
    }

    public void setElapsedTimeInMinutes(java.lang.Double ElapsedTimeInMinutes) {
      this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
      ElapsedTimeInMinutes__is_set = true;
    }

    protected void setElapsedTimeInMinutes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setElapsedTimeInMinutes((java.lang.Double)__typeMapper.readObject(__in, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true), java.lang.Double.class));
      }
    }

    private void writeFieldElapsedTimeInMinutes(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ElapsedTimeInMinutes", "urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true), ElapsedTimeInMinutes, ElapsedTimeInMinutes__is_set);
    }

    /**
     * element : OriginalActor of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean OriginalActor__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject OriginalActor;

    public com.sforce.soap.enterprise.sobject.SObject getOriginalActor() {
      return OriginalActor;
    }

    public void setOriginalActor(com.sforce.soap.enterprise.sobject.SObject OriginalActor) {
      this.OriginalActor = OriginalActor;
      OriginalActor__is_set = true;
    }

    protected void setOriginalActor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OriginalActor", "urn:sobject.enterprise.soap.sforce.com","OriginalActor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setOriginalActor((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("OriginalActor", "urn:sobject.enterprise.soap.sforce.com","OriginalActor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldOriginalActor(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OriginalActor", "urn:sobject.enterprise.soap.sforce.com","OriginalActor","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), OriginalActor, OriginalActor__is_set);
    }

    /**
     * element : OriginalActorId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean OriginalActorId__is_set = false;

    private java.lang.String OriginalActorId;

    public java.lang.String getOriginalActorId() {
      return OriginalActorId;
    }

    public void setOriginalActorId(java.lang.String OriginalActorId) {
      this.OriginalActorId = OriginalActorId;
      OriginalActorId__is_set = true;
    }

    protected void setOriginalActorId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OriginalActorId", "urn:sobject.enterprise.soap.sforce.com","OriginalActorId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setOriginalActorId(__typeMapper.readString(__in, _lookupTypeInfo("OriginalActorId", "urn:sobject.enterprise.soap.sforce.com","OriginalActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOriginalActorId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OriginalActorId", "urn:sobject.enterprise.soap.sforce.com","OriginalActorId","urn:enterprise.soap.sforce.com","ID",0,1,true), OriginalActorId, OriginalActorId__is_set);
    }

    /**
     * element : ProcessInstance of type {urn:sobject.enterprise.soap.sforce.com}ProcessInstance
     * java type: com.sforce.soap.enterprise.sobject.ProcessInstance
     */
    private boolean ProcessInstance__is_set = false;

    private com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance;

    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
      return ProcessInstance;
    }

    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance) {
      this.ProcessInstance = ProcessInstance;
      ProcessInstance__is_set = true;
    }

    protected void setProcessInstance(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true))) {
        setProcessInstance((com.sforce.soap.enterprise.sobject.ProcessInstance)__typeMapper.readObject(__in, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true), com.sforce.soap.enterprise.sobject.ProcessInstance.class));
      }
    }

    private void writeFieldProcessInstance(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessInstance", "urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true), ProcessInstance, ProcessInstance__is_set);
    }

    /**
     * element : ProcessInstanceId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ProcessInstanceId__is_set = false;

    private java.lang.String ProcessInstanceId;

    public java.lang.String getProcessInstanceId() {
      return ProcessInstanceId;
    }

    public void setProcessInstanceId(java.lang.String ProcessInstanceId) {
      this.ProcessInstanceId = ProcessInstanceId;
      ProcessInstanceId__is_set = true;
    }

    protected void setProcessInstanceId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setProcessInstanceId(__typeMapper.readString(__in, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldProcessInstanceId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ProcessInstanceId", "urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true), ProcessInstanceId, ProcessInstanceId__is_set);
    }

    /**
     * element : StepNodeId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean StepNodeId__is_set = false;

    private java.lang.String StepNodeId;

    public java.lang.String getStepNodeId() {
      return StepNodeId;
    }

    public void setStepNodeId(java.lang.String StepNodeId) {
      this.StepNodeId = StepNodeId;
      StepNodeId__is_set = true;
    }

    protected void setStepNodeId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StepNodeId", "urn:sobject.enterprise.soap.sforce.com","StepNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setStepNodeId(__typeMapper.readString(__in, _lookupTypeInfo("StepNodeId", "urn:sobject.enterprise.soap.sforce.com","StepNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStepNodeId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StepNodeId", "urn:sobject.enterprise.soap.sforce.com","StepNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true), StepNodeId, StepNodeId__is_set);
    }

    /**
     * element : StepStatus of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean StepStatus__is_set = false;

    private java.lang.String StepStatus;

    public java.lang.String getStepStatus() {
      return StepStatus;
    }

    public void setStepStatus(java.lang.String StepStatus) {
      this.StepStatus = StepStatus;
      StepStatus__is_set = true;
    }

    protected void setStepStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StepStatus", "urn:sobject.enterprise.soap.sforce.com","StepStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStepStatus(__typeMapper.readString(__in, _lookupTypeInfo("StepStatus", "urn:sobject.enterprise.soap.sforce.com","StepStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStepStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StepStatus", "urn:sobject.enterprise.soap.sforce.com","StepStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true), StepStatus, StepStatus__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceStep");
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
      sb.append("[ProcessInstanceStep ");
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
      writeFieldActor(__out, __typeMapper);
      writeFieldActorId(__out, __typeMapper);
      writeFieldComments(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldElapsedTimeInDays(__out, __typeMapper);
      writeFieldElapsedTimeInHours(__out, __typeMapper);
      writeFieldElapsedTimeInMinutes(__out, __typeMapper);
      writeFieldOriginalActor(__out, __typeMapper);
      writeFieldOriginalActorId(__out, __typeMapper);
      writeFieldProcessInstance(__out, __typeMapper);
      writeFieldProcessInstanceId(__out, __typeMapper);
      writeFieldStepNodeId(__out, __typeMapper);
      writeFieldStepStatus(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActor(__in, __typeMapper);
      setActorId(__in, __typeMapper);
      setComments(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setElapsedTimeInDays(__in, __typeMapper);
      setElapsedTimeInHours(__in, __typeMapper);
      setElapsedTimeInMinutes(__in, __typeMapper);
      setOriginalActor(__in, __typeMapper);
      setOriginalActorId(__in, __typeMapper);
      setProcessInstance(__in, __typeMapper);
      setProcessInstanceId(__in, __typeMapper);
      setStepNodeId(__in, __typeMapper);
      setStepStatus(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Actor", Actor);
      toStringHelper(sb, "ActorId", ActorId);
      toStringHelper(sb, "Comments", Comments);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "ElapsedTimeInDays", ElapsedTimeInDays);
      toStringHelper(sb, "ElapsedTimeInHours", ElapsedTimeInHours);
      toStringHelper(sb, "ElapsedTimeInMinutes", ElapsedTimeInMinutes);
      toStringHelper(sb, "OriginalActor", OriginalActor);
      toStringHelper(sb, "OriginalActorId", OriginalActorId);
      toStringHelper(sb, "ProcessInstance", ProcessInstance);
      toStringHelper(sb, "ProcessInstanceId", ProcessInstanceId);
      toStringHelper(sb, "StepNodeId", StepNodeId);
      toStringHelper(sb, "StepStatus", StepStatus);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
