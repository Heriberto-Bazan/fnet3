
package com.pos.fnet3.soap;

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
 *         <element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/>
 *         <element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/>
 *         <element name="shippingCost" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingCost"/>
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
    "movement",
    "exchangeCode",
    "shippingInformation",
    "shippingCost",
    "shippingShop"
})
@XmlRootElement(name = "GetExchangeInformationResponse")
public class GetExchangeInformationResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSMovement movement;
    protected long exchangeCode;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    @XmlElement(required = true)
    protected WSShippingCost shippingCost;
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
     */
    public long getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Define el valor de la propiedad exchangeCode.
     * 
     */
    public void setExchangeCode(long value) {
        this.exchangeCode = value;
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
