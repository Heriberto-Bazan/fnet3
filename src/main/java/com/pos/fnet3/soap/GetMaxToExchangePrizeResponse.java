
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="maxToExchangeByCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="exchangedAmountByCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dayFrom" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dayTo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dayToReset" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "maxToExchangeByCustomer",
    "exchangedAmountByCustomer",
    "dayFrom",
    "dayTo",
    "dayToReset"
})
@XmlRootElement(name = "GetMaxToExchangePrizeResponse")
public class GetMaxToExchangePrizeResponse {

    protected int answerCode;
    protected long maxToExchangeByCustomer;
    protected long exchangedAmountByCustomer;
    protected long dayFrom;
    protected long dayTo;
    protected long dayToReset;

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
     * Obtiene el valor de la propiedad maxToExchangeByCustomer.
     * 
     */
    public long getMaxToExchangeByCustomer() {
        return maxToExchangeByCustomer;
    }

    /**
     * Define el valor de la propiedad maxToExchangeByCustomer.
     * 
     */
    public void setMaxToExchangeByCustomer(long value) {
        this.maxToExchangeByCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangedAmountByCustomer.
     * 
     */
    public long getExchangedAmountByCustomer() {
        return exchangedAmountByCustomer;
    }

    /**
     * Define el valor de la propiedad exchangedAmountByCustomer.
     * 
     */
    public void setExchangedAmountByCustomer(long value) {
        this.exchangedAmountByCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad dayFrom.
     * 
     */
    public long getDayFrom() {
        return dayFrom;
    }

    /**
     * Define el valor de la propiedad dayFrom.
     * 
     */
    public void setDayFrom(long value) {
        this.dayFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dayTo.
     * 
     */
    public long getDayTo() {
        return dayTo;
    }

    /**
     * Define el valor de la propiedad dayTo.
     * 
     */
    public void setDayTo(long value) {
        this.dayTo = value;
    }

    /**
     * Obtiene el valor de la propiedad dayToReset.
     * 
     */
    public long getDayToReset() {
        return dayToReset;
    }

    /**
     * Define el valor de la propiedad dayToReset.
     * 
     */
    public void setDayToReset(long value) {
        this.dayToReset = value;
    }

}
