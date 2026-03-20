
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OtherImage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OtherImage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImageAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="orderImage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OtherImage", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "pathImage",
    "pathImageAbsolute",
    "orderImage"
})
public class WSOtherImage {

    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(required = true)
    protected String pathImageAbsolute;
    protected int orderImage;

    /**
     * Obtiene el valor de la propiedad pathImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Define el valor de la propiedad pathImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImage(String value) {
        this.pathImage = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImageAbsolute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImageAbsolute() {
        return pathImageAbsolute;
    }

    /**
     * Define el valor de la propiedad pathImageAbsolute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImageAbsolute(String value) {
        this.pathImageAbsolute = value;
    }

    /**
     * Obtiene el valor de la propiedad orderImage.
     * 
     */
    public int getOrderImage() {
        return orderImage;
    }

    /**
     * Define el valor de la propiedad orderImage.
     * 
     */
    public void setOrderImage(int value) {
        this.orderImage = value;
    }

}
