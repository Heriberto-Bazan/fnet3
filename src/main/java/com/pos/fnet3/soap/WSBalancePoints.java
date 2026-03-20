
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_BalancePoints complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_BalancePoints">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pointsCharged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balance_points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BalancePoints", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "pointsCharged",
    "pointsUsed",
    "balancePoints"
})
public class WSBalancePoints {

    protected double pointsCharged;
    protected double pointsUsed;
    @XmlElement(name = "balance_points")
    protected double balancePoints;

    /**
     * Obtiene el valor de la propiedad pointsCharged.
     * 
     */
    public double getPointsCharged() {
        return pointsCharged;
    }

    /**
     * Define el valor de la propiedad pointsCharged.
     * 
     */
    public void setPointsCharged(double value) {
        this.pointsCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsUsed.
     * 
     */
    public double getPointsUsed() {
        return pointsUsed;
    }

    /**
     * Define el valor de la propiedad pointsUsed.
     * 
     */
    public void setPointsUsed(double value) {
        this.pointsUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad balancePoints.
     * 
     */
    public double getBalancePoints() {
        return balancePoints;
    }

    /**
     * Define el valor de la propiedad balancePoints.
     * 
     */
    public void setBalancePoints(double value) {
        this.balancePoints = value;
    }

}
