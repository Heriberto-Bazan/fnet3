
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OperativeShopFlags2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OperativeShopFlags2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useSendMovementTicketEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSaleMRS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useTerminalHideDischargePointsManual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useProductsInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useTerminalHideChargePointsManual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useTerminalAskPrintTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="putLimitsOnPrizesQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useTerminalNotAskBirthdateTransferPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="modifyPointsOnRefund" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePerformDecimalPointsRoundingUp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomerSearchBySocialMedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="winMoreBeneficialChargedPointsPromotion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="groupChargedPointsPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useFraudMonitoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendMailNotifyDetectingFraud" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="automaticPointDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="automaticCreditDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="automaticGetVoucherInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendMailUsedVoucher" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendAmountToPayLapos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendCreditsBalanceLapos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendPointsBalanceLapos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="validIdentityCardInPointsRedemption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="allowManualDischargePointsInSaleFromApp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showProductCostInMovement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAutomaticGenerationMonthlyShopReport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInSaleWithPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInManualDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInExchangePrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="needPayAllWithBenefits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePinCodeRequestInTransferCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OperativeShopFlags2", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useSendMovementTicketEmail",
    "useSaleMRS",
    "useTerminalHideDischargePointsManual",
    "useProductsInSale",
    "useTerminalHideChargePointsManual",
    "useTerminalAskPrintTicket",
    "putLimitsOnPrizesQuantity",
    "useTerminalNotAskBirthdateTransferPoints",
    "modifyPointsOnRefund",
    "usePerformDecimalPointsRoundingUp",
    "useCustomerSearchBySocialMedia",
    "winMoreBeneficialChargedPointsPromotion",
    "groupChargedPointsPromotions",
    "useFraudMonitoring",
    "sendMailNotifyDetectingFraud",
    "automaticPointDischarge",
    "automaticCreditDischarge",
    "automaticGetVoucherInSale",
    "sendMailUsedVoucher",
    "sendAmountToPayLapos",
    "sendCreditsBalanceLapos",
    "sendPointsBalanceLapos",
    "validIdentityCardInPointsRedemption",
    "allowManualDischargePointsInSaleFromApp",
    "showProductCostInMovement",
    "useAutomaticGenerationMonthlyShopReport",
    "usePinCodeRequestInSaleWithPoints",
    "usePinCodeRequestInManualDischargePoints",
    "usePinCodeRequestInExchangePrizes",
    "needPayAllWithBenefits",
    "usePinCodeRequestInTransferCredits"
})
public class WSOperativeShopFlags2 {

    protected long flags;
    protected boolean useSendMovementTicketEmail;
    protected boolean useSaleMRS;
    protected boolean useTerminalHideDischargePointsManual;
    protected boolean useProductsInSale;
    protected boolean useTerminalHideChargePointsManual;
    protected boolean useTerminalAskPrintTicket;
    protected boolean putLimitsOnPrizesQuantity;
    protected boolean useTerminalNotAskBirthdateTransferPoints;
    protected boolean modifyPointsOnRefund;
    protected boolean usePerformDecimalPointsRoundingUp;
    protected boolean useCustomerSearchBySocialMedia;
    protected boolean winMoreBeneficialChargedPointsPromotion;
    protected boolean groupChargedPointsPromotions;
    protected boolean useFraudMonitoring;
    protected boolean sendMailNotifyDetectingFraud;
    protected boolean automaticPointDischarge;
    protected boolean automaticCreditDischarge;
    protected boolean automaticGetVoucherInSale;
    protected boolean sendMailUsedVoucher;
    protected boolean sendAmountToPayLapos;
    protected boolean sendCreditsBalanceLapos;
    protected boolean sendPointsBalanceLapos;
    protected boolean validIdentityCardInPointsRedemption;
    protected boolean allowManualDischargePointsInSaleFromApp;
    protected boolean showProductCostInMovement;
    protected boolean useAutomaticGenerationMonthlyShopReport;
    protected boolean usePinCodeRequestInSaleWithPoints;
    protected boolean usePinCodeRequestInManualDischargePoints;
    protected boolean usePinCodeRequestInExchangePrizes;
    protected boolean needPayAllWithBenefits;
    protected boolean usePinCodeRequestInTransferCredits;

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
     * Obtiene el valor de la propiedad useSendMovementTicketEmail.
     * 
     */
    public boolean isUseSendMovementTicketEmail() {
        return useSendMovementTicketEmail;
    }

    /**
     * Define el valor de la propiedad useSendMovementTicketEmail.
     * 
     */
    public void setUseSendMovementTicketEmail(boolean value) {
        this.useSendMovementTicketEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad useSaleMRS.
     * 
     */
    public boolean isUseSaleMRS() {
        return useSaleMRS;
    }

    /**
     * Define el valor de la propiedad useSaleMRS.
     * 
     */
    public void setUseSaleMRS(boolean value) {
        this.useSaleMRS = value;
    }

    /**
     * Obtiene el valor de la propiedad useTerminalHideDischargePointsManual.
     * 
     */
    public boolean isUseTerminalHideDischargePointsManual() {
        return useTerminalHideDischargePointsManual;
    }

    /**
     * Define el valor de la propiedad useTerminalHideDischargePointsManual.
     * 
     */
    public void setUseTerminalHideDischargePointsManual(boolean value) {
        this.useTerminalHideDischargePointsManual = value;
    }

    /**
     * Obtiene el valor de la propiedad useProductsInSale.
     * 
     */
    public boolean isUseProductsInSale() {
        return useProductsInSale;
    }

    /**
     * Define el valor de la propiedad useProductsInSale.
     * 
     */
    public void setUseProductsInSale(boolean value) {
        this.useProductsInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad useTerminalHideChargePointsManual.
     * 
     */
    public boolean isUseTerminalHideChargePointsManual() {
        return useTerminalHideChargePointsManual;
    }

    /**
     * Define el valor de la propiedad useTerminalHideChargePointsManual.
     * 
     */
    public void setUseTerminalHideChargePointsManual(boolean value) {
        this.useTerminalHideChargePointsManual = value;
    }

    /**
     * Obtiene el valor de la propiedad useTerminalAskPrintTicket.
     * 
     */
    public boolean isUseTerminalAskPrintTicket() {
        return useTerminalAskPrintTicket;
    }

    /**
     * Define el valor de la propiedad useTerminalAskPrintTicket.
     * 
     */
    public void setUseTerminalAskPrintTicket(boolean value) {
        this.useTerminalAskPrintTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad putLimitsOnPrizesQuantity.
     * 
     */
    public boolean isPutLimitsOnPrizesQuantity() {
        return putLimitsOnPrizesQuantity;
    }

    /**
     * Define el valor de la propiedad putLimitsOnPrizesQuantity.
     * 
     */
    public void setPutLimitsOnPrizesQuantity(boolean value) {
        this.putLimitsOnPrizesQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad useTerminalNotAskBirthdateTransferPoints.
     * 
     */
    public boolean isUseTerminalNotAskBirthdateTransferPoints() {
        return useTerminalNotAskBirthdateTransferPoints;
    }

    /**
     * Define el valor de la propiedad useTerminalNotAskBirthdateTransferPoints.
     * 
     */
    public void setUseTerminalNotAskBirthdateTransferPoints(boolean value) {
        this.useTerminalNotAskBirthdateTransferPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyPointsOnRefund.
     * 
     */
    public boolean isModifyPointsOnRefund() {
        return modifyPointsOnRefund;
    }

    /**
     * Define el valor de la propiedad modifyPointsOnRefund.
     * 
     */
    public void setModifyPointsOnRefund(boolean value) {
        this.modifyPointsOnRefund = value;
    }

    /**
     * Obtiene el valor de la propiedad usePerformDecimalPointsRoundingUp.
     * 
     */
    public boolean isUsePerformDecimalPointsRoundingUp() {
        return usePerformDecimalPointsRoundingUp;
    }

    /**
     * Define el valor de la propiedad usePerformDecimalPointsRoundingUp.
     * 
     */
    public void setUsePerformDecimalPointsRoundingUp(boolean value) {
        this.usePerformDecimalPointsRoundingUp = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomerSearchBySocialMedia.
     * 
     */
    public boolean isUseCustomerSearchBySocialMedia() {
        return useCustomerSearchBySocialMedia;
    }

    /**
     * Define el valor de la propiedad useCustomerSearchBySocialMedia.
     * 
     */
    public void setUseCustomerSearchBySocialMedia(boolean value) {
        this.useCustomerSearchBySocialMedia = value;
    }

    /**
     * Obtiene el valor de la propiedad winMoreBeneficialChargedPointsPromotion.
     * 
     */
    public boolean isWinMoreBeneficialChargedPointsPromotion() {
        return winMoreBeneficialChargedPointsPromotion;
    }

    /**
     * Define el valor de la propiedad winMoreBeneficialChargedPointsPromotion.
     * 
     */
    public void setWinMoreBeneficialChargedPointsPromotion(boolean value) {
        this.winMoreBeneficialChargedPointsPromotion = value;
    }

    /**
     * Obtiene el valor de la propiedad groupChargedPointsPromotions.
     * 
     */
    public boolean isGroupChargedPointsPromotions() {
        return groupChargedPointsPromotions;
    }

    /**
     * Define el valor de la propiedad groupChargedPointsPromotions.
     * 
     */
    public void setGroupChargedPointsPromotions(boolean value) {
        this.groupChargedPointsPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad useFraudMonitoring.
     * 
     */
    public boolean isUseFraudMonitoring() {
        return useFraudMonitoring;
    }

    /**
     * Define el valor de la propiedad useFraudMonitoring.
     * 
     */
    public void setUseFraudMonitoring(boolean value) {
        this.useFraudMonitoring = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailNotifyDetectingFraud.
     * 
     */
    public boolean isSendMailNotifyDetectingFraud() {
        return sendMailNotifyDetectingFraud;
    }

    /**
     * Define el valor de la propiedad sendMailNotifyDetectingFraud.
     * 
     */
    public void setSendMailNotifyDetectingFraud(boolean value) {
        this.sendMailNotifyDetectingFraud = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticPointDischarge.
     * 
     */
    public boolean isAutomaticPointDischarge() {
        return automaticPointDischarge;
    }

    /**
     * Define el valor de la propiedad automaticPointDischarge.
     * 
     */
    public void setAutomaticPointDischarge(boolean value) {
        this.automaticPointDischarge = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticCreditDischarge.
     * 
     */
    public boolean isAutomaticCreditDischarge() {
        return automaticCreditDischarge;
    }

    /**
     * Define el valor de la propiedad automaticCreditDischarge.
     * 
     */
    public void setAutomaticCreditDischarge(boolean value) {
        this.automaticCreditDischarge = value;
    }

    /**
     * Obtiene el valor de la propiedad automaticGetVoucherInSale.
     * 
     */
    public boolean isAutomaticGetVoucherInSale() {
        return automaticGetVoucherInSale;
    }

    /**
     * Define el valor de la propiedad automaticGetVoucherInSale.
     * 
     */
    public void setAutomaticGetVoucherInSale(boolean value) {
        this.automaticGetVoucherInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailUsedVoucher.
     * 
     */
    public boolean isSendMailUsedVoucher() {
        return sendMailUsedVoucher;
    }

    /**
     * Define el valor de la propiedad sendMailUsedVoucher.
     * 
     */
    public void setSendMailUsedVoucher(boolean value) {
        this.sendMailUsedVoucher = value;
    }

    /**
     * Obtiene el valor de la propiedad sendAmountToPayLapos.
     * 
     */
    public boolean isSendAmountToPayLapos() {
        return sendAmountToPayLapos;
    }

    /**
     * Define el valor de la propiedad sendAmountToPayLapos.
     * 
     */
    public void setSendAmountToPayLapos(boolean value) {
        this.sendAmountToPayLapos = value;
    }

    /**
     * Obtiene el valor de la propiedad sendCreditsBalanceLapos.
     * 
     */
    public boolean isSendCreditsBalanceLapos() {
        return sendCreditsBalanceLapos;
    }

    /**
     * Define el valor de la propiedad sendCreditsBalanceLapos.
     * 
     */
    public void setSendCreditsBalanceLapos(boolean value) {
        this.sendCreditsBalanceLapos = value;
    }

    /**
     * Obtiene el valor de la propiedad sendPointsBalanceLapos.
     * 
     */
    public boolean isSendPointsBalanceLapos() {
        return sendPointsBalanceLapos;
    }

    /**
     * Define el valor de la propiedad sendPointsBalanceLapos.
     * 
     */
    public void setSendPointsBalanceLapos(boolean value) {
        this.sendPointsBalanceLapos = value;
    }

    /**
     * Obtiene el valor de la propiedad validIdentityCardInPointsRedemption.
     * 
     */
    public boolean isValidIdentityCardInPointsRedemption() {
        return validIdentityCardInPointsRedemption;
    }

    /**
     * Define el valor de la propiedad validIdentityCardInPointsRedemption.
     * 
     */
    public void setValidIdentityCardInPointsRedemption(boolean value) {
        this.validIdentityCardInPointsRedemption = value;
    }

    /**
     * Obtiene el valor de la propiedad allowManualDischargePointsInSaleFromApp.
     * 
     */
    public boolean isAllowManualDischargePointsInSaleFromApp() {
        return allowManualDischargePointsInSaleFromApp;
    }

    /**
     * Define el valor de la propiedad allowManualDischargePointsInSaleFromApp.
     * 
     */
    public void setAllowManualDischargePointsInSaleFromApp(boolean value) {
        this.allowManualDischargePointsInSaleFromApp = value;
    }

    /**
     * Obtiene el valor de la propiedad showProductCostInMovement.
     * 
     */
    public boolean isShowProductCostInMovement() {
        return showProductCostInMovement;
    }

    /**
     * Define el valor de la propiedad showProductCostInMovement.
     * 
     */
    public void setShowProductCostInMovement(boolean value) {
        this.showProductCostInMovement = value;
    }

    /**
     * Obtiene el valor de la propiedad useAutomaticGenerationMonthlyShopReport.
     * 
     */
    public boolean isUseAutomaticGenerationMonthlyShopReport() {
        return useAutomaticGenerationMonthlyShopReport;
    }

    /**
     * Define el valor de la propiedad useAutomaticGenerationMonthlyShopReport.
     * 
     */
    public void setUseAutomaticGenerationMonthlyShopReport(boolean value) {
        this.useAutomaticGenerationMonthlyShopReport = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInSaleWithPoints.
     * 
     */
    public boolean isUsePinCodeRequestInSaleWithPoints() {
        return usePinCodeRequestInSaleWithPoints;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInSaleWithPoints.
     * 
     */
    public void setUsePinCodeRequestInSaleWithPoints(boolean value) {
        this.usePinCodeRequestInSaleWithPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInManualDischargePoints.
     * 
     */
    public boolean isUsePinCodeRequestInManualDischargePoints() {
        return usePinCodeRequestInManualDischargePoints;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInManualDischargePoints.
     * 
     */
    public void setUsePinCodeRequestInManualDischargePoints(boolean value) {
        this.usePinCodeRequestInManualDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInExchangePrizes.
     * 
     */
    public boolean isUsePinCodeRequestInExchangePrizes() {
        return usePinCodeRequestInExchangePrizes;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInExchangePrizes.
     * 
     */
    public void setUsePinCodeRequestInExchangePrizes(boolean value) {
        this.usePinCodeRequestInExchangePrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad needPayAllWithBenefits.
     * 
     */
    public boolean isNeedPayAllWithBenefits() {
        return needPayAllWithBenefits;
    }

    /**
     * Define el valor de la propiedad needPayAllWithBenefits.
     * 
     */
    public void setNeedPayAllWithBenefits(boolean value) {
        this.needPayAllWithBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad usePinCodeRequestInTransferCredits.
     * 
     */
    public boolean isUsePinCodeRequestInTransferCredits() {
        return usePinCodeRequestInTransferCredits;
    }

    /**
     * Define el valor de la propiedad usePinCodeRequestInTransferCredits.
     * 
     */
    public void setUsePinCodeRequestInTransferCredits(boolean value) {
        this.usePinCodeRequestInTransferCredits = value;
    }

}
