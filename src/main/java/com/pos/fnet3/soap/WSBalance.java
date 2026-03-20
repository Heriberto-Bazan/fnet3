
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Balance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Balance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="category" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="cardType" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         <element name="pointsCharged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="creditsCharged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="creditsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="creditsGiftCharged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="creditsGiftUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="rechargesCard" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="usesCard" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="balance_points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balance_credits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balance_gift_credits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="total_money_in_sale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="paid_money_in_sale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsChargedCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pointsUsedCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="creditsUsedCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="creditsGiftUsedCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="expiredPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsToMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsMLMCharged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pointsMLMUsed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="customerInformationToExpired" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInformationToExpire"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Balance", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "category",
    "status",
    "cardType",
    "pointsCharged",
    "pointsUsed",
    "creditsCharged",
    "creditsUsed",
    "creditsGiftCharged",
    "creditsGiftUsed",
    "rechargesCard",
    "usesCard",
    "balancePoints",
    "balanceCredits",
    "balanceGiftCredits",
    "totalMoneyInSale",
    "paidMoneyInSale",
    "pointsChargedCount",
    "pointsUsedCount",
    "creditsUsedCount",
    "creditsGiftUsedCount",
    "expiredPoints",
    "pointsToMoney",
    "pointsMLMCharged",
    "pointsMLMUsed",
    "customerInformationToExpired"
})
public class WSBalance {

    protected long category;
    protected int status;
    protected byte cardType;
    protected double pointsCharged;
    protected double pointsUsed;
    protected double creditsCharged;
    protected double creditsUsed;
    protected double creditsGiftCharged;
    protected double creditsGiftUsed;
    protected long rechargesCard;
    protected long usesCard;
    @XmlElement(name = "balance_points")
    protected double balancePoints;
    @XmlElement(name = "balance_credits")
    protected double balanceCredits;
    @XmlElement(name = "balance_gift_credits")
    protected double balanceGiftCredits;
    @XmlElement(name = "total_money_in_sale")
    protected double totalMoneyInSale;
    @XmlElement(name = "paid_money_in_sale")
    protected double paidMoneyInSale;
    protected long pointsChargedCount;
    protected long pointsUsedCount;
    protected long creditsUsedCount;
    protected long creditsGiftUsedCount;
    protected double expiredPoints;
    protected double pointsToMoney;
    protected double pointsMLMCharged;
    protected double pointsMLMUsed;
    @XmlElement(required = true)
    protected WSCustomerInformationToExpire customerInformationToExpired;

    /**
     * Obtiene el valor de la propiedad category.
     * 
     */
    public long getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     */
    public void setCategory(long value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad cardType.
     * 
     */
    public byte getCardType() {
        return cardType;
    }

    /**
     * Define el valor de la propiedad cardType.
     * 
     */
    public void setCardType(byte value) {
        this.cardType = value;
    }

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
     * Obtiene el valor de la propiedad creditsCharged.
     * 
     */
    public double getCreditsCharged() {
        return creditsCharged;
    }

    /**
     * Define el valor de la propiedad creditsCharged.
     * 
     */
    public void setCreditsCharged(double value) {
        this.creditsCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsUsed.
     * 
     */
    public double getCreditsUsed() {
        return creditsUsed;
    }

    /**
     * Define el valor de la propiedad creditsUsed.
     * 
     */
    public void setCreditsUsed(double value) {
        this.creditsUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsGiftCharged.
     * 
     */
    public double getCreditsGiftCharged() {
        return creditsGiftCharged;
    }

    /**
     * Define el valor de la propiedad creditsGiftCharged.
     * 
     */
    public void setCreditsGiftCharged(double value) {
        this.creditsGiftCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsGiftUsed.
     * 
     */
    public double getCreditsGiftUsed() {
        return creditsGiftUsed;
    }

    /**
     * Define el valor de la propiedad creditsGiftUsed.
     * 
     */
    public void setCreditsGiftUsed(double value) {
        this.creditsGiftUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargesCard.
     * 
     */
    public long getRechargesCard() {
        return rechargesCard;
    }

    /**
     * Define el valor de la propiedad rechargesCard.
     * 
     */
    public void setRechargesCard(long value) {
        this.rechargesCard = value;
    }

    /**
     * Obtiene el valor de la propiedad usesCard.
     * 
     */
    public long getUsesCard() {
        return usesCard;
    }

    /**
     * Define el valor de la propiedad usesCard.
     * 
     */
    public void setUsesCard(long value) {
        this.usesCard = value;
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

    /**
     * Obtiene el valor de la propiedad balanceCredits.
     * 
     */
    public double getBalanceCredits() {
        return balanceCredits;
    }

    /**
     * Define el valor de la propiedad balanceCredits.
     * 
     */
    public void setBalanceCredits(double value) {
        this.balanceCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceGiftCredits.
     * 
     */
    public double getBalanceGiftCredits() {
        return balanceGiftCredits;
    }

    /**
     * Define el valor de la propiedad balanceGiftCredits.
     * 
     */
    public void setBalanceGiftCredits(double value) {
        this.balanceGiftCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoneyInSale.
     * 
     */
    public double getTotalMoneyInSale() {
        return totalMoneyInSale;
    }

    /**
     * Define el valor de la propiedad totalMoneyInSale.
     * 
     */
    public void setTotalMoneyInSale(double value) {
        this.totalMoneyInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad paidMoneyInSale.
     * 
     */
    public double getPaidMoneyInSale() {
        return paidMoneyInSale;
    }

    /**
     * Define el valor de la propiedad paidMoneyInSale.
     * 
     */
    public void setPaidMoneyInSale(double value) {
        this.paidMoneyInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsChargedCount.
     * 
     */
    public long getPointsChargedCount() {
        return pointsChargedCount;
    }

    /**
     * Define el valor de la propiedad pointsChargedCount.
     * 
     */
    public void setPointsChargedCount(long value) {
        this.pointsChargedCount = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsUsedCount.
     * 
     */
    public long getPointsUsedCount() {
        return pointsUsedCount;
    }

    /**
     * Define el valor de la propiedad pointsUsedCount.
     * 
     */
    public void setPointsUsedCount(long value) {
        this.pointsUsedCount = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsUsedCount.
     * 
     */
    public long getCreditsUsedCount() {
        return creditsUsedCount;
    }

    /**
     * Define el valor de la propiedad creditsUsedCount.
     * 
     */
    public void setCreditsUsedCount(long value) {
        this.creditsUsedCount = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsGiftUsedCount.
     * 
     */
    public long getCreditsGiftUsedCount() {
        return creditsGiftUsedCount;
    }

    /**
     * Define el valor de la propiedad creditsGiftUsedCount.
     * 
     */
    public void setCreditsGiftUsedCount(long value) {
        this.creditsGiftUsedCount = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredPoints.
     * 
     */
    public double getExpiredPoints() {
        return expiredPoints;
    }

    /**
     * Define el valor de la propiedad expiredPoints.
     * 
     */
    public void setExpiredPoints(double value) {
        this.expiredPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsToMoney.
     * 
     */
    public double getPointsToMoney() {
        return pointsToMoney;
    }

    /**
     * Define el valor de la propiedad pointsToMoney.
     * 
     */
    public void setPointsToMoney(double value) {
        this.pointsToMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsMLMCharged.
     * 
     */
    public double getPointsMLMCharged() {
        return pointsMLMCharged;
    }

    /**
     * Define el valor de la propiedad pointsMLMCharged.
     * 
     */
    public void setPointsMLMCharged(double value) {
        this.pointsMLMCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsMLMUsed.
     * 
     */
    public double getPointsMLMUsed() {
        return pointsMLMUsed;
    }

    /**
     * Define el valor de la propiedad pointsMLMUsed.
     * 
     */
    public void setPointsMLMUsed(double value) {
        this.pointsMLMUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad customerInformationToExpired.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInformationToExpire }
     *     
     */
    public WSCustomerInformationToExpire getCustomerInformationToExpired() {
        return customerInformationToExpired;
    }

    /**
     * Define el valor de la propiedad customerInformationToExpired.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInformationToExpire }
     *     
     */
    public void setCustomerInformationToExpired(WSCustomerInformationToExpire value) {
        this.customerInformationToExpired = value;
    }

}
