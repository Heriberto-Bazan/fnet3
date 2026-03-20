
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_TerminalByCampaignLogoFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_TerminalByCampaignLogoFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="logoFlags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="hasToUpdateTicketLogoCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="errorInUpdateTicketLogoCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalByCampaignLogoFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "logoFlags",
    "hasToUpdateTicketLogoCampaign",
    "errorInUpdateTicketLogoCampaign"
})
public class WSTerminalByCampaignLogoFlags {

    protected long logoFlags;
    protected boolean hasToUpdateTicketLogoCampaign;
    protected boolean errorInUpdateTicketLogoCampaign;

    /**
     * Obtiene el valor de la propiedad logoFlags.
     * 
     */
    public long getLogoFlags() {
        return logoFlags;
    }

    /**
     * Define el valor de la propiedad logoFlags.
     * 
     */
    public void setLogoFlags(long value) {
        this.logoFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateTicketLogoCampaign.
     * 
     */
    public boolean isHasToUpdateTicketLogoCampaign() {
        return hasToUpdateTicketLogoCampaign;
    }

    /**
     * Define el valor de la propiedad hasToUpdateTicketLogoCampaign.
     * 
     */
    public void setHasToUpdateTicketLogoCampaign(boolean value) {
        this.hasToUpdateTicketLogoCampaign = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateTicketLogoCampaign.
     * 
     */
    public boolean isErrorInUpdateTicketLogoCampaign() {
        return errorInUpdateTicketLogoCampaign;
    }

    /**
     * Define el valor de la propiedad errorInUpdateTicketLogoCampaign.
     * 
     */
    public void setErrorInUpdateTicketLogoCampaign(boolean value) {
        this.errorInUpdateTicketLogoCampaign = value;
    }

}
