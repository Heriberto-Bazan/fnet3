
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
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customerForeignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeablePrize" maxOccurs="unbounded"/>
 *         <element name="sellerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="voucherCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="externalRefMixedPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/>
 *         <element name="auctionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="forGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shopID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shopForeignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useDataShopForShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "card",
    "customerID",
    "customerForeignId",
    "email",
    "mobile",
    "identityCard",
    "prizesList",
    "sellerCard",
    "pincode",
    "notes",
    "ticketID",
    "voucherCode",
    "externalRefMixedPayment",
    "shippingInformation",
    "auctionId",
    "forGift",
    "shopID",
    "shopForeignID",
    "useDataShopForShipping",
    "shoppingCartId",
    "useFeeFix"
})
@XmlRootElement(name = "ExchangePrizesByCardRequest")
public class ExchangePrizesByCardRequest {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String card;
    protected long customerID;
    @XmlElement(required = true)
    protected String customerForeignId;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String identityCard;
    @XmlElement(required = true)
    protected List<WSExchangeablePrize> prizesList;
    @XmlElement(required = true)
    protected String sellerCard;
    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true)
    protected String ticketID;
    protected long voucherCode;
    @XmlElement(required = true)
    protected String externalRefMixedPayment;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    protected long auctionId;
    protected boolean forGift;
    protected long shopID;
    protected long shopForeignID;
    protected boolean useDataShopForShipping;
    protected long shoppingCartId;
    protected boolean useFeeFix;

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
     * Obtiene el valor de la propiedad customerForeignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerForeignId() {
        return customerForeignId;
    }

    /**
     * Define el valor de la propiedad customerForeignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerForeignId(String value) {
        this.customerForeignId = value;
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
     * Gets the value of the prizesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prizesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangeablePrize }
     * 
     * 
     * @return
     *     The value of the prizesList property.
     */
    public List<WSExchangeablePrize> getPrizesList() {
        if (prizesList == null) {
            prizesList = new ArrayList<>();
        }
        return this.prizesList;
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
     * Obtiene el valor de la propiedad voucherCode.
     * 
     */
    public long getVoucherCode() {
        return voucherCode;
    }

    /**
     * Define el valor de la propiedad voucherCode.
     * 
     */
    public void setVoucherCode(long value) {
        this.voucherCode = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRefMixedPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefMixedPayment() {
        return externalRefMixedPayment;
    }

    /**
     * Define el valor de la propiedad externalRefMixedPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefMixedPayment(String value) {
        this.externalRefMixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingInformation.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingInformation }
     *     
     */
    public WSShippingInformation getShippingInformation() {
        return shippingInformation;
    }

    /**
     * Define el valor de la propiedad shippingInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingInformation }
     *     
     */
    public void setShippingInformation(WSShippingInformation value) {
        this.shippingInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad auctionId.
     * 
     */
    public long getAuctionId() {
        return auctionId;
    }

    /**
     * Define el valor de la propiedad auctionId.
     * 
     */
    public void setAuctionId(long value) {
        this.auctionId = value;
    }

    /**
     * Obtiene el valor de la propiedad forGift.
     * 
     */
    public boolean isForGift() {
        return forGift;
    }

    /**
     * Define el valor de la propiedad forGift.
     * 
     */
    public void setForGift(boolean value) {
        this.forGift = value;
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
     * Obtiene el valor de la propiedad shopForeignID.
     * 
     */
    public long getShopForeignID() {
        return shopForeignID;
    }

    /**
     * Define el valor de la propiedad shopForeignID.
     * 
     */
    public void setShopForeignID(long value) {
        this.shopForeignID = value;
    }

    /**
     * Obtiene el valor de la propiedad useDataShopForShipping.
     * 
     */
    public boolean isUseDataShopForShipping() {
        return useDataShopForShipping;
    }

    /**
     * Define el valor de la propiedad useDataShopForShipping.
     * 
     */
    public void setUseDataShopForShipping(boolean value) {
        this.useDataShopForShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad shoppingCartId.
     * 
     */
    public long getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Define el valor de la propiedad shoppingCartId.
     * 
     */
    public void setShoppingCartId(long value) {
        this.shoppingCartId = value;
    }

    /**
     * Obtiene el valor de la propiedad useFeeFix.
     * 
     */
    public boolean isUseFeeFix() {
        return useFeeFix;
    }

    /**
     * Define el valor de la propiedad useFeeFix.
     * 
     */
    public void setUseFeeFix(boolean value) {
        this.useFeeFix = value;
    }

}
