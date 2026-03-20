
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_BillingDataByProductCategory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_BillingDataByProductCategory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idProductCategory" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="descriptionProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="billingTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="advancePercentPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="amountProductCategoryInPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BillingDataByProductCategory", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "idProductCategory",
    "descriptionProductCategory",
    "billingTarget",
    "advancePercentPeriod",
    "amountProductCategoryInPeriod"
})
public class WSBillingDataByProductCategory {

    protected long idProductCategory;
    @XmlElement(required = true)
    protected String descriptionProductCategory;
    protected double billingTarget;
    protected double advancePercentPeriod;
    protected double amountProductCategoryInPeriod;

    /**
     * Obtiene el valor de la propiedad idProductCategory.
     * 
     */
    public long getIdProductCategory() {
        return idProductCategory;
    }

    /**
     * Define el valor de la propiedad idProductCategory.
     * 
     */
    public void setIdProductCategory(long value) {
        this.idProductCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionProductCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProductCategory() {
        return descriptionProductCategory;
    }

    /**
     * Define el valor de la propiedad descriptionProductCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProductCategory(String value) {
        this.descriptionProductCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad billingTarget.
     * 
     */
    public double getBillingTarget() {
        return billingTarget;
    }

    /**
     * Define el valor de la propiedad billingTarget.
     * 
     */
    public void setBillingTarget(double value) {
        this.billingTarget = value;
    }

    /**
     * Obtiene el valor de la propiedad advancePercentPeriod.
     * 
     */
    public double getAdvancePercentPeriod() {
        return advancePercentPeriod;
    }

    /**
     * Define el valor de la propiedad advancePercentPeriod.
     * 
     */
    public void setAdvancePercentPeriod(double value) {
        this.advancePercentPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad amountProductCategoryInPeriod.
     * 
     */
    public double getAmountProductCategoryInPeriod() {
        return amountProductCategoryInPeriod;
    }

    /**
     * Define el valor de la propiedad amountProductCategoryInPeriod.
     * 
     */
    public void setAmountProductCategoryInPeriod(double value) {
        this.amountProductCategoryInPeriod = value;
    }

}
