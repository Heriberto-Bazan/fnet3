
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="licence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="versionSW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "licence",
    "versionSW"
})
@XmlRootElement(name = "SynchroRequest")
public class SynchroRequest {

    @XmlElement(required = true)
    protected String licence;
    @XmlElement(required = true)
    protected String versionSW;

    /**
     * Obtiene el valor de la propiedad licence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicence() {
        return licence;
    }

    /**
     * Define el valor de la propiedad licence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicence(String value) {
        this.licence = value;
    }

    /**
     * Obtiene el valor de la propiedad versionSW.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionSW() {
        return versionSW;
    }

    /**
     * Define el valor de la propiedad versionSW.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionSW(String value) {
        this.versionSW = value;
    }

}
