package com.sforce.soap.enterprise.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DatacloudAddress extends com.sforce.soap.enterprise.sobject.SObject {

    /**
     * Constructor
     */
    public DatacloudAddress() {}

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
     * element : AddressLine1 of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AddressLine1__is_set = false;

    private java.lang.String AddressLine1;

    public java.lang.String getAddressLine1() {
      return AddressLine1;
    }

    public void setAddressLine1(java.lang.String AddressLine1) {
      this.AddressLine1 = AddressLine1;
      AddressLine1__is_set = true;
    }

    protected void setAddressLine1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AddressLine1", "urn:sobject.enterprise.soap.sforce.com","AddressLine1","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAddressLine1(__typeMapper.readString(__in, _lookupTypeInfo("AddressLine1", "urn:sobject.enterprise.soap.sforce.com","AddressLine1","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAddressLine1(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AddressLine1", "urn:sobject.enterprise.soap.sforce.com","AddressLine1","http://www.w3.org/2001/XMLSchema","string",0,1,true), AddressLine1, AddressLine1__is_set);
    }

    /**
     * element : AddressLine2 of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AddressLine2__is_set = false;

    private java.lang.String AddressLine2;

    public java.lang.String getAddressLine2() {
      return AddressLine2;
    }

    public void setAddressLine2(java.lang.String AddressLine2) {
      this.AddressLine2 = AddressLine2;
      AddressLine2__is_set = true;
    }

    protected void setAddressLine2(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AddressLine2", "urn:sobject.enterprise.soap.sforce.com","AddressLine2","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAddressLine2(__typeMapper.readString(__in, _lookupTypeInfo("AddressLine2", "urn:sobject.enterprise.soap.sforce.com","AddressLine2","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAddressLine2(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AddressLine2", "urn:sobject.enterprise.soap.sforce.com","AddressLine2","http://www.w3.org/2001/XMLSchema","string",0,1,true), AddressLine2, AddressLine2__is_set);
    }

    /**
     * element : City of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean City__is_set = false;

    private java.lang.String City;

    public java.lang.String getCity() {
      return City;
    }

    public void setCity(java.lang.String City) {
      this.City = City;
      City__is_set = true;
    }

    protected void setCity(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("City", "urn:sobject.enterprise.soap.sforce.com","City","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCity(__typeMapper.readString(__in, _lookupTypeInfo("City", "urn:sobject.enterprise.soap.sforce.com","City","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCity(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("City", "urn:sobject.enterprise.soap.sforce.com","City","http://www.w3.org/2001/XMLSchema","string",0,1,true), City, City__is_set);
    }

    /**
     * element : Country of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Country__is_set = false;

    private java.lang.String Country;

    public java.lang.String getCountry() {
      return Country;
    }

    public void setCountry(java.lang.String Country) {
      this.Country = Country;
      Country__is_set = true;
    }

    protected void setCountry(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Country", "urn:sobject.enterprise.soap.sforce.com","Country","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCountry(__typeMapper.readString(__in, _lookupTypeInfo("Country", "urn:sobject.enterprise.soap.sforce.com","Country","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCountry(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Country", "urn:sobject.enterprise.soap.sforce.com","Country","http://www.w3.org/2001/XMLSchema","string",0,1,true), Country, Country__is_set);
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
     * element : GeoAccuracyCode of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean GeoAccuracyCode__is_set = false;

    private java.lang.String GeoAccuracyCode;

    public java.lang.String getGeoAccuracyCode() {
      return GeoAccuracyCode;
    }

    public void setGeoAccuracyCode(java.lang.String GeoAccuracyCode) {
      this.GeoAccuracyCode = GeoAccuracyCode;
      GeoAccuracyCode__is_set = true;
    }

    protected void setGeoAccuracyCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("GeoAccuracyCode", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyCode","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setGeoAccuracyCode(__typeMapper.readString(__in, _lookupTypeInfo("GeoAccuracyCode", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldGeoAccuracyCode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("GeoAccuracyCode", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), GeoAccuracyCode, GeoAccuracyCode__is_set);
    }

    /**
     * element : GeoAccuracyNum of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean GeoAccuracyNum__is_set = false;

    private java.lang.String GeoAccuracyNum;

    public java.lang.String getGeoAccuracyNum() {
      return GeoAccuracyNum;
    }

    public void setGeoAccuracyNum(java.lang.String GeoAccuracyNum) {
      this.GeoAccuracyNum = GeoAccuracyNum;
      GeoAccuracyNum__is_set = true;
    }

    protected void setGeoAccuracyNum(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("GeoAccuracyNum", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyNum","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setGeoAccuracyNum(__typeMapper.readString(__in, _lookupTypeInfo("GeoAccuracyNum", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyNum","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldGeoAccuracyNum(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("GeoAccuracyNum", "urn:sobject.enterprise.soap.sforce.com","GeoAccuracyNum","http://www.w3.org/2001/XMLSchema","string",0,1,true), GeoAccuracyNum, GeoAccuracyNum__is_set);
    }

    /**
     * element : Latitude of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Latitude__is_set = false;

    private java.lang.String Latitude;

    public java.lang.String getLatitude() {
      return Latitude;
    }

    public void setLatitude(java.lang.String Latitude) {
      this.Latitude = Latitude;
      Latitude__is_set = true;
    }

    protected void setLatitude(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Latitude", "urn:sobject.enterprise.soap.sforce.com","Latitude","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLatitude(__typeMapper.readString(__in, _lookupTypeInfo("Latitude", "urn:sobject.enterprise.soap.sforce.com","Latitude","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLatitude(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Latitude", "urn:sobject.enterprise.soap.sforce.com","Latitude","http://www.w3.org/2001/XMLSchema","string",0,1,true), Latitude, Latitude__is_set);
    }

    /**
     * element : Longitude of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Longitude__is_set = false;

    private java.lang.String Longitude;

    public java.lang.String getLongitude() {
      return Longitude;
    }

    public void setLongitude(java.lang.String Longitude) {
      this.Longitude = Longitude;
      Longitude__is_set = true;
    }

    protected void setLongitude(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Longitude", "urn:sobject.enterprise.soap.sforce.com","Longitude","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLongitude(__typeMapper.readString(__in, _lookupTypeInfo("Longitude", "urn:sobject.enterprise.soap.sforce.com","Longitude","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLongitude(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Longitude", "urn:sobject.enterprise.soap.sforce.com","Longitude","http://www.w3.org/2001/XMLSchema","string",0,1,true), Longitude, Longitude__is_set);
    }

    /**
     * element : PostalCode of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean PostalCode__is_set = false;

    private java.lang.String PostalCode;

    public java.lang.String getPostalCode() {
      return PostalCode;
    }

    public void setPostalCode(java.lang.String PostalCode) {
      this.PostalCode = PostalCode;
      PostalCode__is_set = true;
    }

    protected void setPostalCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("PostalCode", "urn:sobject.enterprise.soap.sforce.com","PostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPostalCode(__typeMapper.readString(__in, _lookupTypeInfo("PostalCode", "urn:sobject.enterprise.soap.sforce.com","PostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPostalCode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("PostalCode", "urn:sobject.enterprise.soap.sforce.com","PostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true), PostalCode, PostalCode__is_set);
    }

    /**
     * element : State of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean State__is_set = false;

    private java.lang.String State;

    public java.lang.String getState() {
      return State;
    }

    public void setState(java.lang.String State) {
      this.State = State;
      State__is_set = true;
    }

    protected void setState(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("State", "urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setState(__typeMapper.readString(__in, _lookupTypeInfo("State", "urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldState(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("State", "urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true), State, State__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "DatacloudAddress");
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
      sb.append("[DatacloudAddress ");
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
      writeFieldAddressLine1(__out, __typeMapper);
      writeFieldAddressLine2(__out, __typeMapper);
      writeFieldCity(__out, __typeMapper);
      writeFieldCountry(__out, __typeMapper);
      writeFieldExternalId(__out, __typeMapper);
      writeFieldGeoAccuracyCode(__out, __typeMapper);
      writeFieldGeoAccuracyNum(__out, __typeMapper);
      writeFieldLatitude(__out, __typeMapper);
      writeFieldLongitude(__out, __typeMapper);
      writeFieldPostalCode(__out, __typeMapper);
      writeFieldState(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAddressLine1(__in, __typeMapper);
      setAddressLine2(__in, __typeMapper);
      setCity(__in, __typeMapper);
      setCountry(__in, __typeMapper);
      setExternalId(__in, __typeMapper);
      setGeoAccuracyCode(__in, __typeMapper);
      setGeoAccuracyNum(__in, __typeMapper);
      setLatitude(__in, __typeMapper);
      setLongitude(__in, __typeMapper);
      setPostalCode(__in, __typeMapper);
      setState(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AddressLine1", AddressLine1);
      toStringHelper(sb, "AddressLine2", AddressLine2);
      toStringHelper(sb, "City", City);
      toStringHelper(sb, "Country", Country);
      toStringHelper(sb, "ExternalId", ExternalId);
      toStringHelper(sb, "GeoAccuracyCode", GeoAccuracyCode);
      toStringHelper(sb, "GeoAccuracyNum", GeoAccuracyNum);
      toStringHelper(sb, "Latitude", Latitude);
      toStringHelper(sb, "Longitude", Longitude);
      toStringHelper(sb, "PostalCode", PostalCode);
      toStringHelper(sb, "State", State);
    }


}
