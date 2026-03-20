
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShoppingCartBalance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShoppingCartBalance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="totalPrizesQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsWithDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsedWithDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShoppingCartBalance", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "totalPrizesQuantity",
    "pointsUsed",
    "moneyUsed",
    "pointsWithDiscount",
    "moneyUsedWithDiscount"
})
public class WSShoppingCartBalance {

    protected long totalPrizesQuantity;
    protected double pointsUsed;
    protected double moneyUsed;
    protected double pointsWithDiscount;
    protected double moneyUsedWithDiscount;

    /**
     * Obtiene el valor de la propiedad totalPrizesQuantity.
     * 
     */
    public long getTotalPrizesQuantity() {
        return totalPrizesQuantity;
    }

    /**
     * Define el valor de la propiedad totalPrizesQuantity.
     * 
     */
    public void setTotalPrizesQuantity(long value) {
        this.totalPrizesQuantity = value;
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
     * Obtiene el valor de la propiedad moneyUsed.
     * 
     */
    public double getMoneyUsed() {
        return moneyUsed;
    }

    /**
     * Define el valor de la propiedad moneyUsed.
     * 
     */
    public void setMoneyUsed(double value) {
        this.moneyUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsWithDiscount.
     * 
     */
    public double getPointsWithDiscount() {
        return pointsWithDiscount;
    }

    /**
     * Define el valor de la propiedad pointsWithDiscount.
     * 
     */
    public void setPointsWithDiscount(double value) {
        this.pointsWithDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUsedWithDiscount.
     * 
     */
    public double getMoneyUsedWithDiscount() {
        return moneyUsedWithDiscount;
    }

    /**
     * Define el valor de la propiedad moneyUsedWithDiscount.
     * 
     */
    public void setMoneyUsedWithDiscount(double value) {
        this.moneyUsedWithDiscount = value;
    }

}
