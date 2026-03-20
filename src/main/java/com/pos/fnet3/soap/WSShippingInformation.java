
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShippingInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShippingInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="address2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="references" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobileCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="visitHour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="foreignShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shippingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="shippingDocumentNbr" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="sendingCompany" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="estimatedDeliverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="courierURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="inscription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShippingInformation", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "address1",
    "address2",
    "city",
    "state",
    "country",
    "references",
    "contactSurname",
    "contactEmail",
    "contactMobile",
    "mobileCarrier",
    "zip",
    "contactTelephone",
    "contactName",
    "visitHour",
    "note",
    "foreignShipping",
    "shippingDate",
    "shippingDocumentNbr",
    "sendingCompany",
    "trackingNumber",
    "estimatedDeliverDate",
    "courierURL",
    "inscription"
})
public class WSShippingInformation {

    @XmlElement(required = true)
    protected String address1;
    @XmlElement(required = true)
    protected String address2;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String references;
    @XmlElement(required = true)
    protected String contactSurname;
    @XmlElement(required = true)
    protected String contactEmail;
    @XmlElement(required = true)
    protected String contactMobile;
    @XmlElement(required = true)
    protected String mobileCarrier;
    @XmlElement(required = true)
    protected String zip;
    @XmlElement(required = true)
    protected String contactTelephone;
    @XmlElement(required = true)
    protected String contactName;
    @XmlElement(required = true)
    protected String visitHour;
    @XmlElement(required = true)
    protected String note;
    protected boolean foreignShipping;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingDate;
    protected long shippingDocumentNbr;
    @XmlElement(required = true)
    protected String sendingCompany;
    @XmlElement(required = true)
    protected String trackingNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliverDate;
    @XmlElement(required = true)
    protected String courierURL;
    @XmlElement(required = true)
    protected String inscription;

    /**
     * Obtiene el valor de la propiedad address1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Define el valor de la propiedad address1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Obtiene el valor de la propiedad address2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Define el valor de la propiedad address2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad references.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Define el valor de la propiedad references.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * Obtiene el valor de la propiedad contactSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSurname() {
        return contactSurname;
    }

    /**
     * Define el valor de la propiedad contactSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSurname(String value) {
        this.contactSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad contactEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Define el valor de la propiedad contactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad contactMobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * Define el valor de la propiedad contactMobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileCarrier() {
        return mobileCarrier;
    }

    /**
     * Define el valor de la propiedad mobileCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileCarrier(String value) {
        this.mobileCarrier = value;
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
     * Obtiene el valor de la propiedad contactTelephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelephone() {
        return contactTelephone;
    }

    /**
     * Define el valor de la propiedad contactTelephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelephone(String value) {
        this.contactTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Define el valor de la propiedad contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Obtiene el valor de la propiedad visitHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitHour() {
        return visitHour;
    }

    /**
     * Define el valor de la propiedad visitHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitHour(String value) {
        this.visitHour = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignShipping.
     * 
     */
    public boolean isForeignShipping() {
        return foreignShipping;
    }

    /**
     * Define el valor de la propiedad foreignShipping.
     * 
     */
    public void setForeignShipping(boolean value) {
        this.foreignShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingDate() {
        return shippingDate;
    }

    /**
     * Define el valor de la propiedad shippingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingDate(XMLGregorianCalendar value) {
        this.shippingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingDocumentNbr.
     * 
     */
    public long getShippingDocumentNbr() {
        return shippingDocumentNbr;
    }

    /**
     * Define el valor de la propiedad shippingDocumentNbr.
     * 
     */
    public void setShippingDocumentNbr(long value) {
        this.shippingDocumentNbr = value;
    }

    /**
     * Obtiene el valor de la propiedad sendingCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingCompany() {
        return sendingCompany;
    }

    /**
     * Define el valor de la propiedad sendingCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingCompany(String value) {
        this.sendingCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Define el valor de la propiedad trackingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad estimatedDeliverDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliverDate() {
        return estimatedDeliverDate;
    }

    /**
     * Define el valor de la propiedad estimatedDeliverDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliverDate(XMLGregorianCalendar value) {
        this.estimatedDeliverDate = value;
    }

    /**
     * Obtiene el valor de la propiedad courierURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierURL() {
        return courierURL;
    }

    /**
     * Define el valor de la propiedad courierURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierURL(String value) {
        this.courierURL = value;
    }

    /**
     * Obtiene el valor de la propiedad inscription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscription() {
        return inscription;
    }

    /**
     * Define el valor de la propiedad inscription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscription(String value) {
        this.inscription = value;
    }

}
