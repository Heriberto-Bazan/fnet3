
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangedExternalTransfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangedExternalTransfer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="exchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="deliverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeFlags"/>
 *         <element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="externalTransferValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="externalTransfer" type="{http://FidelyNET3_SW_01_89_00}WS_CatalogExternalTransfer"/>
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="shippingCost" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingCost"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangedExternalTransfer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "exchangeDate",
    "deliverDate",
    "flags",
    "points",
    "moneyUsed",
    "quantity",
    "externalTransferValue",
    "externalTransfer",
    "shop",
    "name",
    "shippingCost"
})
public class WSExchangedExternalTransfer {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliverDate;
    @XmlElement(required = true)
    protected WSExchangedPrizeFlags flags;
    protected double points;
    protected double moneyUsed;
    protected int quantity;
    protected double externalTransferValue;
    @XmlElement(required = true)
    protected WSCatalogExternalTransfer externalTransfer;
    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected WSShippingCost shippingCost;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Define el valor de la propiedad exchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliverDate() {
        return deliverDate;
    }

    /**
     * Define el valor de la propiedad deliverDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliverDate(XMLGregorianCalendar value) {
        this.deliverDate = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public WSExchangedPrizeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public void setFlags(WSExchangedPrizeFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad points.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
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
     * Obtiene el valor de la propiedad externalTransferValue.
     * 
     */
    public double getExternalTransferValue() {
        return externalTransferValue;
    }

    /**
     * Define el valor de la propiedad externalTransferValue.
     * 
     */
    public void setExternalTransferValue(double value) {
        this.externalTransferValue = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTransfer.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogExternalTransfer }
     *     
     */
    public WSCatalogExternalTransfer getExternalTransfer() {
        return externalTransfer;
    }

    /**
     * Define el valor de la propiedad externalTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogExternalTransfer }
     *     
     */
    public void setExternalTransfer(WSCatalogExternalTransfer value) {
        this.externalTransfer = value;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShop }
     *     
     */
    public WSShop getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShop }
     *     
     */
    public void setShop(WSShop value) {
        this.shop = value;
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
     * Obtiene el valor de la propiedad shippingCost.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingCost }
     *     
     */
    public WSShippingCost getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingCost }
     *     
     */
    public void setShippingCost(WSShippingCost value) {
        this.shippingCost = value;
    }

}
