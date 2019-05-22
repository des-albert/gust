package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class MatchResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public MatchResult() {}

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
     * element : entityType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean entityType__is_set = false;

    private java.lang.String entityType;

    public java.lang.String getEntityType() {
      return entityType;
    }

    public void setEntityType(java.lang.String entityType) {
      this.entityType = entityType;
      entityType__is_set = true;
    }

    protected void setEntityType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("entityType", "urn:enterprise.soap.sforce.com","entityType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEntityType(__typeMapper.readString(__in, _lookupTypeInfo("entityType", "urn:enterprise.soap.sforce.com","entityType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEntityType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("entityType", "urn:enterprise.soap.sforce.com","entityType","http://www.w3.org/2001/XMLSchema","string",1,1,true), entityType, entityType__is_set);
    }

    /**
     * element : errors of type {urn:enterprise.soap.sforce.com}Error
     * java type: com.sforce.soap.enterprise.Error[]
     */
    private boolean errors__is_set = false;

    private com.sforce.soap.enterprise.Error[] errors = new com.sforce.soap.enterprise.Error[0];

    public com.sforce.soap.enterprise.Error[] getErrors() {
      return errors;
    }

    public void setErrors(com.sforce.soap.enterprise.Error[] errors) {
      this.errors = errors;
      errors__is_set = true;
    }

    protected void setErrors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true))) {
        setErrors((com.sforce.soap.enterprise.Error[])__typeMapper.readObject(__in, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true), com.sforce.soap.enterprise.Error[].class));
      }
    }

    private void writeFieldErrors(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("errors", "urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true), errors, errors__is_set);
    }

    /**
     * element : matchEngine of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean matchEngine__is_set = false;

    private java.lang.String matchEngine;

    public java.lang.String getMatchEngine() {
      return matchEngine;
    }

    public void setMatchEngine(java.lang.String matchEngine) {
      this.matchEngine = matchEngine;
      matchEngine__is_set = true;
    }

    protected void setMatchEngine(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("matchEngine", "urn:enterprise.soap.sforce.com","matchEngine","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMatchEngine(__typeMapper.readString(__in, _lookupTypeInfo("matchEngine", "urn:enterprise.soap.sforce.com","matchEngine","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMatchEngine(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("matchEngine", "urn:enterprise.soap.sforce.com","matchEngine","http://www.w3.org/2001/XMLSchema","string",1,1,true), matchEngine, matchEngine__is_set);
    }

    /**
     * element : matchRecords of type {urn:enterprise.soap.sforce.com}MatchRecord
     * java type: com.sforce.soap.enterprise.MatchRecord[]
     */
    private boolean matchRecords__is_set = false;

    private com.sforce.soap.enterprise.MatchRecord[] matchRecords = new com.sforce.soap.enterprise.MatchRecord[0];

    public com.sforce.soap.enterprise.MatchRecord[] getMatchRecords() {
      return matchRecords;
    }

    public void setMatchRecords(com.sforce.soap.enterprise.MatchRecord[] matchRecords) {
      this.matchRecords = matchRecords;
      matchRecords__is_set = true;
    }

    protected void setMatchRecords(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("matchRecords", "urn:enterprise.soap.sforce.com","matchRecords","urn:enterprise.soap.sforce.com","MatchRecord",0,-1,true))) {
        setMatchRecords((com.sforce.soap.enterprise.MatchRecord[])__typeMapper.readObject(__in, _lookupTypeInfo("matchRecords", "urn:enterprise.soap.sforce.com","matchRecords","urn:enterprise.soap.sforce.com","MatchRecord",0,-1,true), com.sforce.soap.enterprise.MatchRecord[].class));
      }
    }

    private void writeFieldMatchRecords(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("matchRecords", "urn:enterprise.soap.sforce.com","matchRecords","urn:enterprise.soap.sforce.com","MatchRecord",0,-1,true), matchRecords, matchRecords__is_set);
    }

    /**
     * element : rule of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean rule__is_set = false;

    private java.lang.String rule;

    public java.lang.String getRule() {
      return rule;
    }

    public void setRule(java.lang.String rule) {
      this.rule = rule;
      rule__is_set = true;
    }

    protected void setRule(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("rule", "urn:enterprise.soap.sforce.com","rule","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setRule(__typeMapper.readString(__in, _lookupTypeInfo("rule", "urn:enterprise.soap.sforce.com","rule","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRule(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("rule", "urn:enterprise.soap.sforce.com","rule","http://www.w3.org/2001/XMLSchema","string",1,1,true), rule, rule__is_set);
    }

    /**
     * element : size of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean size__is_set = false;

    private int size;

    public int getSize() {
      return size;
    }

    public void setSize(int size) {
      this.size = size;
      size__is_set = true;
    }

    protected void setSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setSize((int)__typeMapper.readInt(__in, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldSize(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","http://www.w3.org/2001/XMLSchema","int",1,1,true), size, size__is_set);
    }

    /**
     * element : success of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean success__is_set = false;

    private boolean success;

    public boolean getSuccess() {
      return success;
    }

    public boolean isSuccess() {
      return success;
    }

    public void setSuccess(boolean success) {
      this.success = success;
      success__is_set = true;
    }

    protected void setSuccess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setSuccess(__typeMapper.readBoolean(__in, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldSuccess(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("success", "urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), success, success__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
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
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[MatchResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEntityType(__out, __typeMapper);
      writeFieldErrors(__out, __typeMapper);
      writeFieldMatchEngine(__out, __typeMapper);
      writeFieldMatchRecords(__out, __typeMapper);
      writeFieldRule(__out, __typeMapper);
      writeFieldSize(__out, __typeMapper);
      writeFieldSuccess(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEntityType(__in, __typeMapper);
      setErrors(__in, __typeMapper);
      setMatchEngine(__in, __typeMapper);
      setMatchRecords(__in, __typeMapper);
      setRule(__in, __typeMapper);
      setSize(__in, __typeMapper);
      setSuccess(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "entityType", entityType);
      toStringHelper(sb, "errors", errors);
      toStringHelper(sb, "matchEngine", matchEngine);
      toStringHelper(sb, "matchRecords", matchRecords);
      toStringHelper(sb, "rule", rule);
      toStringHelper(sb, "size", size);
      toStringHelper(sb, "success", success);
    }


}