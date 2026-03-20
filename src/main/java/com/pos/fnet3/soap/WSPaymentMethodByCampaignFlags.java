
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PaymentMethodByCampaignFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PaymentMethodByCampaignFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="enable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isCash" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PaymentMethodByCampaignFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "enable",
    "isCash"
})
public class WSPaymentMethodByCampaignFlags {

    protected boolean enable;
    protected boolean isCash;

    /**
     * Obtiene el valor de la propiedad enable.
     * 
     */
    public boolean isEnable() {
        return enable;
    }

    /**
     * Define el valor de la propiedad enable.
     * 
     */
    public void setEnable(boolean value) {
        this.enable = value;
    }

    /**
     * Obtiene el valor de la propiedad isCash.
     * 
     */
    public boolean isIsCash() {
        return isCash;
    }

    /**
     * Define el valor de la propiedad isCash.
     * 
     */
    public void setIsCash(boolean value) {
        this.isCash = value;
    }

}
