package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ConnectedApplication extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public ConnectedApplication() {}

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
     * element : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
     * java type: com.sforce.soap.enterprise.sobject.User
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.enterprise.sobject.User CreatedBy;

    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true))) {
        setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), com.sforce.soap.enterprise.sobject.User.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true), CreatedBy, CreatedBy__is_set);
    }

    /**
     * element : CreatedById of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    protected void setCreatedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setCreatedById(__typeMapper.readString(__in, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCreatedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedById", "urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true), CreatedById, CreatedById__is_set);
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    protected void setCreatedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCreatedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedDate", "urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CreatedDate, CreatedDate__is_set);
    }

    /**
     * element : InstalledMobileApps of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean InstalledMobileApps__is_set = false;

    private com.sforce.soap.enterprise.QueryResult InstalledMobileApps;

    public com.sforce.soap.enterprise.QueryResult getInstalledMobileApps() {
      return InstalledMobileApps;
    }

    public void setInstalledMobileApps(com.sforce.soap.enterprise.QueryResult InstalledMobileApps) {
      this.InstalledMobileApps = InstalledMobileApps;
      InstalledMobileApps__is_set = true;
    }

    protected void setInstalledMobileApps(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("InstalledMobileApps", "urn:sobject.enterprise.soap.sforce.com","InstalledMobileApps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setInstalledMobileApps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("InstalledMobileApps", "urn:sobject.enterprise.soap.sforce.com","InstalledMobileApps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldInstalledMobileApps(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("InstalledMobileApps", "urn:sobject.enterprise.soap.sforce.com","InstalledMobileApps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), InstalledMobileApps, InstalledMobileApps__is_set);
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
     * element : MobileSessionTimeout of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean MobileSessionTimeout__is_set = false;

    private java.lang.String MobileSessionTimeout;

    public java.lang.String getMobileSessionTimeout() {
      return MobileSessionTimeout;
    }

    public void setMobileSessionTimeout(java.lang.String MobileSessionTimeout) {
      this.MobileSessionTimeout = MobileSessionTimeout;
      MobileSessionTimeout__is_set = true;
    }

    protected void setMobileSessionTimeout(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MobileSessionTimeout", "urn:sobject.enterprise.soap.sforce.com","MobileSessionTimeout","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMobileSessionTimeout(__typeMapper.readString(__in, _lookupTypeInfo("MobileSessionTimeout", "urn:sobject.enterprise.soap.sforce.com","MobileSessionTimeout","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMobileSessionTimeout(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MobileSessionTimeout", "urn:sobject.enterprise.soap.sforce.com","MobileSessionTimeout","http://www.w3.org/2001/XMLSchema","string",0,1,true), MobileSessionTimeout, MobileSessionTimeout__is_set);
    }

    /**
     * element : MobileStartUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean MobileStartUrl__is_set = false;

    private java.lang.String MobileStartUrl;

    public java.lang.String getMobileStartUrl() {
      return MobileStartUrl;
    }

    public void setMobileStartUrl(java.lang.String MobileStartUrl) {
      this.MobileStartUrl = MobileStartUrl;
      MobileStartUrl__is_set = true;
    }

    protected void setMobileStartUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MobileStartUrl", "urn:sobject.enterprise.soap.sforce.com","MobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMobileStartUrl(__typeMapper.readString(__in, _lookupTypeInfo("MobileStartUrl", "urn:sobject.enterprise.soap.sforce.com","MobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMobileStartUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MobileStartUrl", "urn:sobject.enterprise.soap.sforce.com","MobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), MobileStartUrl, MobileStartUrl__is_set);
    }

    /**
     * element : Name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Name__is_set = false;

    private java.lang.String Name;

    public java.lang.String getName() {
      return Name;
    }

    public void setName(java.lang.String Name) {
      this.Name = Name;
      Name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Name", "urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), Name, Name__is_set);
    }

    /**
     * element : OptionsAllowAdminApprovedUsersOnly of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean OptionsAllowAdminApprovedUsersOnly__is_set = false;

    private java.lang.Boolean OptionsAllowAdminApprovedUsersOnly;

    public java.lang.Boolean getOptionsAllowAdminApprovedUsersOnly() {
      return OptionsAllowAdminApprovedUsersOnly;
    }

    public void setOptionsAllowAdminApprovedUsersOnly(java.lang.Boolean OptionsAllowAdminApprovedUsersOnly) {
      this.OptionsAllowAdminApprovedUsersOnly = OptionsAllowAdminApprovedUsersOnly;
      OptionsAllowAdminApprovedUsersOnly__is_set = true;
    }

    protected void setOptionsAllowAdminApprovedUsersOnly(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OptionsAllowAdminApprovedUsersOnly", "urn:sobject.enterprise.soap.sforce.com","OptionsAllowAdminApprovedUsersOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setOptionsAllowAdminApprovedUsersOnly((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("OptionsAllowAdminApprovedUsersOnly", "urn:sobject.enterprise.soap.sforce.com","OptionsAllowAdminApprovedUsersOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldOptionsAllowAdminApprovedUsersOnly(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OptionsAllowAdminApprovedUsersOnly", "urn:sobject.enterprise.soap.sforce.com","OptionsAllowAdminApprovedUsersOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), OptionsAllowAdminApprovedUsersOnly, OptionsAllowAdminApprovedUsersOnly__is_set);
    }

    /**
     * element : OptionsHasSessionLevelPolicy of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean OptionsHasSessionLevelPolicy__is_set = false;

    private java.lang.Boolean OptionsHasSessionLevelPolicy;

    public java.lang.Boolean getOptionsHasSessionLevelPolicy() {
      return OptionsHasSessionLevelPolicy;
    }

    public void setOptionsHasSessionLevelPolicy(java.lang.Boolean OptionsHasSessionLevelPolicy) {
      this.OptionsHasSessionLevelPolicy = OptionsHasSessionLevelPolicy;
      OptionsHasSessionLevelPolicy__is_set = true;
    }

    protected void setOptionsHasSessionLevelPolicy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OptionsHasSessionLevelPolicy", "urn:sobject.enterprise.soap.sforce.com","OptionsHasSessionLevelPolicy","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setOptionsHasSessionLevelPolicy((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("OptionsHasSessionLevelPolicy", "urn:sobject.enterprise.soap.sforce.com","OptionsHasSessionLevelPolicy","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldOptionsHasSessionLevelPolicy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OptionsHasSessionLevelPolicy", "urn:sobject.enterprise.soap.sforce.com","OptionsHasSessionLevelPolicy","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), OptionsHasSessionLevelPolicy, OptionsHasSessionLevelPolicy__is_set);
    }

    /**
     * element : OptionsIsInternal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean OptionsIsInternal__is_set = false;

    private java.lang.Boolean OptionsIsInternal;

    public java.lang.Boolean getOptionsIsInternal() {
      return OptionsIsInternal;
    }

    public void setOptionsIsInternal(java.lang.Boolean OptionsIsInternal) {
      this.OptionsIsInternal = OptionsIsInternal;
      OptionsIsInternal__is_set = true;
    }

    protected void setOptionsIsInternal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OptionsIsInternal", "urn:sobject.enterprise.soap.sforce.com","OptionsIsInternal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setOptionsIsInternal((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("OptionsIsInternal", "urn:sobject.enterprise.soap.sforce.com","OptionsIsInternal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldOptionsIsInternal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OptionsIsInternal", "urn:sobject.enterprise.soap.sforce.com","OptionsIsInternal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), OptionsIsInternal, OptionsIsInternal__is_set);
    }

    /**
     * element : OptionsRefreshTokenValidityMetric of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean OptionsRefreshTokenValidityMetric__is_set = false;

    private java.lang.Boolean OptionsRefreshTokenValidityMetric;

    public java.lang.Boolean getOptionsRefreshTokenValidityMetric() {
      return OptionsRefreshTokenValidityMetric;
    }

    public void setOptionsRefreshTokenValidityMetric(java.lang.Boolean OptionsRefreshTokenValidityMetric) {
      this.OptionsRefreshTokenValidityMetric = OptionsRefreshTokenValidityMetric;
      OptionsRefreshTokenValidityMetric__is_set = true;
    }

    protected void setOptionsRefreshTokenValidityMetric(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OptionsRefreshTokenValidityMetric", "urn:sobject.enterprise.soap.sforce.com","OptionsRefreshTokenValidityMetric","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setOptionsRefreshTokenValidityMetric((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("OptionsRefreshTokenValidityMetric", "urn:sobject.enterprise.soap.sforce.com","OptionsRefreshTokenValidityMetric","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldOptionsRefreshTokenValidityMetric(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OptionsRefreshTokenValidityMetric", "urn:sobject.enterprise.soap.sforce.com","OptionsRefreshTokenValidityMetric","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), OptionsRefreshTokenValidityMetric, OptionsRefreshTokenValidityMetric__is_set);
    }

    /**
     * element : PinLength of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean PinLength__is_set = false;

    private java.lang.String PinLength;

    public java.lang.String getPinLength() {
      return PinLength;
    }

    public void setPinLength(java.lang.String PinLength) {
      this.PinLength = PinLength;
      PinLength__is_set = true;
    }

    protected void setPinLength(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PinLength", "urn:sobject.enterprise.soap.sforce.com","PinLength","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPinLength(__typeMapper.readString(__in, _lookupTypeInfo("PinLength", "urn:sobject.enterprise.soap.sforce.com","PinLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPinLength(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PinLength", "urn:sobject.enterprise.soap.sforce.com","PinLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), PinLength, PinLength__is_set);
    }

    /**
     * element : RefreshTokenValidityPeriod of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean RefreshTokenValidityPeriod__is_set = false;

    private java.lang.Integer RefreshTokenValidityPeriod;

    public java.lang.Integer getRefreshTokenValidityPeriod() {
      return RefreshTokenValidityPeriod;
    }

    public void setRefreshTokenValidityPeriod(java.lang.Integer RefreshTokenValidityPeriod) {
      this.RefreshTokenValidityPeriod = RefreshTokenValidityPeriod;
      RefreshTokenValidityPeriod__is_set = true;
    }

    protected void setRefreshTokenValidityPeriod(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RefreshTokenValidityPeriod", "urn:sobject.enterprise.soap.sforce.com","RefreshTokenValidityPeriod","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setRefreshTokenValidityPeriod((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("RefreshTokenValidityPeriod", "urn:sobject.enterprise.soap.sforce.com","RefreshTokenValidityPeriod","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldRefreshTokenValidityPeriod(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RefreshTokenValidityPeriod", "urn:sobject.enterprise.soap.sforce.com","RefreshTokenValidityPeriod","http://www.w3.org/2001/XMLSchema","int",0,1,true), RefreshTokenValidityPeriod, RefreshTokenValidityPeriod__is_set);
    }

    /**
     * element : SetupEntityAccessItems of type {urn:enterprise.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.enterprise.QueryResult
     */
    private boolean SetupEntityAccessItems__is_set = false;

    private com.sforce.soap.enterprise.QueryResult SetupEntityAccessItems;

    public com.sforce.soap.enterprise.QueryResult getSetupEntityAccessItems() {
      return SetupEntityAccessItems;
    }

    public void setSetupEntityAccessItems(com.sforce.soap.enterprise.QueryResult SetupEntityAccessItems) {
      this.SetupEntityAccessItems = SetupEntityAccessItems;
      SetupEntityAccessItems__is_set = true;
    }

    protected void setSetupEntityAccessItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SetupEntityAccessItems", "urn:sobject.enterprise.soap.sforce.com","SetupEntityAccessItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true))) {
        setSetupEntityAccessItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("SetupEntityAccessItems", "urn:sobject.enterprise.soap.sforce.com","SetupEntityAccessItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.enterprise.QueryResult.class));
      }
    }

    private void writeFieldSetupEntityAccessItems(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SetupEntityAccessItems", "urn:sobject.enterprise.soap.sforce.com","SetupEntityAccessItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true), SetupEntityAccessItems, SetupEntityAccessItems__is_set);
    }

    /**
     * element : StartUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean StartUrl__is_set = false;

    private java.lang.String StartUrl;

    public java.lang.String getStartUrl() {
      return StartUrl;
    }

    public void setStartUrl(java.lang.String StartUrl) {
      this.StartUrl = StartUrl;
      StartUrl__is_set = true;
    }

    protected void setStartUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("StartUrl", "urn:sobject.enterprise.soap.sforce.com","StartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setStartUrl(__typeMapper.readString(__in, _lookupTypeInfo("StartUrl", "urn:sobject.enterprise.soap.sforce.com","StartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStartUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("StartUrl", "urn:sobject.enterprise.soap.sforce.com","StartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), StartUrl, StartUrl__is_set);
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    protected void setSystemModstamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldSystemModstamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SystemModstamp", "urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), SystemModstamp, SystemModstamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication");
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
      sb.append("[ConnectedApplication ");
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
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldInstalledMobileApps(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldMobileSessionTimeout(__out, __typeMapper);
      writeFieldMobileStartUrl(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldOptionsAllowAdminApprovedUsersOnly(__out, __typeMapper);
      writeFieldOptionsHasSessionLevelPolicy(__out, __typeMapper);
      writeFieldOptionsIsInternal(__out, __typeMapper);
      writeFieldOptionsRefreshTokenValidityMetric(__out, __typeMapper);
      writeFieldPinLength(__out, __typeMapper);
      writeFieldRefreshTokenValidityPeriod(__out, __typeMapper);
      writeFieldSetupEntityAccessItems(__out, __typeMapper);
      writeFieldStartUrl(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setInstalledMobileApps(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setMobileSessionTimeout(__in, __typeMapper);
      setMobileStartUrl(__in, __typeMapper);
      setName(__in, __typeMapper);
      setOptionsAllowAdminApprovedUsersOnly(__in, __typeMapper);
      setOptionsHasSessionLevelPolicy(__in, __typeMapper);
      setOptionsIsInternal(__in, __typeMapper);
      setOptionsRefreshTokenValidityMetric(__in, __typeMapper);
      setPinLength(__in, __typeMapper);
      setRefreshTokenValidityPeriod(__in, __typeMapper);
      setSetupEntityAccessItems(__in, __typeMapper);
      setStartUrl(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "InstalledMobileApps", InstalledMobileApps);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "MobileSessionTimeout", MobileSessionTimeout);
      toStringHelper(sb, "MobileStartUrl", MobileStartUrl);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "OptionsAllowAdminApprovedUsersOnly", OptionsAllowAdminApprovedUsersOnly);
      toStringHelper(sb, "OptionsHasSessionLevelPolicy", OptionsHasSessionLevelPolicy);
      toStringHelper(sb, "OptionsIsInternal", OptionsIsInternal);
      toStringHelper(sb, "OptionsRefreshTokenValidityMetric", OptionsRefreshTokenValidityMetric);
      toStringHelper(sb, "PinLength", PinLength);
      toStringHelper(sb, "RefreshTokenValidityPeriod", RefreshTokenValidityPeriod);
      toStringHelper(sb, "SetupEntityAccessItems", SetupEntityAccessItems);
      toStringHelper(sb, "StartUrl", StartUrl);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
