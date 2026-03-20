
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DynamicFieldFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DynamicFieldFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="isEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isVisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="chargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showingTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showingCustomerArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DynamicFieldFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "isEnabled",
    "isVisible",
    "isMandatory",
    "chargePoints",
    "showingTerminal",
    "showingCustomerArea",
    "readOnly"
})
public class WSDynamicFieldFlags {

    protected long flags;
    protected boolean isEnabled;
    protected boolean isVisible;
    protected boolean isMandatory;
    protected boolean chargePoints;
    protected boolean showingTerminal;
    protected boolean showingCustomerArea;
    protected boolean readOnly;

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
     * Obtiene el valor de la propiedad isVisible.
     * 
     */
    public boolean isIsVisible() {
        return isVisible;
    }

    /**
     * Define el valor de la propiedad isVisible.
     * 
     */
    public void setIsVisible(boolean value) {
        this.isVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatory.
     * 
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Define el valor de la propiedad isMandatory.
     * 
     */
    public void setIsMandatory(boolean value) {
        this.isMandatory = value;
    }

    /**
     * Obtiene el valor de la propiedad chargePoints.
     * 
     */
    public boolean isChargePoints() {
        return chargePoints;
    }

    /**
     * Define el valor de la propiedad chargePoints.
     * 
     */
    public void setChargePoints(boolean value) {
        this.chargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad showingTerminal.
     * 
     */
    public boolean isShowingTerminal() {
        return showingTerminal;
    }

    /**
     * Define el valor de la propiedad showingTerminal.
     * 
     */
    public void setShowingTerminal(boolean value) {
        this.showingTerminal = value;
    }

    /**
     * Obtiene el valor de la propiedad showingCustomerArea.
     * 
     */
    public boolean isShowingCustomerArea() {
        return showingCustomerArea;
    }

    /**
     * Define el valor de la propiedad showingCustomerArea.
     * 
     */
    public void setShowingCustomerArea(boolean value) {
        this.showingCustomerArea = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnly.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Define el valor de la propiedad readOnly.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

}
