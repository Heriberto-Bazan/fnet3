
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="prizeID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *         <element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "prizeID",
    "exchangeCode",
    "notes"
})
@XmlRootElement(name = "DeliverPrizesRequest")
public class DeliverPrizesRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    protected long customerID;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(type = Long.class)
    protected List<Long> prizeID;
    @XmlElement(required = true)
    protected String exchangeCode;
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
     * Gets the value of the prizeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prizeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     * @return
     *     The value of the prizeID property.
     */
    public List<Long> getPrizeID() {
        if (prizeID == null) {
            prizeID = new ArrayList<>();
        }
        return this.prizeID;
    }

    /**
     * Obtiene el valor de la propiedad exchangeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Define el valor de la propiedad exchangeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeCode(String value) {
        this.exchangeCode = value;
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
