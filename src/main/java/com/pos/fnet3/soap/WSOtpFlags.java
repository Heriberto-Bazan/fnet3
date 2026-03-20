
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OtpFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OtpFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="used" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="notUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OtpFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "used",
    "notUsed"
})
public class WSOtpFlags {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long flags;
    protected boolean used;
    protected boolean notUsed;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlags(Long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad used.
     * 
     */
    public boolean isUsed() {
        return used;
    }

    /**
     * Define el valor de la propiedad used.
     * 
     */
    public void setUsed(boolean value) {
        this.used = value;
    }

    /**
     * Obtiene el valor de la propiedad notUsed.
     * 
     */
    public boolean isNotUsed() {
        return notUsed;
    }

    /**
     * Define el valor de la propiedad notUsed.
     * 
     */
    public void setNotUsed(boolean value) {
        this.notUsed = value;
    }

}
