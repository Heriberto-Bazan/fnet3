
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CategoryFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CategoryFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="isGIFT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deliverPointsInChargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deliverPointsInDischargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deliverPointsInSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deliverPointsInActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showPointsInActivationTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showMoney4PointsInTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useExpirationCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="customerOnlyAllowInActivationShop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="registerActivationPointsInCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="onlyOneUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sellerCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="checkMinimalLimitDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="checkCanNotTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dealerCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="deliverPointsInCashback" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "isGIFT",
    "deliverPointsInChargeCredits",
    "deliverPointsInDischargeCredits",
    "deliverPointsInSale",
    "deliverPointsInActivation",
    "showPointsInActivationTicket",
    "showMoney4PointsInTicket",
    "useExpirationCard",
    "customerOnlyAllowInActivationShop",
    "registerActivationPointsInCampaign",
    "onlyOneUse",
    "sellerCategory",
    "checkMinimalLimitDischargePoints",
    "checkCanNotTransaction",
    "dealerCategory",
    "deliverPointsInCashback"
})
public class WSCategoryFlags {

    protected long flags;
    protected boolean isGIFT;
    protected boolean deliverPointsInChargeCredits;
    protected boolean deliverPointsInDischargeCredits;
    protected boolean deliverPointsInSale;
    protected boolean deliverPointsInActivation;
    protected boolean showPointsInActivationTicket;
    protected boolean showMoney4PointsInTicket;
    protected boolean useExpirationCard;
    protected boolean customerOnlyAllowInActivationShop;
    protected boolean registerActivationPointsInCampaign;
    protected boolean onlyOneUse;
    protected boolean sellerCategory;
    protected boolean checkMinimalLimitDischargePoints;
    protected boolean checkCanNotTransaction;
    protected boolean dealerCategory;
    protected boolean deliverPointsInCashback;

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
     * Obtiene el valor de la propiedad isGIFT.
     * 
     */
    public boolean isIsGIFT() {
        return isGIFT;
    }

    /**
     * Define el valor de la propiedad isGIFT.
     * 
     */
    public void setIsGIFT(boolean value) {
        this.isGIFT = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverPointsInChargeCredits.
     * 
     */
    public boolean isDeliverPointsInChargeCredits() {
        return deliverPointsInChargeCredits;
    }

    /**
     * Define el valor de la propiedad deliverPointsInChargeCredits.
     * 
     */
    public void setDeliverPointsInChargeCredits(boolean value) {
        this.deliverPointsInChargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverPointsInDischargeCredits.
     * 
     */
    public boolean isDeliverPointsInDischargeCredits() {
        return deliverPointsInDischargeCredits;
    }

    /**
     * Define el valor de la propiedad deliverPointsInDischargeCredits.
     * 
     */
    public void setDeliverPointsInDischargeCredits(boolean value) {
        this.deliverPointsInDischargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverPointsInSale.
     * 
     */
    public boolean isDeliverPointsInSale() {
        return deliverPointsInSale;
    }

    /**
     * Define el valor de la propiedad deliverPointsInSale.
     * 
     */
    public void setDeliverPointsInSale(boolean value) {
        this.deliverPointsInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverPointsInActivation.
     * 
     */
    public boolean isDeliverPointsInActivation() {
        return deliverPointsInActivation;
    }

    /**
     * Define el valor de la propiedad deliverPointsInActivation.
     * 
     */
    public void setDeliverPointsInActivation(boolean value) {
        this.deliverPointsInActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad showPointsInActivationTicket.
     * 
     */
    public boolean isShowPointsInActivationTicket() {
        return showPointsInActivationTicket;
    }

    /**
     * Define el valor de la propiedad showPointsInActivationTicket.
     * 
     */
    public void setShowPointsInActivationTicket(boolean value) {
        this.showPointsInActivationTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad showMoney4PointsInTicket.
     * 
     */
    public boolean isShowMoney4PointsInTicket() {
        return showMoney4PointsInTicket;
    }

    /**
     * Define el valor de la propiedad showMoney4PointsInTicket.
     * 
     */
    public void setShowMoney4PointsInTicket(boolean value) {
        this.showMoney4PointsInTicket = value;
    }

    /**
     * Obtiene el valor de la propiedad useExpirationCard.
     * 
     */
    public boolean isUseExpirationCard() {
        return useExpirationCard;
    }

    /**
     * Define el valor de la propiedad useExpirationCard.
     * 
     */
    public void setUseExpirationCard(boolean value) {
        this.useExpirationCard = value;
    }

    /**
     * Obtiene el valor de la propiedad customerOnlyAllowInActivationShop.
     * 
     */
    public boolean isCustomerOnlyAllowInActivationShop() {
        return customerOnlyAllowInActivationShop;
    }

    /**
     * Define el valor de la propiedad customerOnlyAllowInActivationShop.
     * 
     */
    public void setCustomerOnlyAllowInActivationShop(boolean value) {
        this.customerOnlyAllowInActivationShop = value;
    }

    /**
     * Obtiene el valor de la propiedad registerActivationPointsInCampaign.
     * 
     */
    public boolean isRegisterActivationPointsInCampaign() {
        return registerActivationPointsInCampaign;
    }

    /**
     * Define el valor de la propiedad registerActivationPointsInCampaign.
     * 
     */
    public void setRegisterActivationPointsInCampaign(boolean value) {
        this.registerActivationPointsInCampaign = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyOneUse.
     * 
     */
    public boolean isOnlyOneUse() {
        return onlyOneUse;
    }

    /**
     * Define el valor de la propiedad onlyOneUse.
     * 
     */
    public void setOnlyOneUse(boolean value) {
        this.onlyOneUse = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerCategory.
     * 
     */
    public boolean isSellerCategory() {
        return sellerCategory;
    }

    /**
     * Define el valor de la propiedad sellerCategory.
     * 
     */
    public void setSellerCategory(boolean value) {
        this.sellerCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad checkMinimalLimitDischargePoints.
     * 
     */
    public boolean isCheckMinimalLimitDischargePoints() {
        return checkMinimalLimitDischargePoints;
    }

    /**
     * Define el valor de la propiedad checkMinimalLimitDischargePoints.
     * 
     */
    public void setCheckMinimalLimitDischargePoints(boolean value) {
        this.checkMinimalLimitDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad checkCanNotTransaction.
     * 
     */
    public boolean isCheckCanNotTransaction() {
        return checkCanNotTransaction;
    }

    /**
     * Define el valor de la propiedad checkCanNotTransaction.
     * 
     */
    public void setCheckCanNotTransaction(boolean value) {
        this.checkCanNotTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad dealerCategory.
     * 
     */
    public boolean isDealerCategory() {
        return dealerCategory;
    }

    /**
     * Define el valor de la propiedad dealerCategory.
     * 
     */
    public void setDealerCategory(boolean value) {
        this.dealerCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverPointsInCashback.
     * 
     */
    public boolean isDeliverPointsInCashback() {
        return deliverPointsInCashback;
    }

    /**
     * Define el valor de la propiedad deliverPointsInCashback.
     * 
     */
    public void setDeliverPointsInCashback(boolean value) {
        this.deliverPointsInCashback = value;
    }

}
