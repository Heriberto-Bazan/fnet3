
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_FlagsPromotion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_FlagsPromotion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="canceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="winPromo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="winDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_FlagsPromotion", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "canceled",
    "winPromo",
    "winDiscount"
})
public class WSFlagsPromotion {

    protected long flags;
    protected boolean canceled;
    protected boolean winPromo;
    protected boolean winDiscount;

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
     * Obtiene el valor de la propiedad canceled.
     * 
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Define el valor de la propiedad canceled.
     * 
     */
    public void setCanceled(boolean value) {
        this.canceled = value;
    }

    /**
     * Obtiene el valor de la propiedad winPromo.
     * 
     */
    public boolean isWinPromo() {
        return winPromo;
    }

    /**
     * Define el valor de la propiedad winPromo.
     * 
     */
    public void setWinPromo(boolean value) {
        this.winPromo = value;
    }

    /**
     * Obtiene el valor de la propiedad winDiscount.
     * 
     */
    public boolean isWinDiscount() {
        return winDiscount;
    }

    /**
     * Define el valor de la propiedad winDiscount.
     * 
     */
    public void setWinDiscount(boolean value) {
        this.winDiscount = value;
    }

}
