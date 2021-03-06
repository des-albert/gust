package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class OutgoingEmail extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public OutgoingEmail() {}

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
     * element : BccAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean BccAddress__is_set = false;

    private java.lang.String BccAddress;

    public java.lang.String getBccAddress() {
      return BccAddress;
    }

    public void setBccAddress(java.lang.String BccAddress) {
      this.BccAddress = BccAddress;
      BccAddress__is_set = true;
    }

    protected void setBccAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("BccAddress", "urn:sobject.enterprise.soap.sforce.com","BccAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setBccAddress(__typeMapper.readString(__in, _lookupTypeInfo("BccAddress", "urn:sobject.enterprise.soap.sforce.com","BccAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldBccAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("BccAddress", "urn:sobject.enterprise.soap.sforce.com","BccAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), BccAddress, BccAddress__is_set);
    }

    /**
     * element : BccIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean BccIds__is_set = false;

    private java.lang.String[] BccIds = new java.lang.String[0];

    public java.lang.String[] getBccIds() {
      return BccIds;
    }

    public void setBccIds(java.lang.String[] BccIds) {
      this.BccIds = BccIds;
      BccIds__is_set = true;
    }

    protected void setBccIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("BccIds", "urn:sobject.enterprise.soap.sforce.com","BccIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setBccIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("BccIds", "urn:sobject.enterprise.soap.sforce.com","BccIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldBccIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("BccIds", "urn:sobject.enterprise.soap.sforce.com","BccIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), BccIds, BccIds__is_set);
    }

    /**
     * element : CcAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CcAddress__is_set = false;

    private java.lang.String CcAddress;

    public java.lang.String getCcAddress() {
      return CcAddress;
    }

    public void setCcAddress(java.lang.String CcAddress) {
      this.CcAddress = CcAddress;
      CcAddress__is_set = true;
    }

    protected void setCcAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CcAddress", "urn:sobject.enterprise.soap.sforce.com","CcAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCcAddress(__typeMapper.readString(__in, _lookupTypeInfo("CcAddress", "urn:sobject.enterprise.soap.sforce.com","CcAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCcAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CcAddress", "urn:sobject.enterprise.soap.sforce.com","CcAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), CcAddress, CcAddress__is_set);
    }

    /**
     * element : CcIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean CcIds__is_set = false;

    private java.lang.String[] CcIds = new java.lang.String[0];

    public java.lang.String[] getCcIds() {
      return CcIds;
    }

    public void setCcIds(java.lang.String[] CcIds) {
      this.CcIds = CcIds;
      CcIds__is_set = true;
    }

    protected void setCcIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CcIds", "urn:sobject.enterprise.soap.sforce.com","CcIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setCcIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("CcIds", "urn:sobject.enterprise.soap.sforce.com","CcIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldCcIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CcIds", "urn:sobject.enterprise.soap.sforce.com","CcIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), CcIds, CcIds__is_set);
    }

    /**
     * element : ContentDocumentIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean ContentDocumentIds__is_set = false;

    private java.lang.String[] ContentDocumentIds = new java.lang.String[0];

    public java.lang.String[] getContentDocumentIds() {
      return ContentDocumentIds;
    }

    public void setContentDocumentIds(java.lang.String[] ContentDocumentIds) {
      this.ContentDocumentIds = ContentDocumentIds;
      ContentDocumentIds__is_set = true;
    }

    protected void setContentDocumentIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentDocumentIds", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setContentDocumentIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("ContentDocumentIds", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldContentDocumentIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentDocumentIds", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), ContentDocumentIds, ContentDocumentIds__is_set);
    }

    /**
     * element : ContentDocumentLinks of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean ContentDocumentLinks__is_set = false;

    private com.sforce.soap.enterprise.QueryResult ContentDocumentLinks;

    public com.sforce.soap.enterprise.QueryResult getContentDocumentLinks() {
      return ContentDocumentLinks;
    }

    public void setContentDocumentLinks(com.sforce.soap.enterprise.QueryResult ContentDocumentLinks) {
      this.ContentDocumentLinks = ContentDocumentLinks;
      ContentDocumentLinks__is_set = true;
    }

    protected void setContentDocumentLinks(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContentDocumentLinks", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentLinks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("ContentDocumentLinks", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentLinks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldContentDocumentLinks(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContentDocumentLinks", "urn:sobject.enterprise.soap.sforce.com","ContentDocumentLinks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), ContentDocumentLinks, ContentDocumentLinks__is_set);
    }

    /**
     * element : EmailTemplate of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean EmailTemplate__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject EmailTemplate;

    public com.sforce.soap.enterprise.sobject.SObject getEmailTemplate() {
      return EmailTemplate;
    }

    public void setEmailTemplate(com.sforce.soap.enterprise.sobject.SObject EmailTemplate) {
      this.EmailTemplate = EmailTemplate;
      EmailTemplate__is_set = true;
    }

    protected void setEmailTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EmailTemplate", "urn:sobject.enterprise.soap.sforce.com","EmailTemplate","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setEmailTemplate((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("EmailTemplate", "urn:sobject.enterprise.soap.sforce.com","EmailTemplate","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldEmailTemplate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EmailTemplate", "urn:sobject.enterprise.soap.sforce.com","EmailTemplate","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), EmailTemplate, EmailTemplate__is_set);
    }

    /**
     * element : EmailTemplateId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean EmailTemplateId__is_set = false;

    private java.lang.String EmailTemplateId;

    public java.lang.String getEmailTemplateId() {
      return EmailTemplateId;
    }

    public void setEmailTemplateId(java.lang.String EmailTemplateId) {
      this.EmailTemplateId = EmailTemplateId;
      EmailTemplateId__is_set = true;
    }

    protected void setEmailTemplateId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EmailTemplateId", "urn:sobject.enterprise.soap.sforce.com","EmailTemplateId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setEmailTemplateId(__typeMapper.readString(__in, _lookupTypeInfo("EmailTemplateId", "urn:sobject.enterprise.soap.sforce.com","EmailTemplateId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmailTemplateId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EmailTemplateId", "urn:sobject.enterprise.soap.sforce.com","EmailTemplateId","urn:enterprise.soap.sforce.com","ID",0,1,true), EmailTemplateId, EmailTemplateId__is_set);
    }

    /**
     * element : ExternalId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ExternalId__is_set = false;

    private java.lang.String ExternalId;

    public java.lang.String getExternalId() {
      return ExternalId;
    }

    public void setExternalId(java.lang.String ExternalId) {
      this.ExternalId = ExternalId;
      ExternalId__is_set = true;
    }

    protected void setExternalId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ExternalId", "urn:sobject.enterprise.soap.sforce.com","ExternalId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExternalId(__typeMapper.readString(__in, _lookupTypeInfo("ExternalId", "urn:sobject.enterprise.soap.sforce.com","ExternalId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExternalId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ExternalId", "urn:sobject.enterprise.soap.sforce.com","ExternalId","http://www.w3.org/2001/XMLSchema","string",0,1,true), ExternalId, ExternalId__is_set);
    }

    /**
     * element : HtmlBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean HtmlBody__is_set = false;

    private java.lang.String HtmlBody;

    public java.lang.String getHtmlBody() {
      return HtmlBody;
    }

    public void setHtmlBody(java.lang.String HtmlBody) {
      this.HtmlBody = HtmlBody;
      HtmlBody__is_set = true;
    }

    protected void setHtmlBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("HtmlBody", "urn:sobject.enterprise.soap.sforce.com","HtmlBody","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setHtmlBody(__typeMapper.readString(__in, _lookupTypeInfo("HtmlBody", "urn:sobject.enterprise.soap.sforce.com","HtmlBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldHtmlBody(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("HtmlBody", "urn:sobject.enterprise.soap.sforce.com","HtmlBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), HtmlBody, HtmlBody__is_set);
    }

    /**
     * element : OutgoingEmailRelations of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean OutgoingEmailRelations__is_set = false;

    private com.sforce.soap.enterprise.QueryResult OutgoingEmailRelations;

    public com.sforce.soap.enterprise.QueryResult getOutgoingEmailRelations() {
      return OutgoingEmailRelations;
    }

    public void setOutgoingEmailRelations(com.sforce.soap.enterprise.QueryResult OutgoingEmailRelations) {
      this.OutgoingEmailRelations = OutgoingEmailRelations;
      OutgoingEmailRelations__is_set = true;
    }

    protected void setOutgoingEmailRelations(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OutgoingEmailRelations", "urn:sobject.enterprise.soap.sforce.com","OutgoingEmailRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setOutgoingEmailRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("OutgoingEmailRelations", "urn:sobject.enterprise.soap.sforce.com","OutgoingEmailRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldOutgoingEmailRelations(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OutgoingEmailRelations", "urn:sobject.enterprise.soap.sforce.com","OutgoingEmailRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), OutgoingEmailRelations, OutgoingEmailRelations__is_set);
    }

    /**
     * element : RelatedTo of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean RelatedTo__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject RelatedTo;

    public com.sforce.soap.enterprise.sobject.SObject getRelatedTo() {
      return RelatedTo;
    }

    public void setRelatedTo(com.sforce.soap.enterprise.sobject.SObject RelatedTo) {
      this.RelatedTo = RelatedTo;
      RelatedTo__is_set = true;
    }

    protected void setRelatedTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RelatedTo", "urn:sobject.enterprise.soap.sforce.com","RelatedTo","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setRelatedTo((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("RelatedTo", "urn:sobject.enterprise.soap.sforce.com","RelatedTo","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldRelatedTo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RelatedTo", "urn:sobject.enterprise.soap.sforce.com","RelatedTo","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), RelatedTo, RelatedTo__is_set);
    }

    /**
     * element : RelatedToId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean RelatedToId__is_set = false;

    private java.lang.String RelatedToId;

    public java.lang.String getRelatedToId() {
      return RelatedToId;
    }

    public void setRelatedToId(java.lang.String RelatedToId) {
      this.RelatedToId = RelatedToId;
      RelatedToId__is_set = true;
    }

    protected void setRelatedToId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RelatedToId", "urn:sobject.enterprise.soap.sforce.com","RelatedToId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setRelatedToId(__typeMapper.readString(__in, _lookupTypeInfo("RelatedToId", "urn:sobject.enterprise.soap.sforce.com","RelatedToId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRelatedToId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RelatedToId", "urn:sobject.enterprise.soap.sforce.com","RelatedToId","urn:enterprise.soap.sforce.com","ID",0,1,true), RelatedToId, RelatedToId__is_set);
    }

    /**
     * element : Subject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Subject__is_set = false;

    private java.lang.String Subject;

    public java.lang.String getSubject() {
      return Subject;
    }

    public void setSubject(java.lang.String Subject) {
      this.Subject = Subject;
      Subject__is_set = true;
    }

    protected void setSubject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Subject", "urn:sobject.enterprise.soap.sforce.com","Subject","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSubject(__typeMapper.readString(__in, _lookupTypeInfo("Subject", "urn:sobject.enterprise.soap.sforce.com","Subject","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Subject", "urn:sobject.enterprise.soap.sforce.com","Subject","http://www.w3.org/2001/XMLSchema","string",0,1,true), Subject, Subject__is_set);
    }

    /**
     * element : TextBody of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean TextBody__is_set = false;

    private java.lang.String TextBody;

    public java.lang.String getTextBody() {
      return TextBody;
    }

    public void setTextBody(java.lang.String TextBody) {
      this.TextBody = TextBody;
      TextBody__is_set = true;
    }

    protected void setTextBody(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("TextBody", "urn:sobject.enterprise.soap.sforce.com","TextBody","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTextBody(__typeMapper.readString(__in, _lookupTypeInfo("TextBody", "urn:sobject.enterprise.soap.sforce.com","TextBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTextBody(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("TextBody", "urn:sobject.enterprise.soap.sforce.com","TextBody","http://www.w3.org/2001/XMLSchema","string",0,1,true), TextBody, TextBody__is_set);
    }

    /**
     * element : ToAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ToAddress__is_set = false;

    private java.lang.String ToAddress;

    public java.lang.String getToAddress() {
      return ToAddress;
    }

    public void setToAddress(java.lang.String ToAddress) {
      this.ToAddress = ToAddress;
      ToAddress__is_set = true;
    }

    protected void setToAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ToAddress", "urn:sobject.enterprise.soap.sforce.com","ToAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setToAddress(__typeMapper.readString(__in, _lookupTypeInfo("ToAddress", "urn:sobject.enterprise.soap.sforce.com","ToAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldToAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ToAddress", "urn:sobject.enterprise.soap.sforce.com","ToAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), ToAddress, ToAddress__is_set);
    }

    /**
     * element : ToIds of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String[]
     */
    private boolean ToIds__is_set = false;

    private java.lang.String[] ToIds = new java.lang.String[0];

    public java.lang.String[] getToIds() {
      return ToIds;
    }

    public void setToIds(java.lang.String[] ToIds) {
      this.ToIds = ToIds;
      ToIds__is_set = true;
    }

    protected void setToIds(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ToIds", "urn:sobject.enterprise.soap.sforce.com","ToIds","urn:enterprise.soap.sforce.com","ID",0,-1,true))) {
        setToIds((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("ToIds", "urn:sobject.enterprise.soap.sforce.com","ToIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldToIds(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ToIds", "urn:sobject.enterprise.soap.sforce.com","ToIds","urn:enterprise.soap.sforce.com","ID",0,-1,true), ToIds, ToIds__is_set);
    }

    /**
     * element : ValidatedFromAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ValidatedFromAddress__is_set = false;

    private java.lang.String ValidatedFromAddress;

    public java.lang.String getValidatedFromAddress() {
      return ValidatedFromAddress;
    }

    public void setValidatedFromAddress(java.lang.String ValidatedFromAddress) {
      this.ValidatedFromAddress = ValidatedFromAddress;
      ValidatedFromAddress__is_set = true;
    }

    protected void setValidatedFromAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ValidatedFromAddress", "urn:sobject.enterprise.soap.sforce.com","ValidatedFromAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setValidatedFromAddress(__typeMapper.readString(__in, _lookupTypeInfo("ValidatedFromAddress", "urn:sobject.enterprise.soap.sforce.com","ValidatedFromAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldValidatedFromAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ValidatedFromAddress", "urn:sobject.enterprise.soap.sforce.com","ValidatedFromAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true), ValidatedFromAddress, ValidatedFromAddress__is_set);
    }

    /**
     * element : Who of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean Who__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject Who;

    public com.sforce.soap.enterprise.sobject.SObject getWho() {
      return Who;
    }

    public void setWho(com.sforce.soap.enterprise.sobject.SObject Who) {
      this.Who = Who;
      Who__is_set = true;
    }

    protected void setWho(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Who", "urn:sobject.enterprise.soap.sforce.com","Who","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setWho((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("Who", "urn:sobject.enterprise.soap.sforce.com","Who","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldWho(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Who", "urn:sobject.enterprise.soap.sforce.com","Who","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), Who, Who__is_set);
    }

    /**
     * element : WhoId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean WhoId__is_set = false;

    private java.lang.String WhoId;

    public java.lang.String getWhoId() {
      return WhoId;
    }

    public void setWhoId(java.lang.String WhoId) {
      this.WhoId = WhoId;
      WhoId__is_set = true;
    }

    protected void setWhoId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("WhoId", "urn:sobject.enterprise.soap.sforce.com","WhoId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setWhoId(__typeMapper.readString(__in, _lookupTypeInfo("WhoId", "urn:sobject.enterprise.soap.sforce.com","WhoId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldWhoId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("WhoId", "urn:sobject.enterprise.soap.sforce.com","WhoId","urn:enterprise.soap.sforce.com","ID",0,1,true), WhoId, WhoId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OutgoingEmail");
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
      sb.append("[OutgoingEmail ");
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
      writeFieldBccAddress(__out, __typeMapper);
      writeFieldBccIds(__out, __typeMapper);
      writeFieldCcAddress(__out, __typeMapper);
      writeFieldCcIds(__out, __typeMapper);
      writeFieldContentDocumentIds(__out, __typeMapper);
      writeFieldContentDocumentLinks(__out, __typeMapper);
      writeFieldEmailTemplate(__out, __typeMapper);
      writeFieldEmailTemplateId(__out, __typeMapper);
      writeFieldExternalId(__out, __typeMapper);
      writeFieldHtmlBody(__out, __typeMapper);
      writeFieldOutgoingEmailRelations(__out, __typeMapper);
      writeFieldRelatedTo(__out, __typeMapper);
      writeFieldRelatedToId(__out, __typeMapper);
      writeFieldSubject(__out, __typeMapper);
      writeFieldTextBody(__out, __typeMapper);
      writeFieldToAddress(__out, __typeMapper);
      writeFieldToIds(__out, __typeMapper);
      writeFieldValidatedFromAddress(__out, __typeMapper);
      writeFieldWho(__out, __typeMapper);
      writeFieldWhoId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setBccAddress(__in, __typeMapper);
      setBccIds(__in, __typeMapper);
      setCcAddress(__in, __typeMapper);
      setCcIds(__in, __typeMapper);
      setContentDocumentIds(__in, __typeMapper);
      setContentDocumentLinks(__in, __typeMapper);
      setEmailTemplate(__in, __typeMapper);
      setEmailTemplateId(__in, __typeMapper);
      setExternalId(__in, __typeMapper);
      setHtmlBody(__in, __typeMapper);
      setOutgoingEmailRelations(__in, __typeMapper);
      setRelatedTo(__in, __typeMapper);
      setRelatedToId(__in, __typeMapper);
      setSubject(__in, __typeMapper);
      setTextBody(__in, __typeMapper);
      setToAddress(__in, __typeMapper);
      setToIds(__in, __typeMapper);
      setValidatedFromAddress(__in, __typeMapper);
      setWho(__in, __typeMapper);
      setWhoId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "BccAddress", BccAddress);
      toStringHelper(sb, "BccIds", BccIds);
      toStringHelper(sb, "CcAddress", CcAddress);
      toStringHelper(sb, "CcIds", CcIds);
      toStringHelper(sb, "ContentDocumentIds", ContentDocumentIds);
      toStringHelper(sb, "ContentDocumentLinks", ContentDocumentLinks);
      toStringHelper(sb, "EmailTemplate", EmailTemplate);
      toStringHelper(sb, "EmailTemplateId", EmailTemplateId);
      toStringHelper(sb, "ExternalId", ExternalId);
      toStringHelper(sb, "HtmlBody", HtmlBody);
      toStringHelper(sb, "OutgoingEmailRelations", OutgoingEmailRelations);
      toStringHelper(sb, "RelatedTo", RelatedTo);
      toStringHelper(sb, "RelatedToId", RelatedToId);
      toStringHelper(sb, "Subject", Subject);
      toStringHelper(sb, "TextBody", TextBody);
      toStringHelper(sb, "ToAddress", ToAddress);
      toStringHelper(sb, "ToIds", ToIds);
      toStringHelper(sb, "ValidatedFromAddress", ValidatedFromAddress);
      toStringHelper(sb, "Who", Who);
      toStringHelper(sb, "WhoId", WhoId);
    }


}
