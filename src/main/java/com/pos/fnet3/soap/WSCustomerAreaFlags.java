
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerAreaFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerAreaFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useWeb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAndroid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useiOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useJME" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useBB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerAreaFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useWeb",
    "useAndroid",
    "useiOS",
    "useJME",
    "useBB"
})
public class WSCustomerAreaFlags {

    protected long flags;
    protected boolean useWeb;
    protected boolean useAndroid;
    protected boolean useiOS;
    protected boolean useJME;
    protected boolean useBB;

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
     * Obtiene el valor de la propiedad useWeb.
     * 
     */
    public boolean isUseWeb() {
        return useWeb;
    }

    /**
     * Define el valor de la propiedad useWeb.
     * 
     */
    public void setUseWeb(boolean value) {
        this.useWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad useAndroid.
     * 
     */
    public boolean isUseAndroid() {
        return useAndroid;
    }

    /**
     * Define el valor de la propiedad useAndroid.
     * 
     */
    public void setUseAndroid(boolean value) {
        this.useAndroid = value;
    }

    /**
     * Obtiene el valor de la propiedad useiOS.
     * 
     */
    public boolean isUseiOS() {
        return useiOS;
    }

    /**
     * Define el valor de la propiedad useiOS.
     * 
     */
    public void setUseiOS(boolean value) {
        this.useiOS = value;
    }

    /**
     * Obtiene el valor de la propiedad useJME.
     * 
     */
    public boolean isUseJME() {
        return useJME;
    }

    /**
     * Define el valor de la propiedad useJME.
     * 
     */
    public void setUseJME(boolean value) {
        this.useJME = value;
    }

    /**
     * Obtiene el valor de la propiedad useBB.
     * 
     */
    public boolean isUseBB() {
        return useBB;
    }

    /**
     * Define el valor de la propiedad useBB.
     * 
     */
    public void setUseBB(boolean value) {
        this.useBB = value;
    }

}
