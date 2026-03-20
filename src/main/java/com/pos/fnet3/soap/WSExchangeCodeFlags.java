
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangeCodeFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangeCodeFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="retiredAllPrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="foreignShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangeCodeFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "enabled",
    "retiredAllPrizes",
    "foreignShipping"
})
public class WSExchangeCodeFlags {

    protected long flags;
    protected boolean enabled;
    protected boolean retiredAllPrizes;
    protected boolean foreignShipping;

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
     * Obtiene el valor de la propiedad retiredAllPrizes.
     * 
     */
    public boolean isRetiredAllPrizes() {
        return retiredAllPrizes;
    }

    /**
     * Define el valor de la propiedad retiredAllPrizes.
     * 
     */
    public void setRetiredAllPrizes(boolean value) {
        this.retiredAllPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignShipping.
     * 
     */
    public boolean isForeignShipping() {
        return foreignShipping;
    }

    /**
     * Define el valor de la propiedad foreignShipping.
     * 
     */
    public void setForeignShipping(boolean value) {
        this.foreignShipping = value;
    }

}
