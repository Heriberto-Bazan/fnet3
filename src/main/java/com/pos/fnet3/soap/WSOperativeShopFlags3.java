
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OperativeShopFlags3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OperativeShopFlags3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useSellerRequestInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSellerRequestInCardReplacement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSellerRequestInCreditsTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSellerRequestInChargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSellerRequestInDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAssignShopInCardSubstitution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAssignSellerToMovAndShopRegToCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInTransferCreditsFromCAWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useBorndateInTransferCreditsFromCAWS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useProductPriceVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useExchangeGiftCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useExchangeExternalTransfers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInDeliverGiftCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useProductsInDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendMailNotifyDetectingFraudOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useFee" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="applyFeeOnBalanceToPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSaleInferiorLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSaleSuperiorLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="applyFeeOnEquivalentAmountPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OperativeShopFlags3", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useSellerRequestInSale",
    "useSellerRequestInCardReplacement",
    "useSellerRequestInCreditsTransfer",
    "useSellerRequestInChargePoints",
    "useSellerRequestInDischargePoints",
    "useAssignShopInCardSubstitution",
    "useAssignSellerToMovAndShopRegToCustomer",
    "usePinCodeRequestInTransferCreditsFromCAWS",
    "useBorndateInTransferCreditsFromCAWS",
    "useProductPriceVerification",
    "useExchangeGiftCards",
    "useExchangeExternalTransfers",
    "usePinCodeRequestInDeliverGiftCard",
    "useProductsInDischargePoints",
    "sendMailNotifyDetectingFraudOnline",
    "useFee",
    "applyFeeOnBalanceToPay",
    "useSaleInferiorLimit",
    "useSaleSuperiorLimit",
    "applyFeeOnEquivalentAmountPoints"
})
public class WSOperativeShopFlags3 {

    protected long flags;
    protected boolean useSellerRequestInSale;
    protected boolean useSellerRequestInCardReplacement;
    protected boolean useSellerRequestInCreditsTransfer;
    protected boolean useSellerRequestInChargePoints;
    protected boolean useSellerRequestInDischargePoints;
    protected boolean useAssignShopInCardSubstitution;
    protected boolean useAssignSellerToMovAndShopRegToCustomer;
    protected boolean usePinCodeRequestInTransferCreditsFromCAWS;
    protected boolean useBorndateInTransferCreditsFromCAWS;
    protected boolean useProductPriceVerification;
    protected boolean useExchangeGiftCards;
    protected boolean useExchangeExternalTransfers;
    protected boolean usePinCodeRequestInDeliverGiftCard;
    protected boolean useProductsInDischargePoints;
    protected boolean sendMailNotifyDetectingFraudOnline;
    protected boolean useFee;
    protected boolean applyFeeOnBalanceToPay;
    protected boolean useSaleInferiorLimit;
    protected boolean useSaleSuperiorLimit;
    protected boolean applyFeeOnEquivalentAmountPoints;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad useSellerRequestInSale.
     * 
     */
    public boolean isUseSellerRequestInSale() {
        return useSellerRequestInSale;
    }

    /**
     * Define el valor de la propiedad useSellerRequestInSale.
     * 
     */
    public void setUseSellerRequestInSale(boolean value) {
        this.useSellerRequestInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad useSellerRequestInCardReplacement.
     * 
     */
    public boolean isUseSellerRequestInCardReplacement() {
        return useSellerRequestInCardReplacement;
    }

    /**
     * Define el valor de la propiedad useSellerRequestInCardReplacement.
     * 
     */
    public void setUseSellerRequestInCardReplacement(boolean value) {
        this.useSellerRequestInCardReplacement = value;
    }

    /**
     * Obtiene el valor de la propiedad useSellerRequestInCreditsTransfer.
     * 
     */
    public boolean isUseSellerRequestInCreditsTransfer() {
        return useSellerRequestInCreditsTransfer;
    }

    /**
     * Define el valor de la propiedad useSellerRequestInCreditsTransfer.
     * 
     */
    public void setUseSellerRequestInCreditsTransfer(boolean value) {
        this.useSellerRequestInCreditsTransfer = value;
    }

    /**
     * Obtiene el valor de la propiedad useSellerRequestInChargePoints.
     * 
     */
    public boolean isUseSellerRequestInChargePoints() {
        return useSellerRequestInChargePoints;
    }

    /**
     * Define el valor de la propiedad useSellerRequestInChargePoints.
     * 
     */
    public void setUseSellerRequestInChargePoints(boolean value) {
        this.useSellerRequestInChargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useSellerRequestInDischargePoints.
     * 
     */
    public boolean isUseSellerRequestInDischargePoints() {
        return useSellerRequestInDischargePoints;
    }

    /**
     * Define el valor de la propiedad useSellerRequestInDischargePoints.
     * 
     */
    public void setUseSellerRequestInDischargePoints(boolean value) {
        this.useSellerRequestInDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useAssignShopInCardSubstitution.
     * 
     */
    public boolean isUseAssignShopInCardSubstitution() {
        return useAssignShopInCardSubstitution;
    }

    /**
     * Define el valor de la propiedad useAssignShopInCardSubstitution.
     * 
     */
    public void setUseAssignShopInCardSubstitution(boolean value) {
        this.useAssignShopInCardSubstitution = value;
    }

    /**
     * Obtiene el valor de la propiedad useAssignSellerToMovAndShopRegToCustomer.
     * 
     */
    public boolean isUseAssignSellerToMovAndShopRegToCustomer() {
        return useAssignSellerToMovAndShopRegToCustomer;
    }

    /**
     * Define el valor de la propiedad useAssignSellerToMovAndShopRegToCustomer.
     * 
     */
    public void setUseAssignSellerToMovAndShopRegToCustomer(boolean value) {
        this.useAssignSellerToMovAndShopRegToCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInTransferCreditsFromCAWS.
     * 
     */
    public boolean isUsePinCodeRequestInTransferCreditsFromCAWS() {
        return usePinCodeRequestInTransferCreditsFromCAWS;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInTransferCreditsFromCAWS.
     * 
     */
    public void setUsePinCodeRequestInTransferCreditsFromCAWS(boolean value) {
        this.usePinCodeRequestInTransferCreditsFromCAWS = value;
    }

    /**
     * Obtiene el valor de la propiedad useBorndateInTransferCreditsFromCAWS.
     * 
     */
    public boolean isUseBorndateInTransferCreditsFromCAWS() {
        return useBorndateInTransferCreditsFromCAWS;
    }

    /**
     * Define el valor de la propiedad useBorndateInTransferCreditsFromCAWS.
     * 
     */
    public void setUseBorndateInTransferCreditsFromCAWS(boolean value) {
        this.useBorndateInTransferCreditsFromCAWS = value;
    }

    /**
     * Obtiene el valor de la propiedad useProductPriceVerification.
     * 
     */
    public boolean isUseProductPriceVerification() {
        return useProductPriceVerification;
    }

    /**
     * Define el valor de la propiedad useProductPriceVerification.
     * 
     */
    public void setUseProductPriceVerification(boolean value) {
        this.useProductPriceVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad useExchangeGiftCards.
     * 
     */
    public boolean isUseExchangeGiftCards() {
        return useExchangeGiftCards;
    }

    /**
     * Define el valor de la propiedad useExchangeGiftCards.
     * 
     */
    public void setUseExchangeGiftCards(boolean value) {
        this.useExchangeGiftCards = value;
    }

    /**
     * Obtiene el valor de la propiedad useExchangeExternalTransfers.
     * 
     */
    public boolean isUseExchangeExternalTransfers() {
        return useExchangeExternalTransfers;
    }

    /**
     * Define el valor de la propiedad useExchangeExternalTransfers.
     * 
     */
    public void setUseExchangeExternalTransfers(boolean value) {
        this.useExchangeExternalTransfers = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInDeliverGiftCard.
     * 
     */
    public boolean isUsePinCodeRequestInDeliverGiftCard() {
        return usePinCodeRequestInDeliverGiftCard;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInDeliverGiftCard.
     * 
     */
    public void setUsePinCodeRequestInDeliverGiftCard(boolean value) {
        this.usePinCodeRequestInDeliverGiftCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useProductsInDischargePoints.
     * 
     */
    public boolean isUseProductsInDischargePoints() {
        return useProductsInDischargePoints;
    }

    /**
     * Define el valor de la propiedad useProductsInDischargePoints.
     * 
     */
    public void setUseProductsInDischargePoints(boolean value) {
        this.useProductsInDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailNotifyDetectingFraudOnline.
     * 
     */
    public boolean isSendMailNotifyDetectingFraudOnline() {
        return sendMailNotifyDetectingFraudOnline;
    }

    /**
     * Define el valor de la propiedad sendMailNotifyDetectingFraudOnline.
     * 
     */
    public void setSendMailNotifyDetectingFraudOnline(boolean value) {
        this.sendMailNotifyDetectingFraudOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad useFee.
     * 
     */
    public boolean isUseFee() {
        return useFee;
    }

    /**
     * Define el valor de la propiedad useFee.
     * 
     */
    public void setUseFee(boolean value) {
        this.useFee = value;
    }

    /**
     * Obtiene el valor de la propiedad applyFeeOnBalanceToPay.
     * 
     */
    public boolean isApplyFeeOnBalanceToPay() {
        return applyFeeOnBalanceToPay;
    }

    /**
     * Define el valor de la propiedad applyFeeOnBalanceToPay.
     * 
     */
    public void setApplyFeeOnBalanceToPay(boolean value) {
        this.applyFeeOnBalanceToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad useSaleInferiorLimit.
     * 
     */
    public boolean isUseSaleInferiorLimit() {
        return useSaleInferiorLimit;
    }

    /**
     * Define el valor de la propiedad useSaleInferiorLimit.
     * 
     */
    public void setUseSaleInferiorLimit(boolean value) {
        this.useSaleInferiorLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad useSaleSuperiorLimit.
     * 
     */
    public boolean isUseSaleSuperiorLimit() {
        return useSaleSuperiorLimit;
    }

    /**
     * Define el valor de la propiedad useSaleSuperiorLimit.
     * 
     */
    public void setUseSaleSuperiorLimit(boolean value) {
        this.useSaleSuperiorLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad applyFeeOnEquivalentAmountPoints.
     * 
     */
    public boolean isApplyFeeOnEquivalentAmountPoints() {
        return applyFeeOnEquivalentAmountPoints;
    }

    /**
     * Define el valor de la propiedad applyFeeOnEquivalentAmountPoints.
     * 
     */
    public void setApplyFeeOnEquivalentAmountPoints(boolean value) {
        this.applyFeeOnEquivalentAmountPoints = value;
    }

}
