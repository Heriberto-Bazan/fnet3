
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerToModify complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerToModify">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customer_area_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "WS_CustomerToModify", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "card",
    "status",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "mlmCustomerCard",
    "zoneId",
    "zoneForeignId",
    "customerAreaStatus",
    "personalInfo"
})
public class WSCustomerToModify {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String card;
    protected int status;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    @XmlElement(required = true)
    protected String mlmCustomerCard;
    protected long zoneId;
    protected long zoneForeignId;
    @XmlElement(name = "customer_area_status")
    protected int customerAreaStatus;
    @XmlElement(required = true)
    protected WSPersonalInfo personalInfo;

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
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
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
     * Obtiene el valor de la propiedad zoneForeignId.
     * 
     */
    public long getZoneForeignId() {
        return zoneForeignId;
    }

    /**
     * Define el valor de la propiedad zoneForeignId.
     * 
     */
    public void setZoneForeignId(long value) {
        this.zoneForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAreaStatus.
     * 
     */
    public int getCustomerAreaStatus() {
        return customerAreaStatus;
    }

    /**
     * Define el valor de la propiedad customerAreaStatus.
     * 
     */
    public void setCustomerAreaStatus(int value) {
        this.customerAreaStatus = value;
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
