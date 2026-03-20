
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
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customer" type="{http://FidelyNET3_SW_01_89_00}WS_Customer"/>
 *         <element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeablePrize" maxOccurs="unbounded"/>
 *         <element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/>
 *         <element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "customer",
    "prizesList",
    "shippingInformation",
    "ticketID",
    "shippingShop"
})
@XmlRootElement(name = "GetExchangePrizesByOtpResponse")
public class GetExchangePrizesByOtpResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSCustomer customer;
    @XmlElement(required = true)
    protected List<WSExchangeablePrize> prizesList;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    @XmlElement(required = true)
    protected String ticketID;
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
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomer }
     *     
     */
    public WSCustomer getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomer }
     *     
     */
    public void setCustomer(WSCustomer value) {
        this.customer = value;
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
