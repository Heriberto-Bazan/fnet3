
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizePaymentMethod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizePaymentMethod">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="money" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="bin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="last4CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizePaymentMethod", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "foreignId",
    "code",
    "money",
    "currencyId",
    "bin",
    "last4CardNumber"
})
public class WSPrizePaymentMethod {

    protected long id;
    protected long foreignId;
    @XmlElement(required = true)
    protected String code;
    protected double money;
    protected long currencyId;
    @XmlElement(required = true)
    protected String bin;
    @XmlElement(required = true)
    protected String last4CardNumber;

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
     * Obtiene el valor de la propiedad foreignId.
     * 
     */
    public long getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     */
    public void setForeignId(long value) {
        this.foreignId = value;
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
     * Obtiene el valor de la propiedad money.
     * 
     */
    public double getMoney() {
        return money;
    }

    /**
     * Define el valor de la propiedad money.
     * 
     */
    public void setMoney(double value) {
        this.money = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     */
    public long getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     */
    public void setCurrencyId(long value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad bin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBin() {
        return bin;
    }

    /**
     * Define el valor de la propiedad bin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Obtiene el valor de la propiedad last4CardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLast4CardNumber() {
        return last4CardNumber;
    }

    /**
     * Define el valor de la propiedad last4CardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLast4CardNumber(String value) {
        this.last4CardNumber = value;
    }

}
