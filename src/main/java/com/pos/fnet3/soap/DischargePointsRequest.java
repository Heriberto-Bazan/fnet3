
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
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="kindCharge" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="operatorForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="sellerCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sessionID",
    "campaignID",
    "customerID",
    "card",
    "dischargedPoints",
    "kindCharge",
    "operatorForeignId",
    "totalMoney",
    "ticketID",
    "sellerCard",
    "pincode",
    "foreignId",
    "notes"
})
@XmlRootElement(name = "DischargePointsRequest")
public class DischargePointsRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    protected long customerID;
    @XmlElement(required = true)
    protected String card;
    protected double dischargedPoints;
    protected long kindCharge;
    protected long operatorForeignId;
    protected double totalMoney;
    @XmlElement(required = true)
    protected String ticketID;
    @XmlElement(required = true)
    protected String sellerCard;
    @XmlElement(required = true)
    protected String pincode;
    protected long foreignId;
    @XmlElement(required = true)
    protected String notes;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignID.
     * 
     */
    public long getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     */
    public void setCampaignID(long value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(long value) {
        this.customerID = value;
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
     * Obtiene el valor de la propiedad dischargedPoints.
     * 
     */
    public double getDischargedPoints() {
        return dischargedPoints;
    }

    /**
     * Define el valor de la propiedad dischargedPoints.
     * 
     */
    public void setDischargedPoints(double value) {
        this.dischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad kindCharge.
     * 
     */
    public long getKindCharge() {
        return kindCharge;
    }

    /**
     * Define el valor de la propiedad kindCharge.
     * 
     */
    public void setKindCharge(long value) {
        this.kindCharge = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorForeignId.
     * 
     */
    public long getOperatorForeignId() {
        return operatorForeignId;
    }

    /**
     * Define el valor de la propiedad operatorForeignId.
     * 
     */
    public void setOperatorForeignId(long value) {
        this.operatorForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoney.
     * 
     */
    public double getTotalMoney() {
        return totalMoney;
    }

    /**
     * Define el valor de la propiedad totalMoney.
     * 
     */
    public void setTotalMoney(double value) {
        this.totalMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Define el valor de la propiedad ticketID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCard() {
        return sellerCard;
    }

    /**
     * Define el valor de la propiedad sellerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCard(String value) {
        this.sellerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad pincode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Define el valor de la propiedad pincode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
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
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
