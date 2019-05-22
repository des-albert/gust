package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeSoftphoneScreenPopOption implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeSoftphoneScreenPopOption() {}

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
     * element : matchType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean matchType__is_set = false;

    private java.lang.String matchType;

    public java.lang.String getMatchType() {
      return matchType;
    }

    public void setMatchType(java.lang.String matchType) {
      this.matchType = matchType;
      matchType__is_set = true;
    }

    protected void setMatchType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("matchType", "urn:enterprise.soap.sforce.com","matchType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMatchType(__typeMapper.readString(__in, _lookupTypeInfo("matchType", "urn:enterprise.soap.sforce.com","matchType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMatchType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("matchType", "urn:enterprise.soap.sforce.com","matchType","http://www.w3.org/2001/XMLSchema","string",1,1,true), matchType, matchType__is_set);
    }

    /**
     * element : screenPopData of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean screenPopData__is_set = false;

    private java.lang.String screenPopData;

    public java.lang.String getScreenPopData() {
      return screenPopData;
    }

    public void setScreenPopData(java.lang.String screenPopData) {
      this.screenPopData = screenPopData;
      screenPopData__is_set = true;
    }

    protected void setScreenPopData(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("screenPopData", "urn:enterprise.soap.sforce.com","screenPopData","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setScreenPopData(__typeMapper.readString(__in, _lookupTypeInfo("screenPopData", "urn:enterprise.soap.sforce.com","screenPopData","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldScreenPopData(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("screenPopData", "urn:enterprise.soap.sforce.com","screenPopData","http://www.w3.org/2001/XMLSchema","string",1,1,true), screenPopData, screenPopData__is_set);
    }

    /**
     * element : screenPopType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean screenPopType__is_set = false;

    private java.lang.String screenPopType;

    public java.lang.String getScreenPopType() {
      return screenPopType;
    }

    public void setScreenPopType(java.lang.String screenPopType) {
      this.screenPopType = screenPopType;
      screenPopType__is_set = true;
    }

    protected void setScreenPopType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("screenPopType", "urn:enterprise.soap.sforce.com","screenPopType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setScreenPopType(__typeMapper.readString(__in, _lookupTypeInfo("screenPopType", "urn:enterprise.soap.sforce.com","screenPopType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldScreenPopType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("screenPopType", "urn:enterprise.soap.sforce.com","screenPopType","http://www.w3.org/2001/XMLSchema","string",1,1,true), screenPopType, screenPopType__is_set);
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
      sb.append("[DescribeSoftphoneScreenPopOption ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldMatchType(__out, __typeMapper);
      writeFieldScreenPopData(__out, __typeMapper);
      writeFieldScreenPopType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setMatchType(__in, __typeMapper);
      setScreenPopData(__in, __typeMapper);
      setScreenPopType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "matchType", matchType);
      toStringHelper(sb, "screenPopData", screenPopData);
      toStringHelper(sb, "screenPopType", screenPopType);
    }


}
