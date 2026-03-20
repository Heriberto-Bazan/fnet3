
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeCategory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeCategory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="idFather" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="order" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="imageFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCategoryFlags"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCategory", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "description",
    "idFather",
    "order",
    "imageFile",
    "flags"
})
public class WSPrizeCategory {

    protected long id;
    @XmlElement(required = true)
    protected String description;
    protected long idFather;
    protected long order;
    @XmlElement(required = true)
    protected String imageFile;
    @XmlElement(required = true)
    protected WSPrizeCategoryFlags flags;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad idFather.
     * 
     */
    public long getIdFather() {
        return idFather;
    }

    /**
     * Define el valor de la propiedad idFather.
     * 
     */
    public void setIdFather(long value) {
        this.idFather = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public long getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(long value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad imageFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFile() {
        return imageFile;
    }

    /**
     * Define el valor de la propiedad imageFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFile(String value) {
        this.imageFile = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeCategoryFlags }
     *     
     */
    public WSPrizeCategoryFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeCategoryFlags }
     *     
     */
    public void setFlags(WSPrizeCategoryFlags value) {
        this.flags = value;
    }

}
