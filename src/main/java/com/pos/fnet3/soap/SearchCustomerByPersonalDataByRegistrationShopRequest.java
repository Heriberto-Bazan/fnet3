
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="birthdateDay" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="birthdateMonth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="birthdateYear" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cellphone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="facebookId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shopID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pagination" type="{http://FidelyNET3_SW_01_89_00}WS_PaginationResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionID",
    "name",
    "surname",
    "birthdate",
    "birthdateDay",
    "birthdateMonth",
    "birthdateYear",
    "email",
    "cellphone",
    "facebookId",
    "campaignID",
    "shopID",
    "pagination"
})
@XmlRootElement(name = "SearchCustomerByPersonalDataByRegistrationShopRequest")
public class SearchCustomerByPersonalDataByRegistrationShopRequest {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String surname;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdate;
    protected long birthdateDay;
    protected long birthdateMonth;
    protected long birthdateYear;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String cellphone;
    @XmlElement(required = true)
    protected String facebookId;
    protected long campaignID;
    protected long shopID;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Obtiene el valor de la propiedad birthdateDay.
     * 
     */
    public long getBirthdateDay() {
        return birthdateDay;
    }

    /**
     * Define el valor de la propiedad birthdateDay.
     * 
     */
    public void setBirthdateDay(long value) {
        this.birthdateDay = value;
    }

    /**
     * Obtiene el valor de la propiedad birthdateMonth.
     * 
     */
    public long getBirthdateMonth() {
        return birthdateMonth;
    }

    /**
     * Define el valor de la propiedad birthdateMonth.
     * 
     */
    public void setBirthdateMonth(long value) {
        this.birthdateMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad birthdateYear.
     * 
     */
    public long getBirthdateYear() {
        return birthdateYear;
    }

    /**
     * Define el valor de la propiedad birthdateYear.
     * 
     */
    public void setBirthdateYear(long value) {
        this.birthdateYear = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad cellphone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * Define el valor de la propiedad cellphone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellphone(String value) {
        this.cellphone = value;
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
     * Obtiene el valor de la propiedad campaignID.
     * 
     */
    public long getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     */
    public void setCampaignID(long value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad shopID.
     * 
     */
    public long getShopID() {
        return shopID;
    }

    /**
     * Define el valor de la propiedad shopID.
     * 
     */
    public void setShopID(long value) {
        this.shopID = value;
    }

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link WSPaginationResult }
     *     
     */
    public WSPaginationResult getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaginationResult }
     *     
     */
    public void setPagination(WSPaginationResult value) {
        this.pagination = value;
    }

}
