
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_GeneralBillingDataInf complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_GeneralBillingDataInf">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="billingTarget" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="advancePercentPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalMoneyInPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_GeneralBillingDataInf", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "kind",
    "billingTarget",
    "advancePercentPeriod",
    "totalMoneyInPeriod"
})
public class WSGeneralBillingDataInf {

    protected int kind;
    protected double billingTarget;
    protected double advancePercentPeriod;
    protected double totalMoneyInPeriod;

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
     * Obtiene el valor de la propiedad totalMoneyInPeriod.
     * 
     */
    public double getTotalMoneyInPeriod() {
        return totalMoneyInPeriod;
    }

    /**
     * Define el valor de la propiedad totalMoneyInPeriod.
     * 
     */
    public void setTotalMoneyInPeriod(double value) {
        this.totalMoneyInPeriod = value;
    }

}
