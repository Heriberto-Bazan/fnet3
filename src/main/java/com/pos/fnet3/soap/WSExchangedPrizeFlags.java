
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangedPrizeFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangedPrizeFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="ordered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sentToShop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="availableForRetirement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="retired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="inStock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="returnedForDamage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="notDeliveredCustomerMissing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="inTransit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangedPrizeFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "ordered",
    "sentToShop",
    "availableForRetirement",
    "retired",
    "inStock",
    "confirmed",
    "returnedForDamage",
    "notDeliveredCustomerMissing",
    "inTransit"
})
public class WSExchangedPrizeFlags {

    protected long flags;
    protected boolean ordered;
    protected boolean sentToShop;
    protected boolean availableForRetirement;
    protected boolean retired;
    protected boolean inStock;
    protected boolean confirmed;
    protected boolean returnedForDamage;
    protected boolean notDeliveredCustomerMissing;
    protected boolean inTransit;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad ordered.
     * 
     */
    public boolean isOrdered() {
        return ordered;
    }

    /**
     * Define el valor de la propiedad ordered.
     * 
     */
    public void setOrdered(boolean value) {
        this.ordered = value;
    }

    /**
     * Obtiene el valor de la propiedad sentToShop.
     * 
     */
    public boolean isSentToShop() {
        return sentToShop;
    }

    /**
     * Define el valor de la propiedad sentToShop.
     * 
     */
    public void setSentToShop(boolean value) {
        this.sentToShop = value;
    }

    /**
     * Obtiene el valor de la propiedad availableForRetirement.
     * 
     */
    public boolean isAvailableForRetirement() {
        return availableForRetirement;
    }

    /**
     * Define el valor de la propiedad availableForRetirement.
     * 
     */
    public void setAvailableForRetirement(boolean value) {
        this.availableForRetirement = value;
    }

    /**
     * Obtiene el valor de la propiedad retired.
     * 
     */
    public boolean isRetired() {
        return retired;
    }

    /**
     * Define el valor de la propiedad retired.
     * 
     */
    public void setRetired(boolean value) {
        this.retired = value;
    }

    /**
     * Obtiene el valor de la propiedad inStock.
     * 
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * Define el valor de la propiedad inStock.
     * 
     */
    public void setInStock(boolean value) {
        this.inStock = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmed.
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Define el valor de la propiedad confirmed.
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

    /**
     * Obtiene el valor de la propiedad returnedForDamage.
     * 
     */
    public boolean isReturnedForDamage() {
        return returnedForDamage;
    }

    /**
     * Define el valor de la propiedad returnedForDamage.
     * 
     */
    public void setReturnedForDamage(boolean value) {
        this.returnedForDamage = value;
    }

    /**
     * Obtiene el valor de la propiedad notDeliveredCustomerMissing.
     * 
     */
    public boolean isNotDeliveredCustomerMissing() {
        return notDeliveredCustomerMissing;
    }

    /**
     * Define el valor de la propiedad notDeliveredCustomerMissing.
     * 
     */
    public void setNotDeliveredCustomerMissing(boolean value) {
        this.notDeliveredCustomerMissing = value;
    }

    /**
     * Obtiene el valor de la propiedad inTransit.
     * 
     */
    public boolean isInTransit() {
        return inTransit;
    }

    /**
     * Define el valor de la propiedad inTransit.
     * 
     */
    public void setInTransit(boolean value) {
        this.inTransit = value;
    }

}
