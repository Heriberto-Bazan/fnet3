
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OperativeShopFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OperativeShopFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useNameSurnameClientArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCardNumberClientArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useMailClientArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomerSearchByDNI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomerSearchByCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomerSearchByBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCustomerSearchByCustomerID" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePartialDeliverPrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showMinimumInfoInCustomerSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="askTicketInfoInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="askBirthdateInReplaceCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="askDNIInReplaceCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="giveDiscountsInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useManualAmountInsteadProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showNetMovements" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useMultiExchange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCentralizedIssueCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="winAllPromotion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="orderPromotionsNewToOld" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="usePasswordInTerminals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="saleHidesImportInTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="shopCanSeeAllCustCamp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useDecimalPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useShopAutoUpdateWeightnings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="generatePasswordByBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useSilentActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useCeilDecimalPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showAmountInChargeProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="kindChargeInPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="externalTicketInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showFidelyCodeInTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="winMoreBeneficialChargedPointsPromotion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="groupChargedPointsPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OperativeShopFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useNameSurnameClientArea",
    "useCardNumberClientArea",
    "useMailClientArea",
    "useCustomerSearchByDNI",
    "useCustomerSearchByCard",
    "useCustomerSearchByBirthdate",
    "useCustomerSearchByCustomerID",
    "usePartialDeliverPrizes",
    "showMinimumInfoInCustomerSearch",
    "askTicketInfoInSale",
    "askBirthdateInReplaceCard",
    "askDNIInReplaceCard",
    "giveDiscountsInSale",
    "useManualAmountInsteadProducts",
    "showNetMovements",
    "useMultiExchange",
    "useCentralizedIssueCards",
    "winAllPromotion",
    "orderPromotionsNewToOld",
    "usePasswordInTerminals",
    "saleHidesImportInTicket",
    "shopCanSeeAllCustCamp",
    "useDecimalPoints",
    "useShopAutoUpdateWeightnings",
    "generatePasswordByBirthdate",
    "useSilentActivation",
    "useCeilDecimalPoints",
    "showAmountInChargeProducts",
    "kindChargeInPoints",
    "externalTicketInformation",
    "showFidelyCodeInTicket",
    "winMoreBeneficialChargedPointsPromotion",
    "groupChargedPointsPromotions"
})
public class WSOperativeShopFlags {

    protected long flags;
    protected boolean useNameSurnameClientArea;
    protected boolean useCardNumberClientArea;
    protected boolean useMailClientArea;
    protected boolean useCustomerSearchByDNI;
    protected boolean useCustomerSearchByCard;
    protected boolean useCustomerSearchByBirthdate;
    protected boolean useCustomerSearchByCustomerID;
    protected boolean usePartialDeliverPrizes;
    protected boolean showMinimumInfoInCustomerSearch;
    protected boolean askTicketInfoInSale;
    protected boolean askBirthdateInReplaceCard;
    protected boolean askDNIInReplaceCard;
    protected boolean giveDiscountsInSale;
    protected boolean useManualAmountInsteadProducts;
    protected boolean showNetMovements;
    protected boolean useMultiExchange;
    protected boolean useCentralizedIssueCards;
    protected boolean winAllPromotion;
    protected boolean orderPromotionsNewToOld;
    protected boolean usePasswordInTerminals;
    protected boolean saleHidesImportInTicket;
    protected boolean shopCanSeeAllCustCamp;
    protected boolean useDecimalPoints;
    protected boolean useShopAutoUpdateWeightnings;
    protected boolean generatePasswordByBirthdate;
    protected boolean useSilentActivation;
    protected boolean useCeilDecimalPoints;
    protected boolean showAmountInChargeProducts;
    protected boolean kindChargeInPoints;
    protected boolean externalTicketInformation;
    protected boolean showFidelyCodeInTicket;
    protected boolean winMoreBeneficialChargedPointsPromotion;
    protected boolean groupChargedPointsPromotions;

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
     * Obtiene el valor de la propiedad useNameSurnameClientArea.
     * 
     */
    public boolean isUseNameSurnameClientArea() {
        return useNameSurnameClientArea;
    }

    /**
     * Define el valor de la propiedad useNameSurnameClientArea.
     * 
     */
    public void setUseNameSurnameClientArea(boolean value) {
        this.useNameSurnameClientArea = value;
    }

    /**
     * Obtiene el valor de la propiedad useCardNumberClientArea.
     * 
     */
    public boolean isUseCardNumberClientArea() {
        return useCardNumberClientArea;
    }

    /**
     * Define el valor de la propiedad useCardNumberClientArea.
     * 
     */
    public void setUseCardNumberClientArea(boolean value) {
        this.useCardNumberClientArea = value;
    }

    /**
     * Obtiene el valor de la propiedad useMailClientArea.
     * 
     */
    public boolean isUseMailClientArea() {
        return useMailClientArea;
    }

    /**
     * Define el valor de la propiedad useMailClientArea.
     * 
     */
    public void setUseMailClientArea(boolean value) {
        this.useMailClientArea = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomerSearchByDNI.
     * 
     */
    public boolean isUseCustomerSearchByDNI() {
        return useCustomerSearchByDNI;
    }

    /**
     * Define el valor de la propiedad useCustomerSearchByDNI.
     * 
     */
    public void setUseCustomerSearchByDNI(boolean value) {
        this.useCustomerSearchByDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomerSearchByCard.
     * 
     */
    public boolean isUseCustomerSearchByCard() {
        return useCustomerSearchByCard;
    }

    /**
     * Define el valor de la propiedad useCustomerSearchByCard.
     * 
     */
    public void setUseCustomerSearchByCard(boolean value) {
        this.useCustomerSearchByCard = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomerSearchByBirthdate.
     * 
     */
    public boolean isUseCustomerSearchByBirthdate() {
        return useCustomerSearchByBirthdate;
    }

    /**
     * Define el valor de la propiedad useCustomerSearchByBirthdate.
     * 
     */
    public void setUseCustomerSearchByBirthdate(boolean value) {
        this.useCustomerSearchByBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad useCustomerSearchByCustomerID.
     * 
     */
    public boolean isUseCustomerSearchByCustomerID() {
        return useCustomerSearchByCustomerID;
    }

    /**
     * Define el valor de la propiedad useCustomerSearchByCustomerID.
     * 
     */
    public void setUseCustomerSearchByCustomerID(boolean value) {
        this.useCustomerSearchByCustomerID = value;
    }

    /**
     * Obtiene el valor de la propiedad usePartialDeliverPrizes.
     * 
     */
    public boolean isUsePartialDeliverPrizes() {
        return usePartialDeliverPrizes;
    }

    /**
     * Define el valor de la propiedad usePartialDeliverPrizes.
     * 
     */
    public void setUsePartialDeliverPrizes(boolean value) {
        this.usePartialDeliverPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad showMinimumInfoInCustomerSearch.
     * 
     */
    public boolean isShowMinimumInfoInCustomerSearch() {
        return showMinimumInfoInCustomerSearch;
    }

    /**
     * Define el valor de la propiedad showMinimumInfoInCustomerSearch.
     * 
     */
    public void setShowMinimumInfoInCustomerSearch(boolean value) {
        this.showMinimumInfoInCustomerSearch = value;
    }

    /**
     * Obtiene el valor de la propiedad askTicketInfoInSale.
     * 
     */
    public boolean isAskTicketInfoInSale() {
        return askTicketInfoInSale;
    }

    /**
     * Define el valor de la propiedad askTicketInfoInSale.
     * 
     */
    public void setAskTicketInfoInSale(boolean value) {
        this.askTicketInfoInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad askBirthdateInReplaceCard.
     * 
     */
    public boolean isAskBirthdateInReplaceCard() {
        return askBirthdateInReplaceCard;
    }

    /**
     * Define el valor de la propiedad askBirthdateInReplaceCard.
     * 
     */
    public void setAskBirthdateInReplaceCard(boolean value) {
        this.askBirthdateInReplaceCard = value;
    }

    /**
     * Obtiene el valor de la propiedad askDNIInReplaceCard.
     * 
     */
    public boolean isAskDNIInReplaceCard() {
        return askDNIInReplaceCard;
    }

    /**
     * Define el valor de la propiedad askDNIInReplaceCard.
     * 
     */
    public void setAskDNIInReplaceCard(boolean value) {
        this.askDNIInReplaceCard = value;
    }

    /**
     * Obtiene el valor de la propiedad giveDiscountsInSale.
     * 
     */
    public boolean isGiveDiscountsInSale() {
        return giveDiscountsInSale;
    }

    /**
     * Define el valor de la propiedad giveDiscountsInSale.
     * 
     */
    public void setGiveDiscountsInSale(boolean value) {
        this.giveDiscountsInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad useManualAmountInsteadProducts.
     * 
     */
    public boolean isUseManualAmountInsteadProducts() {
        return useManualAmountInsteadProducts;
    }

    /**
     * Define el valor de la propiedad useManualAmountInsteadProducts.
     * 
     */
    public void setUseManualAmountInsteadProducts(boolean value) {
        this.useManualAmountInsteadProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad showNetMovements.
     * 
     */
    public boolean isShowNetMovements() {
        return showNetMovements;
    }

    /**
     * Define el valor de la propiedad showNetMovements.
     * 
     */
    public void setShowNetMovements(boolean value) {
        this.showNetMovements = value;
    }

    /**
     * Obtiene el valor de la propiedad useMultiExchange.
     * 
     */
    public boolean isUseMultiExchange() {
        return useMultiExchange;
    }

    /**
     * Define el valor de la propiedad useMultiExchange.
     * 
     */
    public void setUseMultiExchange(boolean value) {
        this.useMultiExchange = value;
    }

    /**
     * Obtiene el valor de la propiedad useCentralizedIssueCards.
     * 
     */
    public boolean isUseCentralizedIssueCards() {
        return useCentralizedIssueCards;
    }

    /**
     * Define el valor de la propiedad useCentralizedIssueCards.
     * 
     */
    public void setUseCentralizedIssueCards(boolean value) {
        this.useCentralizedIssueCards = value;
    }

    /**
     * Obtiene el valor de la propiedad winAllPromotion.
     * 
     */
    public boolean isWinAllPromotion() {
        return winAllPromotion;
    }

    /**
     * Define el valor de la propiedad winAllPromotion.
     * 
     */
    public void setWinAllPromotion(boolean value) {
        this.winAllPromotion = value;
    }

    /**
     * Obtiene el valor de la propiedad orderPromotionsNewToOld.
     * 
     */
    public boolean isOrderPromotionsNewToOld() {
        return orderPromotionsNewToOld;
    }

    /**
     * Define el valor de la propiedad orderPromotionsNewToOld.
     * 
     */
    public void setOrderPromotionsNewToOld(boolean value) {
        this.orderPromotionsNewToOld = value;
    }

    /**
     * Obtiene el valor de la propiedad usePasswordInTerminals.
     * 
     */
    public boolean isUsePasswordInTerminals() {
        return usePasswordInTerminals;
    }

    /**
     * Define el valor de la propiedad usePasswordInTerminals.
     * 
     */
    public void setUsePasswordInTerminals(boolean value) {
        this.usePasswordInTerminals = value;
    }

    /**
     * Obtiene el valor de la propiedad saleHidesImportInTicket.
     * 
     */
    public boolean isSaleHidesImportInTicket() {
        return saleHidesImportInTicket;
    }

    /**
     * Define el valor de la propiedad saleHidesImportInTicket.
     * 
     */
    public void setSaleHidesImportInTicket(boolean value) {
        this.saleHidesImportInTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad shopCanSeeAllCustCamp.
     * 
     */
    public boolean isShopCanSeeAllCustCamp() {
        return shopCanSeeAllCustCamp;
    }

    /**
     * Define el valor de la propiedad shopCanSeeAllCustCamp.
     * 
     */
    public void setShopCanSeeAllCustCamp(boolean value) {
        this.shopCanSeeAllCustCamp = value;
    }

    /**
     * Obtiene el valor de la propiedad useDecimalPoints.
     * 
     */
    public boolean isUseDecimalPoints() {
        return useDecimalPoints;
    }

    /**
     * Define el valor de la propiedad useDecimalPoints.
     * 
     */
    public void setUseDecimalPoints(boolean value) {
        this.useDecimalPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad useShopAutoUpdateWeightnings.
     * 
     */
    public boolean isUseShopAutoUpdateWeightnings() {
        return useShopAutoUpdateWeightnings;
    }

    /**
     * Define el valor de la propiedad useShopAutoUpdateWeightnings.
     * 
     */
    public void setUseShopAutoUpdateWeightnings(boolean value) {
        this.useShopAutoUpdateWeightnings = value;
    }

    /**
     * Obtiene el valor de la propiedad generatePasswordByBirthdate.
     * 
     */
    public boolean isGeneratePasswordByBirthdate() {
        return generatePasswordByBirthdate;
    }

    /**
     * Define el valor de la propiedad generatePasswordByBirthdate.
     * 
     */
    public void setGeneratePasswordByBirthdate(boolean value) {
        this.generatePasswordByBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad useSilentActivation.
     * 
     */
    public boolean isUseSilentActivation() {
        return useSilentActivation;
    }

    /**
     * Define el valor de la propiedad useSilentActivation.
     * 
     */
    public void setUseSilentActivation(boolean value) {
        this.useSilentActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad useCeilDecimalPoints.
     * 
     */
    public boolean isUseCeilDecimalPoints() {
        return useCeilDecimalPoints;
    }

    /**
     * Define el valor de la propiedad useCeilDecimalPoints.
     * 
     */
    public void setUseCeilDecimalPoints(boolean value) {
        this.useCeilDecimalPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad showAmountInChargeProducts.
     * 
     */
    public boolean isShowAmountInChargeProducts() {
        return showAmountInChargeProducts;
    }

    /**
     * Define el valor de la propiedad showAmountInChargeProducts.
     * 
     */
    public void setShowAmountInChargeProducts(boolean value) {
        this.showAmountInChargeProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad kindChargeInPoints.
     * 
     */
    public boolean isKindChargeInPoints() {
        return kindChargeInPoints;
    }

    /**
     * Define el valor de la propiedad kindChargeInPoints.
     * 
     */
    public void setKindChargeInPoints(boolean value) {
        this.kindChargeInPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTicketInformation.
     * 
     */
    public boolean isExternalTicketInformation() {
        return externalTicketInformation;
    }

    /**
     * Define el valor de la propiedad externalTicketInformation.
     * 
     */
    public void setExternalTicketInformation(boolean value) {
        this.externalTicketInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad showFidelyCodeInTicket.
     * 
     */
    public boolean isShowFidelyCodeInTicket() {
        return showFidelyCodeInTicket;
    }

    /**
     * Define el valor de la propiedad showFidelyCodeInTicket.
     * 
     */
    public void setShowFidelyCodeInTicket(boolean value) {
        this.showFidelyCodeInTicket = value;
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

}
