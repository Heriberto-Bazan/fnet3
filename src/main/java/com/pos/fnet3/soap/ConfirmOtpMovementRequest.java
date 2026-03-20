
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
 *         <element name="otpCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeablePrize" maxOccurs="unbounded"/>
 *         <element name="shopID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shopForeignID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useDataShopForShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "otpCode",
    "customerID",
    "ticketID",
    "prizesList",
    "shopID",
    "shopForeignID",
    "useDataShopForShipping",
    "useFeeFix"
})
@XmlRootElement(name = "ConfirmOtpMovementRequest")
public class ConfirmOtpMovementRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected int otpCode;
    protected long customerID;
    @XmlElement(required = true)
    protected String ticketID;
    @XmlElement(required = true)
    protected List<WSExchangeablePrize> prizesList;
    protected long shopID;
    protected long shopForeignID;
    protected boolean useDataShopForShipping;
    protected boolean useFeeFix;

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
     * Obtiene el valor de la propiedad otpCode.
     * 
     */
    public int getOtpCode() {
        return otpCode;
    }

    /**
     * Define el valor de la propiedad otpCode.
     * 
     */
    public void setOtpCode(int value) {
        this.otpCode = value;
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
     * Gets the value of the prizesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prizesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangeablePrize }
     * 
     * 
     * @return
     *     The value of the prizesList property.
     */
    public List<WSExchangeablePrize> getPrizesList() {
        if (prizesList == null) {
            prizesList = new ArrayList<>();
        }
        return this.prizesList;
    }

    /**
     * Obtiene el valor de la propiedad shopID.
     * 
     */
    public long getShopID() {
        return shopID;
    }

    /**
     * Define el valor de la propiedad shopID.
     * 
     */
    public void setShopID(long value) {
        this.shopID = value;
    }

    /**
     * Obtiene el valor de la propiedad shopForeignID.
     * 
     */
    public long getShopForeignID() {
        return shopForeignID;
    }

    /**
     * Define el valor de la propiedad shopForeignID.
     * 
     */
    public void setShopForeignID(long value) {
        this.shopForeignID = value;
    }

    /**
     * Obtiene el valor de la propiedad useDataShopForShipping.
     * 
     */
    public boolean isUseDataShopForShipping() {
        return useDataShopForShipping;
    }

    /**
     * Define el valor de la propiedad useDataShopForShipping.
     * 
     */
    public void setUseDataShopForShipping(boolean value) {
        this.useDataShopForShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad useFeeFix.
     * 
     */
    public boolean isUseFeeFix() {
        return useFeeFix;
    }

    /**
     * Define el valor de la propiedad useFeeFix.
     * 
     */
    public void setUseFeeFix(boolean value) {
        this.useFeeFix = value;
    }

}
