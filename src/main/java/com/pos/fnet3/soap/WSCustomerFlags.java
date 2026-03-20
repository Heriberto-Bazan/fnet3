
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="activatedFromPointsCharge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="nameChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="failCardActivation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="migratedFromFNet1" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="migratedFromFNet2" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="fatherExtension" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="activatedOfflineWithoutPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="merged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="imported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="wonPointsByCompleteAllData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="decrementCardStockByImport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="notGivePointsOnActivationFromExternalComponent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="fatherFamilyCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "activatedFromPointsCharge",
    "nameChanged",
    "failCardActivation",
    "migratedFromFNet1",
    "migratedFromFNet2",
    "fatherExtension",
    "activatedOfflineWithoutPoints",
    "merged",
    "imported",
    "wonPointsByCompleteAllData",
    "decrementCardStockByImport",
    "notGivePointsOnActivationFromExternalComponent",
    "fatherFamilyCard"
})
public class WSCustomerFlags {

    protected long flags;
    protected boolean activatedFromPointsCharge;
    protected boolean nameChanged;
    protected boolean failCardActivation;
    protected boolean migratedFromFNet1;
    protected boolean migratedFromFNet2;
    protected boolean fatherExtension;
    protected boolean activatedOfflineWithoutPoints;
    protected boolean merged;
    protected boolean imported;
    protected boolean wonPointsByCompleteAllData;
    protected boolean decrementCardStockByImport;
    protected boolean notGivePointsOnActivationFromExternalComponent;
    protected boolean fatherFamilyCard;

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
     * Obtiene el valor de la propiedad activatedFromPointsCharge.
     * 
     */
    public boolean isActivatedFromPointsCharge() {
        return activatedFromPointsCharge;
    }

    /**
     * Define el valor de la propiedad activatedFromPointsCharge.
     * 
     */
    public void setActivatedFromPointsCharge(boolean value) {
        this.activatedFromPointsCharge = value;
    }

    /**
     * Obtiene el valor de la propiedad nameChanged.
     * 
     */
    public boolean isNameChanged() {
        return nameChanged;
    }

    /**
     * Define el valor de la propiedad nameChanged.
     * 
     */
    public void setNameChanged(boolean value) {
        this.nameChanged = value;
    }

    /**
     * Obtiene el valor de la propiedad failCardActivation.
     * 
     */
    public boolean isFailCardActivation() {
        return failCardActivation;
    }

    /**
     * Define el valor de la propiedad failCardActivation.
     * 
     */
    public void setFailCardActivation(boolean value) {
        this.failCardActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad migratedFromFNet1.
     * 
     */
    public boolean isMigratedFromFNet1() {
        return migratedFromFNet1;
    }

    /**
     * Define el valor de la propiedad migratedFromFNet1.
     * 
     */
    public void setMigratedFromFNet1(boolean value) {
        this.migratedFromFNet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad migratedFromFNet2.
     * 
     */
    public boolean isMigratedFromFNet2() {
        return migratedFromFNet2;
    }

    /**
     * Define el valor de la propiedad migratedFromFNet2.
     * 
     */
    public void setMigratedFromFNet2(boolean value) {
        this.migratedFromFNet2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fatherExtension.
     * 
     */
    public boolean isFatherExtension() {
        return fatherExtension;
    }

    /**
     * Define el valor de la propiedad fatherExtension.
     * 
     */
    public void setFatherExtension(boolean value) {
        this.fatherExtension = value;
    }

    /**
     * Obtiene el valor de la propiedad activatedOfflineWithoutPoints.
     * 
     */
    public boolean isActivatedOfflineWithoutPoints() {
        return activatedOfflineWithoutPoints;
    }

    /**
     * Define el valor de la propiedad activatedOfflineWithoutPoints.
     * 
     */
    public void setActivatedOfflineWithoutPoints(boolean value) {
        this.activatedOfflineWithoutPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad merged.
     * 
     */
    public boolean isMerged() {
        return merged;
    }

    /**
     * Define el valor de la propiedad merged.
     * 
     */
    public void setMerged(boolean value) {
        this.merged = value;
    }

    /**
     * Obtiene el valor de la propiedad imported.
     * 
     */
    public boolean isImported() {
        return imported;
    }

    /**
     * Define el valor de la propiedad imported.
     * 
     */
    public void setImported(boolean value) {
        this.imported = value;
    }

    /**
     * Obtiene el valor de la propiedad wonPointsByCompleteAllData.
     * 
     */
    public boolean isWonPointsByCompleteAllData() {
        return wonPointsByCompleteAllData;
    }

    /**
     * Define el valor de la propiedad wonPointsByCompleteAllData.
     * 
     */
    public void setWonPointsByCompleteAllData(boolean value) {
        this.wonPointsByCompleteAllData = value;
    }

    /**
     * Obtiene el valor de la propiedad decrementCardStockByImport.
     * 
     */
    public boolean isDecrementCardStockByImport() {
        return decrementCardStockByImport;
    }

    /**
     * Define el valor de la propiedad decrementCardStockByImport.
     * 
     */
    public void setDecrementCardStockByImport(boolean value) {
        this.decrementCardStockByImport = value;
    }

    /**
     * Obtiene el valor de la propiedad notGivePointsOnActivationFromExternalComponent.
     * 
     */
    public boolean isNotGivePointsOnActivationFromExternalComponent() {
        return notGivePointsOnActivationFromExternalComponent;
    }

    /**
     * Define el valor de la propiedad notGivePointsOnActivationFromExternalComponent.
     * 
     */
    public void setNotGivePointsOnActivationFromExternalComponent(boolean value) {
        this.notGivePointsOnActivationFromExternalComponent = value;
    }

    /**
     * Obtiene el valor de la propiedad fatherFamilyCard.
     * 
     */
    public boolean isFatherFamilyCard() {
        return fatherFamilyCard;
    }

    /**
     * Define el valor de la propiedad fatherFamilyCard.
     * 
     */
    public void setFatherFamilyCard(boolean value) {
        this.fatherFamilyCard = value;
    }

}
