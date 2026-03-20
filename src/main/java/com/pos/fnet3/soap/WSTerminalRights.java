
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_TerminalRights complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_TerminalRights">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rights" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="canDoNewCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canChargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDischargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canChargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDoSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canApplyDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canAceptVouchers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDeliverPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canLockCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canUnlockCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canReplaceCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canSearchCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canExchangePrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDeliverPrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canExtendExpirationDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canModifyCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canDeliverStatusPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canRequestPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canCancelMovement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="canTransferPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalRights", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "rights",
    "canDoNewCard",
    "canChargeCredits",
    "canDischargeCredits",
    "canChargePoints",
    "canDischargePoints",
    "canDoSale",
    "canApplyDiscount",
    "canAceptVouchers",
    "canDeliverPromotions",
    "canLockCard",
    "canUnlockCard",
    "canReplaceCard",
    "canSearchCustomer",
    "canExchangePrizes",
    "canDeliverPrizes",
    "canExtendExpirationDate",
    "canModifyCategory",
    "canDeliverStatusPoints",
    "canRequestPoints",
    "canCancelMovement",
    "canTransferPoints"
})
public class WSTerminalRights {

    protected long rights;
    protected boolean canDoNewCard;
    protected boolean canChargeCredits;
    protected boolean canDischargeCredits;
    protected boolean canChargePoints;
    protected boolean canDischargePoints;
    protected boolean canDoSale;
    protected boolean canApplyDiscount;
    protected boolean canAceptVouchers;
    protected boolean canDeliverPromotions;
    protected boolean canLockCard;
    protected boolean canUnlockCard;
    protected boolean canReplaceCard;
    protected boolean canSearchCustomer;
    protected boolean canExchangePrizes;
    protected boolean canDeliverPrizes;
    protected boolean canExtendExpirationDate;
    protected boolean canModifyCategory;
    protected boolean canDeliverStatusPoints;
    protected boolean canRequestPoints;
    protected boolean canCancelMovement;
    protected boolean canTransferPoints;

    /**
     * Obtiene el valor de la propiedad rights.
     * 
     */
    public long getRights() {
        return rights;
    }

    /**
     * Define el valor de la propiedad rights.
     * 
     */
    public void setRights(long value) {
        this.rights = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoNewCard.
     * 
     */
    public boolean isCanDoNewCard() {
        return canDoNewCard;
    }

    /**
     * Define el valor de la propiedad canDoNewCard.
     * 
     */
    public void setCanDoNewCard(boolean value) {
        this.canDoNewCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canChargeCredits.
     * 
     */
    public boolean isCanChargeCredits() {
        return canChargeCredits;
    }

    /**
     * Define el valor de la propiedad canChargeCredits.
     * 
     */
    public void setCanChargeCredits(boolean value) {
        this.canChargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad canDischargeCredits.
     * 
     */
    public boolean isCanDischargeCredits() {
        return canDischargeCredits;
    }

    /**
     * Define el valor de la propiedad canDischargeCredits.
     * 
     */
    public void setCanDischargeCredits(boolean value) {
        this.canDischargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad canChargePoints.
     * 
     */
    public boolean isCanChargePoints() {
        return canChargePoints;
    }

    /**
     * Define el valor de la propiedad canChargePoints.
     * 
     */
    public void setCanChargePoints(boolean value) {
        this.canChargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canDischargePoints.
     * 
     */
    public boolean isCanDischargePoints() {
        return canDischargePoints;
    }

    /**
     * Define el valor de la propiedad canDischargePoints.
     * 
     */
    public void setCanDischargePoints(boolean value) {
        this.canDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoSale.
     * 
     */
    public boolean isCanDoSale() {
        return canDoSale;
    }

    /**
     * Define el valor de la propiedad canDoSale.
     * 
     */
    public void setCanDoSale(boolean value) {
        this.canDoSale = value;
    }

    /**
     * Obtiene el valor de la propiedad canApplyDiscount.
     * 
     */
    public boolean isCanApplyDiscount() {
        return canApplyDiscount;
    }

    /**
     * Define el valor de la propiedad canApplyDiscount.
     * 
     */
    public void setCanApplyDiscount(boolean value) {
        this.canApplyDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad canAceptVouchers.
     * 
     */
    public boolean isCanAceptVouchers() {
        return canAceptVouchers;
    }

    /**
     * Define el valor de la propiedad canAceptVouchers.
     * 
     */
    public void setCanAceptVouchers(boolean value) {
        this.canAceptVouchers = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverPromotions.
     * 
     */
    public boolean isCanDeliverPromotions() {
        return canDeliverPromotions;
    }

    /**
     * Define el valor de la propiedad canDeliverPromotions.
     * 
     */
    public void setCanDeliverPromotions(boolean value) {
        this.canDeliverPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad canLockCard.
     * 
     */
    public boolean isCanLockCard() {
        return canLockCard;
    }

    /**
     * Define el valor de la propiedad canLockCard.
     * 
     */
    public void setCanLockCard(boolean value) {
        this.canLockCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canUnlockCard.
     * 
     */
    public boolean isCanUnlockCard() {
        return canUnlockCard;
    }

    /**
     * Define el valor de la propiedad canUnlockCard.
     * 
     */
    public void setCanUnlockCard(boolean value) {
        this.canUnlockCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canReplaceCard.
     * 
     */
    public boolean isCanReplaceCard() {
        return canReplaceCard;
    }

    /**
     * Define el valor de la propiedad canReplaceCard.
     * 
     */
    public void setCanReplaceCard(boolean value) {
        this.canReplaceCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canSearchCustomer.
     * 
     */
    public boolean isCanSearchCustomer() {
        return canSearchCustomer;
    }

    /**
     * Define el valor de la propiedad canSearchCustomer.
     * 
     */
    public void setCanSearchCustomer(boolean value) {
        this.canSearchCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad canExchangePrizes.
     * 
     */
    public boolean isCanExchangePrizes() {
        return canExchangePrizes;
    }

    /**
     * Define el valor de la propiedad canExchangePrizes.
     * 
     */
    public void setCanExchangePrizes(boolean value) {
        this.canExchangePrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverPrizes.
     * 
     */
    public boolean isCanDeliverPrizes() {
        return canDeliverPrizes;
    }

    /**
     * Define el valor de la propiedad canDeliverPrizes.
     * 
     */
    public void setCanDeliverPrizes(boolean value) {
        this.canDeliverPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad canExtendExpirationDate.
     * 
     */
    public boolean isCanExtendExpirationDate() {
        return canExtendExpirationDate;
    }

    /**
     * Define el valor de la propiedad canExtendExpirationDate.
     * 
     */
    public void setCanExtendExpirationDate(boolean value) {
        this.canExtendExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad canModifyCategory.
     * 
     */
    public boolean isCanModifyCategory() {
        return canModifyCategory;
    }

    /**
     * Define el valor de la propiedad canModifyCategory.
     * 
     */
    public void setCanModifyCategory(boolean value) {
        this.canModifyCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverStatusPoints.
     * 
     */
    public boolean isCanDeliverStatusPoints() {
        return canDeliverStatusPoints;
    }

    /**
     * Define el valor de la propiedad canDeliverStatusPoints.
     * 
     */
    public void setCanDeliverStatusPoints(boolean value) {
        this.canDeliverStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canRequestPoints.
     * 
     */
    public boolean isCanRequestPoints() {
        return canRequestPoints;
    }

    /**
     * Define el valor de la propiedad canRequestPoints.
     * 
     */
    public void setCanRequestPoints(boolean value) {
        this.canRequestPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canCancelMovement.
     * 
     */
    public boolean isCanCancelMovement() {
        return canCancelMovement;
    }

    /**
     * Define el valor de la propiedad canCancelMovement.
     * 
     */
    public void setCanCancelMovement(boolean value) {
        this.canCancelMovement = value;
    }

    /**
     * Obtiene el valor de la propiedad canTransferPoints.
     * 
     */
    public boolean isCanTransferPoints() {
        return canTransferPoints;
    }

    /**
     * Define el valor de la propiedad canTransferPoints.
     * 
     */
    public void setCanTransferPoints(boolean value) {
        this.canTransferPoints = value;
    }

}
