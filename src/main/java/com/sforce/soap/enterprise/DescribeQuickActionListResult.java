package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeQuickActionListResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeQuickActionListResult() {}

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
     * element : quickActionListItems of type {urn:enterprise.soap.sforce.com}DescribeQuickActionListItemResult
     * java type: com.sforce.soap.enterprise.DescribeQuickActionListItemResult[]
     */
    private boolean quickActionListItems__is_set = false;

    private com.sforce.soap.enterprise.DescribeQuickActionListItemResult[] quickActionListItems = new com.sforce.soap.enterprise.DescribeQuickActionListItemResult[0];

    public com.sforce.soap.enterprise.DescribeQuickActionListItemResult[] getQuickActionListItems() {
      return quickActionListItems;
    }

    public void setQuickActionListItems(com.sforce.soap.enterprise.DescribeQuickActionListItemResult[] quickActionListItems) {
      this.quickActionListItems = quickActionListItems;
      quickActionListItems__is_set = true;
    }

    protected void setQuickActionListItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("quickActionListItems", "urn:enterprise.soap.sforce.com","quickActionListItems","urn:enterprise.soap.sforce.com","DescribeQuickActionListItemResult",0,-1,true))) {
        setQuickActionListItems((com.sforce.soap.enterprise.DescribeQuickActionListItemResult[])__typeMapper.readObject(__in, _lookupTypeInfo("quickActionListItems", "urn:enterprise.soap.sforce.com","quickActionListItems","urn:enterprise.soap.sforce.com","DescribeQuickActionListItemResult",0,-1,true), com.sforce.soap.enterprise.DescribeQuickActionListItemResult[].class));
      }
    }

    private void writeFieldQuickActionListItems(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("quickActionListItems", "urn:enterprise.soap.sforce.com","quickActionListItems","urn:enterprise.soap.sforce.com","DescribeQuickActionListItemResult",0,-1,true), quickActionListItems, quickActionListItems__is_set);
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
      sb.append("[DescribeQuickActionListResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldQuickActionListItems(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setQuickActionListItems(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "quickActionListItems", quickActionListItems);
    }


}
