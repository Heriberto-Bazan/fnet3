
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SW_GeneralBillingData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="SW_GeneralBillingData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="totalBilling" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalChargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalProductsAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="advancePercents" type="{http://FidelyNET3_SW_01_89_00}WS_AdvancePercents" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_GeneralBillingData", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "totalBilling",
    "totalChargedPoints",
    "totalProductsAmount",
    "advancePercents"
})
public class SWGeneralBillingData {

    protected double totalBilling;
    protected double totalChargedPoints;
    protected double totalProductsAmount;
    @XmlElement(required = true)
    protected List<WSAdvancePercents> advancePercents;

    /**
     * Obtiene el valor de la propiedad totalBilling.
     * 
     */
    public double getTotalBilling() {
        return totalBilling;
    }

    /**
     * Define el valor de la propiedad totalBilling.
     * 
     */
    public void setTotalBilling(double value) {
        this.totalBilling = value;
    }

    /**
     * Obtiene el valor de la propiedad totalChargedPoints.
     * 
     */
    public double getTotalChargedPoints() {
        return totalChargedPoints;
    }

    /**
     * Define el valor de la propiedad totalChargedPoints.
     * 
     */
    public void setTotalChargedPoints(double value) {
        this.totalChargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalProductsAmount.
     * 
     */
    public double getTotalProductsAmount() {
        return totalProductsAmount;
    }

    /**
     * Define el valor de la propiedad totalProductsAmount.
     * 
     */
    public void setTotalProductsAmount(double value) {
        this.totalProductsAmount = value;
    }

    /**
     * Gets the value of the advancePercents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the advancePercents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancePercents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSAdvancePercents }
     * 
     * 
     * @return
     *     The value of the advancePercents property.
     */
    public List<WSAdvancePercents> getAdvancePercents() {
        if (advancePercents == null) {
            advancePercents = new ArrayList<>();
        }
        return this.advancePercents;
    }

}
