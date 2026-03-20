
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dischargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalBenefits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="discountID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         <element name="voucherID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="operatorForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dischargeDirectPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="paymentMethod" type="{http://FidelyNET3_SW_01_89_00}WS_PurchasePaymentMethod" maxOccurs="unbounded"/>
 *         <element name="foreignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="productList" type="{http://FidelyNET3_SW_01_89_00}WS_Product4Sale" maxOccurs="unbounded"/>
 *         <element name="sellerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="notReward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "campaignID",
    "customerID",
    "card",
    "mobile",
    "email",
    "identityCard",
    "dischargedCredits",
    "dischargedPoints",
    "totalMoney",
    "totalBenefits",
    "ticketID",
    "discountID",
    "voucherID",
    "operatorForeignId",
    "dischargeDirectPoints",
    "paymentMethod",
    "foreignID",
    "productList",
    "sellerCard",
    "pincode",
    "notes",
    "notReward"
})
@XmlRootElement(name = "SaleRequest")
public class SaleRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    protected long customerID;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String identityCard;
    protected double dischargedCredits;
    protected double dischargedPoints;
    protected double totalMoney;
    protected double totalBenefits;
    @XmlElement(required = true)
    protected String ticketID;
    @XmlElement(type = Long.class)
    protected List<Long> discountID;
    protected long voucherID;
    protected long operatorForeignId;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean dischargeDirectPoints;
    @XmlElement(required = true)
    protected List<WSPurchasePaymentMethod> paymentMethod;
    protected long foreignID;
    @XmlElement(required = true)
    protected List<WSProduct4Sale> productList;
    @XmlElement(required = true)
    protected String sellerCard;
    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean notReward;

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
     * Obtiene el valor de la propiedad dischargedCredits.
     * 
     */
    public double getDischargedCredits() {
        return dischargedCredits;
    }

    /**
     * Define el valor de la propiedad dischargedCredits.
     * 
     */
    public void setDischargedCredits(double value) {
        this.dischargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPoints.
     * 
     */
    public double getDischargedPoints() {
        return dischargedPoints;
    }

    /**
     * Define el valor de la propiedad dischargedPoints.
     * 
     */
    public void setDischargedPoints(double value) {
        this.dischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoney.
     * 
     */
    public double getTotalMoney() {
        return totalMoney;
    }

    /**
     * Define el valor de la propiedad totalMoney.
     * 
     */
    public void setTotalMoney(double value) {
        this.totalMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBenefits.
     * 
     */
    public double getTotalBenefits() {
        return totalBenefits;
    }

    /**
     * Define el valor de la propiedad totalBenefits.
     * 
     */
    public void setTotalBenefits(double value) {
        this.totalBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Define el valor de la propiedad ticketID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the discountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the discountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     * @return
     *     The value of the discountID property.
     */
    public List<Long> getDiscountID() {
        if (discountID == null) {
            discountID = new ArrayList<>();
        }
        return this.discountID;
    }

    /**
     * Obtiene el valor de la propiedad voucherID.
     * 
     */
    public long getVoucherID() {
        return voucherID;
    }

    /**
     * Define el valor de la propiedad voucherID.
     * 
     */
    public void setVoucherID(long value) {
        this.voucherID = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorForeignId.
     * 
     */
    public long getOperatorForeignId() {
        return operatorForeignId;
    }

    /**
     * Define el valor de la propiedad operatorForeignId.
     * 
     */
    public void setOperatorForeignId(long value) {
        this.operatorForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargeDirectPoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDischargeDirectPoints() {
        return dischargeDirectPoints;
    }

    /**
     * Define el valor de la propiedad dischargeDirectPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDischargeDirectPoints(Boolean value) {
        this.dischargeDirectPoints = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPurchasePaymentMethod }
     * 
     * 
     * @return
     *     The value of the paymentMethod property.
     */
    public List<WSPurchasePaymentMethod> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<>();
        }
        return this.paymentMethod;
    }

    /**
     * Obtiene el valor de la propiedad foreignID.
     * 
     */
    public long getForeignID() {
        return foreignID;
    }

    /**
     * Define el valor de la propiedad foreignID.
     * 
     */
    public void setForeignID(long value) {
        this.foreignID = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProduct4Sale }
     * 
     * 
     * @return
     *     The value of the productList property.
     */
    public List<WSProduct4Sale> getProductList() {
        if (productList == null) {
            productList = new ArrayList<>();
        }
        return this.productList;
    }

    /**
     * Obtiene el valor de la propiedad sellerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCard() {
        return sellerCard;
    }

    /**
     * Define el valor de la propiedad sellerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCard(String value) {
        this.sellerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad pincode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Define el valor de la propiedad pincode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
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
     * Obtiene el valor de la propiedad notReward.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotReward() {
        return notReward;
    }

    /**
     * Define el valor de la propiedad notReward.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotReward(Boolean value) {
        this.notReward = value;
    }

}
