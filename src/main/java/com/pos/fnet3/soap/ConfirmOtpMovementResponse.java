
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
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="otpCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customer" type="{http://FidelyNET3_SW_01_89_00}WS_Customer"/>
 *         <element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/>
 *         <element name="exchangeCode" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeCode"/>
 *         <element name="promotions" type="{http://FidelyNET3_SW_01_89_00}WS_Promotion" maxOccurs="unbounded"/>
 *         <element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/>
 *         <element name="shippingShop" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingShop"/>
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
    "answerCode",
    "otpCode",
    "customer",
    "movement",
    "exchangeCode",
    "promotions",
    "shippingInformation",
    "shippingShop"
})
@XmlRootElement(name = "ConfirmOtpMovementResponse")
public class ConfirmOtpMovementResponse {

    protected int answerCode;
    protected int otpCode;
    @XmlElement(required = true)
    protected WSCustomer customer;
    @XmlElement(required = true)
    protected WSMovement movement;
    @XmlElement(required = true)
    protected WSExchangeCode exchangeCode;
    @XmlElement(required = true)
    protected List<WSPromotion> promotions;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    @XmlElement(required = true)
    protected WSShippingShop shippingShop;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad otpCode.
     * 
     */
    public int getOtpCode() {
        return otpCode;
    }

    /**
     * Define el valor de la propiedad otpCode.
     * 
     */
    public void setOtpCode(int value) {
        this.otpCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomer }
     *     
     */
    public WSCustomer getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomer }
     *     
     */
    public void setCustomer(WSCustomer value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad movement.
     * 
     * @return
     *     possible object is
     *     {@link WSMovement }
     *     
     */
    public WSMovement getMovement() {
        return movement;
    }

    /**
     * Define el valor de la propiedad movement.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMovement }
     *     
     */
    public void setMovement(WSMovement value) {
        this.movement = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeCode.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangeCode }
     *     
     */
    public WSExchangeCode getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Define el valor de la propiedad exchangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangeCode }
     *     
     */
    public void setExchangeCode(WSExchangeCode value) {
        this.exchangeCode = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotion }
     * 
     * 
     * @return
     *     The value of the promotions property.
     */
    public List<WSPromotion> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<>();
        }
        return this.promotions;
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
     * Obtiene el valor de la propiedad shippingShop.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingShop }
     *     
     */
    public WSShippingShop getShippingShop() {
        return shippingShop;
    }

    /**
     * Define el valor de la propiedad shippingShop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingShop }
     *     
     */
    public void setShippingShop(WSShippingShop value) {
        this.shippingShop = value;
    }

}
