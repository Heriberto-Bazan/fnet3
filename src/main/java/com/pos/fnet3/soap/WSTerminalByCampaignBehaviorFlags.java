
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_TerminalByCampaignBehaviorFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_TerminalByCampaignBehaviorFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="behaviorFlags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="hasToUpdateCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalByCampaignBehaviorFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "behaviorFlags",
    "hasToUpdateCampaign"
})
public class WSTerminalByCampaignBehaviorFlags {

    protected long behaviorFlags;
    protected boolean hasToUpdateCampaign;

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     */
    public long getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     */
    public void setBehaviorFlags(long value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateCampaign.
     * 
     */
    public boolean isHasToUpdateCampaign() {
        return hasToUpdateCampaign;
    }

    /**
     * Define el valor de la propiedad hasToUpdateCampaign.
     * 
     */
    public void setHasToUpdateCampaign(boolean value) {
        this.hasToUpdateCampaign = value;
    }

}
