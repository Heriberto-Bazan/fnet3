
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_BehaviorFlags2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_BehaviorFlags2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="behaviorFlags2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useOtherCardTrack1Applebee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useActivationCardCost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useReplaceCardCost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAutomaticRechargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="campaignGetsPointsOnMlm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCascadePointsOnMlm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePointsExpiration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="recordRedemptionPointsRejects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dontAllowSaleWhenCantDischargeAccountBalancePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useApportionmentCalculationPointsInChargePointsWithProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useWeightingByProductCalculationPointsInChargePointsWithProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useProductPointsInSaleWithProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useWeightingByProductCalculationPointsInSaleWithProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCanSearchCustomerAShopInYourNet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeVerificationFromRC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useBornDateInPinCodeTransferCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useGiftCardCatalog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useExternalTransferCatalog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BehaviorFlags2", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "behaviorFlags2",
    "useVoiceMail",
    "useSale",
    "useOtherCardTrack1Applebee",
    "useActivationCardCost",
    "useReplaceCardCost",
    "useAutomaticRechargePoints",
    "campaignGetsPointsOnMlm",
    "useCascadePointsOnMlm",
    "usePointsExpiration",
    "recordRedemptionPointsRejects",
    "dontAllowSaleWhenCantDischargeAccountBalancePoints",
    "useApportionmentCalculationPointsInChargePointsWithProduct",
    "useWeightingByProductCalculationPointsInChargePointsWithProduct",
    "useProductPointsInSaleWithProduct",
    "useWeightingByProductCalculationPointsInSaleWithProduct",
    "useCanSearchCustomerAShopInYourNet",
    "usePinCodeVerification",
    "usePinCodeVerificationFromRC",
    "useBornDateInPinCodeTransferCredits",
    "useGiftCardCatalog",
    "useExternalTransferCatalog"
})
public class WSBehaviorFlags2 {

    protected long behaviorFlags2;
    protected boolean useVoiceMail;
    protected boolean useSale;
    protected boolean useOtherCardTrack1Applebee;
    protected boolean useActivationCardCost;
    protected boolean useReplaceCardCost;
    protected boolean useAutomaticRechargePoints;
    protected boolean campaignGetsPointsOnMlm;
    protected boolean useCascadePointsOnMlm;
    protected boolean usePointsExpiration;
    protected boolean recordRedemptionPointsRejects;
    protected boolean dontAllowSaleWhenCantDischargeAccountBalancePoints;
    protected boolean useApportionmentCalculationPointsInChargePointsWithProduct;
    protected boolean useWeightingByProductCalculationPointsInChargePointsWithProduct;
    protected boolean useProductPointsInSaleWithProduct;
    protected boolean useWeightingByProductCalculationPointsInSaleWithProduct;
    protected boolean useCanSearchCustomerAShopInYourNet;
    protected boolean usePinCodeVerification;
    protected boolean usePinCodeVerificationFromRC;
    protected boolean useBornDateInPinCodeTransferCredits;
    protected boolean useGiftCardCatalog;
    protected boolean useExternalTransferCatalog;

    /**
     * Obtiene el valor de la propiedad behaviorFlags2.
     * 
     */
    public long getBehaviorFlags2() {
        return behaviorFlags2;
    }

    /**
     * Define el valor de la propiedad behaviorFlags2.
     * 
     */
    public void setBehaviorFlags2(long value) {
        this.behaviorFlags2 = value;
    }

    /**
     * Obtiene el valor de la propiedad useVoiceMail.
     * 
     */
    public boolean isUseVoiceMail() {
        return useVoiceMail;
    }

    /**
     * Define el valor de la propiedad useVoiceMail.
     * 
     */
    public void setUseVoiceMail(boolean value) {
        this.useVoiceMail = value;
    }

    /**
     * Obtiene el valor de la propiedad useSale.
     * 
     */
    public boolean isUseSale() {
        return useSale;
    }

    /**
     * Define el valor de la propiedad useSale.
     * 
     */
    public void setUseSale(boolean value) {
        this.useSale = value;
    }

    /**
     * Obtiene el valor de la propiedad useOtherCardTrack1Applebee.
     * 
     */
    public boolean isUseOtherCardTrack1Applebee() {
        return useOtherCardTrack1Applebee;
    }

    /**
     * Define el valor de la propiedad useOtherCardTrack1Applebee.
     * 
     */
    public void setUseOtherCardTrack1Applebee(boolean value) {
        this.useOtherCardTrack1Applebee = value;
    }

    /**
     * Obtiene el valor de la propiedad useActivationCardCost.
     * 
     */
    public boolean isUseActivationCardCost() {
        return useActivationCardCost;
    }

    /**
     * Define el valor de la propiedad useActivationCardCost.
     * 
     */
    public void setUseActivationCardCost(boolean value) {
        this.useActivationCardCost = value;
    }

    /**
     * Obtiene el valor de la propiedad useReplaceCardCost.
     * 
     */
    public boolean isUseReplaceCardCost() {
        return useReplaceCardCost;
    }

    /**
     * Define el valor de la propiedad useReplaceCardCost.
     * 
     */
    public void setUseReplaceCardCost(boolean value) {
        this.useReplaceCardCost = value;
    }

    /**
     * Obtiene el valor de la propiedad useAutomaticRechargePoints.
     * 
     */
    public boolean isUseAutomaticRechargePoints() {
        return useAutomaticRechargePoints;
    }

    /**
     * Define el valor de la propiedad useAutomaticRechargePoints.
     * 
     */
    public void setUseAutomaticRechargePoints(boolean value) {
        this.useAutomaticRechargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignGetsPointsOnMlm.
     * 
     */
    public boolean isCampaignGetsPointsOnMlm() {
        return campaignGetsPointsOnMlm;
    }

    /**
     * Define el valor de la propiedad campaignGetsPointsOnMlm.
     * 
     */
    public void setCampaignGetsPointsOnMlm(boolean value) {
        this.campaignGetsPointsOnMlm = value;
    }

    /**
     * Obtiene el valor de la propiedad useCascadePointsOnMlm.
     * 
     */
    public boolean isUseCascadePointsOnMlm() {
        return useCascadePointsOnMlm;
    }

    /**
     * Define el valor de la propiedad useCascadePointsOnMlm.
     * 
     */
    public void setUseCascadePointsOnMlm(boolean value) {
        this.useCascadePointsOnMlm = value;
    }

    /**
     * Obtiene el valor de la propiedad usePointsExpiration.
     * 
     */
    public boolean isUsePointsExpiration() {
        return usePointsExpiration;
    }

    /**
     * Define el valor de la propiedad usePointsExpiration.
     * 
     */
    public void setUsePointsExpiration(boolean value) {
        this.usePointsExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad recordRedemptionPointsRejects.
     * 
     */
    public boolean isRecordRedemptionPointsRejects() {
        return recordRedemptionPointsRejects;
    }

    /**
     * Define el valor de la propiedad recordRedemptionPointsRejects.
     * 
     */
    public void setRecordRedemptionPointsRejects(boolean value) {
        this.recordRedemptionPointsRejects = value;
    }

    /**
     * Obtiene el valor de la propiedad dontAllowSaleWhenCantDischargeAccountBalancePoints.
     * 
     */
    public boolean isDontAllowSaleWhenCantDischargeAccountBalancePoints() {
        return dontAllowSaleWhenCantDischargeAccountBalancePoints;
    }

    /**
     * Define el valor de la propiedad dontAllowSaleWhenCantDischargeAccountBalancePoints.
     * 
     */
    public void setDontAllowSaleWhenCantDischargeAccountBalancePoints(boolean value) {
        this.dontAllowSaleWhenCantDischargeAccountBalancePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useApportionmentCalculationPointsInChargePointsWithProduct.
     * 
     */
    public boolean isUseApportionmentCalculationPointsInChargePointsWithProduct() {
        return useApportionmentCalculationPointsInChargePointsWithProduct;
    }

    /**
     * Define el valor de la propiedad useApportionmentCalculationPointsInChargePointsWithProduct.
     * 
     */
    public void setUseApportionmentCalculationPointsInChargePointsWithProduct(boolean value) {
        this.useApportionmentCalculationPointsInChargePointsWithProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad useWeightingByProductCalculationPointsInChargePointsWithProduct.
     * 
     */
    public boolean isUseWeightingByProductCalculationPointsInChargePointsWithProduct() {
        return useWeightingByProductCalculationPointsInChargePointsWithProduct;
    }

    /**
     * Define el valor de la propiedad useWeightingByProductCalculationPointsInChargePointsWithProduct.
     * 
     */
    public void setUseWeightingByProductCalculationPointsInChargePointsWithProduct(boolean value) {
        this.useWeightingByProductCalculationPointsInChargePointsWithProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad useProductPointsInSaleWithProduct.
     * 
     */
    public boolean isUseProductPointsInSaleWithProduct() {
        return useProductPointsInSaleWithProduct;
    }

    /**
     * Define el valor de la propiedad useProductPointsInSaleWithProduct.
     * 
     */
    public void setUseProductPointsInSaleWithProduct(boolean value) {
        this.useProductPointsInSaleWithProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad useWeightingByProductCalculationPointsInSaleWithProduct.
     * 
     */
    public boolean isUseWeightingByProductCalculationPointsInSaleWithProduct() {
        return useWeightingByProductCalculationPointsInSaleWithProduct;
    }

    /**
     * Define el valor de la propiedad useWeightingByProductCalculationPointsInSaleWithProduct.
     * 
     */
    public void setUseWeightingByProductCalculationPointsInSaleWithProduct(boolean value) {
        this.useWeightingByProductCalculationPointsInSaleWithProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad useCanSearchCustomerAShopInYourNet.
     * 
     */
    public boolean isUseCanSearchCustomerAShopInYourNet() {
        return useCanSearchCustomerAShopInYourNet;
    }

    /**
     * Define el valor de la propiedad useCanSearchCustomerAShopInYourNet.
     * 
     */
    public void setUseCanSearchCustomerAShopInYourNet(boolean value) {
        this.useCanSearchCustomerAShopInYourNet = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeVerification.
     * 
     */
    public boolean isUsePinCodeVerification() {
        return usePinCodeVerification;
    }

    /**
     * Define el valor de la propiedad usePinCodeVerification.
     * 
     */
    public void setUsePinCodeVerification(boolean value) {
        this.usePinCodeVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeVerificationFromRC.
     * 
     */
    public boolean isUsePinCodeVerificationFromRC() {
        return usePinCodeVerificationFromRC;
    }

    /**
     * Define el valor de la propiedad usePinCodeVerificationFromRC.
     * 
     */
    public void setUsePinCodeVerificationFromRC(boolean value) {
        this.usePinCodeVerificationFromRC = value;
    }

    /**
     * Obtiene el valor de la propiedad useBornDateInPinCodeTransferCredits.
     * 
     */
    public boolean isUseBornDateInPinCodeTransferCredits() {
        return useBornDateInPinCodeTransferCredits;
    }

    /**
     * Define el valor de la propiedad useBornDateInPinCodeTransferCredits.
     * 
     */
    public void setUseBornDateInPinCodeTransferCredits(boolean value) {
        this.useBornDateInPinCodeTransferCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad useGiftCardCatalog.
     * 
     */
    public boolean isUseGiftCardCatalog() {
        return useGiftCardCatalog;
    }

    /**
     * Define el valor de la propiedad useGiftCardCatalog.
     * 
     */
    public void setUseGiftCardCatalog(boolean value) {
        this.useGiftCardCatalog = value;
    }

    /**
     * Obtiene el valor de la propiedad useExternalTransferCatalog.
     * 
     */
    public boolean isUseExternalTransferCatalog() {
        return useExternalTransferCatalog;
    }

    /**
     * Define el valor de la propiedad useExternalTransferCatalog.
     * 
     */
    public void setUseExternalTransferCatalog(boolean value) {
        this.useExternalTransferCatalog = value;
    }

}
