
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PromotionNotWinner complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PromotionNotWinner">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="promotionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="budget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="budgetUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="budgetUsedPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="promotionPrizes" type="{http://FidelyNET3_SW_01_89_00}WS_PromotionPrize" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PromotionNotWinner", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "promotionID",
    "description",
    "shortDescription",
    "longDescription",
    "budget",
    "budgetUsed",
    "budgetUsedPercent",
    "promotionPrizes"
})
public class WSPromotionNotWinner {

    protected long promotionID;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String longDescription;
    protected double budget;
    protected double budgetUsed;
    protected double budgetUsedPercent;
    @XmlElement(required = true)
    protected List<WSPromotionPrize> promotionPrizes;

    /**
     * Obtiene el valor de la propiedad promotionID.
     * 
     */
    public long getPromotionID() {
        return promotionID;
    }

    /**
     * Define el valor de la propiedad promotionID.
     * 
     */
    public void setPromotionID(long value) {
        this.promotionID = value;
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
     * Obtiene el valor de la propiedad shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define el valor de la propiedad shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
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
     * Obtiene el valor de la propiedad budget.
     * 
     */
    public double getBudget() {
        return budget;
    }

    /**
     * Define el valor de la propiedad budget.
     * 
     */
    public void setBudget(double value) {
        this.budget = value;
    }

    /**
     * Obtiene el valor de la propiedad budgetUsed.
     * 
     */
    public double getBudgetUsed() {
        return budgetUsed;
    }

    /**
     * Define el valor de la propiedad budgetUsed.
     * 
     */
    public void setBudgetUsed(double value) {
        this.budgetUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad budgetUsedPercent.
     * 
     */
    public double getBudgetUsedPercent() {
        return budgetUsedPercent;
    }

    /**
     * Define el valor de la propiedad budgetUsedPercent.
     * 
     */
    public void setBudgetUsedPercent(double value) {
        this.budgetUsedPercent = value;
    }

    /**
     * Gets the value of the promotionPrizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promotionPrizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionPrizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotionPrize }
     * 
     * 
     * @return
     *     The value of the promotionPrizes property.
     */
    public List<WSPromotionPrize> getPromotionPrizes() {
        if (promotionPrizes == null) {
            promotionPrizes = new ArrayList<>();
        }
        return this.promotionPrizes;
    }

}
