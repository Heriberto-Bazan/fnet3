
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangePrizeCart complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangePrizeCart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pointUse" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUse" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangePrizeCart", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "prizeId",
    "prizeCode",
    "quantity",
    "catalogId",
    "pointUse",
    "moneyUse"
})
public class WSExchangePrizeCart {

    protected long prizeId;
    @XmlElement(required = true)
    protected String prizeCode;
    protected int quantity;
    protected long catalogId;
    protected double pointUse;
    protected double moneyUse;

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

}
