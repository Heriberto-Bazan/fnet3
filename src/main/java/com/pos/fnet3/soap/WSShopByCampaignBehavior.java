
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShopByCampaignBehavior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShopByCampaignBehavior">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="chargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="chargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="chargedCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="chargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="cardsCharged" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cardsEmitted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="limitChargeCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="limitChargeCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="limitChargePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="limitDischargeCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="limitDischargeCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="limitDischargePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="rights_shop" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalRights"/>
 *         <element name="behavior_flags" type="{http://FidelyNET3_SW_01_89_00}WS_BehaviorFlags"/>
 *         <element name="behavior_flags2" type="{http://FidelyNET3_SW_01_89_00}WS_BehaviorFlags2"/>
 *         <element name="operative_flags" type="{http://FidelyNET3_SW_01_89_00}WS_OperativeShopFlags"/>
 *         <element name="operative_flags2" type="{http://FidelyNET3_SW_01_89_00}WS_OperativeShopFlags2"/>
 *         <element name="operative_flags3" type="{http://FidelyNET3_SW_01_89_00}WS_OperativeShopFlags3"/>
 *         <element name="balancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balanceCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balancePointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balanceCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balanceCards" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="balanceCardsGift" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="cardsGiftCharged" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cardsGiftEmitted" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="qualificationAvg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShopByCampaignBehavior", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "campaignId",
    "shopId",
    "chargedPoints",
    "dischargedPoints",
    "chargedCredits",
    "dischargedCredits",
    "chargedCreditsGift",
    "dischargedCreditsGift",
    "chargedPointsStatus",
    "dischargedPointsStatus",
    "cardsCharged",
    "cardsEmitted",
    "limitChargeCredits",
    "limitChargeCreditsGift",
    "limitChargePoints",
    "limitDischargeCredits",
    "limitDischargeCreditsGift",
    "limitDischargePoints",
    "rightsShop",
    "behaviorFlags",
    "behaviorFlags2",
    "operativeFlags",
    "operativeFlags2",
    "operativeFlags3",
    "balancePoints",
    "balanceCredits",
    "balancePointsStatus",
    "balanceCreditsGift",
    "balanceCards",
    "balanceCardsGift",
    "cardsGiftCharged",
    "cardsGiftEmitted",
    "qualificationAvg"
})
public class WSShopByCampaignBehavior {

    protected long campaignId;
    protected long shopId;
    protected double chargedPoints;
    protected double dischargedPoints;
    protected double chargedCredits;
    protected double dischargedCredits;
    protected double chargedCreditsGift;
    protected double dischargedCreditsGift;
    protected double chargedPointsStatus;
    protected double dischargedPointsStatus;
    protected long cardsCharged;
    protected long cardsEmitted;
    protected double limitChargeCredits;
    protected double limitChargeCreditsGift;
    protected double limitChargePoints;
    protected double limitDischargeCredits;
    protected double limitDischargeCreditsGift;
    protected double limitDischargePoints;
    @XmlElement(name = "rights_shop", required = true)
    protected WSTerminalRights rightsShop;
    @XmlElement(name = "behavior_flags", required = true)
    protected WSBehaviorFlags behaviorFlags;
    @XmlElement(name = "behavior_flags2", required = true)
    protected WSBehaviorFlags2 behaviorFlags2;
    @XmlElement(name = "operative_flags", required = true)
    protected WSOperativeShopFlags operativeFlags;
    @XmlElement(name = "operative_flags2", required = true)
    protected WSOperativeShopFlags2 operativeFlags2;
    @XmlElement(name = "operative_flags3", required = true)
    protected WSOperativeShopFlags3 operativeFlags3;
    protected double balancePoints;
    protected double balanceCredits;
    protected double balancePointsStatus;
    protected double balanceCreditsGift;
    protected int balanceCards;
    protected int balanceCardsGift;
    protected long cardsGiftCharged;
    protected long cardsGiftEmitted;
    protected double qualificationAvg;

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

    /**
     * Obtiene el valor de la propiedad shopId.
     * 
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Define el valor de la propiedad shopId.
     * 
     */
    public void setShopId(long value) {
        this.shopId = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedPoints.
     * 
     */
    public double getChargedPoints() {
        return chargedPoints;
    }

    /**
     * Define el valor de la propiedad chargedPoints.
     * 
     */
    public void setChargedPoints(double value) {
        this.chargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPoints.
     * 
     */
    public double getDischargedPoints() {
        return dischargedPoints;
    }

    /**
     * Define el valor de la propiedad dischargedPoints.
     * 
     */
    public void setDischargedPoints(double value) {
        this.dischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedCredits.
     * 
     */
    public double getChargedCredits() {
        return chargedCredits;
    }

    /**
     * Define el valor de la propiedad chargedCredits.
     * 
     */
    public void setChargedCredits(double value) {
        this.chargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedCredits.
     * 
     */
    public double getDischargedCredits() {
        return dischargedCredits;
    }

    /**
     * Define el valor de la propiedad dischargedCredits.
     * 
     */
    public void setDischargedCredits(double value) {
        this.dischargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedCreditsGift.
     * 
     */
    public double getChargedCreditsGift() {
        return chargedCreditsGift;
    }

    /**
     * Define el valor de la propiedad chargedCreditsGift.
     * 
     */
    public void setChargedCreditsGift(double value) {
        this.chargedCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedCreditsGift.
     * 
     */
    public double getDischargedCreditsGift() {
        return dischargedCreditsGift;
    }

    /**
     * Define el valor de la propiedad dischargedCreditsGift.
     * 
     */
    public void setDischargedCreditsGift(double value) {
        this.dischargedCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedPointsStatus.
     * 
     */
    public double getChargedPointsStatus() {
        return chargedPointsStatus;
    }

    /**
     * Define el valor de la propiedad chargedPointsStatus.
     * 
     */
    public void setChargedPointsStatus(double value) {
        this.chargedPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPointsStatus.
     * 
     */
    public double getDischargedPointsStatus() {
        return dischargedPointsStatus;
    }

    /**
     * Define el valor de la propiedad dischargedPointsStatus.
     * 
     */
    public void setDischargedPointsStatus(double value) {
        this.dischargedPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsCharged.
     * 
     */
    public long getCardsCharged() {
        return cardsCharged;
    }

    /**
     * Define el valor de la propiedad cardsCharged.
     * 
     */
    public void setCardsCharged(long value) {
        this.cardsCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsEmitted.
     * 
     */
    public long getCardsEmitted() {
        return cardsEmitted;
    }

    /**
     * Define el valor de la propiedad cardsEmitted.
     * 
     */
    public void setCardsEmitted(long value) {
        this.cardsEmitted = value;
    }

    /**
     * Obtiene el valor de la propiedad limitChargeCredits.
     * 
     */
    public double getLimitChargeCredits() {
        return limitChargeCredits;
    }

    /**
     * Define el valor de la propiedad limitChargeCredits.
     * 
     */
    public void setLimitChargeCredits(double value) {
        this.limitChargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad limitChargeCreditsGift.
     * 
     */
    public double getLimitChargeCreditsGift() {
        return limitChargeCreditsGift;
    }

    /**
     * Define el valor de la propiedad limitChargeCreditsGift.
     * 
     */
    public void setLimitChargeCreditsGift(double value) {
        this.limitChargeCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad limitChargePoints.
     * 
     */
    public double getLimitChargePoints() {
        return limitChargePoints;
    }

    /**
     * Define el valor de la propiedad limitChargePoints.
     * 
     */
    public void setLimitChargePoints(double value) {
        this.limitChargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad limitDischargeCredits.
     * 
     */
    public double getLimitDischargeCredits() {
        return limitDischargeCredits;
    }

    /**
     * Define el valor de la propiedad limitDischargeCredits.
     * 
     */
    public void setLimitDischargeCredits(double value) {
        this.limitDischargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad limitDischargeCreditsGift.
     * 
     */
    public double getLimitDischargeCreditsGift() {
        return limitDischargeCreditsGift;
    }

    /**
     * Define el valor de la propiedad limitDischargeCreditsGift.
     * 
     */
    public void setLimitDischargeCreditsGift(double value) {
        this.limitDischargeCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad limitDischargePoints.
     * 
     */
    public double getLimitDischargePoints() {
        return limitDischargePoints;
    }

    /**
     * Define el valor de la propiedad limitDischargePoints.
     * 
     */
    public void setLimitDischargePoints(double value) {
        this.limitDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad rightsShop.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalRights }
     *     
     */
    public WSTerminalRights getRightsShop() {
        return rightsShop;
    }

    /**
     * Define el valor de la propiedad rightsShop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalRights }
     *     
     */
    public void setRightsShop(WSTerminalRights value) {
        this.rightsShop = value;
    }

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSBehaviorFlags }
     *     
     */
    public WSBehaviorFlags getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBehaviorFlags }
     *     
     */
    public void setBehaviorFlags(WSBehaviorFlags value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad behaviorFlags2.
     * 
     * @return
     *     possible object is
     *     {@link WSBehaviorFlags2 }
     *     
     */
    public WSBehaviorFlags2 getBehaviorFlags2() {
        return behaviorFlags2;
    }

    /**
     * Define el valor de la propiedad behaviorFlags2.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBehaviorFlags2 }
     *     
     */
    public void setBehaviorFlags2(WSBehaviorFlags2 value) {
        this.behaviorFlags2 = value;
    }

    /**
     * Obtiene el valor de la propiedad operativeFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSOperativeShopFlags }
     *     
     */
    public WSOperativeShopFlags getOperativeFlags() {
        return operativeFlags;
    }

    /**
     * Define el valor de la propiedad operativeFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOperativeShopFlags }
     *     
     */
    public void setOperativeFlags(WSOperativeShopFlags value) {
        this.operativeFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad operativeFlags2.
     * 
     * @return
     *     possible object is
     *     {@link WSOperativeShopFlags2 }
     *     
     */
    public WSOperativeShopFlags2 getOperativeFlags2() {
        return operativeFlags2;
    }

    /**
     * Define el valor de la propiedad operativeFlags2.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOperativeShopFlags2 }
     *     
     */
    public void setOperativeFlags2(WSOperativeShopFlags2 value) {
        this.operativeFlags2 = value;
    }

    /**
     * Obtiene el valor de la propiedad operativeFlags3.
     * 
     * @return
     *     possible object is
     *     {@link WSOperativeShopFlags3 }
     *     
     */
    public WSOperativeShopFlags3 getOperativeFlags3() {
        return operativeFlags3;
    }

    /**
     * Define el valor de la propiedad operativeFlags3.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOperativeShopFlags3 }
     *     
     */
    public void setOperativeFlags3(WSOperativeShopFlags3 value) {
        this.operativeFlags3 = value;
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
     * Obtiene el valor de la propiedad balancePointsStatus.
     * 
     */
    public double getBalancePointsStatus() {
        return balancePointsStatus;
    }

    /**
     * Define el valor de la propiedad balancePointsStatus.
     * 
     */
    public void setBalancePointsStatus(double value) {
        this.balancePointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCreditsGift.
     * 
     */
    public double getBalanceCreditsGift() {
        return balanceCreditsGift;
    }

    /**
     * Define el valor de la propiedad balanceCreditsGift.
     * 
     */
    public void setBalanceCreditsGift(double value) {
        this.balanceCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCards.
     * 
     */
    public int getBalanceCards() {
        return balanceCards;
    }

    /**
     * Define el valor de la propiedad balanceCards.
     * 
     */
    public void setBalanceCards(int value) {
        this.balanceCards = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCardsGift.
     * 
     */
    public int getBalanceCardsGift() {
        return balanceCardsGift;
    }

    /**
     * Define el valor de la propiedad balanceCardsGift.
     * 
     */
    public void setBalanceCardsGift(int value) {
        this.balanceCardsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsGiftCharged.
     * 
     */
    public long getCardsGiftCharged() {
        return cardsGiftCharged;
    }

    /**
     * Define el valor de la propiedad cardsGiftCharged.
     * 
     */
    public void setCardsGiftCharged(long value) {
        this.cardsGiftCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsGiftEmitted.
     * 
     */
    public long getCardsGiftEmitted() {
        return cardsGiftEmitted;
    }

    /**
     * Define el valor de la propiedad cardsGiftEmitted.
     * 
     */
    public void setCardsGiftEmitted(long value) {
        this.cardsGiftEmitted = value;
    }

    /**
     * Obtiene el valor de la propiedad qualificationAvg.
     * 
     */
    public double getQualificationAvg() {
        return qualificationAvg;
    }

    /**
     * Define el valor de la propiedad qualificationAvg.
     * 
     */
    public void setQualificationAvg(double value) {
        this.qualificationAvg = value;
    }

}
