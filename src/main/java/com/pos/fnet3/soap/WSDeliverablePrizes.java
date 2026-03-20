
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DeliverablePrizes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DeliverablePrizes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalPointsPrizes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalAmountPrizes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="exchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrize" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DeliverablePrizes", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "customerID",
    "exchangeCode",
    "totalPointsPrizes",
    "totalAmountPrizes",
    "exchangeDate",
    "prizesList"
})
public class WSDeliverablePrizes {

    protected long customerID;
    @XmlElement(required = true)
    protected String exchangeCode;
    protected double totalPointsPrizes;
    protected int totalAmountPrizes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(required = true)
    protected List<WSExchangedPrize> prizesList;

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
     * Obtiene el valor de la propiedad totalPointsPrizes.
     * 
     */
    public double getTotalPointsPrizes() {
        return totalPointsPrizes;
    }

    /**
     * Define el valor de la propiedad totalPointsPrizes.
     * 
     */
    public void setTotalPointsPrizes(double value) {
        this.totalPointsPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmountPrizes.
     * 
     */
    public int getTotalAmountPrizes() {
        return totalAmountPrizes;
    }

    /**
     * Define el valor de la propiedad totalAmountPrizes.
     * 
     */
    public void setTotalAmountPrizes(int value) {
        this.totalAmountPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Define el valor de la propiedad exchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
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
     * {@link WSExchangedPrize }
     * 
     * 
     * @return
     *     The value of the prizesList property.
     */
    public List<WSExchangedPrize> getPrizesList() {
        if (prizesList == null) {
            prizesList = new ArrayList<>();
        }
        return this.prizesList;
    }

}
