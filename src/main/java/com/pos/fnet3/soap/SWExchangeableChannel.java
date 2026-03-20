
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SW_ExchangeableChannel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="SW_ExchangeableChannel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="channelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pointTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointUse" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUse" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="epMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="epPoint" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="optionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="paymentMethod" type="{http://FidelyNET3_SW_01_89_00}WS_ChannelPaymentMethod" maxOccurs="unbounded"/>
 *         <element name="keyChannel" type="{http://FidelyNET3_SW_01_89_00}WS_KeyChannel" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_ExchangeableChannel", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "channelId",
    "channelCode",
    "quantity",
    "shopId",
    "catalogId",
    "pointTotal",
    "moneyTotal",
    "pointUse",
    "moneyUse",
    "epMoney",
    "epPoint",
    "optionId",
    "paymentMethod",
    "keyChannel"
})
public class SWExchangeableChannel {

    protected long channelId;
    @XmlElement(required = true)
    protected String channelCode;
    protected int quantity;
    protected long shopId;
    protected long catalogId;
    protected double pointTotal;
    protected double moneyTotal;
    protected double pointUse;
    protected double moneyUse;
    protected double epMoney;
    protected double epPoint;
    @XmlElement(required = true)
    protected String optionId;
    @XmlElement(required = true)
    protected List<WSChannelPaymentMethod> paymentMethod;
    @XmlElement(required = true)
    protected List<WSKeyChannel> keyChannel;

    /**
     * Obtiene el valor de la propiedad channelId.
     * 
     */
    public long getChannelId() {
        return channelId;
    }

    /**
     * Define el valor de la propiedad channelId.
     * 
     */
    public void setChannelId(long value) {
        this.channelId = value;
    }

    /**
     * Obtiene el valor de la propiedad channelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Define el valor de la propiedad channelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
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
     * Obtiene el valor de la propiedad pointTotal.
     * 
     */
    public double getPointTotal() {
        return pointTotal;
    }

    /**
     * Define el valor de la propiedad pointTotal.
     * 
     */
    public void setPointTotal(double value) {
        this.pointTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyTotal.
     * 
     */
    public double getMoneyTotal() {
        return moneyTotal;
    }

    /**
     * Define el valor de la propiedad moneyTotal.
     * 
     */
    public void setMoneyTotal(double value) {
        this.moneyTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad pointUse.
     * 
     */
    public double getPointUse() {
        return pointUse;
    }

    /**
     * Define el valor de la propiedad pointUse.
     * 
     */
    public void setPointUse(double value) {
        this.pointUse = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUse.
     * 
     */
    public double getMoneyUse() {
        return moneyUse;
    }

    /**
     * Define el valor de la propiedad moneyUse.
     * 
     */
    public void setMoneyUse(double value) {
        this.moneyUse = value;
    }

    /**
     * Obtiene el valor de la propiedad epMoney.
     * 
     */
    public double getEpMoney() {
        return epMoney;
    }

    /**
     * Define el valor de la propiedad epMoney.
     * 
     */
    public void setEpMoney(double value) {
        this.epMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad epPoint.
     * 
     */
    public double getEpPoint() {
        return epPoint;
    }

    /**
     * Define el valor de la propiedad epPoint.
     * 
     */
    public void setEpPoint(double value) {
        this.epPoint = value;
    }

    /**
     * Obtiene el valor de la propiedad optionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionId() {
        return optionId;
    }

    /**
     * Define el valor de la propiedad optionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionId(String value) {
        this.optionId = value;
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
     * {@link WSChannelPaymentMethod }
     * 
     * 
     * @return
     *     The value of the paymentMethod property.
     */
    public List<WSChannelPaymentMethod> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the keyChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSKeyChannel }
     * 
     * 
     * @return
     *     The value of the keyChannel property.
     */
    public List<WSKeyChannel> getKeyChannel() {
        if (keyChannel == null) {
            keyChannel = new ArrayList<>();
        }
        return this.keyChannel;
    }

}
