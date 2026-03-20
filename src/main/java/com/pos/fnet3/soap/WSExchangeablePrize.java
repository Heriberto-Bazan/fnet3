
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangeablePrize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangeablePrize">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="discountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="feeMixedPayment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="paymentMethod" type="{http://FidelyNET3_SW_01_89_00}WS_PrizePaymentMethod" maxOccurs="unbounded"/>
 *         <element name="key" type="{http://FidelyNET3_SW_01_89_00}WS_Key" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangeablePrize", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "prizeId",
    "prizeCode",
    "pointsUsed",
    "moneyUsed",
    "quantity",
    "shopId",
    "catalogId",
    "discountId",
    "feeMixedPayment",
    "paymentMethod",
    "key"
})
public class WSExchangeablePrize {

    protected long prizeId;
    @XmlElement(required = true)
    protected String prizeCode;
    protected double pointsUsed;
    protected double moneyUsed;
    protected int quantity;
    protected long shopId;
    protected long catalogId;
    protected long discountId;
    protected double feeMixedPayment;
    @XmlElement(required = true)
    protected List<WSPrizePaymentMethod> paymentMethod;
    @XmlElement(required = true)
    protected List<WSKey> key;

    /**
     * Obtiene el valor de la propiedad prizeId.
     * 
     */
    public long getPrizeId() {
        return prizeId;
    }

    /**
     * Define el valor de la propiedad prizeId.
     * 
     */
    public void setPrizeId(long value) {
        this.prizeId = value;
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
     * Obtiene el valor de la propiedad pointsUsed.
     * 
     */
    public double getPointsUsed() {
        return pointsUsed;
    }

    /**
     * Define el valor de la propiedad pointsUsed.
     * 
     */
    public void setPointsUsed(double value) {
        this.pointsUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUsed.
     * 
     */
    public double getMoneyUsed() {
        return moneyUsed;
    }

    /**
     * Define el valor de la propiedad moneyUsed.
     * 
     */
    public void setMoneyUsed(double value) {
        this.moneyUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad shopId.
     * 
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Define el valor de la propiedad shopId.
     * 
     */
    public void setShopId(long value) {
        this.shopId = value;
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
     * Obtiene el valor de la propiedad discountId.
     * 
     */
    public long getDiscountId() {
        return discountId;
    }

    /**
     * Define el valor de la propiedad discountId.
     * 
     */
    public void setDiscountId(long value) {
        this.discountId = value;
    }

    /**
     * Obtiene el valor de la propiedad feeMixedPayment.
     * 
     */
    public double getFeeMixedPayment() {
        return feeMixedPayment;
    }

    /**
     * Define el valor de la propiedad feeMixedPayment.
     * 
     */
    public void setFeeMixedPayment(double value) {
        this.feeMixedPayment = value;
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
     * {@link WSPrizePaymentMethod }
     * 
     * 
     * @return
     *     The value of the paymentMethod property.
     */
    public List<WSPrizePaymentMethod> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSKey }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<WSKey> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

}
