package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class AccountShare extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public AccountShare() {}

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
     * element : Account of type {urn:sobject.enterprise.soap.sforce.com}Account
     * java type: com.sforce.soap.enterprise.sobject.Account
     */
    private boolean Account__is_set = false;

    private com.sforce.soap.enterprise.sobject.Account Account;

    public com.sforce.soap.enterprise.sobject.Account getAccount() {
      return Account;
    }

    public void setAccount(com.sforce.soap.enterprise.sobject.Account Account) {
      this.Account = Account;
      Account__is_set = true;
    }

    protected void setAccount(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Account", "urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true))) {
        setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, _lookupTypeInfo("Account", "urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true), com.sforce.soap.enterprise.sobject.Account.class));
      }
    }

    private void writeFieldAccount(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Account", "urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true), Account, Account__is_set);
    }

    /**
     * element : AccountAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AccountAccessLevel__is_set = false;

    private java.lang.String AccountAccessLevel;

    public java.lang.String getAccountAccessLevel() {
      return AccountAccessLevel;
    }

    public void setAccountAccessLevel(java.lang.String AccountAccessLevel) {
      this.AccountAccessLevel = AccountAccessLevel;
      AccountAccessLevel__is_set = true;
    }

    protected void setAccountAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AccountAccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccountAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAccountAccessLevel(__typeMapper.readString(__in, _lookupTypeInfo("AccountAccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccountAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAccountAccessLevel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AccountAccessLevel", "urn:sobject.enterprise.soap.sforce.com","AccountAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), AccountAccessLevel, AccountAccessLevel__is_set);
    }

    /**
     * element : AccountId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean AccountId__is_set = false;

    private java.lang.String AccountId;

    public java.lang.String getAccountId() {
      return AccountId;
    }

    public void setAccountId(java.lang.String AccountId) {
      this.AccountId = AccountId;
      AccountId__is_set = true;
    }

    protected void setAccountId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AccountId", "urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAccountId(__typeMapper.readString(__in, _lookupTypeInfo("AccountId", "urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAccountId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AccountId", "urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true), AccountId, AccountId__is_set);
    }

    /**
     * element : CaseAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CaseAccessLevel__is_set = false;

    private java.lang.String CaseAccessLevel;

    public java.lang.String getCaseAccessLevel() {
      return CaseAccessLevel;
    }

    public void setCaseAccessLevel(java.lang.String CaseAccessLevel) {
      this.CaseAccessLevel = CaseAccessLevel;
      CaseAccessLevel__is_set = true;
    }

    protected void setCaseAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CaseAccessLevel", "urn:sobject.enterprise.soap.sforce.com","CaseAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCaseAccessLevel(__typeMapper.readString(__in, _lookupTypeInfo("CaseAccessLevel", "urn:sobject.enterprise.soap.sforce.com","CaseAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCaseAccessLevel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CaseAccessLevel", "urn:sobject.enterprise.soap.sforce.com","CaseAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), CaseAccessLevel, CaseAccessLevel__is_set);
    }

    /**
     * element : ContactAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ContactAccessLevel__is_set = false;

    private java.lang.String ContactAccessLevel;

    public java.lang.String getContactAccessLevel() {
      return ContactAccessLevel;
    }

    public void setContactAccessLevel(java.lang.String ContactAccessLevel) {
      this.ContactAccessLevel = ContactAccessLevel;
      ContactAccessLevel__is_set = true;
    }

    protected void setContactAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ContactAccessLevel", "urn:sobject.enterprise.soap.sforce.com","ContactAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setContactAccessLevel(__typeMapper.readString(__in, _lookupTypeInfo("ContactAccessLevel", "urn:sobject.enterprise.soap.sforce.com","ContactAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContactAccessLevel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ContactAccessLevel", "urn:sobject.enterprise.soap.sforce.com","ContactAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), ContactAccessLevel, ContactAccessLevel__is_set);
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
     * element : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    protected void setLastModifiedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldLastModifiedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedBy", "urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), LastModifiedBy, LastModifiedBy__is_set);
    }

    /**
     * element : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    protected void setLastModifiedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setLastModifiedById(__typeMapper.readString(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastModifiedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedById", "urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true), LastModifiedById, LastModifiedById__is_set);
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
     * element : OpportunityAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean OpportunityAccessLevel__is_set = false;

    private java.lang.String OpportunityAccessLevel;

    public java.lang.String getOpportunityAccessLevel() {
      return OpportunityAccessLevel;
    }

    public void setOpportunityAccessLevel(java.lang.String OpportunityAccessLevel) {
      this.OpportunityAccessLevel = OpportunityAccessLevel;
      OpportunityAccessLevel__is_set = true;
    }

    protected void setOpportunityAccessLevel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OpportunityAccessLevel", "urn:sobject.enterprise.soap.sforce.com","OpportunityAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOpportunityAccessLevel(__typeMapper.readString(__in, _lookupTypeInfo("OpportunityAccessLevel", "urn:sobject.enterprise.soap.sforce.com","OpportunityAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityAccessLevel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OpportunityAccessLevel", "urn:sobject.enterprise.soap.sforce.com","OpportunityAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true), OpportunityAccessLevel, OpportunityAccessLevel__is_set);
    }

    /**
     * element : RowCause of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean RowCause__is_set = false;

    private java.lang.String RowCause;

    public java.lang.String getRowCause() {
      return RowCause;
    }

    public void setRowCause(java.lang.String RowCause) {
      this.RowCause = RowCause;
      RowCause__is_set = true;
    }

    protected void setRowCause(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setRowCause(__typeMapper.readString(__in, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRowCause(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RowCause", "urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true), RowCause, RowCause__is_set);
    }

    /**
     * element : UserOrGroup of type {urn:sobject.enterprise.soap.sforce.com}sObject
     * java type: com.sforce.soap.enterprise.sobject.SObject
     */
    private boolean UserOrGroup__is_set = false;

    private com.sforce.soap.enterprise.sobject.SObject UserOrGroup;

    public com.sforce.soap.enterprise.sobject.SObject getUserOrGroup() {
      return UserOrGroup;
    }

    public void setUserOrGroup(com.sforce.soap.enterprise.sobject.SObject UserOrGroup) {
      this.UserOrGroup = UserOrGroup;
      UserOrGroup__is_set = true;
    }

    protected void setUserOrGroup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true))) {
        setUserOrGroup((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), com.sforce.soap.enterprise.sobject.SObject.class));
      }
    }

    private void writeFieldUserOrGroup(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserOrGroup", "urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true), UserOrGroup, UserOrGroup__is_set);
    }

    /**
     * element : UserOrGroupId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean UserOrGroupId__is_set = false;

    private java.lang.String UserOrGroupId;

    public java.lang.String getUserOrGroupId() {
      return UserOrGroupId;
    }

    public void setUserOrGroupId(java.lang.String UserOrGroupId) {
      this.UserOrGroupId = UserOrGroupId;
      UserOrGroupId__is_set = true;
    }

    protected void setUserOrGroupId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setUserOrGroupId(__typeMapper.readString(__in, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUserOrGroupId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("UserOrGroupId", "urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true), UserOrGroupId, UserOrGroupId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AccountShare");
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
      sb.append("[AccountShare ");
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
      writeFieldAccount(__out, __typeMapper);
      writeFieldAccountAccessLevel(__out, __typeMapper);
      writeFieldAccountId(__out, __typeMapper);
      writeFieldCaseAccessLevel(__out, __typeMapper);
      writeFieldContactAccessLevel(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldOpportunityAccessLevel(__out, __typeMapper);
      writeFieldRowCause(__out, __typeMapper);
      writeFieldUserOrGroup(__out, __typeMapper);
      writeFieldUserOrGroupId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAccount(__in, __typeMapper);
      setAccountAccessLevel(__in, __typeMapper);
      setAccountId(__in, __typeMapper);
      setCaseAccessLevel(__in, __typeMapper);
      setContactAccessLevel(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setOpportunityAccessLevel(__in, __typeMapper);
      setRowCause(__in, __typeMapper);
      setUserOrGroup(__in, __typeMapper);
      setUserOrGroupId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Account", Account);
      toStringHelper(sb, "AccountAccessLevel", AccountAccessLevel);
      toStringHelper(sb, "AccountId", AccountId);
      toStringHelper(sb, "CaseAccessLevel", CaseAccessLevel);
      toStringHelper(sb, "ContactAccessLevel", ContactAccessLevel);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "OpportunityAccessLevel", OpportunityAccessLevel);
      toStringHelper(sb, "RowCause", RowCause);
      toStringHelper(sb, "UserOrGroup", UserOrGroup);
      toStringHelper(sb, "UserOrGroupId", UserOrGroupId);
    }


}