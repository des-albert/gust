package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeGlobalResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeGlobalResult() {}

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
     * element : encoding of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean encoding__is_set = false;

    private java.lang.String encoding;

    public java.lang.String getEncoding() {
      return encoding;
    }

    public void setEncoding(java.lang.String encoding) {
      this.encoding = encoding;
      encoding__is_set = true;
    }

    protected void setEncoding(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("encoding", "urn:enterprise.soap.sforce.com","encoding","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEncoding(__typeMapper.readString(__in, _lookupTypeInfo("encoding", "urn:enterprise.soap.sforce.com","encoding","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEncoding(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("encoding", "urn:enterprise.soap.sforce.com","encoding","http://www.w3.org/2001/XMLSchema","string",1,1,true), encoding, encoding__is_set);
    }

    /**
     * element : maxBatchSize of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean maxBatchSize__is_set = false;

    private int maxBatchSize;

    public int getMaxBatchSize() {
      return maxBatchSize;
    }

    public void setMaxBatchSize(int maxBatchSize) {
      this.maxBatchSize = maxBatchSize;
      maxBatchSize__is_set = true;
    }

    protected void setMaxBatchSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("maxBatchSize", "urn:enterprise.soap.sforce.com","maxBatchSize","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setMaxBatchSize((int)__typeMapper.readInt(__in, _lookupTypeInfo("maxBatchSize", "urn:enterprise.soap.sforce.com","maxBatchSize","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldMaxBatchSize(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("maxBatchSize", "urn:enterprise.soap.sforce.com","maxBatchSize","http://www.w3.org/2001/XMLSchema","int",1,1,true), maxBatchSize, maxBatchSize__is_set);
    }

    /**
     * element : sobjects of type {urn:enterprise.soap.sforce.com}DescribeGlobalSObjectResult
     * java type: com.sforce.soap.enterprise.DescribeGlobalSObjectResult[]
     */
    private boolean sobjects__is_set = false;

    private com.sforce.soap.enterprise.DescribeGlobalSObjectResult[] sobjects = new com.sforce.soap.enterprise.DescribeGlobalSObjectResult[0];

    public com.sforce.soap.enterprise.DescribeGlobalSObjectResult[] getSobjects() {
      return sobjects;
    }

    public void setSobjects(com.sforce.soap.enterprise.DescribeGlobalSObjectResult[] sobjects) {
      this.sobjects = sobjects;
      sobjects__is_set = true;
    }

    protected void setSobjects(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("sobjects", "urn:enterprise.soap.sforce.com","sobjects","urn:enterprise.soap.sforce.com","DescribeGlobalSObjectResult",0,-1,true))) {
        setSobjects((com.sforce.soap.enterprise.DescribeGlobalSObjectResult[])__typeMapper.readObject(__in, _lookupTypeInfo("sobjects", "urn:enterprise.soap.sforce.com","sobjects","urn:enterprise.soap.sforce.com","DescribeGlobalSObjectResult",0,-1,true), com.sforce.soap.enterprise.DescribeGlobalSObjectResult[].class));
      }
    }

    private void writeFieldSobjects(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sobjects", "urn:enterprise.soap.sforce.com","sobjects","urn:enterprise.soap.sforce.com","DescribeGlobalSObjectResult",0,-1,true), sobjects, sobjects__is_set);
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
      sb.append("[DescribeGlobalResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEncoding(__out, __typeMapper);
      writeFieldMaxBatchSize(__out, __typeMapper);
      writeFieldSobjects(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEncoding(__in, __typeMapper);
      setMaxBatchSize(__in, __typeMapper);
      setSobjects(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "encoding", encoding);
      toStringHelper(sb, "maxBatchSize", maxBatchSize);
      toStringHelper(sb, "sobjects", sobjects);
    }


}
