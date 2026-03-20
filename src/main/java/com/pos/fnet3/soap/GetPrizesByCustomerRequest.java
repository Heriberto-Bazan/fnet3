
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="onlyOutstandingPrize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="filterKind" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="lastDays" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizesCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="filterKindQualification" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="onlyForGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "customerID",
    "card",
    "mobile",
    "email",
    "identityCard",
    "catalogId",
    "prizeID",
    "categoryId",
    "prizeEnabled",
    "prizeCode",
    "onlyOutstandingPrize",
    "filterKind",
    "lastDays",
    "prizesCount",
    "filterKindQualification",
    "onlyForGift",
    "pagination"
})
@XmlRootElement(name = "GetPrizesByCustomerRequest")
public class GetPrizesByCustomerRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long customerID;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String identityCard;
    protected long catalogId;
    protected long prizeID;
    protected long categoryId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean prizeEnabled;
    @XmlElement(required = true)
    protected String prizeCode;
    protected boolean onlyOutstandingPrize;
    protected long filterKind;
    protected long lastDays;
    protected long prizesCount;
    protected long filterKindQualification;
    protected boolean onlyForGift;
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
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(long value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad mobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Define el valor de la propiedad mobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeID.
     * 
     */
    public long getPrizeID() {
        return prizeID;
    }

    /**
     * Define el valor de la propiedad prizeID.
     * 
     */
    public void setPrizeID(long value) {
        this.prizeID = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrizeEnabled() {
        return prizeEnabled;
    }

    /**
     * Define el valor de la propiedad prizeEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrizeEnabled(Boolean value) {
        this.prizeEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeCode() {
        return prizeCode;
    }

    /**
     * Define el valor de la propiedad prizeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeCode(String value) {
        this.prizeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyOutstandingPrize.
     * 
     */
    public boolean isOnlyOutstandingPrize() {
        return onlyOutstandingPrize;
    }

    /**
     * Define el valor de la propiedad onlyOutstandingPrize.
     * 
     */
    public void setOnlyOutstandingPrize(boolean value) {
        this.onlyOutstandingPrize = value;
    }

    /**
     * Obtiene el valor de la propiedad filterKind.
     * 
     */
    public long getFilterKind() {
        return filterKind;
    }

    /**
     * Define el valor de la propiedad filterKind.
     * 
     */
    public void setFilterKind(long value) {
        this.filterKind = value;
    }

    /**
     * Obtiene el valor de la propiedad lastDays.
     * 
     */
    public long getLastDays() {
        return lastDays;
    }

    /**
     * Define el valor de la propiedad lastDays.
     * 
     */
    public void setLastDays(long value) {
        this.lastDays = value;
    }

    /**
     * Obtiene el valor de la propiedad prizesCount.
     * 
     */
    public long getPrizesCount() {
        return prizesCount;
    }

    /**
     * Define el valor de la propiedad prizesCount.
     * 
     */
    public void setPrizesCount(long value) {
        this.prizesCount = value;
    }

    /**
     * Obtiene el valor de la propiedad filterKindQualification.
     * 
     */
    public long getFilterKindQualification() {
        return filterKindQualification;
    }

    /**
     * Define el valor de la propiedad filterKindQualification.
     * 
     */
    public void setFilterKindQualification(long value) {
        this.filterKindQualification = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyForGift.
     * 
     */
    public boolean isOnlyForGift() {
        return onlyForGift;
    }

    /**
     * Define el valor de la propiedad onlyForGift.
     * 
     */
    public void setOnlyForGift(boolean value) {
        this.onlyForGift = value;
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
