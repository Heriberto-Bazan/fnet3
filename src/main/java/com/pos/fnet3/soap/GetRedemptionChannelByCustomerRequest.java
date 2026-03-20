
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
 *         <element name="redemptionChannelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="redemptionChannelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="filterKind" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="lastDays" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="redemptionChannelCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="filterKindQualification" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="onlyOutstandingPrize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="onlySeasonal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="onlyMixedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="onlyMoneyToPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "redemptionChannelId",
    "categoryId",
    "redemptionChannelCode",
    "filterKind",
    "lastDays",
    "redemptionChannelCount",
    "filterKindQualification",
    "onlyOutstandingPrize",
    "onlySeasonal",
    "onlyMixedPayment",
    "onlyMoneyToPay",
    "pagination"
})
@XmlRootElement(name = "GetRedemptionChannelByCustomerRequest")
public class GetRedemptionChannelByCustomerRequest {

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
    protected long redemptionChannelId;
    protected long categoryId;
    @XmlElement(required = true)
    protected String redemptionChannelCode;
    protected long filterKind;
    protected long lastDays;
    protected long redemptionChannelCount;
    protected long filterKindQualification;
    protected boolean onlyOutstandingPrize;
    protected boolean onlySeasonal;
    protected boolean onlyMixedPayment;
    protected boolean onlyMoneyToPay;
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
     * Obtiene el valor de la propiedad redemptionChannelId.
     * 
     */
    public long getRedemptionChannelId() {
        return redemptionChannelId;
    }

    /**
     * Define el valor de la propiedad redemptionChannelId.
     * 
     */
    public void setRedemptionChannelId(long value) {
        this.redemptionChannelId = value;
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
     * Obtiene el valor de la propiedad redemptionChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionChannelCode() {
        return redemptionChannelCode;
    }

    /**
     * Define el valor de la propiedad redemptionChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionChannelCode(String value) {
        this.redemptionChannelCode = value;
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
     * Obtiene el valor de la propiedad redemptionChannelCount.
     * 
     */
    public long getRedemptionChannelCount() {
        return redemptionChannelCount;
    }

    /**
     * Define el valor de la propiedad redemptionChannelCount.
     * 
     */
    public void setRedemptionChannelCount(long value) {
        this.redemptionChannelCount = value;
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
     * Obtiene el valor de la propiedad onlySeasonal.
     * 
     */
    public boolean isOnlySeasonal() {
        return onlySeasonal;
    }

    /**
     * Define el valor de la propiedad onlySeasonal.
     * 
     */
    public void setOnlySeasonal(boolean value) {
        this.onlySeasonal = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyMixedPayment.
     * 
     */
    public boolean isOnlyMixedPayment() {
        return onlyMixedPayment;
    }

    /**
     * Define el valor de la propiedad onlyMixedPayment.
     * 
     */
    public void setOnlyMixedPayment(boolean value) {
        this.onlyMixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public boolean isOnlyMoneyToPay() {
        return onlyMoneyToPay;
    }

    /**
     * Define el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public void setOnlyMoneyToPay(boolean value) {
        this.onlyMoneyToPay = value;
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
