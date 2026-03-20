
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerBaseCard complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerBaseCard">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="personalInfo" type="{http://FidelyNET3_SW_01_89_00}WS_PersonalInfo"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerBaseCard", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "card",
    "fidelyCode",
    "invitorCode",
    "personalInfo"
})
public class WSCustomerBaseCard {

    @XmlElement(required = true)
    protected String card;
    protected long fidelyCode;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;
    @XmlElement(required = true)
    protected WSPersonalInfo personalInfo;

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
     * Obtiene el valor de la propiedad fidelyCode.
     * 
     */
    public long getFidelyCode() {
        return fidelyCode;
    }

    /**
     * Define el valor de la propiedad fidelyCode.
     * 
     */
    public void setFidelyCode(long value) {
        this.fidelyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad invitorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitorCode() {
        return invitorCode;
    }

    /**
     * Define el valor de la propiedad invitorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitorCode(String value) {
        this.invitorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInfo.
     * 
     * @return
     *     possible object is
     *     {@link WSPersonalInfo }
     *     
     */
    public WSPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Define el valor de la propiedad personalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPersonalInfo }
     *     
     */
    public void setPersonalInfo(WSPersonalInfo value) {
        this.personalInfo = value;
    }

}
