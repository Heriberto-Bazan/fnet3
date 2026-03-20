
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_NetBehaviorFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_NetBehaviorFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="isEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useOperator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="lockedByDailyLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="lockedByTimeslotLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NetBehaviorFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "isEnabled",
    "useOperator",
    "lockedByDailyLimit",
    "lockedByTimeslotLimit"
})
public class WSNetBehaviorFlags {

    protected long flags;
    protected boolean isEnabled;
    protected boolean useOperator;
    protected boolean lockedByDailyLimit;
    protected boolean lockedByTimeslotLimit;

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
     * Obtiene el valor de la propiedad isEnabled.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define el valor de la propiedad isEnabled.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad useOperator.
     * 
     */
    public boolean isUseOperator() {
        return useOperator;
    }

    /**
     * Define el valor de la propiedad useOperator.
     * 
     */
    public void setUseOperator(boolean value) {
        this.useOperator = value;
    }

    /**
     * Obtiene el valor de la propiedad lockedByDailyLimit.
     * 
     */
    public boolean isLockedByDailyLimit() {
        return lockedByDailyLimit;
    }

    /**
     * Define el valor de la propiedad lockedByDailyLimit.
     * 
     */
    public void setLockedByDailyLimit(boolean value) {
        this.lockedByDailyLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad lockedByTimeslotLimit.
     * 
     */
    public boolean isLockedByTimeslotLimit() {
        return lockedByTimeslotLimit;
    }

    /**
     * Define el valor de la propiedad lockedByTimeslotLimit.
     * 
     */
    public void setLockedByTimeslotLimit(boolean value) {
        this.lockedByTimeslotLimit = value;
    }

}
