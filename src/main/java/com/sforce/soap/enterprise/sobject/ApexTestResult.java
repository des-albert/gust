package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApexTestResult extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ApexTestResult() {}

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
     * element : ApexClass of type {urn:sobject.enterprise.soap.sforce.com}ApexClass
     * java type: com.sforce.soap.enterprise.sobject.ApexClass
     */
    private boolean ApexClass__is_set = false;

    private com.sforce.soap.enterprise.sobject.ApexClass ApexClass;

    public com.sforce.soap.enterprise.sobject.ApexClass getApexClass() {
      return ApexClass;
    }

    public void setApexClass(com.sforce.soap.enterprise.sobject.ApexClass ApexClass) {
      this.ApexClass = ApexClass;
      ApexClass__is_set = true;
    }

    protected void setApexClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexClass", "urn:sobject.enterprise.soap.sforce.com","ApexClass","urn:sobject.enterprise.soap.sforce.com","ApexClass",0,1,true))) {
        setApexClass((com.sforce.soap.enterprise.sobject.ApexClass)__typeMapper.readObject(__in, _lookupTypeInfo("ApexClass", "urn:sobject.enterprise.soap.sforce.com","ApexClass","urn:sobject.enterprise.soap.sforce.com","ApexClass",0,1,true), com.sforce.soap.enterprise.sobject.ApexClass.class));
      }
    }

    private void writeFieldApexClass(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexClass", "urn:sobject.enterprise.soap.sforce.com","ApexClass","urn:sobject.enterprise.soap.sforce.com","ApexClass",0,1,true), ApexClass, ApexClass__is_set);
    }

    /**
     * element : ApexClassId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ApexClassId__is_set = false;

    private java.lang.String ApexClassId;

    public java.lang.String getApexClassId() {
      return ApexClassId;
    }

    public void setApexClassId(java.lang.String ApexClassId) {
      this.ApexClassId = ApexClassId;
      ApexClassId__is_set = true;
    }

    protected void setApexClassId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexClassId", "urn:sobject.enterprise.soap.sforce.com","ApexClassId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setApexClassId(__typeMapper.readString(__in, _lookupTypeInfo("ApexClassId", "urn:sobject.enterprise.soap.sforce.com","ApexClassId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexClassId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexClassId", "urn:sobject.enterprise.soap.sforce.com","ApexClassId","urn:enterprise.soap.sforce.com","ID",0,1,true), ApexClassId, ApexClassId__is_set);
    }

    /**
     * element : ApexLog of type {urn:sobject.enterprise.soap.sforce.com}ApexLog
     * java type: com.sforce.soap.enterprise.sobject.ApexLog
     */
    private boolean ApexLog__is_set = false;

    private com.sforce.soap.enterprise.sobject.ApexLog ApexLog;

    public com.sforce.soap.enterprise.sobject.ApexLog getApexLog() {
      return ApexLog;
    }

    public void setApexLog(com.sforce.soap.enterprise.sobject.ApexLog ApexLog) {
      this.ApexLog = ApexLog;
      ApexLog__is_set = true;
    }

    protected void setApexLog(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexLog", "urn:sobject.enterprise.soap.sforce.com","ApexLog","urn:sobject.enterprise.soap.sforce.com","ApexLog",0,1,true))) {
        setApexLog((com.sforce.soap.enterprise.sobject.ApexLog)__typeMapper.readObject(__in, _lookupTypeInfo("ApexLog", "urn:sobject.enterprise.soap.sforce.com","ApexLog","urn:sobject.enterprise.soap.sforce.com","ApexLog",0,1,true), com.sforce.soap.enterprise.sobject.ApexLog.class));
      }
    }

    private void writeFieldApexLog(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexLog", "urn:sobject.enterprise.soap.sforce.com","ApexLog","urn:sobject.enterprise.soap.sforce.com","ApexLog",0,1,true), ApexLog, ApexLog__is_set);
    }

    /**
     * element : ApexLogId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ApexLogId__is_set = false;

    private java.lang.String ApexLogId;

    public java.lang.String getApexLogId() {
      return ApexLogId;
    }

    public void setApexLogId(java.lang.String ApexLogId) {
      this.ApexLogId = ApexLogId;
      ApexLogId__is_set = true;
    }

    protected void setApexLogId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexLogId", "urn:sobject.enterprise.soap.sforce.com","ApexLogId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setApexLogId(__typeMapper.readString(__in, _lookupTypeInfo("ApexLogId", "urn:sobject.enterprise.soap.sforce.com","ApexLogId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexLogId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexLogId", "urn:sobject.enterprise.soap.sforce.com","ApexLogId","urn:enterprise.soap.sforce.com","ID",0,1,true), ApexLogId, ApexLogId__is_set);
    }

    /**
     * element : ApexTestResults of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean ApexTestResults__is_set = false;

    private com.sforce.soap.enterprise.QueryResult ApexTestResults;

    public com.sforce.soap.enterprise.QueryResult getApexTestResults() {
      return ApexTestResults;
    }

    public void setApexTestResults(com.sforce.soap.enterprise.QueryResult ApexTestResults) {
      this.ApexTestResults = ApexTestResults;
      ApexTestResults__is_set = true;
    }

    protected void setApexTestResults(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexTestResults", "urn:sobject.enterprise.soap.sforce.com","ApexTestResults","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setApexTestResults((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("ApexTestResults", "urn:sobject.enterprise.soap.sforce.com","ApexTestResults","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldApexTestResults(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexTestResults", "urn:sobject.enterprise.soap.sforce.com","ApexTestResults","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), ApexTestResults, ApexTestResults__is_set);
    }

    /**
     * element : ApexTestRunResult of type {urn:sobject.enterprise.soap.sforce.com}ApexTestRunResult
     * java type: com.sforce.soap.enterprise.sobject.ApexTestRunResult
     */
    private boolean ApexTestRunResult__is_set = false;

    private com.sforce.soap.enterprise.sobject.ApexTestRunResult ApexTestRunResult;

    public com.sforce.soap.enterprise.sobject.ApexTestRunResult getApexTestRunResult() {
      return ApexTestRunResult;
    }

    public void setApexTestRunResult(com.sforce.soap.enterprise.sobject.ApexTestRunResult ApexTestRunResult) {
      this.ApexTestRunResult = ApexTestRunResult;
      ApexTestRunResult__is_set = true;
    }

    protected void setApexTestRunResult(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexTestRunResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult","urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult",0,1,true))) {
        setApexTestRunResult((com.sforce.soap.enterprise.sobject.ApexTestRunResult)__typeMapper.readObject(__in, _lookupTypeInfo("ApexTestRunResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult","urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult",0,1,true), com.sforce.soap.enterprise.sobject.ApexTestRunResult.class));
      }
    }

    private void writeFieldApexTestRunResult(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexTestRunResult", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult","urn:sobject.enterprise.soap.sforce.com","ApexTestRunResult",0,1,true), ApexTestRunResult, ApexTestRunResult__is_set);
    }

    /**
     * element : ApexTestRunResultId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ApexTestRunResultId__is_set = false;

    private java.lang.String ApexTestRunResultId;

    public java.lang.String getApexTestRunResultId() {
      return ApexTestRunResultId;
    }

    public void setApexTestRunResultId(java.lang.String ApexTestRunResultId) {
      this.ApexTestRunResultId = ApexTestRunResultId;
      ApexTestRunResultId__is_set = true;
    }

    protected void setApexTestRunResultId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ApexTestRunResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResultId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setApexTestRunResultId(__typeMapper.readString(__in, _lookupTypeInfo("ApexTestRunResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResultId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexTestRunResultId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ApexTestRunResultId", "urn:sobject.enterprise.soap.sforce.com","ApexTestRunResultId","urn:enterprise.soap.sforce.com","ID",0,1,true), ApexTestRunResultId, ApexTestRunResultId__is_set);
    }

    /**
     * element : AsyncApexJob of type {urn:sobject.enterprise.soap.sforce.com}AsyncApexJob
     * java type: com.sforce.soap.enterprise.sobject.AsyncApexJob
     */
    private boolean AsyncApexJob__is_set = false;

    private com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob;

    public com.sforce.soap.enterprise.sobject.AsyncApexJob getAsyncApexJob() {
      return AsyncApexJob;
    }

    public void setAsyncApexJob(com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob) {
      this.AsyncApexJob = AsyncApexJob;
      AsyncApexJob__is_set = true;
    }

    protected void setAsyncApexJob(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true))) {
        setAsyncApexJob((com.sforce.soap.enterprise.sobject.AsyncApexJob)__typeMapper.readObject(__in, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true), com.sforce.soap.enterprise.sobject.AsyncApexJob.class));
      }
    }

    private void writeFieldAsyncApexJob(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AsyncApexJob", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true), AsyncApexJob, AsyncApexJob__is_set);
    }

    /**
     * element : AsyncApexJobId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean AsyncApexJobId__is_set = false;

    private java.lang.String AsyncApexJobId;

    public java.lang.String getAsyncApexJobId() {
      return AsyncApexJobId;
    }

    public void setAsyncApexJobId(java.lang.String AsyncApexJobId) {
      this.AsyncApexJobId = AsyncApexJobId;
      AsyncApexJobId__is_set = true;
    }

    protected void setAsyncApexJobId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAsyncApexJobId(__typeMapper.readString(__in, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAsyncApexJobId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AsyncApexJobId", "urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true), AsyncApexJobId, AsyncApexJobId__is_set);
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
     * element : MethodName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean MethodName__is_set = false;

    private java.lang.String MethodName;

    public java.lang.String getMethodName() {
      return MethodName;
    }

    public void setMethodName(java.lang.String MethodName) {
      this.MethodName = MethodName;
      MethodName__is_set = true;
    }

    protected void setMethodName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MethodName", "urn:sobject.enterprise.soap.sforce.com","MethodName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMethodName(__typeMapper.readString(__in, _lookupTypeInfo("MethodName", "urn:sobject.enterprise.soap.sforce.com","MethodName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMethodName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MethodName", "urn:sobject.enterprise.soap.sforce.com","MethodName","http://www.w3.org/2001/XMLSchema","string",0,1,true), MethodName, MethodName__is_set);
    }

    /**
     * element : Outcome of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Outcome__is_set = false;

    private java.lang.String Outcome;

    public java.lang.String getOutcome() {
      return Outcome;
    }

    public void setOutcome(java.lang.String Outcome) {
      this.Outcome = Outcome;
      Outcome__is_set = true;
    }

    protected void setOutcome(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Outcome", "urn:sobject.enterprise.soap.sforce.com","Outcome","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOutcome(__typeMapper.readString(__in, _lookupTypeInfo("Outcome", "urn:sobject.enterprise.soap.sforce.com","Outcome","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOutcome(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Outcome", "urn:sobject.enterprise.soap.sforce.com","Outcome","http://www.w3.org/2001/XMLSchema","string",0,1,true), Outcome, Outcome__is_set);
    }

    /**
     * element : QueueItem of type {urn:sobject.enterprise.soap.sforce.com}ApexTestQueueItem
     * java type: com.sforce.soap.enterprise.sobject.ApexTestQueueItem
     */
    private boolean QueueItem__is_set = false;

    private com.sforce.soap.enterprise.sobject.ApexTestQueueItem QueueItem;

    public com.sforce.soap.enterprise.sobject.ApexTestQueueItem getQueueItem() {
      return QueueItem;
    }

    public void setQueueItem(com.sforce.soap.enterprise.sobject.ApexTestQueueItem QueueItem) {
      this.QueueItem = QueueItem;
      QueueItem__is_set = true;
    }

    protected void setQueueItem(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("QueueItem", "urn:sobject.enterprise.soap.sforce.com","QueueItem","urn:sobject.enterprise.soap.sforce.com","ApexTestQueueItem",0,1,true))) {
        setQueueItem((com.sforce.soap.enterprise.sobject.ApexTestQueueItem)__typeMapper.readObject(__in, _lookupTypeInfo("QueueItem", "urn:sobject.enterprise.soap.sforce.com","QueueItem","urn:sobject.enterprise.soap.sforce.com","ApexTestQueueItem",0,1,true), com.sforce.soap.enterprise.sobject.ApexTestQueueItem.class));
      }
    }

    private void writeFieldQueueItem(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("QueueItem", "urn:sobject.enterprise.soap.sforce.com","QueueItem","urn:sobject.enterprise.soap.sforce.com","ApexTestQueueItem",0,1,true), QueueItem, QueueItem__is_set);
    }

    /**
     * element : QueueItemId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean QueueItemId__is_set = false;

    private java.lang.String QueueItemId;

    public java.lang.String getQueueItemId() {
      return QueueItemId;
    }

    public void setQueueItemId(java.lang.String QueueItemId) {
      this.QueueItemId = QueueItemId;
      QueueItemId__is_set = true;
    }

    protected void setQueueItemId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("QueueItemId", "urn:sobject.enterprise.soap.sforce.com","QueueItemId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setQueueItemId(__typeMapper.readString(__in, _lookupTypeInfo("QueueItemId", "urn:sobject.enterprise.soap.sforce.com","QueueItemId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQueueItemId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("QueueItemId", "urn:sobject.enterprise.soap.sforce.com","QueueItemId","urn:enterprise.soap.sforce.com","ID",0,1,true), QueueItemId, QueueItemId__is_set);
    }

    /**
     * element : RunTime of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean RunTime__is_set = false;

    private java.lang.Integer RunTime;

    public java.lang.Integer getRunTime() {
      return RunTime;
    }

    public void setRunTime(java.lang.Integer RunTime) {
      this.RunTime = RunTime;
      RunTime__is_set = true;
    }

    protected void setRunTime(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RunTime", "urn:sobject.enterprise.soap.sforce.com","RunTime","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setRunTime((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("RunTime", "urn:sobject.enterprise.soap.sforce.com","RunTime","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldRunTime(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RunTime", "urn:sobject.enterprise.soap.sforce.com","RunTime","http://www.w3.org/2001/XMLSchema","int",0,1,true), RunTime, RunTime__is_set);
    }

    /**
     * element : StackTrace of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean StackTrace__is_set = false;

    private java.lang.String StackTrace;

    public java.lang.String getStackTrace() {
      return StackTrace;
    }

    public void setStackTrace(java.lang.String StackTrace) {
      this.StackTrace = StackTrace;
      StackTrace__is_set = true;
    }

    protected void setStackTrace(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StackTrace", "urn:sobject.enterprise.soap.sforce.com","StackTrace","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStackTrace(__typeMapper.readString(__in, _lookupTypeInfo("StackTrace", "urn:sobject.enterprise.soap.sforce.com","StackTrace","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStackTrace(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StackTrace", "urn:sobject.enterprise.soap.sforce.com","StackTrace","http://www.w3.org/2001/XMLSchema","string",0,1,true), StackTrace, StackTrace__is_set);
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
     * element : TestTimestamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean TestTimestamp__is_set = false;

    private java.util.Calendar TestTimestamp;

    public java.util.Calendar getTestTimestamp() {
      return TestTimestamp;
    }

    public void setTestTimestamp(java.util.Calendar TestTimestamp) {
      this.TestTimestamp = TestTimestamp;
      TestTimestamp__is_set = true;
    }

    protected void setTestTimestamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("TestTimestamp", "urn:sobject.enterprise.soap.sforce.com","TestTimestamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setTestTimestamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("TestTimestamp", "urn:sobject.enterprise.soap.sforce.com","TestTimestamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldTestTimestamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("TestTimestamp", "urn:sobject.enterprise.soap.sforce.com","TestTimestamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), TestTimestamp, TestTimestamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTestResult");
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
      sb.append("[ApexTestResult ");
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
      writeFieldApexClass(__out, __typeMapper);
      writeFieldApexClassId(__out, __typeMapper);
      writeFieldApexLog(__out, __typeMapper);
      writeFieldApexLogId(__out, __typeMapper);
      writeFieldApexTestResults(__out, __typeMapper);
      writeFieldApexTestRunResult(__out, __typeMapper);
      writeFieldApexTestRunResultId(__out, __typeMapper);
      writeFieldAsyncApexJob(__out, __typeMapper);
      writeFieldAsyncApexJobId(__out, __typeMapper);
      writeFieldMessage(__out, __typeMapper);
      writeFieldMethodName(__out, __typeMapper);
      writeFieldOutcome(__out, __typeMapper);
      writeFieldQueueItem(__out, __typeMapper);
      writeFieldQueueItemId(__out, __typeMapper);
      writeFieldRunTime(__out, __typeMapper);
      writeFieldStackTrace(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
      writeFieldTestTimestamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApexClass(__in, __typeMapper);
      setApexClassId(__in, __typeMapper);
      setApexLog(__in, __typeMapper);
      setApexLogId(__in, __typeMapper);
      setApexTestResults(__in, __typeMapper);
      setApexTestRunResult(__in, __typeMapper);
      setApexTestRunResultId(__in, __typeMapper);
      setAsyncApexJob(__in, __typeMapper);
      setAsyncApexJobId(__in, __typeMapper);
      setMessage(__in, __typeMapper);
      setMethodName(__in, __typeMapper);
      setOutcome(__in, __typeMapper);
      setQueueItem(__in, __typeMapper);
      setQueueItemId(__in, __typeMapper);
      setRunTime(__in, __typeMapper);
      setStackTrace(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
      setTestTimestamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ApexClass", ApexClass);
      toStringHelper(sb, "ApexClassId", ApexClassId);
      toStringHelper(sb, "ApexLog", ApexLog);
      toStringHelper(sb, "ApexLogId", ApexLogId);
      toStringHelper(sb, "ApexTestResults", ApexTestResults);
      toStringHelper(sb, "ApexTestRunResult", ApexTestRunResult);
      toStringHelper(sb, "ApexTestRunResultId", ApexTestRunResultId);
      toStringHelper(sb, "AsyncApexJob", AsyncApexJob);
      toStringHelper(sb, "AsyncApexJobId", AsyncApexJobId);
      toStringHelper(sb, "Message", Message);
      toStringHelper(sb, "MethodName", MethodName);
      toStringHelper(sb, "Outcome", Outcome);
      toStringHelper(sb, "QueueItem", QueueItem);
      toStringHelper(sb, "QueueItemId", QueueItemId);
      toStringHelper(sb, "RunTime", RunTime);
      toStringHelper(sb, "StackTrace", StackTrace);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
      toStringHelper(sb, "TestTimestamp", TestTimestamp);
    }


}
