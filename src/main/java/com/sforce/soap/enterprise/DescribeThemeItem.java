package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeThemeItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeThemeItem() {}

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
     * element : colors of type {urn:enterprise.soap.sforce.com}DescribeColor
     * java type: com.sforce.soap.enterprise.DescribeColor[]
     */
    private boolean colors__is_set = false;

    private com.sforce.soap.enterprise.DescribeColor[] colors = new com.sforce.soap.enterprise.DescribeColor[0];

    public com.sforce.soap.enterprise.DescribeColor[] getColors() {
      return colors;
    }

    public void setColors(com.sforce.soap.enterprise.DescribeColor[] colors) {
      this.colors = colors;
      colors__is_set = true;
    }

    protected void setColors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("colors", "urn:enterprise.soap.sforce.com","colors","urn:enterprise.soap.sforce.com","DescribeColor",0,-1,true))) {
        setColors((com.sforce.soap.enterprise.DescribeColor[])__typeMapper.readObject(__in, _lookupTypeInfo("colors", "urn:enterprise.soap.sforce.com","colors","urn:enterprise.soap.sforce.com","DescribeColor",0,-1,true), com.sforce.soap.enterprise.DescribeColor[].class));
      }
    }

    private void writeFieldColors(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("colors", "urn:enterprise.soap.sforce.com","colors","urn:enterprise.soap.sforce.com","DescribeColor",0,-1,true), colors, colors__is_set);
    }

    /**
     * element : icons of type {urn:enterprise.soap.sforce.com}DescribeIcon
     * java type: com.sforce.soap.enterprise.DescribeIcon[]
     */
    private boolean icons__is_set = false;

    private com.sforce.soap.enterprise.DescribeIcon[] icons = new com.sforce.soap.enterprise.DescribeIcon[0];

    public com.sforce.soap.enterprise.DescribeIcon[] getIcons() {
      return icons;
    }

    public void setIcons(com.sforce.soap.enterprise.DescribeIcon[] icons) {
      this.icons = icons;
      icons__is_set = true;
    }

    protected void setIcons(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("icons", "urn:enterprise.soap.sforce.com","icons","urn:enterprise.soap.sforce.com","DescribeIcon",0,-1,true))) {
        setIcons((com.sforce.soap.enterprise.DescribeIcon[])__typeMapper.readObject(__in, _lookupTypeInfo("icons", "urn:enterprise.soap.sforce.com","icons","urn:enterprise.soap.sforce.com","DescribeIcon",0,-1,true), com.sforce.soap.enterprise.DescribeIcon[].class));
      }
    }

    private void writeFieldIcons(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("icons", "urn:enterprise.soap.sforce.com","icons","urn:enterprise.soap.sforce.com","DescribeIcon",0,-1,true), icons, icons__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
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
      sb.append("[DescribeThemeItem ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldColors(__out, __typeMapper);
      writeFieldIcons(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setColors(__in, __typeMapper);
      setIcons(__in, __typeMapper);
      setName(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "colors", colors);
      toStringHelper(sb, "icons", icons);
      toStringHelper(sb, "name", name);
    }


}
