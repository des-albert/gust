package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ReportChartComponent extends com.sforce.soap.enterprise.DescribeLayoutComponent {

    /**
     * Constructor
     */
    public ReportChartComponent() {}

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
     * element : cacheData of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean cacheData__is_set = false;

    private boolean cacheData;

    public boolean getCacheData() {
      return cacheData;
    }

    public boolean isCacheData() {
      return cacheData;
    }

    public void setCacheData(boolean cacheData) {
      this.cacheData = cacheData;
      cacheData__is_set = true;
    }

    protected void setCacheData(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("cacheData", "urn:enterprise.soap.sforce.com","cacheData","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setCacheData(__typeMapper.readBoolean(__in, _lookupTypeInfo("cacheData", "urn:enterprise.soap.sforce.com","cacheData","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldCacheData(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("cacheData", "urn:enterprise.soap.sforce.com","cacheData","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), cacheData, cacheData__is_set);
    }

    /**
     * element : contextFilterableField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean contextFilterableField__is_set = false;

    private java.lang.String contextFilterableField;

    public java.lang.String getContextFilterableField() {
      return contextFilterableField;
    }

    public void setContextFilterableField(java.lang.String contextFilterableField) {
      this.contextFilterableField = contextFilterableField;
      contextFilterableField__is_set = true;
    }

    protected void setContextFilterableField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("contextFilterableField", "urn:enterprise.soap.sforce.com","contextFilterableField","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setContextFilterableField(__typeMapper.readString(__in, _lookupTypeInfo("contextFilterableField", "urn:enterprise.soap.sforce.com","contextFilterableField","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContextFilterableField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("contextFilterableField", "urn:enterprise.soap.sforce.com","contextFilterableField","http://www.w3.org/2001/XMLSchema","string",1,1,true), contextFilterableField, contextFilterableField__is_set);
    }

    /**
     * element : error of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean error__is_set = false;

    private java.lang.String error;

    public java.lang.String getError() {
      return error;
    }

    public void setError(java.lang.String error) {
      this.error = error;
      error__is_set = true;
    }

    protected void setError(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("error", "urn:enterprise.soap.sforce.com","error","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setError(__typeMapper.readString(__in, _lookupTypeInfo("error", "urn:enterprise.soap.sforce.com","error","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldError(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("error", "urn:enterprise.soap.sforce.com","error","http://www.w3.org/2001/XMLSchema","string",1,1,true), error, error__is_set);
    }

    /**
     * element : hideOnError of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean hideOnError__is_set = false;

    private boolean hideOnError;

    public boolean getHideOnError() {
      return hideOnError;
    }

    public boolean isHideOnError() {
      return hideOnError;
    }

    public void setHideOnError(boolean hideOnError) {
      this.hideOnError = hideOnError;
      hideOnError__is_set = true;
    }

    protected void setHideOnError(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("hideOnError", "urn:enterprise.soap.sforce.com","hideOnError","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setHideOnError(__typeMapper.readBoolean(__in, _lookupTypeInfo("hideOnError", "urn:enterprise.soap.sforce.com","hideOnError","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldHideOnError(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("hideOnError", "urn:enterprise.soap.sforce.com","hideOnError","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), hideOnError, hideOnError__is_set);
    }

    /**
     * element : includeContext of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean includeContext__is_set = false;

    private boolean includeContext;

    public boolean getIncludeContext() {
      return includeContext;
    }

    public boolean isIncludeContext() {
      return includeContext;
    }

    public void setIncludeContext(boolean includeContext) {
      this.includeContext = includeContext;
      includeContext__is_set = true;
    }

    protected void setIncludeContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("includeContext", "urn:enterprise.soap.sforce.com","includeContext","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setIncludeContext(__typeMapper.readBoolean(__in, _lookupTypeInfo("includeContext", "urn:enterprise.soap.sforce.com","includeContext","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldIncludeContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("includeContext", "urn:enterprise.soap.sforce.com","includeContext","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), includeContext, includeContext__is_set);
    }

    /**
     * element : showTitle of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean showTitle__is_set = false;

    private boolean showTitle;

    public boolean getShowTitle() {
      return showTitle;
    }

    public boolean isShowTitle() {
      return showTitle;
    }

    public void setShowTitle(boolean showTitle) {
      this.showTitle = showTitle;
      showTitle__is_set = true;
    }

    protected void setShowTitle(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("showTitle", "urn:enterprise.soap.sforce.com","showTitle","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setShowTitle(__typeMapper.readBoolean(__in, _lookupTypeInfo("showTitle", "urn:enterprise.soap.sforce.com","showTitle","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldShowTitle(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("showTitle", "urn:enterprise.soap.sforce.com","showTitle","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), showTitle, showTitle__is_set);
    }

    /**
     * element : size of type {urn:enterprise.soap.sforce.com}ReportChartSize
     * java type: com.sforce.soap.enterprise.ReportChartSize
     */
    private boolean size__is_set = false;

    private com.sforce.soap.enterprise.ReportChartSize size;

    public com.sforce.soap.enterprise.ReportChartSize getSize() {
      return size;
    }

    public void setSize(com.sforce.soap.enterprise.ReportChartSize size) {
      this.size = size;
      size__is_set = true;
    }

    protected void setSize(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","urn:enterprise.soap.sforce.com","ReportChartSize",1,1,true))) {
        setSize((com.sforce.soap.enterprise.ReportChartSize)__typeMapper.readObject(__in, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","urn:enterprise.soap.sforce.com","ReportChartSize",1,1,true), com.sforce.soap.enterprise.ReportChartSize.class));
      }
    }

    private void writeFieldSize(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("size", "urn:enterprise.soap.sforce.com","size","urn:enterprise.soap.sforce.com","ReportChartSize",1,1,true), size, size__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "ReportChartComponent");
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
      sb.append("[ReportChartComponent ");
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
      writeFieldCacheData(__out, __typeMapper);
      writeFieldContextFilterableField(__out, __typeMapper);
      writeFieldError(__out, __typeMapper);
      writeFieldHideOnError(__out, __typeMapper);
      writeFieldIncludeContext(__out, __typeMapper);
      writeFieldShowTitle(__out, __typeMapper);
      writeFieldSize(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCacheData(__in, __typeMapper);
      setContextFilterableField(__in, __typeMapper);
      setError(__in, __typeMapper);
      setHideOnError(__in, __typeMapper);
      setIncludeContext(__in, __typeMapper);
      setShowTitle(__in, __typeMapper);
      setSize(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "cacheData", cacheData);
      toStringHelper(sb, "contextFilterableField", contextFilterableField);
      toStringHelper(sb, "error", error);
      toStringHelper(sb, "hideOnError", hideOnError);
      toStringHelper(sb, "includeContext", includeContext);
      toStringHelper(sb, "showTitle", showTitle);
      toStringHelper(sb, "size", size);
    }


}
