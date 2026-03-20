
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_NewsImages complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_NewsImages">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="imageHiperLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="imageOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NewsImages", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "image",
    "imageHiperLink",
    "imageOrder"
})
public class WSNewsImages {

    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String imageHiperLink;
    protected long imageOrder;

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad imageHiperLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHiperLink() {
        return imageHiperLink;
    }

    /**
     * Define el valor de la propiedad imageHiperLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHiperLink(String value) {
        this.imageHiperLink = value;
    }

    /**
     * Obtiene el valor de la propiedad imageOrder.
     * 
     */
    public long getImageOrder() {
        return imageOrder;
    }

    /**
     * Define el valor de la propiedad imageOrder.
     * 
     */
    public void setImageOrder(long value) {
        this.imageOrder = value;
    }

}
