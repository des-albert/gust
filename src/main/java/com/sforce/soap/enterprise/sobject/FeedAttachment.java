package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FeedAttachment extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public FeedAttachment() {}

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
     * element : FeedEntityId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean FeedEntityId__is_set = false;

    private java.lang.String FeedEntityId;

    public java.lang.String getFeedEntityId() {
      return FeedEntityId;
    }

    public void setFeedEntityId(java.lang.String FeedEntityId) {
      this.FeedEntityId = FeedEntityId;
      FeedEntityId__is_set = true;
    }

    protected void setFeedEntityId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FeedEntityId", "urn:sobject.enterprise.soap.sforce.com","FeedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setFeedEntityId(__typeMapper.readString(__in, _lookupTypeInfo("FeedEntityId", "urn:sobject.enterprise.soap.sforce.com","FeedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFeedEntityId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FeedEntityId", "urn:sobject.enterprise.soap.sforce.com","FeedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true), FeedEntityId, FeedEntityId__is_set);
    }

    /**
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    protected void setIsDeleted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsDeleted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsDeleted", "urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsDeleted, IsDeleted__is_set);
    }

    /**
     * element : RecordId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean RecordId__is_set = false;

    private java.lang.String RecordId;

    public java.lang.String getRecordId() {
      return RecordId;
    }

    public void setRecordId(java.lang.String RecordId) {
      this.RecordId = RecordId;
      RecordId__is_set = true;
    }

    protected void setRecordId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RecordId", "urn:sobject.enterprise.soap.sforce.com","RecordId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setRecordId(__typeMapper.readString(__in, _lookupTypeInfo("RecordId", "urn:sobject.enterprise.soap.sforce.com","RecordId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRecordId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RecordId", "urn:sobject.enterprise.soap.sforce.com","RecordId","urn:enterprise.soap.sforce.com","ID",0,1,true), RecordId, RecordId__is_set);
    }

    /**
     * element : Title of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Title__is_set = false;

    private java.lang.String Title;

    public java.lang.String getTitle() {
      return Title;
    }

    public void setTitle(java.lang.String Title) {
      this.Title = Title;
      Title__is_set = true;
    }

    protected void setTitle(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Title", "urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTitle(__typeMapper.readString(__in, _lookupTypeInfo("Title", "urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTitle(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Title", "urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true), Title, Title__is_set);
    }

    /**
     * element : Type of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Type__is_set = false;

    private java.lang.String Type;

    public java.lang.String getType() {
      return Type;
    }

    public void setType(java.lang.String Type) {
      this.Type = Type;
      Type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setType(__typeMapper.readString(__in, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Type", "urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true), Type, Type__is_set);
    }

    /**
     * element : Value of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Value__is_set = false;

    private java.lang.String Value;

    public java.lang.String getValue() {
      return Value;
    }

    public void setValue(java.lang.String Value) {
      this.Value = Value;
      Value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Value", "urn:sobject.enterprise.soap.sforce.com","Value","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setValue(__typeMapper.readString(__in, _lookupTypeInfo("Value", "urn:sobject.enterprise.soap.sforce.com","Value","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Value", "urn:sobject.enterprise.soap.sforce.com","Value","http://www.w3.org/2001/XMLSchema","string",0,1,true), Value, Value__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedAttachment");
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
      sb.append("[FeedAttachment ");
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
      writeFieldFeedEntityId(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldRecordId(__out, __typeMapper);
      writeFieldTitle(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
      writeFieldValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setFeedEntityId(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setRecordId(__in, __typeMapper);
      setTitle(__in, __typeMapper);
      setType(__in, __typeMapper);
      setValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "FeedEntityId", FeedEntityId);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "RecordId", RecordId);
      toStringHelper(sb, "Title", Title);
      toStringHelper(sb, "Type", Type);
      toStringHelper(sb, "Value", Value);
    }


}
