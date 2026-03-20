
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_TerminalBehavior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_TerminalBehavior">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="behaviorFlags" type="{http://FidelyNET3_SW_01_89_00}WS_NetBehaviorFlags"/>
 *         <element name="informativeFlags" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalInformativeFlags"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalBehavior", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "terminalId",
    "behaviorFlags",
    "informativeFlags"
})
public class WSTerminalBehavior {

    protected long terminalId;
    @XmlElement(required = true)
    protected WSNetBehaviorFlags behaviorFlags;
    @XmlElement(required = true)
    protected WSTerminalInformativeFlags informativeFlags;

    /**
     * Obtiene el valor de la propiedad terminalId.
     * 
     */
    public long getTerminalId() {
        return terminalId;
    }

    /**
     * Define el valor de la propiedad terminalId.
     * 
     */
    public void setTerminalId(long value) {
        this.terminalId = value;
    }

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public WSNetBehaviorFlags getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public void setBehaviorFlags(WSNetBehaviorFlags value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad informativeFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalInformativeFlags }
     *     
     */
    public WSTerminalInformativeFlags getInformativeFlags() {
        return informativeFlags;
    }

    /**
     * Define el valor de la propiedad informativeFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalInformativeFlags }
     *     
     */
    public void setInformativeFlags(WSTerminalInformativeFlags value) {
        this.informativeFlags = value;
    }

}
