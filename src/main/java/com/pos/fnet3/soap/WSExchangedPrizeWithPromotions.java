
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangedPrizeWithPromotions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangedPrizeWithPromotions">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeFlags"/>
 *         <element name="flagsPrizeCart" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeCartFlags"/>
 *         <element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_Prize"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="discountInPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="discountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "WS_ExchangedPrizeWithPromotions", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "flags",
    "flagsPrizeCart",
    "points",
    "moneyUsed",
    "quantity",
    "prize",
    "name",
    "discountInPercent",
    "discountInMoney",
    "pointsWithDiscount",
    "moneyUsedWithDiscount"
})
public class WSExchangedPrizeWithPromotions {

    protected long id;
    @XmlElement(required = true)
    protected WSExchangedPrizeFlags flags;
    @XmlElement(required = true)
    protected WSExchangedPrizeCartFlags flagsPrizeCart;
    protected double points;
    protected double moneyUsed;
    protected int quantity;
    @XmlElement(required = true)
    protected WSPrize prize;
    @XmlElement(required = true)
    protected String name;
    protected double discountInPercent;
    protected double discountInMoney;
    protected double pointsWithDiscount;
    protected double moneyUsedWithDiscount;

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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public WSExchangedPrizeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public void setFlags(WSExchangedPrizeFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad flagsPrizeCart.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedPrizeCartFlags }
     *     
     */
    public WSExchangedPrizeCartFlags getFlagsPrizeCart() {
        return flagsPrizeCart;
    }

    /**
     * Define el valor de la propiedad flagsPrizeCart.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedPrizeCartFlags }
     *     
     */
    public void setFlagsPrizeCart(WSExchangedPrizeCartFlags value) {
        this.flagsPrizeCart = value;
    }

    /**
     * Obtiene el valor de la propiedad points.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
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
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrize }
     *     
     */
    public WSPrize getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrize }
     *     
     */
    public void setPrize(WSPrize value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad discountInPercent.
     * 
     */
    public double getDiscountInPercent() {
        return discountInPercent;
    }

    /**
     * Define el valor de la propiedad discountInPercent.
     * 
     */
    public void setDiscountInPercent(double value) {
        this.discountInPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad discountInMoney.
     * 
     */
    public double getDiscountInMoney() {
        return discountInMoney;
    }

    /**
     * Define el valor de la propiedad discountInMoney.
     * 
     */
    public void setDiscountInMoney(double value) {
        this.discountInMoney = value;
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
