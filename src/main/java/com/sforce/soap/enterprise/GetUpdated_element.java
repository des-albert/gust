package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class GetUpdated_element implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public GetUpdated_element() {}

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
     * element : sObjectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean sObjectType__is_set = false;

    private java.lang.String sObjectType;

    public java.lang.String getSObjectType() {
      return sObjectType;
    }

    public void setSObjectType(java.lang.String sObjectType) {
      this.sObjectType = sObjectType;
      sObjectType__is_set = true;
    }

    protected void setSObjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sObjectType", "urn:enterprise.soap.sforce.com","sObjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setSObjectType(__typeMapper.readString(__in, _lookupTypeInfo("sObjectType", "urn:enterprise.soap.sforce.com","sObjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSObjectType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sObjectType", "urn:enterprise.soap.sforce.com","sObjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true), sObjectType, sObjectType__is_set);
    }

    /**
     * element : startDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean startDate__is_set = false;

    private java.util.Calendar startDate;

    public java.util.Calendar getStartDate() {
      return startDate;
    }

    public void setStartDate(java.util.Calendar startDate) {
      this.startDate = startDate;
      startDate__is_set = true;
    }

    protected void setStartDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("startDate", "urn:enterprise.soap.sforce.com","startDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true))) {
        setStartDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("startDate", "urn:enterprise.soap.sforce.com","startDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldStartDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("startDate", "urn:enterprise.soap.sforce.com","startDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true), startDate, startDate__is_set);
    }

    /**
     * element : endDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean endDate__is_set = false;

    private java.util.Calendar endDate;

    public java.util.Calendar getEndDate() {
      return endDate;
    }

    public void setEndDate(java.util.Calendar endDate) {
      this.endDate = endDate;
      endDate__is_set = true;
    }

    protected void setEndDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("endDate", "urn:enterprise.soap.sforce.com","endDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true))) {
        setEndDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("endDate", "urn:enterprise.soap.sforce.com","endDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldEndDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("endDate", "urn:enterprise.soap.sforce.com","endDate","http://www.w3.org/2001/XMLSchema","dateTime",1,1,true), endDate, endDate__is_set);
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
      sb.append("[GetUpdated_element ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldSObjectType(__out, __typeMapper);
      writeFieldStartDate(__out, __typeMapper);
      writeFieldEndDate(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setSObjectType(__in, __typeMapper);
      setStartDate(__in, __typeMapper);
      setEndDate(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "sObjectType", sObjectType);
      toStringHelper(sb, "startDate", startDate);
      toStringHelper(sb, "endDate", endDate);
    }


}
