
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerBaseStringGeolevel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerBaseStringGeolevel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneForeingId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="personalInfo" type="{http://FidelyNET3_SW_01_89_00}WS_PersonalInfoStringGeolevel"/>
 *         <element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerBaseStringGeolevel", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "campaignId",
    "card",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "mlmCustomerCard",
    "zoneId",
    "zoneForeingId",
    "personalInfo",
    "invitorCode"
})
public class WSCustomerBaseStringGeolevel {

    protected long campaignId;
    @XmlElement(required = true)
    protected String card;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    @XmlElement(required = true)
    protected String mlmCustomerCard;
    protected long zoneId;
    protected long zoneForeingId;
    @XmlElement(required = true)
    protected WSPersonalInfoStringGeolevel personalInfo;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

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
     * Obtiene el valor de la propiedad parentCustomerId.
     * 
     */
    public long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Define el valor de la propiedad parentCustomerId.
     * 
     */
    public void setParentCustomerId(long value) {
        this.parentCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmCustomerId.
     * 
     */
    public long getMlmCustomerId() {
        return mlmCustomerId;
    }

    /**
     * Define el valor de la propiedad mlmCustomerId.
     * 
     */
    public void setMlmCustomerId(long value) {
        this.mlmCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmCustomerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlmCustomerCard() {
        return mlmCustomerCard;
    }

    /**
     * Define el valor de la propiedad mlmCustomerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlmCustomerCard(String value) {
        this.mlmCustomerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneId.
     * 
     */
    public long getZoneId() {
        return zoneId;
    }

    /**
     * Define el valor de la propiedad zoneId.
     * 
     */
    public void setZoneId(long value) {
        this.zoneId = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneForeingId.
     * 
     */
    public long getZoneForeingId() {
        return zoneForeingId;
    }

    /**
     * Define el valor de la propiedad zoneForeingId.
     * 
     */
    public void setZoneForeingId(long value) {
        this.zoneForeingId = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInfo.
     * 
     * @return
     *     possible object is
     *     {@link WSPersonalInfoStringGeolevel }
     *     
     */
    public WSPersonalInfoStringGeolevel getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Define el valor de la propiedad personalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPersonalInfoStringGeolevel }
     *     
     */
    public void setPersonalInfo(WSPersonalInfoStringGeolevel value) {
        this.personalInfo = value;
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

}
