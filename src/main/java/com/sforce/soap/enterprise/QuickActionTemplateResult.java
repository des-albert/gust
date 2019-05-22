package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class QuickActionTemplateResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public QuickActionTemplateResult() {}

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
     * element : contextId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean contextId__is_set = false;

    private java.lang.String contextId;

    public java.lang.String getContextId() {
      return contextId;
    }

    public void setContextId(java.lang.String contextId) {
      this.contextId = contextId;
      contextId__is_set = true;
    }

    protected void setContextId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("contextId", "urn:enterprise.soap.sforce.com","contextId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setContextId(__typeMapper.readString(__in, _lookupTypeInfo("contextId", "urn:enterprise.soap.sforce.com","contextId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContextId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("contextId", "urn:enterprise.soap.sforce.com","contextId","http://www.w3.org/2001/XMLSchema","string",1,1,true), contextId, contextId__is_set);
    }

    /**
     * element : defaultValueFormulas of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean defaultValueFormulas__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject defaultValueFormulas;

    public com.sforce.soap.enterprise.sobject.SObject getDefaultValueFormulas() {
      return defaultValueFormulas;
    }

    public void setDefaultValueFormulas(com.sforce.soap.enterprise.sobject.SObject defaultValueFormulas) {
      this.defaultValueFormulas = defaultValueFormulas;
      defaultValueFormulas__is_set = true;
    }

    protected void setDefaultValueFormulas(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("defaultValueFormulas", "urn:enterprise.soap.sforce.com","defaultValueFormulas","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true))) {
        setDefaultValueFormulas((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("defaultValueFormulas", "urn:enterprise.soap.sforce.com","defaultValueFormulas","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldDefaultValueFormulas(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("defaultValueFormulas", "urn:enterprise.soap.sforce.com","defaultValueFormulas","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true), defaultValueFormulas, defaultValueFormulas__is_set);
    }

    /**
     * element : defaultValues of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean defaultValues__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject defaultValues;

    public com.sforce.soap.enterprise.sobject.SObject getDefaultValues() {
      return defaultValues;
    }

    public void setDefaultValues(com.sforce.soap.enterprise.sobject.SObject defaultValues) {
      this.defaultValues = defaultValues;
      defaultValues__is_set = true;
    }

    protected void setDefaultValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("defaultValues", "urn:enterprise.soap.sforce.com","defaultValues","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true))) {
        setDefaultValues((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("defaultValues", "urn:enterprise.soap.sforce.com","defaultValues","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldDefaultValues(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("defaultValues", "urn:enterprise.soap.sforce.com","defaultValues","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true), defaultValues, defaultValues__is_set);
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
      sb.append("[QuickActionTemplateResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldContextId(__out, __typeMapper);
      writeFieldDefaultValueFormulas(__out, __typeMapper);
      writeFieldDefaultValues(__out, __typeMapper);
      writeFieldErrors(__out, __typeMapper);
      writeFieldSuccess(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setContextId(__in, __typeMapper);
      setDefaultValueFormulas(__in, __typeMapper);
      setDefaultValues(__in, __typeMapper);
      setErrors(__in, __typeMapper);
      setSuccess(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "contextId", contextId);
      toStringHelper(sb, "defaultValueFormulas", defaultValueFormulas);
      toStringHelper(sb, "defaultValues", defaultValues);
      toStringHelper(sb, "errors", errors);
      toStringHelper(sb, "success", success);
    }


}