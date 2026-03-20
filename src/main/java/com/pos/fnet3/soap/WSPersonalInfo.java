
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PersonalInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PersonalInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityCardTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="privacy" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerPrivacy"/>
 *         <element name="mailContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobileContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="telephoneContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="faxContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="addressNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="addressPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="country" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel3" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel4" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel5" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="facebookId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="twitterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="instagramId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="youtubeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="principalCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="customerDynamicFields" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerDynamicField" maxOccurs="unbounded"/>
 *         <element name="interestAreas" type="{http://FidelyNET3_SW_01_89_00}WS_InterestAreaCustomer" maxOccurs="unbounded"/>
 *         <element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="frequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PersonalInfo", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "identityCard",
    "identityCardTypeId",
    "name",
    "surname",
    "gender",
    "birthdate",
    "notes",
    "userName",
    "privacy",
    "mailContactData",
    "mobileContactData",
    "telephoneContactData",
    "faxContactData",
    "address",
    "addressNumber",
    "addressPrefix",
    "zip",
    "country",
    "geoLevel1",
    "geoLevel2",
    "geoLevel3",
    "geoLevel4",
    "geoLevel5",
    "facebookId",
    "twitterId",
    "instagramId",
    "youtubeId",
    "principalCard",
    "customerDynamicFields",
    "interestAreas",
    "accountNumber",
    "frequentFlyerNumber",
    "pathImage",
    "foreignId"
})
public class WSPersonalInfo {

    @XmlElement(required = true)
    protected String identityCard;
    protected long identityCardTypeId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected WSCustomerPrivacy privacy;
    @XmlElement(required = true)
    protected String mailContactData;
    @XmlElement(required = true)
    protected String mobileContactData;
    @XmlElement(required = true)
    protected String telephoneContactData;
    @XmlElement(required = true)
    protected String faxContactData;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String addressNumber;
    @XmlElement(required = true)
    protected String addressPrefix;
    @XmlElement(required = true)
    protected String zip;
    protected long country;
    protected long geoLevel1;
    protected long geoLevel2;
    protected long geoLevel3;
    protected long geoLevel4;
    protected long geoLevel5;
    @XmlElement(required = true)
    protected String facebookId;
    @XmlElement(required = true)
    protected String twitterId;
    @XmlElement(required = true)
    protected String instagramId;
    @XmlElement(required = true)
    protected String youtubeId;
    protected boolean principalCard;
    @XmlElement(required = true)
    protected List<WSCustomerDynamicField> customerDynamicFields;
    @XmlElement(required = true)
    protected List<WSInterestAreaCustomer> interestAreas;
    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String frequentFlyerNumber;
    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(required = true)
    protected String foreignId;

    /**
     * Obtiene el valor de la propiedad identityCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * Define el valor de la propiedad identityCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCard(String value) {
        this.identityCard = value;
    }

    /**
     * Obtiene el valor de la propiedad identityCardTypeId.
     * 
     */
    public long getIdentityCardTypeId() {
        return identityCardTypeId;
    }

    /**
     * Define el valor de la propiedad identityCardTypeId.
     * 
     */
    public void setIdentityCardTypeId(long value) {
        this.identityCardTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Define el valor de la propiedad surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad birthdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Define el valor de la propiedad birthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define el valor de la propiedad userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtiene el valor de la propiedad privacy.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerPrivacy }
     *     
     */
    public WSCustomerPrivacy getPrivacy() {
        return privacy;
    }

    /**
     * Define el valor de la propiedad privacy.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerPrivacy }
     *     
     */
    public void setPrivacy(WSCustomerPrivacy value) {
        this.privacy = value;
    }

    /**
     * Obtiene el valor de la propiedad mailContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContactData() {
        return mailContactData;
    }

    /**
     * Define el valor de la propiedad mailContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContactData(String value) {
        this.mailContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileContactData() {
        return mobileContactData;
    }

    /**
     * Define el valor de la propiedad mobileContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileContactData(String value) {
        this.mobileContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad telephoneContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneContactData() {
        return telephoneContactData;
    }

    /**
     * Define el valor de la propiedad telephoneContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneContactData(String value) {
        this.telephoneContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad faxContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxContactData() {
        return faxContactData;
    }

    /**
     * Define el valor de la propiedad faxContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxContactData(String value) {
        this.faxContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad addressNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Define el valor de la propiedad addressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad addressPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * Define el valor de la propiedad addressPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPrefix(String value) {
        this.addressPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad zip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Define el valor de la propiedad zip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     */
    public long getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     */
    public void setCountry(long value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel1.
     * 
     */
    public long getGeoLevel1() {
        return geoLevel1;
    }

    /**
     * Define el valor de la propiedad geoLevel1.
     * 
     */
    public void setGeoLevel1(long value) {
        this.geoLevel1 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel2.
     * 
     */
    public long getGeoLevel2() {
        return geoLevel2;
    }

    /**
     * Define el valor de la propiedad geoLevel2.
     * 
     */
    public void setGeoLevel2(long value) {
        this.geoLevel2 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel3.
     * 
     */
    public long getGeoLevel3() {
        return geoLevel3;
    }

    /**
     * Define el valor de la propiedad geoLevel3.
     * 
     */
    public void setGeoLevel3(long value) {
        this.geoLevel3 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel4.
     * 
     */
    public long getGeoLevel4() {
        return geoLevel4;
    }

    /**
     * Define el valor de la propiedad geoLevel4.
     * 
     */
    public void setGeoLevel4(long value) {
        this.geoLevel4 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel5.
     * 
     */
    public long getGeoLevel5() {
        return geoLevel5;
    }

    /**
     * Define el valor de la propiedad geoLevel5.
     * 
     */
    public void setGeoLevel5(long value) {
        this.geoLevel5 = value;
    }

    /**
     * Obtiene el valor de la propiedad facebookId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Define el valor de la propiedad facebookId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    /**
     * Obtiene el valor de la propiedad twitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     * Define el valor de la propiedad twitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterId(String value) {
        this.twitterId = value;
    }

    /**
     * Obtiene el valor de la propiedad instagramId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstagramId() {
        return instagramId;
    }

    /**
     * Define el valor de la propiedad instagramId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstagramId(String value) {
        this.instagramId = value;
    }

    /**
     * Obtiene el valor de la propiedad youtubeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYoutubeId() {
        return youtubeId;
    }

    /**
     * Define el valor de la propiedad youtubeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYoutubeId(String value) {
        this.youtubeId = value;
    }

    /**
     * Obtiene el valor de la propiedad principalCard.
     * 
     */
    public boolean isPrincipalCard() {
        return principalCard;
    }

    /**
     * Define el valor de la propiedad principalCard.
     * 
     */
    public void setPrincipalCard(boolean value) {
        this.principalCard = value;
    }

    /**
     * Gets the value of the customerDynamicFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customerDynamicFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerDynamicFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCustomerDynamicField }
     * 
     * 
     * @return
     *     The value of the customerDynamicFields property.
     */
    public List<WSCustomerDynamicField> getCustomerDynamicFields() {
        if (customerDynamicFields == null) {
            customerDynamicFields = new ArrayList<>();
        }
        return this.customerDynamicFields;
    }

    /**
     * Gets the value of the interestAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the interestAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSInterestAreaCustomer }
     * 
     * 
     * @return
     *     The value of the interestAreas property.
     */
    public List<WSInterestAreaCustomer> getInterestAreas() {
        if (interestAreas == null) {
            interestAreas = new ArrayList<>();
        }
        return this.interestAreas;
    }

    /**
     * Obtiene el valor de la propiedad accountNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Define el valor de la propiedad accountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad frequentFlyerNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    /**
     * Define el valor de la propiedad frequentFlyerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentFlyerNumber(String value) {
        this.frequentFlyerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Define el valor de la propiedad pathImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImage(String value) {
        this.pathImage = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignId(String value) {
        this.foreignId = value;
    }

}
