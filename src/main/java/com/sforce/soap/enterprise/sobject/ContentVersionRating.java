package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ContentVersionRating extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ContentVersionRating() {}

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
     * element : ContentVersion of type {urn:sobject.enterprise.soap.sforce.com}ContentVersion
     * java type: com.sforce.soap.enterprise.sobject.ContentVersion
     */
    private boolean ContentVersion__is_set = false;

    private com.sforce.soap.enterprise.sobject.ContentVersion ContentVersion;

    public com.sforce.soap.enterprise.sobject.ContentVersion getContentVersion() {
      return ContentVersion;
    }

    public void setContentVersion(com.sforce.soap.enterprise.sobject.ContentVersion ContentVersion) {
      this.ContentVersion = ContentVersion;
      ContentVersion__is_set = true;
    }

    protected void setContentVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentVersion", "urn:sobject.enterprise.soap.sforce.com","ContentVersion","urn:sobject.enterprise.soap.sforce.com","ContentVersion",0,1,true))) {
        setContentVersion((com.sforce.soap.enterprise.sobject.ContentVersion)__typeMapper.readObject(__in, _lookupTypeInfo("ContentVersion", "urn:sobject.enterprise.soap.sforce.com","ContentVersion","urn:sobject.enterprise.soap.sforce.com","ContentVersion",0,1,true), com.sforce.soap.enterprise.sobject.ContentVersion.class));
      }
    }

    private void writeFieldContentVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentVersion", "urn:sobject.enterprise.soap.sforce.com","ContentVersion","urn:sobject.enterprise.soap.sforce.com","ContentVersion",0,1,true), ContentVersion, ContentVersion__is_set);
    }

    /**
     * element : ContentVersionId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ContentVersionId__is_set = false;

    private java.lang.String ContentVersionId;

    public java.lang.String getContentVersionId() {
      return ContentVersionId;
    }

    public void setContentVersionId(java.lang.String ContentVersionId) {
      this.ContentVersionId = ContentVersionId;
      ContentVersionId__is_set = true;
    }

    protected void setContentVersionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentVersionId", "urn:sobject.enterprise.soap.sforce.com","ContentVersionId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setContentVersionId(__typeMapper.readString(__in, _lookupTypeInfo("ContentVersionId", "urn:sobject.enterprise.soap.sforce.com","ContentVersionId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContentVersionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentVersionId", "urn:sobject.enterprise.soap.sforce.com","ContentVersionId","urn:enterprise.soap.sforce.com","ID",0,1,true), ContentVersionId, ContentVersionId__is_set);
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    protected void setLastModifiedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastModifiedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedDate", "urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastModifiedDate, LastModifiedDate__is_set);
    }

    /**
     * element : Rating of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean Rating__is_set = false;

    private java.lang.Integer Rating;

    public java.lang.Integer getRating() {
      return Rating;
    }

    public void setRating(java.lang.Integer Rating) {
      this.Rating = Rating;
      Rating__is_set = true;
    }

    protected void setRating(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Rating", "urn:sobject.enterprise.soap.sforce.com","Rating","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setRating((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("Rating", "urn:sobject.enterprise.soap.sforce.com","Rating","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldRating(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Rating", "urn:sobject.enterprise.soap.sforce.com","Rating","http://www.w3.org/2001/XMLSchema","int",0,1,true), Rating, Rating__is_set);
    }

    /**
     * element : User of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean User__is_set = false;

    private com.sforce.soap.enterprise.sobject.User User;

    public com.sforce.soap.enterprise.sobject.User getUser() {
      return User;
    }

    public void setUser(com.sforce.soap.enterprise.sobject.User User) {
      this.User = User;
      User__is_set = true;
    }

    protected void setUser(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("User", "urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("User", "urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldUser(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("User", "urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), User, User__is_set);
    }

    /**
     * element : UserComment of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean UserComment__is_set = false;

    private java.lang.String UserComment;

    public java.lang.String getUserComment() {
      return UserComment;
    }

    public void setUserComment(java.lang.String UserComment) {
      this.UserComment = UserComment;
      UserComment__is_set = true;
    }

    protected void setUserComment(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserComment", "urn:sobject.enterprise.soap.sforce.com","UserComment","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setUserComment(__typeMapper.readString(__in, _lookupTypeInfo("UserComment", "urn:sobject.enterprise.soap.sforce.com","UserComment","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUserComment(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserComment", "urn:sobject.enterprise.soap.sforce.com","UserComment","http://www.w3.org/2001/XMLSchema","string",0,1,true), UserComment, UserComment__is_set);
    }

    /**
     * element : UserId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean UserId__is_set = false;

    private java.lang.String UserId;

    public java.lang.String getUserId() {
      return UserId;
    }

    public void setUserId(java.lang.String UserId) {
      this.UserId = UserId;
      UserId__is_set = true;
    }

    protected void setUserId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserId", "urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setUserId(__typeMapper.readString(__in, _lookupTypeInfo("UserId", "urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUserId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserId", "urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true), UserId, UserId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentVersionRating");
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
      sb.append("[ContentVersionRating ");
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
      writeFieldContentVersion(__out, __typeMapper);
      writeFieldContentVersionId(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldRating(__out, __typeMapper);
      writeFieldUser(__out, __typeMapper);
      writeFieldUserComment(__out, __typeMapper);
      writeFieldUserId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setContentVersion(__in, __typeMapper);
      setContentVersionId(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setRating(__in, __typeMapper);
      setUser(__in, __typeMapper);
      setUserComment(__in, __typeMapper);
      setUserId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ContentVersion", ContentVersion);
      toStringHelper(sb, "ContentVersionId", ContentVersionId);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "Rating", Rating);
      toStringHelper(sb, "User", User);
      toStringHelper(sb, "UserComment", UserComment);
      toStringHelper(sb, "UserId", UserId);
    }


}
