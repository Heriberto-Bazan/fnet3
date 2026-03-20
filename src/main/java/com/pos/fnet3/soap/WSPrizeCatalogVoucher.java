
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeCatalogVoucher complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeCatalogVoucher">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeInfo"/>
 *         <element name="pointsDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCatalogVoucher", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "prize",
    "pointsDiscount",
    "pointsVoucherValue"
})
public class WSPrizeCatalogVoucher {

    protected long id;
    @XmlElement(required = true)
    protected WSPrizeInfo prize;
    protected double pointsDiscount;
    protected double pointsVoucherValue;

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
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeInfo }
     *     
     */
    public WSPrizeInfo getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeInfo }
     *     
     */
    public void setPrize(WSPrizeInfo value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsDiscount.
     * 
     */
    public double getPointsDiscount() {
        return pointsDiscount;
    }

    /**
     * Define el valor de la propiedad pointsDiscount.
     * 
     */
    public void setPointsDiscount(double value) {
        this.pointsDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsVoucherValue.
     * 
     */
    public double getPointsVoucherValue() {
        return pointsVoucherValue;
    }

    /**
     * Define el valor de la propiedad pointsVoucherValue.
     * 
     */
    public void setPointsVoucherValue(double value) {
        this.pointsVoucherValue = value;
    }

}
