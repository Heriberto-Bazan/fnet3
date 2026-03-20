
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_LittlePrize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_LittlePrize">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pathImageAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_LittlePrize", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "code",
    "catalogId",
    "name",
    "description",
    "pathImage",
    "pathImageAbsolute",
    "points",
    "moneyValue"
})
public class WSLittlePrize {

    protected long id;
    @XmlElement(required = true)
    protected String code;
    protected long catalogId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(required = true)
    protected String pathImageAbsolute;
    protected double points;
    protected double moneyValue;

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
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Obtiene el valor de la propiedad points.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyValue.
     * 
     */
    public double getMoneyValue() {
        return moneyValue;
    }

    /**
     * Define el valor de la propiedad moneyValue.
     * 
     */
    public void setMoneyValue(double value) {
        this.moneyValue = value;
    }

}
