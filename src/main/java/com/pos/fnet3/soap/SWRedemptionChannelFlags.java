
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SW_RedemptionChannelFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="SW_RedemptionChannelFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mixedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="onlyMoneyToPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="outstandingPrize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="seasonal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_RedemptionChannelFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "enabled",
    "mixedPayment",
    "onlyMoneyToPay",
    "outstandingPrize",
    "seasonal"
})
public class SWRedemptionChannelFlags {

    protected boolean enabled;
    protected boolean mixedPayment;
    protected boolean onlyMoneyToPay;
    protected boolean outstandingPrize;
    protected boolean seasonal;

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad mixedPayment.
     * 
     */
    public boolean isMixedPayment() {
        return mixedPayment;
    }

    /**
     * Define el valor de la propiedad mixedPayment.
     * 
     */
    public void setMixedPayment(boolean value) {
        this.mixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public boolean isOnlyMoneyToPay() {
        return onlyMoneyToPay;
    }

    /**
     * Define el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public void setOnlyMoneyToPay(boolean value) {
        this.onlyMoneyToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingPrize.
     * 
     */
    public boolean isOutstandingPrize() {
        return outstandingPrize;
    }

    /**
     * Define el valor de la propiedad outstandingPrize.
     * 
     */
    public void setOutstandingPrize(boolean value) {
        this.outstandingPrize = value;
    }

    /**
     * Obtiene el valor de la propiedad seasonal.
     * 
     */
    public boolean isSeasonal() {
        return seasonal;
    }

    /**
     * Define el valor de la propiedad seasonal.
     * 
     */
    public void setSeasonal(boolean value) {
        this.seasonal = value;
    }

}
