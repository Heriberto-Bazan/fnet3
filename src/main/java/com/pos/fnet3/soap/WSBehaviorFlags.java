
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_BehaviorFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_BehaviorFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="behaviorFlags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="isEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useGiftCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useVouchers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useMLM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useECommerce" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useScratchOff" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useQRProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsBuyPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsBuyCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsRechargeInDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsCommissionInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomersPointsInCompleteData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useNegativePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useNegativeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useFidelyCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useBankCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useNoFidelyCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useStatusPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsBuyGIFTCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopsBuyStatusPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePaymentMethods" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useOtherTrack1LifeMilesCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="vouchersCanExceedsTotalMoney" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useOtherTrack1Card" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BehaviorFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "behaviorFlags",
    "isEnabled",
    "usePoints",
    "useCredits",
    "useGiftCard",
    "useProducts",
    "useDiscount",
    "useVouchers",
    "usePromotions",
    "usePrizes",
    "useMLM",
    "useExtensions",
    "useECommerce",
    "useScratchOff",
    "useQRProducts",
    "useShopsBuyPoints",
    "useShopsBuyCredits",
    "useShopsRechargeInDischarge",
    "useShopsCommissionInSale",
    "useCustomersPointsInCompleteData",
    "useNegativePoints",
    "useNegativeCredits",
    "useFidelyCard",
    "useBankCard",
    "useNoFidelyCard",
    "useStatusPoints",
    "useShopsBuyGIFTCredits",
    "useShopsBuyStatusPoints",
    "usePaymentMethods",
    "useOtherTrack1LifeMilesCard",
    "vouchersCanExceedsTotalMoney",
    "useOtherTrack1Card"
})
public class WSBehaviorFlags {

    protected long behaviorFlags;
    protected boolean isEnabled;
    protected boolean usePoints;
    protected boolean useCredits;
    protected boolean useGiftCard;
    protected boolean useProducts;
    protected boolean useDiscount;
    protected boolean useVouchers;
    protected boolean usePromotions;
    protected boolean usePrizes;
    protected boolean useMLM;
    protected boolean useExtensions;
    protected boolean useECommerce;
    protected boolean useScratchOff;
    protected boolean useQRProducts;
    protected boolean useShopsBuyPoints;
    protected boolean useShopsBuyCredits;
    protected boolean useShopsRechargeInDischarge;
    protected boolean useShopsCommissionInSale;
    protected boolean useCustomersPointsInCompleteData;
    protected boolean useNegativePoints;
    protected boolean useNegativeCredits;
    protected boolean useFidelyCard;
    protected boolean useBankCard;
    protected boolean useNoFidelyCard;
    protected boolean useStatusPoints;
    protected boolean useShopsBuyGIFTCredits;
    protected boolean useShopsBuyStatusPoints;
    protected boolean usePaymentMethods;
    protected boolean useOtherTrack1LifeMilesCard;
    protected boolean vouchersCanExceedsTotalMoney;
    protected boolean useOtherTrack1Card;

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     */
    public long getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     */
    public void setBehaviorFlags(long value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad isEnabled.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define el valor de la propiedad isEnabled.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtiene el valor de la propiedad usePoints.
     * 
     */
    public boolean isUsePoints() {
        return usePoints;
    }

    /**
     * Define el valor de la propiedad usePoints.
     * 
     */
    public void setUsePoints(boolean value) {
        this.usePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useCredits.
     * 
     */
    public boolean isUseCredits() {
        return useCredits;
    }

    /**
     * Define el valor de la propiedad useCredits.
     * 
     */
    public void setUseCredits(boolean value) {
        this.useCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad useGiftCard.
     * 
     */
    public boolean isUseGiftCard() {
        return useGiftCard;
    }

    /**
     * Define el valor de la propiedad useGiftCard.
     * 
     */
    public void setUseGiftCard(boolean value) {
        this.useGiftCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useProducts.
     * 
     */
    public boolean isUseProducts() {
        return useProducts;
    }

    /**
     * Define el valor de la propiedad useProducts.
     * 
     */
    public void setUseProducts(boolean value) {
        this.useProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad useDiscount.
     * 
     */
    public boolean isUseDiscount() {
        return useDiscount;
    }

    /**
     * Define el valor de la propiedad useDiscount.
     * 
     */
    public void setUseDiscount(boolean value) {
        this.useDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad useVouchers.
     * 
     */
    public boolean isUseVouchers() {
        return useVouchers;
    }

    /**
     * Define el valor de la propiedad useVouchers.
     * 
     */
    public void setUseVouchers(boolean value) {
        this.useVouchers = value;
    }

    /**
     * Obtiene el valor de la propiedad usePromotions.
     * 
     */
    public boolean isUsePromotions() {
        return usePromotions;
    }

    /**
     * Define el valor de la propiedad usePromotions.
     * 
     */
    public void setUsePromotions(boolean value) {
        this.usePromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad usePrizes.
     * 
     */
    public boolean isUsePrizes() {
        return usePrizes;
    }

    /**
     * Define el valor de la propiedad usePrizes.
     * 
     */
    public void setUsePrizes(boolean value) {
        this.usePrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad useMLM.
     * 
     */
    public boolean isUseMLM() {
        return useMLM;
    }

    /**
     * Define el valor de la propiedad useMLM.
     * 
     */
    public void setUseMLM(boolean value) {
        this.useMLM = value;
    }

    /**
     * Obtiene el valor de la propiedad useExtensions.
     * 
     */
    public boolean isUseExtensions() {
        return useExtensions;
    }

    /**
     * Define el valor de la propiedad useExtensions.
     * 
     */
    public void setUseExtensions(boolean value) {
        this.useExtensions = value;
    }

    /**
     * Obtiene el valor de la propiedad useECommerce.
     * 
     */
    public boolean isUseECommerce() {
        return useECommerce;
    }

    /**
     * Define el valor de la propiedad useECommerce.
     * 
     */
    public void setUseECommerce(boolean value) {
        this.useECommerce = value;
    }

    /**
     * Obtiene el valor de la propiedad useScratchOff.
     * 
     */
    public boolean isUseScratchOff() {
        return useScratchOff;
    }

    /**
     * Define el valor de la propiedad useScratchOff.
     * 
     */
    public void setUseScratchOff(boolean value) {
        this.useScratchOff = value;
    }

    /**
     * Obtiene el valor de la propiedad useQRProducts.
     * 
     */
    public boolean isUseQRProducts() {
        return useQRProducts;
    }

    /**
     * Define el valor de la propiedad useQRProducts.
     * 
     */
    public void setUseQRProducts(boolean value) {
        this.useQRProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsBuyPoints.
     * 
     */
    public boolean isUseShopsBuyPoints() {
        return useShopsBuyPoints;
    }

    /**
     * Define el valor de la propiedad useShopsBuyPoints.
     * 
     */
    public void setUseShopsBuyPoints(boolean value) {
        this.useShopsBuyPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsBuyCredits.
     * 
     */
    public boolean isUseShopsBuyCredits() {
        return useShopsBuyCredits;
    }

    /**
     * Define el valor de la propiedad useShopsBuyCredits.
     * 
     */
    public void setUseShopsBuyCredits(boolean value) {
        this.useShopsBuyCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsRechargeInDischarge.
     * 
     */
    public boolean isUseShopsRechargeInDischarge() {
        return useShopsRechargeInDischarge;
    }

    /**
     * Define el valor de la propiedad useShopsRechargeInDischarge.
     * 
     */
    public void setUseShopsRechargeInDischarge(boolean value) {
        this.useShopsRechargeInDischarge = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsCommissionInSale.
     * 
     */
    public boolean isUseShopsCommissionInSale() {
        return useShopsCommissionInSale;
    }

    /**
     * Define el valor de la propiedad useShopsCommissionInSale.
     * 
     */
    public void setUseShopsCommissionInSale(boolean value) {
        this.useShopsCommissionInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomersPointsInCompleteData.
     * 
     */
    public boolean isUseCustomersPointsInCompleteData() {
        return useCustomersPointsInCompleteData;
    }

    /**
     * Define el valor de la propiedad useCustomersPointsInCompleteData.
     * 
     */
    public void setUseCustomersPointsInCompleteData(boolean value) {
        this.useCustomersPointsInCompleteData = value;
    }

    /**
     * Obtiene el valor de la propiedad useNegativePoints.
     * 
     */
    public boolean isUseNegativePoints() {
        return useNegativePoints;
    }

    /**
     * Define el valor de la propiedad useNegativePoints.
     * 
     */
    public void setUseNegativePoints(boolean value) {
        this.useNegativePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useNegativeCredits.
     * 
     */
    public boolean isUseNegativeCredits() {
        return useNegativeCredits;
    }

    /**
     * Define el valor de la propiedad useNegativeCredits.
     * 
     */
    public void setUseNegativeCredits(boolean value) {
        this.useNegativeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad useFidelyCard.
     * 
     */
    public boolean isUseFidelyCard() {
        return useFidelyCard;
    }

    /**
     * Define el valor de la propiedad useFidelyCard.
     * 
     */
    public void setUseFidelyCard(boolean value) {
        this.useFidelyCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useBankCard.
     * 
     */
    public boolean isUseBankCard() {
        return useBankCard;
    }

    /**
     * Define el valor de la propiedad useBankCard.
     * 
     */
    public void setUseBankCard(boolean value) {
        this.useBankCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useNoFidelyCard.
     * 
     */
    public boolean isUseNoFidelyCard() {
        return useNoFidelyCard;
    }

    /**
     * Define el valor de la propiedad useNoFidelyCard.
     * 
     */
    public void setUseNoFidelyCard(boolean value) {
        this.useNoFidelyCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useStatusPoints.
     * 
     */
    public boolean isUseStatusPoints() {
        return useStatusPoints;
    }

    /**
     * Define el valor de la propiedad useStatusPoints.
     * 
     */
    public void setUseStatusPoints(boolean value) {
        this.useStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsBuyGIFTCredits.
     * 
     */
    public boolean isUseShopsBuyGIFTCredits() {
        return useShopsBuyGIFTCredits;
    }

    /**
     * Define el valor de la propiedad useShopsBuyGIFTCredits.
     * 
     */
    public void setUseShopsBuyGIFTCredits(boolean value) {
        this.useShopsBuyGIFTCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopsBuyStatusPoints.
     * 
     */
    public boolean isUseShopsBuyStatusPoints() {
        return useShopsBuyStatusPoints;
    }

    /**
     * Define el valor de la propiedad useShopsBuyStatusPoints.
     * 
     */
    public void setUseShopsBuyStatusPoints(boolean value) {
        this.useShopsBuyStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad usePaymentMethods.
     * 
     */
    public boolean isUsePaymentMethods() {
        return usePaymentMethods;
    }

    /**
     * Define el valor de la propiedad usePaymentMethods.
     * 
     */
    public void setUsePaymentMethods(boolean value) {
        this.usePaymentMethods = value;
    }

    /**
     * Obtiene el valor de la propiedad useOtherTrack1LifeMilesCard.
     * 
     */
    public boolean isUseOtherTrack1LifeMilesCard() {
        return useOtherTrack1LifeMilesCard;
    }

    /**
     * Define el valor de la propiedad useOtherTrack1LifeMilesCard.
     * 
     */
    public void setUseOtherTrack1LifeMilesCard(boolean value) {
        this.useOtherTrack1LifeMilesCard = value;
    }

    /**
     * Obtiene el valor de la propiedad vouchersCanExceedsTotalMoney.
     * 
     */
    public boolean isVouchersCanExceedsTotalMoney() {
        return vouchersCanExceedsTotalMoney;
    }

    /**
     * Define el valor de la propiedad vouchersCanExceedsTotalMoney.
     * 
     */
    public void setVouchersCanExceedsTotalMoney(boolean value) {
        this.vouchersCanExceedsTotalMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad useOtherTrack1Card.
     * 
     */
    public boolean isUseOtherTrack1Card() {
        return useOtherTrack1Card;
    }

    /**
     * Define el valor de la propiedad useOtherTrack1Card.
     * 
     */
    public void setUseOtherTrack1Card(boolean value) {
        this.useOtherTrack1Card = value;
    }

}
