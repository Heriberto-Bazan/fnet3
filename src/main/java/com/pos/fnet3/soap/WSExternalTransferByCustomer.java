
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExternalTransferByCustomer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExternalTransferByCustomer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="movementID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="localTime" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="externalTransferByCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedExternalTransfer"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExternalTransferByCustomer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "movementID",
    "localTime",
    "exchangeCode",
    "externalTransferByCustomer"
})
public class WSExternalTransferByCustomer {

    protected long movementID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localTime;
    protected long exchangeCode;
    @XmlElement(required = true)
    protected WSExchangedExternalTransfer externalTransferByCustomer;

    /**
     * Obtiene el valor de la propiedad movementID.
     * 
     */
    public long getMovementID() {
        return movementID;
    }

    /**
     * Define el valor de la propiedad movementID.
     * 
     */
    public void setMovementID(long value) {
        this.movementID = value;
    }

    /**
     * Obtiene el valor de la propiedad localTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTime() {
        return localTime;
    }

    /**
     * Define el valor de la propiedad localTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTime(XMLGregorianCalendar value) {
        this.localTime = value;
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
     * Obtiene el valor de la propiedad externalTransferByCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedExternalTransfer }
     *     
     */
    public WSExchangedExternalTransfer getExternalTransferByCustomer() {
        return externalTransferByCustomer;
    }

    /**
     * Define el valor de la propiedad externalTransferByCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedExternalTransfer }
     *     
     */
    public void setExternalTransferByCustomer(WSExchangedExternalTransfer value) {
        this.externalTransferByCustomer = value;
    }

}
