
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
 *         <element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cvc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cardAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cardNumber",
    "expirationMonth",
    "expirationYear",
    "cvc",
    "cardName",
    "cardAddressLine1",
    "cardAddressLine2",
    "cardAddressCity",
    "cardAddressState",
    "cardAddressZip",
    "cardAddressCountry"
})
@XmlRootElement(name = "ValidateCardRequest")
public class ValidateCardRequest {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String cardNumber;
    protected long expirationMonth;
    protected long expirationYear;
    @XmlElement(required = true)
    protected String cvc;
    @XmlElement(required = true, nillable = true)
    protected String cardName;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressLine1;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressLine2;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressCity;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressState;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressZip;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressCountry;

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
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationMonth.
     * 
     */
    public long getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Define el valor de la propiedad expirationMonth.
     * 
     */
    public void setExpirationMonth(long value) {
        this.expirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationYear.
     * 
     */
    public long getExpirationYear() {
        return expirationYear;
    }

    /**
     * Define el valor de la propiedad expirationYear.
     * 
     */
    public void setExpirationYear(long value) {
        this.expirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Define el valor de la propiedad cvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvc(String value) {
        this.cvc = value;
    }

    /**
     * Obtiene el valor de la propiedad cardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Define el valor de la propiedad cardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressLine1() {
        return cardAddressLine1;
    }

    /**
     * Define el valor de la propiedad cardAddressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressLine1(String value) {
        this.cardAddressLine1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressLine2() {
        return cardAddressLine2;
    }

    /**
     * Define el valor de la propiedad cardAddressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressLine2(String value) {
        this.cardAddressLine2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressCity() {
        return cardAddressCity;
    }

    /**
     * Define el valor de la propiedad cardAddressCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressCity(String value) {
        this.cardAddressCity = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressState() {
        return cardAddressState;
    }

    /**
     * Define el valor de la propiedad cardAddressState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressState(String value) {
        this.cardAddressState = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressZip() {
        return cardAddressZip;
    }

    /**
     * Define el valor de la propiedad cardAddressZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressZip(String value) {
        this.cardAddressZip = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressCountry() {
        return cardAddressCountry;
    }

    /**
     * Define el valor de la propiedad cardAddressCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressCountry(String value) {
        this.cardAddressCountry = value;
    }

}
