package com.sforce.soap.enterprise;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeSoftphoneLayoutCallType implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeSoftphoneLayoutCallType() {}

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
     * element : infoFields of type {urn:enterprise.soap.sforce.com}DescribeSoftphoneLayoutInfoField
     * java type: com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[]
     */
    private boolean infoFields__is_set = false;

    private com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[] infoFields = new com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[0];

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[] getInfoFields() {
      return infoFields;
    }

    public void setInfoFields(com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[] infoFields) {
      this.infoFields = infoFields;
      infoFields__is_set = true;
    }

    protected void setInfoFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("infoFields", "urn:enterprise.soap.sforce.com","infoFields","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutInfoField",1,-1,true))) {
        setInfoFields((com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[])__typeMapper.readObject(__in, _lookupTypeInfo("infoFields", "urn:enterprise.soap.sforce.com","infoFields","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutInfoField",1,-1,true), com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField[].class));
      }
    }

    private void writeFieldInfoFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("infoFields", "urn:enterprise.soap.sforce.com","infoFields","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutInfoField",1,-1,true), infoFields, infoFields__is_set);
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
     * element : screenPopOptions of type {urn:enterprise.soap.sforce.com}DescribeSoftphoneScreenPopOption
     * java type: com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[]
     */
    private boolean screenPopOptions__is_set = false;

    private com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[] screenPopOptions = new com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[0];

    public com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[] getScreenPopOptions() {
      return screenPopOptions;
    }

    public void setScreenPopOptions(com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[] screenPopOptions) {
      this.screenPopOptions = screenPopOptions;
      screenPopOptions__is_set = true;
    }

    protected void setScreenPopOptions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("screenPopOptions", "urn:enterprise.soap.sforce.com","screenPopOptions","urn:enterprise.soap.sforce.com","DescribeSoftphoneScreenPopOption",0,-1,true))) {
        setScreenPopOptions((com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[])__typeMapper.readObject(__in, _lookupTypeInfo("screenPopOptions", "urn:enterprise.soap.sforce.com","screenPopOptions","urn:enterprise.soap.sforce.com","DescribeSoftphoneScreenPopOption",0,-1,true), com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption[].class));
      }
    }

    private void writeFieldScreenPopOptions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("screenPopOptions", "urn:enterprise.soap.sforce.com","screenPopOptions","urn:enterprise.soap.sforce.com","DescribeSoftphoneScreenPopOption",0,-1,true), screenPopOptions, screenPopOptions__is_set);
    }

    /**
     * element : screenPopsOpenWithin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean screenPopsOpenWithin__is_set = false;

    private java.lang.String screenPopsOpenWithin;

    public java.lang.String getScreenPopsOpenWithin() {
      return screenPopsOpenWithin;
    }

    public void setScreenPopsOpenWithin(java.lang.String screenPopsOpenWithin) {
      this.screenPopsOpenWithin = screenPopsOpenWithin;
      screenPopsOpenWithin__is_set = true;
    }

    protected void setScreenPopsOpenWithin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("screenPopsOpenWithin", "urn:enterprise.soap.sforce.com","screenPopsOpenWithin","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setScreenPopsOpenWithin(__typeMapper.readString(__in, _lookupTypeInfo("screenPopsOpenWithin", "urn:enterprise.soap.sforce.com","screenPopsOpenWithin","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldScreenPopsOpenWithin(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("screenPopsOpenWithin", "urn:enterprise.soap.sforce.com","screenPopsOpenWithin","http://www.w3.org/2001/XMLSchema","string",0,1,true), screenPopsOpenWithin, screenPopsOpenWithin__is_set);
    }

    /**
     * element : sections of type {urn:enterprise.soap.sforce.com}DescribeSoftphoneLayoutSection
     * java type: com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[]
     */
    private boolean sections__is_set = false;

    private com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[] sections = new com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[0];

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[] getSections() {
      return sections;
    }

    public void setSections(com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[] sections) {
      this.sections = sections;
      sections__is_set = true;
    }

    protected void setSections(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("sections", "urn:enterprise.soap.sforce.com","sections","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutSection",0,-1,true))) {
        setSections((com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[])__typeMapper.readObject(__in, _lookupTypeInfo("sections", "urn:enterprise.soap.sforce.com","sections","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutSection",0,-1,true), com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection[].class));
      }
    }

    private void writeFieldSections(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sections", "urn:enterprise.soap.sforce.com","sections","urn:enterprise.soap.sforce.com","DescribeSoftphoneLayoutSection",0,-1,true), sections, sections__is_set);
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
      sb.append("[DescribeSoftphoneLayoutCallType ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldInfoFields(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldScreenPopOptions(__out, __typeMapper);
      writeFieldScreenPopsOpenWithin(__out, __typeMapper);
      writeFieldSections(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setInfoFields(__in, __typeMapper);
      setName(__in, __typeMapper);
      setScreenPopOptions(__in, __typeMapper);
      setScreenPopsOpenWithin(__in, __typeMapper);
      setSections(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "infoFields", infoFields);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "screenPopOptions", screenPopOptions);
      toStringHelper(sb, "screenPopsOpenWithin", screenPopsOpenWithin);
      toStringHelper(sb, "sections", sections);
    }


}