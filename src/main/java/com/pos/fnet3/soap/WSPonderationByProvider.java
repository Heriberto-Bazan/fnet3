
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PonderationByProvider complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PonderationByProvider">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeProviderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="epMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="epPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PonderationByProvider", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "categoryId",
    "prizeProviderId",
    "epMoney",
    "epPoints",
    "categoryName"
})
public class WSPonderationByProvider {

    protected long id;
    protected long categoryId;
    protected long prizeProviderId;
    protected double epMoney;
    protected double epPoints;
    @XmlElement(required = true)
    protected String categoryName;

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
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeProviderId.
     * 
     */
    public long getPrizeProviderId() {
        return prizeProviderId;
    }

    /**
     * Define el valor de la propiedad prizeProviderId.
     * 
     */
    public void setPrizeProviderId(long value) {
        this.prizeProviderId = value;
    }

    /**
     * Obtiene el valor de la propiedad epMoney.
     * 
     */
    public double getEpMoney() {
        return epMoney;
    }

    /**
     * Define el valor de la propiedad epMoney.
     * 
     */
    public void setEpMoney(double value) {
        this.epMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad epPoints.
     * 
     */
    public double getEpPoints() {
        return epPoints;
    }

    /**
     * Define el valor de la propiedad epPoints.
     * 
     */
    public void setEpPoints(double value) {
        this.epPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Define el valor de la propiedad categoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

}
