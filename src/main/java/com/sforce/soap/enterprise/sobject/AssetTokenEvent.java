package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class AssetTokenEvent extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public AssetTokenEvent() {}

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
     * element : ActorTokenPayload of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ActorTokenPayload__is_set = false;

    private java.lang.String ActorTokenPayload;

    public java.lang.String getActorTokenPayload() {
      return ActorTokenPayload;
    }

    public void setActorTokenPayload(java.lang.String ActorTokenPayload) {
      this.ActorTokenPayload = ActorTokenPayload;
      ActorTokenPayload__is_set = true;
    }

    protected void setActorTokenPayload(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ActorTokenPayload", "urn:sobject.enterprise.soap.sforce.com","ActorTokenPayload","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setActorTokenPayload(__typeMapper.readString(__in, _lookupTypeInfo("ActorTokenPayload", "urn:sobject.enterprise.soap.sforce.com","ActorTokenPayload","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldActorTokenPayload(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ActorTokenPayload", "urn:sobject.enterprise.soap.sforce.com","ActorTokenPayload","http://www.w3.org/2001/XMLSchema","string",0,1,true), ActorTokenPayload, ActorTokenPayload__is_set);
    }

    /**
     * element : Asset of type {urn:sobject.enterprise.soap.sforce.com}Asset
     * java type: com.sforce.soap.enterprise.sobject.Asset
     */
    private boolean Asset__is_set = false;

    private com.sforce.soap.enterprise.sobject.Asset Asset;

    public com.sforce.soap.enterprise.sobject.Asset getAsset() {
      return Asset;
    }

    public void setAsset(com.sforce.soap.enterprise.sobject.Asset Asset) {
      this.Asset = Asset;
      Asset__is_set = true;
    }

    protected void setAsset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Asset", "urn:sobject.enterprise.soap.sforce.com","Asset","urn:sobject.enterprise.soap.sforce.com","Asset",0,1,true))) {
        setAsset((com.sforce.soap.enterprise.sobject.Asset)__typeMapper.readObject(__in, _lookupTypeInfo("Asset", "urn:sobject.enterprise.soap.sforce.com","Asset","urn:sobject.enterprise.soap.sforce.com","Asset",0,1,true), com.sforce.soap.enterprise.sobject.Asset.class));
      }
    }

    private void writeFieldAsset(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Asset", "urn:sobject.enterprise.soap.sforce.com","Asset","urn:sobject.enterprise.soap.sforce.com","Asset",0,1,true), Asset, Asset__is_set);
    }

    /**
     * element : AssetId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean AssetId__is_set = false;

    private java.lang.String AssetId;

    public java.lang.String getAssetId() {
      return AssetId;
    }

    public void setAssetId(java.lang.String AssetId) {
      this.AssetId = AssetId;
      AssetId__is_set = true;
    }

    protected void setAssetId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetId", "urn:sobject.enterprise.soap.sforce.com","AssetId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setAssetId(__typeMapper.readString(__in, _lookupTypeInfo("AssetId", "urn:sobject.enterprise.soap.sforce.com","AssetId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssetId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetId", "urn:sobject.enterprise.soap.sforce.com","AssetId","urn:enterprise.soap.sforce.com","ID",0,1,true), AssetId, AssetId__is_set);
    }

    /**
     * element : AssetName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AssetName__is_set = false;

    private java.lang.String AssetName;

    public java.lang.String getAssetName() {
      return AssetName;
    }

    public void setAssetName(java.lang.String AssetName) {
      this.AssetName = AssetName;
      AssetName__is_set = true;
    }

    protected void setAssetName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetName", "urn:sobject.enterprise.soap.sforce.com","AssetName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAssetName(__typeMapper.readString(__in, _lookupTypeInfo("AssetName", "urn:sobject.enterprise.soap.sforce.com","AssetName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssetName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetName", "urn:sobject.enterprise.soap.sforce.com","AssetName","http://www.w3.org/2001/XMLSchema","string",0,1,true), AssetName, AssetName__is_set);
    }

    /**
     * element : AssetSerialNumber of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AssetSerialNumber__is_set = false;

    private java.lang.String AssetSerialNumber;

    public java.lang.String getAssetSerialNumber() {
      return AssetSerialNumber;
    }

    public void setAssetSerialNumber(java.lang.String AssetSerialNumber) {
      this.AssetSerialNumber = AssetSerialNumber;
      AssetSerialNumber__is_set = true;
    }

    protected void setAssetSerialNumber(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetSerialNumber", "urn:sobject.enterprise.soap.sforce.com","AssetSerialNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAssetSerialNumber(__typeMapper.readString(__in, _lookupTypeInfo("AssetSerialNumber", "urn:sobject.enterprise.soap.sforce.com","AssetSerialNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssetSerialNumber(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetSerialNumber", "urn:sobject.enterprise.soap.sforce.com","AssetSerialNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true), AssetSerialNumber, AssetSerialNumber__is_set);
    }

    /**
     * element : ConnectedApp of type {urn:sobject.enterprise.soap.sforce.com}ConnectedApplication
     * java type: com.sforce.soap.enterprise.sobject.ConnectedApplication
     */
    private boolean ConnectedApp__is_set = false;

    private com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp;

    public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
      return ConnectedApp;
    }

    public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp) {
      this.ConnectedApp = ConnectedApp;
      ConnectedApp__is_set = true;
    }

    protected void setConnectedApp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ConnectedApp", "urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true))) {
        setConnectedApp((com.sforce.soap.enterprise.sobject.ConnectedApplication)__typeMapper.readObject(__in, _lookupTypeInfo("ConnectedApp", "urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true), com.sforce.soap.enterprise.sobject.ConnectedApplication.class));
      }
    }

    private void writeFieldConnectedApp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ConnectedApp", "urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true), ConnectedApp, ConnectedApp__is_set);
    }

    /**
     * element : ConnectedAppId of type {urn:enterprise.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean ConnectedAppId__is_set = false;

    private java.lang.String ConnectedAppId;

    public java.lang.String getConnectedAppId() {
      return ConnectedAppId;
    }

    public void setConnectedAppId(java.lang.String ConnectedAppId) {
      this.ConnectedAppId = ConnectedAppId;
      ConnectedAppId__is_set = true;
    }

    protected void setConnectedAppId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ConnectedAppId", "urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true))) {
        setConnectedAppId(__typeMapper.readString(__in, _lookupTypeInfo("ConnectedAppId", "urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldConnectedAppId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ConnectedAppId", "urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true), ConnectedAppId, ConnectedAppId__is_set);
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
     * element : DeviceId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DeviceId__is_set = false;

    private java.lang.String DeviceId;

    public java.lang.String getDeviceId() {
      return DeviceId;
    }

    public void setDeviceId(java.lang.String DeviceId) {
      this.DeviceId = DeviceId;
      DeviceId__is_set = true;
    }

    protected void setDeviceId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DeviceId", "urn:sobject.enterprise.soap.sforce.com","DeviceId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDeviceId(__typeMapper.readString(__in, _lookupTypeInfo("DeviceId", "urn:sobject.enterprise.soap.sforce.com","DeviceId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeviceId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DeviceId", "urn:sobject.enterprise.soap.sforce.com","DeviceId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DeviceId, DeviceId__is_set);
    }

    /**
     * element : DeviceKey of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DeviceKey__is_set = false;

    private java.lang.String DeviceKey;

    public java.lang.String getDeviceKey() {
      return DeviceKey;
    }

    public void setDeviceKey(java.lang.String DeviceKey) {
      this.DeviceKey = DeviceKey;
      DeviceKey__is_set = true;
    }

    protected void setDeviceKey(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DeviceKey", "urn:sobject.enterprise.soap.sforce.com","DeviceKey","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDeviceKey(__typeMapper.readString(__in, _lookupTypeInfo("DeviceKey", "urn:sobject.enterprise.soap.sforce.com","DeviceKey","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeviceKey(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DeviceKey", "urn:sobject.enterprise.soap.sforce.com","DeviceKey","http://www.w3.org/2001/XMLSchema","string",0,1,true), DeviceKey, DeviceKey__is_set);
    }

    /**
     * element : Expiration of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean Expiration__is_set = false;

    private java.util.Calendar Expiration;

    public java.util.Calendar getExpiration() {
      return Expiration;
    }

    public void setExpiration(java.util.Calendar Expiration) {
      this.Expiration = Expiration;
      Expiration__is_set = true;
    }

    protected void setExpiration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Expiration", "urn:sobject.enterprise.soap.sforce.com","Expiration","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setExpiration((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("Expiration", "urn:sobject.enterprise.soap.sforce.com","Expiration","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldExpiration(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Expiration", "urn:sobject.enterprise.soap.sforce.com","Expiration","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), Expiration, Expiration__is_set);
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
     * element : ReplayId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ReplayId__is_set = false;

    private java.lang.String ReplayId;

    public java.lang.String getReplayId() {
      return ReplayId;
    }

    public void setReplayId(java.lang.String ReplayId) {
      this.ReplayId = ReplayId;
      ReplayId__is_set = true;
    }

    protected void setReplayId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setReplayId(__typeMapper.readString(__in, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldReplayId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ReplayId", "urn:sobject.enterprise.soap.sforce.com","ReplayId","http://www.w3.org/2001/XMLSchema","string",0,1,true), ReplayId, ReplayId__is_set);
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
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AssetTokenEvent");
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
      sb.append("[AssetTokenEvent ");
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
      writeFieldActorTokenPayload(__out, __typeMapper);
      writeFieldAsset(__out, __typeMapper);
      writeFieldAssetId(__out, __typeMapper);
      writeFieldAssetName(__out, __typeMapper);
      writeFieldAssetSerialNumber(__out, __typeMapper);
      writeFieldConnectedApp(__out, __typeMapper);
      writeFieldConnectedAppId(__out, __typeMapper);
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldDeviceId(__out, __typeMapper);
      writeFieldDeviceKey(__out, __typeMapper);
      writeFieldExpiration(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldReplayId(__out, __typeMapper);
      writeFieldUser(__out, __typeMapper);
      writeFieldUserId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActorTokenPayload(__in, __typeMapper);
      setAsset(__in, __typeMapper);
      setAssetId(__in, __typeMapper);
      setAssetName(__in, __typeMapper);
      setAssetSerialNumber(__in, __typeMapper);
      setConnectedApp(__in, __typeMapper);
      setConnectedAppId(__in, __typeMapper);
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setDeviceId(__in, __typeMapper);
      setDeviceKey(__in, __typeMapper);
      setExpiration(__in, __typeMapper);
      setName(__in, __typeMapper);
      setReplayId(__in, __typeMapper);
      setUser(__in, __typeMapper);
      setUserId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ActorTokenPayload", ActorTokenPayload);
      toStringHelper(sb, "Asset", Asset);
      toStringHelper(sb, "AssetId", AssetId);
      toStringHelper(sb, "AssetName", AssetName);
      toStringHelper(sb, "AssetSerialNumber", AssetSerialNumber);
      toStringHelper(sb, "ConnectedApp", ConnectedApp);
      toStringHelper(sb, "ConnectedAppId", ConnectedAppId);
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "DeviceId", DeviceId);
      toStringHelper(sb, "DeviceKey", DeviceKey);
      toStringHelper(sb, "Expiration", Expiration);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "ReplayId", ReplayId);
      toStringHelper(sb, "User", User);
      toStringHelper(sb, "UserId", UserId);
    }


}
