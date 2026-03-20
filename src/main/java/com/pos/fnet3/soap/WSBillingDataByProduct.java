
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_BillingDataByProduct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_BillingDataByProduct">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="billingTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="advancePercentPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="amountProductInPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="ProductTarget" type="{http://FidelyNET3_SW_01_89_00}WS_ProductTarget" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BillingDataByProduct", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "sku",
    "billingTarget",
    "advancePercentPeriod",
    "amountProductInPeriod",
    "productTarget"
})
public class WSBillingDataByProduct {

    @XmlElement(required = true)
    protected String sku;
    protected double billingTarget;
    protected double advancePercentPeriod;
    protected double amountProductInPeriod;
    @XmlElement(name = "ProductTarget", required = true)
    protected List<WSProductTarget> productTarget;

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
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
     * Obtiene el valor de la propiedad amountProductInPeriod.
     * 
     */
    public double getAmountProductInPeriod() {
        return amountProductInPeriod;
    }

    /**
     * Define el valor de la propiedad amountProductInPeriod.
     * 
     */
    public void setAmountProductInPeriod(double value) {
        this.amountProductInPeriod = value;
    }

    /**
     * Gets the value of the productTarget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productTarget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProductTarget }
     * 
     * 
     * @return
     *     The value of the productTarget property.
     */
    public List<WSProductTarget> getProductTarget() {
        if (productTarget == null) {
            productTarget = new ArrayList<>();
        }
        return this.productTarget;
    }

}
