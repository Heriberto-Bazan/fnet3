
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Badge complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Badge">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="onIcon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="onOff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_Badge_Flags"/>
 *         <element name="categoryBadge" type="{http://FidelyNET3_SW_01_89_00}WS_CategoryBadge"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Badge", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "name",
    "description",
    "longDescription",
    "onIcon",
    "onOff",
    "image",
    "points",
    "pointsStatus",
    "flags",
    "categoryBadge"
})
public class WSBadge {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String longDescription;
    @XmlElement(required = true)
    protected String onIcon;
    @XmlElement(required = true)
    protected String onOff;
    @XmlElement(required = true)
    protected String image;
    protected double points;
    protected double pointsStatus;
    @XmlElement(required = true)
    protected WSBadgeFlags flags;
    @XmlElement(required = true)
    protected WSCategoryBadge categoryBadge;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setID(long value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad longDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Define el valor de la propiedad longDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad onIcon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnIcon() {
        return onIcon;
    }

    /**
     * Define el valor de la propiedad onIcon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnIcon(String value) {
        this.onIcon = value;
    }

    /**
     * Obtiene el valor de la propiedad onOff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnOff() {
        return onOff;
    }

    /**
     * Define el valor de la propiedad onOff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnOff(String value) {
        this.onOff = value;
    }

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
     * Obtiene el valor de la propiedad pointsStatus.
     * 
     */
    public double getPointsStatus() {
        return pointsStatus;
    }

    /**
     * Define el valor de la propiedad pointsStatus.
     * 
     */
    public void setPointsStatus(double value) {
        this.pointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSBadgeFlags }
     *     
     */
    public WSBadgeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBadgeFlags }
     *     
     */
    public void setFlags(WSBadgeFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryBadge.
     * 
     * @return
     *     possible object is
     *     {@link WSCategoryBadge }
     *     
     */
    public WSCategoryBadge getCategoryBadge() {
        return categoryBadge;
    }

    /**
     * Define el valor de la propiedad categoryBadge.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCategoryBadge }
     *     
     */
    public void setCategoryBadge(WSCategoryBadge value) {
        this.categoryBadge = value;
    }

}
