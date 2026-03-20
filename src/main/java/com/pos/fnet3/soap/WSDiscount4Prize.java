
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Discount4Prize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Discount4Prize">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="discountInPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="discountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Discount4Prize", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "prizeId",
    "prizeCode",
    "catalogId",
    "discountInPercent",
    "discountInMoney"
})
public class WSDiscount4Prize {

    protected long id;
    protected long prizeId;
    @XmlElement(required = true, nillable = true)
    protected String prizeCode;
    protected long catalogId;
    protected double discountInPercent;
    protected double discountInMoney;

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
     * Obtiene el valor de la propiedad discountInPercent.
     * 
     */
    public double getDiscountInPercent() {
        return discountInPercent;
    }

    /**
     * Define el valor de la propiedad discountInPercent.
     * 
     */
    public void setDiscountInPercent(double value) {
        this.discountInPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad discountInMoney.
     * 
     */
    public double getDiscountInMoney() {
        return discountInMoney;
    }

    /**
     * Define el valor de la propiedad discountInMoney.
     * 
     */
    public void setDiscountInMoney(double value) {
        this.discountInMoney = value;
    }

}
