
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeItem", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "prizeId",
    "code",
    "pointsUsed",
    "moneyUsed",
    "quantity",
    "catalogId"
})
public class WSPrizeItem {

    protected long prizeId;
    @XmlElement(required = true, nillable = true)
    protected String code;
    protected double pointsUsed;
    protected double moneyUsed;
    protected double quantity;
    protected long catalogId;

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
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
    public double getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(double value) {
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

}
