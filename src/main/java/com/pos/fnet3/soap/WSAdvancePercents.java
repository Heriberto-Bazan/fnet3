
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_AdvancePercents complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_AdvancePercents">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="calculation_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="advancePercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="billingDataByProduct" type="{http://FidelyNET3_SW_01_89_00}WS_BillingDataByProduct" maxOccurs="unbounded"/>
 *         <element name="billingDataByProductCategory" type="{http://FidelyNET3_SW_01_89_00}WS_BillingDataByProductCategory" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_AdvancePercents", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "kind",
    "calculationType",
    "advancePercent",
    "billingDataByProduct",
    "billingDataByProductCategory"
})
public class WSAdvancePercents {

    protected int kind;
    @XmlElement(name = "calculation_type")
    protected int calculationType;
    protected double advancePercent;
    @XmlElement(required = true)
    protected List<WSBillingDataByProduct> billingDataByProduct;
    @XmlElement(required = true)
    protected List<WSBillingDataByProductCategory> billingDataByProductCategory;

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     */
    public int getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     */
    public void setKind(int value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad calculationType.
     * 
     */
    public int getCalculationType() {
        return calculationType;
    }

    /**
     * Define el valor de la propiedad calculationType.
     * 
     */
    public void setCalculationType(int value) {
        this.calculationType = value;
    }

    /**
     * Obtiene el valor de la propiedad advancePercent.
     * 
     */
    public double getAdvancePercent() {
        return advancePercent;
    }

    /**
     * Define el valor de la propiedad advancePercent.
     * 
     */
    public void setAdvancePercent(double value) {
        this.advancePercent = value;
    }

    /**
     * Gets the value of the billingDataByProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingDataByProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDataByProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSBillingDataByProduct }
     * 
     * 
     * @return
     *     The value of the billingDataByProduct property.
     */
    public List<WSBillingDataByProduct> getBillingDataByProduct() {
        if (billingDataByProduct == null) {
            billingDataByProduct = new ArrayList<>();
        }
        return this.billingDataByProduct;
    }

    /**
     * Gets the value of the billingDataByProductCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingDataByProductCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDataByProductCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSBillingDataByProductCategory }
     * 
     * 
     * @return
     *     The value of the billingDataByProductCategory property.
     */
    public List<WSBillingDataByProductCategory> getBillingDataByProductCategory() {
        if (billingDataByProductCategory == null) {
            billingDataByProductCategory = new ArrayList<>();
        }
        return this.billingDataByProductCategory;
    }

}
