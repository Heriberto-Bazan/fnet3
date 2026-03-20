
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShippingCost complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShippingCost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="shippingTaxes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShippingCost", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "shippingCost",
    "shippingTaxes"
})
public class WSShippingCost {

    protected double shippingCost;
    protected double shippingTaxes;

    /**
     * Obtiene el valor de la propiedad shippingCost.
     * 
     */
    public double getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     */
    public void setShippingCost(double value) {
        this.shippingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingTaxes.
     * 
     */
    public double getShippingTaxes() {
        return shippingTaxes;
    }

    /**
     * Define el valor de la propiedad shippingTaxes.
     * 
     */
    public void setShippingTaxes(double value) {
        this.shippingTaxes = value;
    }

}
