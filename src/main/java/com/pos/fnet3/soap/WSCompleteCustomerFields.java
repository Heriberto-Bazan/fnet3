
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CompleteCustomerFields complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CompleteCustomerFields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="showName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showSurname" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatorySurname" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showAddressPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryAddressPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showZipCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryZipCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCountry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryCountry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showGeoLevels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryGeoLevels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showDNI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryDNI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showTelephone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryTelephone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showMobile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryMobile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showGender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryGender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showNotes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryNotes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCustomerDataCanBeUsedForPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryCustomerDataCanBeUsedForPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCustomerDataCanBeUsedForStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryCustomerDataCanBeUsedForStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCustomerDataCanBeUsedByOthers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryCustomerDataCanBeUsedByOthers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryCustomerDataCanGetCurrentLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryComunicaVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryInterestAreas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCustomerDataCanGetCurrentLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showComunicaVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showInterestAreas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCustomerDataCanBeUsedForPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCustomerDataCanBeUsedForStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCustomerDataCanBeUsedByOthers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCustomerDataCanGetCurrentLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyComunicaVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyInterestAreas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlySurname" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyAddressPrefix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyZipCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCountry" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyGeoLevels" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyDNI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyDNIType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyTelephone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyFax" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyMobile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyGender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyNotes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyCanNotModCustInTerminals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showDNIType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryDNIType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryZone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showCanNotModCustInTerminals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="mandatoryCanNotModCustInTerminals" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showAccountNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryAccountNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyAccountNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="showFrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="isMandatoryFrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="readOnlyFrequentFlyerNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CompleteCustomerFields", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "showName",
    "isMandatoryName",
    "showSurname",
    "isMandatorySurname",
    "showBirthdate",
    "isMandatoryBirthdate",
    "showAddress",
    "isMandatoryAddress",
    "showAddressPrefix",
    "isMandatoryAddressPrefix",
    "showZipCode",
    "isMandatoryZipCode",
    "showCountry",
    "isMandatoryCountry",
    "showGeoLevels",
    "isMandatoryGeoLevels",
    "showDNI",
    "isMandatoryDNI",
    "showTelephone",
    "isMandatoryTelephone",
    "showFax",
    "isMandatoryFax",
    "showMobile",
    "isMandatoryMobile",
    "showEmail",
    "isMandatoryEmail",
    "showGender",
    "isMandatoryGender",
    "showNotes",
    "isMandatoryNotes",
    "showCustomerDataCanBeUsedForPromotions",
    "isMandatoryCustomerDataCanBeUsedForPromotions",
    "showCustomerDataCanBeUsedForStatistics",
    "isMandatoryCustomerDataCanBeUsedForStatistics",
    "showCustomerDataCanBeUsedByOthers",
    "isMandatoryCustomerDataCanBeUsedByOthers",
    "mandatoryCustomerDataCanGetCurrentLocation",
    "mandatoryComunicaVerification",
    "mandatoryInterestAreas",
    "showCustomerDataCanGetCurrentLocation",
    "showComunicaVerification",
    "showInterestAreas",
    "readOnlyCustomerDataCanBeUsedForPromotions",
    "readOnlyCustomerDataCanBeUsedForStatistics",
    "readOnlyCustomerDataCanBeUsedByOthers",
    "readOnlyCustomerDataCanGetCurrentLocation",
    "readOnlyComunicaVerification",
    "readOnlyInterestAreas",
    "readOnlyName",
    "readOnlySurname",
    "readOnlyBirthdate",
    "readOnlyAddress",
    "readOnlyAddressPrefix",
    "readOnlyZipCode",
    "readOnlyCountry",
    "readOnlyGeoLevels",
    "readOnlyDNI",
    "readOnlyDNIType",
    "readOnlyTelephone",
    "readOnlyFax",
    "readOnlyMobile",
    "readOnlyEmail",
    "readOnlyGender",
    "readOnlyNotes",
    "readOnlyZone",
    "readOnlyCanNotModCustInTerminals",
    "showDNIType",
    "mandatoryDNIType",
    "showZone",
    "mandatoryZone",
    "showCanNotModCustInTerminals",
    "mandatoryCanNotModCustInTerminals",
    "showAccountNumber",
    "isMandatoryAccountNumber",
    "readOnlyAccountNumber",
    "showFrequentFlyerNumber",
    "isMandatoryFrequentFlyerNumber",
    "readOnlyFrequentFlyerNumber"
})
public class WSCompleteCustomerFields {

    protected boolean showName;
    protected boolean isMandatoryName;
    protected boolean showSurname;
    protected boolean isMandatorySurname;
    protected boolean showBirthdate;
    protected boolean isMandatoryBirthdate;
    protected boolean showAddress;
    protected boolean isMandatoryAddress;
    protected boolean showAddressPrefix;
    protected boolean isMandatoryAddressPrefix;
    protected boolean showZipCode;
    protected boolean isMandatoryZipCode;
    protected boolean showCountry;
    protected boolean isMandatoryCountry;
    protected boolean showGeoLevels;
    protected boolean isMandatoryGeoLevels;
    protected boolean showDNI;
    protected boolean isMandatoryDNI;
    protected boolean showTelephone;
    protected boolean isMandatoryTelephone;
    protected boolean showFax;
    protected boolean isMandatoryFax;
    protected boolean showMobile;
    protected boolean isMandatoryMobile;
    protected boolean showEmail;
    protected boolean isMandatoryEmail;
    protected boolean showGender;
    protected boolean isMandatoryGender;
    protected boolean showNotes;
    protected boolean isMandatoryNotes;
    protected boolean showCustomerDataCanBeUsedForPromotions;
    protected boolean isMandatoryCustomerDataCanBeUsedForPromotions;
    protected boolean showCustomerDataCanBeUsedForStatistics;
    protected boolean isMandatoryCustomerDataCanBeUsedForStatistics;
    protected boolean showCustomerDataCanBeUsedByOthers;
    protected boolean isMandatoryCustomerDataCanBeUsedByOthers;
    protected boolean mandatoryCustomerDataCanGetCurrentLocation;
    protected boolean mandatoryComunicaVerification;
    protected boolean mandatoryInterestAreas;
    protected boolean showCustomerDataCanGetCurrentLocation;
    protected boolean showComunicaVerification;
    protected boolean showInterestAreas;
    protected boolean readOnlyCustomerDataCanBeUsedForPromotions;
    protected boolean readOnlyCustomerDataCanBeUsedForStatistics;
    protected boolean readOnlyCustomerDataCanBeUsedByOthers;
    protected boolean readOnlyCustomerDataCanGetCurrentLocation;
    protected boolean readOnlyComunicaVerification;
    protected boolean readOnlyInterestAreas;
    protected boolean readOnlyName;
    protected boolean readOnlySurname;
    protected boolean readOnlyBirthdate;
    protected boolean readOnlyAddress;
    protected boolean readOnlyAddressPrefix;
    protected boolean readOnlyZipCode;
    protected boolean readOnlyCountry;
    protected boolean readOnlyGeoLevels;
    protected boolean readOnlyDNI;
    protected boolean readOnlyDNIType;
    protected boolean readOnlyTelephone;
    protected boolean readOnlyFax;
    protected boolean readOnlyMobile;
    protected boolean readOnlyEmail;
    protected boolean readOnlyGender;
    protected boolean readOnlyNotes;
    protected boolean readOnlyZone;
    protected boolean readOnlyCanNotModCustInTerminals;
    protected boolean showDNIType;
    protected boolean mandatoryDNIType;
    protected boolean showZone;
    protected boolean mandatoryZone;
    protected boolean showCanNotModCustInTerminals;
    protected boolean mandatoryCanNotModCustInTerminals;
    protected boolean showAccountNumber;
    protected boolean isMandatoryAccountNumber;
    protected boolean readOnlyAccountNumber;
    protected boolean showFrequentFlyerNumber;
    protected boolean isMandatoryFrequentFlyerNumber;
    protected boolean readOnlyFrequentFlyerNumber;

    /**
     * Obtiene el valor de la propiedad showName.
     * 
     */
    public boolean isShowName() {
        return showName;
    }

    /**
     * Define el valor de la propiedad showName.
     * 
     */
    public void setShowName(boolean value) {
        this.showName = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryName.
     * 
     */
    public boolean isIsMandatoryName() {
        return isMandatoryName;
    }

    /**
     * Define el valor de la propiedad isMandatoryName.
     * 
     */
    public void setIsMandatoryName(boolean value) {
        this.isMandatoryName = value;
    }

    /**
     * Obtiene el valor de la propiedad showSurname.
     * 
     */
    public boolean isShowSurname() {
        return showSurname;
    }

    /**
     * Define el valor de la propiedad showSurname.
     * 
     */
    public void setShowSurname(boolean value) {
        this.showSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatorySurname.
     * 
     */
    public boolean isIsMandatorySurname() {
        return isMandatorySurname;
    }

    /**
     * Define el valor de la propiedad isMandatorySurname.
     * 
     */
    public void setIsMandatorySurname(boolean value) {
        this.isMandatorySurname = value;
    }

    /**
     * Obtiene el valor de la propiedad showBirthdate.
     * 
     */
    public boolean isShowBirthdate() {
        return showBirthdate;
    }

    /**
     * Define el valor de la propiedad showBirthdate.
     * 
     */
    public void setShowBirthdate(boolean value) {
        this.showBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryBirthdate.
     * 
     */
    public boolean isIsMandatoryBirthdate() {
        return isMandatoryBirthdate;
    }

    /**
     * Define el valor de la propiedad isMandatoryBirthdate.
     * 
     */
    public void setIsMandatoryBirthdate(boolean value) {
        this.isMandatoryBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad showAddress.
     * 
     */
    public boolean isShowAddress() {
        return showAddress;
    }

    /**
     * Define el valor de la propiedad showAddress.
     * 
     */
    public void setShowAddress(boolean value) {
        this.showAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryAddress.
     * 
     */
    public boolean isIsMandatoryAddress() {
        return isMandatoryAddress;
    }

    /**
     * Define el valor de la propiedad isMandatoryAddress.
     * 
     */
    public void setIsMandatoryAddress(boolean value) {
        this.isMandatoryAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad showAddressPrefix.
     * 
     */
    public boolean isShowAddressPrefix() {
        return showAddressPrefix;
    }

    /**
     * Define el valor de la propiedad showAddressPrefix.
     * 
     */
    public void setShowAddressPrefix(boolean value) {
        this.showAddressPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryAddressPrefix.
     * 
     */
    public boolean isIsMandatoryAddressPrefix() {
        return isMandatoryAddressPrefix;
    }

    /**
     * Define el valor de la propiedad isMandatoryAddressPrefix.
     * 
     */
    public void setIsMandatoryAddressPrefix(boolean value) {
        this.isMandatoryAddressPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad showZipCode.
     * 
     */
    public boolean isShowZipCode() {
        return showZipCode;
    }

    /**
     * Define el valor de la propiedad showZipCode.
     * 
     */
    public void setShowZipCode(boolean value) {
        this.showZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryZipCode.
     * 
     */
    public boolean isIsMandatoryZipCode() {
        return isMandatoryZipCode;
    }

    /**
     * Define el valor de la propiedad isMandatoryZipCode.
     * 
     */
    public void setIsMandatoryZipCode(boolean value) {
        this.isMandatoryZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad showCountry.
     * 
     */
    public boolean isShowCountry() {
        return showCountry;
    }

    /**
     * Define el valor de la propiedad showCountry.
     * 
     */
    public void setShowCountry(boolean value) {
        this.showCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryCountry.
     * 
     */
    public boolean isIsMandatoryCountry() {
        return isMandatoryCountry;
    }

    /**
     * Define el valor de la propiedad isMandatoryCountry.
     * 
     */
    public void setIsMandatoryCountry(boolean value) {
        this.isMandatoryCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad showGeoLevels.
     * 
     */
    public boolean isShowGeoLevels() {
        return showGeoLevels;
    }

    /**
     * Define el valor de la propiedad showGeoLevels.
     * 
     */
    public void setShowGeoLevels(boolean value) {
        this.showGeoLevels = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryGeoLevels.
     * 
     */
    public boolean isIsMandatoryGeoLevels() {
        return isMandatoryGeoLevels;
    }

    /**
     * Define el valor de la propiedad isMandatoryGeoLevels.
     * 
     */
    public void setIsMandatoryGeoLevels(boolean value) {
        this.isMandatoryGeoLevels = value;
    }

    /**
     * Obtiene el valor de la propiedad showDNI.
     * 
     */
    public boolean isShowDNI() {
        return showDNI;
    }

    /**
     * Define el valor de la propiedad showDNI.
     * 
     */
    public void setShowDNI(boolean value) {
        this.showDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryDNI.
     * 
     */
    public boolean isIsMandatoryDNI() {
        return isMandatoryDNI;
    }

    /**
     * Define el valor de la propiedad isMandatoryDNI.
     * 
     */
    public void setIsMandatoryDNI(boolean value) {
        this.isMandatoryDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad showTelephone.
     * 
     */
    public boolean isShowTelephone() {
        return showTelephone;
    }

    /**
     * Define el valor de la propiedad showTelephone.
     * 
     */
    public void setShowTelephone(boolean value) {
        this.showTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryTelephone.
     * 
     */
    public boolean isIsMandatoryTelephone() {
        return isMandatoryTelephone;
    }

    /**
     * Define el valor de la propiedad isMandatoryTelephone.
     * 
     */
    public void setIsMandatoryTelephone(boolean value) {
        this.isMandatoryTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad showFax.
     * 
     */
    public boolean isShowFax() {
        return showFax;
    }

    /**
     * Define el valor de la propiedad showFax.
     * 
     */
    public void setShowFax(boolean value) {
        this.showFax = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryFax.
     * 
     */
    public boolean isIsMandatoryFax() {
        return isMandatoryFax;
    }

    /**
     * Define el valor de la propiedad isMandatoryFax.
     * 
     */
    public void setIsMandatoryFax(boolean value) {
        this.isMandatoryFax = value;
    }

    /**
     * Obtiene el valor de la propiedad showMobile.
     * 
     */
    public boolean isShowMobile() {
        return showMobile;
    }

    /**
     * Define el valor de la propiedad showMobile.
     * 
     */
    public void setShowMobile(boolean value) {
        this.showMobile = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryMobile.
     * 
     */
    public boolean isIsMandatoryMobile() {
        return isMandatoryMobile;
    }

    /**
     * Define el valor de la propiedad isMandatoryMobile.
     * 
     */
    public void setIsMandatoryMobile(boolean value) {
        this.isMandatoryMobile = value;
    }

    /**
     * Obtiene el valor de la propiedad showEmail.
     * 
     */
    public boolean isShowEmail() {
        return showEmail;
    }

    /**
     * Define el valor de la propiedad showEmail.
     * 
     */
    public void setShowEmail(boolean value) {
        this.showEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryEmail.
     * 
     */
    public boolean isIsMandatoryEmail() {
        return isMandatoryEmail;
    }

    /**
     * Define el valor de la propiedad isMandatoryEmail.
     * 
     */
    public void setIsMandatoryEmail(boolean value) {
        this.isMandatoryEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad showGender.
     * 
     */
    public boolean isShowGender() {
        return showGender;
    }

    /**
     * Define el valor de la propiedad showGender.
     * 
     */
    public void setShowGender(boolean value) {
        this.showGender = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryGender.
     * 
     */
    public boolean isIsMandatoryGender() {
        return isMandatoryGender;
    }

    /**
     * Define el valor de la propiedad isMandatoryGender.
     * 
     */
    public void setIsMandatoryGender(boolean value) {
        this.isMandatoryGender = value;
    }

    /**
     * Obtiene el valor de la propiedad showNotes.
     * 
     */
    public boolean isShowNotes() {
        return showNotes;
    }

    /**
     * Define el valor de la propiedad showNotes.
     * 
     */
    public void setShowNotes(boolean value) {
        this.showNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryNotes.
     * 
     */
    public boolean isIsMandatoryNotes() {
        return isMandatoryNotes;
    }

    /**
     * Define el valor de la propiedad isMandatoryNotes.
     * 
     */
    public void setIsMandatoryNotes(boolean value) {
        this.isMandatoryNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad showCustomerDataCanBeUsedForPromotions.
     * 
     */
    public boolean isShowCustomerDataCanBeUsedForPromotions() {
        return showCustomerDataCanBeUsedForPromotions;
    }

    /**
     * Define el valor de la propiedad showCustomerDataCanBeUsedForPromotions.
     * 
     */
    public void setShowCustomerDataCanBeUsedForPromotions(boolean value) {
        this.showCustomerDataCanBeUsedForPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryCustomerDataCanBeUsedForPromotions.
     * 
     */
    public boolean isIsMandatoryCustomerDataCanBeUsedForPromotions() {
        return isMandatoryCustomerDataCanBeUsedForPromotions;
    }

    /**
     * Define el valor de la propiedad isMandatoryCustomerDataCanBeUsedForPromotions.
     * 
     */
    public void setIsMandatoryCustomerDataCanBeUsedForPromotions(boolean value) {
        this.isMandatoryCustomerDataCanBeUsedForPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad showCustomerDataCanBeUsedForStatistics.
     * 
     */
    public boolean isShowCustomerDataCanBeUsedForStatistics() {
        return showCustomerDataCanBeUsedForStatistics;
    }

    /**
     * Define el valor de la propiedad showCustomerDataCanBeUsedForStatistics.
     * 
     */
    public void setShowCustomerDataCanBeUsedForStatistics(boolean value) {
        this.showCustomerDataCanBeUsedForStatistics = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryCustomerDataCanBeUsedForStatistics.
     * 
     */
    public boolean isIsMandatoryCustomerDataCanBeUsedForStatistics() {
        return isMandatoryCustomerDataCanBeUsedForStatistics;
    }

    /**
     * Define el valor de la propiedad isMandatoryCustomerDataCanBeUsedForStatistics.
     * 
     */
    public void setIsMandatoryCustomerDataCanBeUsedForStatistics(boolean value) {
        this.isMandatoryCustomerDataCanBeUsedForStatistics = value;
    }

    /**
     * Obtiene el valor de la propiedad showCustomerDataCanBeUsedByOthers.
     * 
     */
    public boolean isShowCustomerDataCanBeUsedByOthers() {
        return showCustomerDataCanBeUsedByOthers;
    }

    /**
     * Define el valor de la propiedad showCustomerDataCanBeUsedByOthers.
     * 
     */
    public void setShowCustomerDataCanBeUsedByOthers(boolean value) {
        this.showCustomerDataCanBeUsedByOthers = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryCustomerDataCanBeUsedByOthers.
     * 
     */
    public boolean isIsMandatoryCustomerDataCanBeUsedByOthers() {
        return isMandatoryCustomerDataCanBeUsedByOthers;
    }

    /**
     * Define el valor de la propiedad isMandatoryCustomerDataCanBeUsedByOthers.
     * 
     */
    public void setIsMandatoryCustomerDataCanBeUsedByOthers(boolean value) {
        this.isMandatoryCustomerDataCanBeUsedByOthers = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryCustomerDataCanGetCurrentLocation.
     * 
     */
    public boolean isMandatoryCustomerDataCanGetCurrentLocation() {
        return mandatoryCustomerDataCanGetCurrentLocation;
    }

    /**
     * Define el valor de la propiedad mandatoryCustomerDataCanGetCurrentLocation.
     * 
     */
    public void setMandatoryCustomerDataCanGetCurrentLocation(boolean value) {
        this.mandatoryCustomerDataCanGetCurrentLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryComunicaVerification.
     * 
     */
    public boolean isMandatoryComunicaVerification() {
        return mandatoryComunicaVerification;
    }

    /**
     * Define el valor de la propiedad mandatoryComunicaVerification.
     * 
     */
    public void setMandatoryComunicaVerification(boolean value) {
        this.mandatoryComunicaVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryInterestAreas.
     * 
     */
    public boolean isMandatoryInterestAreas() {
        return mandatoryInterestAreas;
    }

    /**
     * Define el valor de la propiedad mandatoryInterestAreas.
     * 
     */
    public void setMandatoryInterestAreas(boolean value) {
        this.mandatoryInterestAreas = value;
    }

    /**
     * Obtiene el valor de la propiedad showCustomerDataCanGetCurrentLocation.
     * 
     */
    public boolean isShowCustomerDataCanGetCurrentLocation() {
        return showCustomerDataCanGetCurrentLocation;
    }

    /**
     * Define el valor de la propiedad showCustomerDataCanGetCurrentLocation.
     * 
     */
    public void setShowCustomerDataCanGetCurrentLocation(boolean value) {
        this.showCustomerDataCanGetCurrentLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad showComunicaVerification.
     * 
     */
    public boolean isShowComunicaVerification() {
        return showComunicaVerification;
    }

    /**
     * Define el valor de la propiedad showComunicaVerification.
     * 
     */
    public void setShowComunicaVerification(boolean value) {
        this.showComunicaVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad showInterestAreas.
     * 
     */
    public boolean isShowInterestAreas() {
        return showInterestAreas;
    }

    /**
     * Define el valor de la propiedad showInterestAreas.
     * 
     */
    public void setShowInterestAreas(boolean value) {
        this.showInterestAreas = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCustomerDataCanBeUsedForPromotions.
     * 
     */
    public boolean isReadOnlyCustomerDataCanBeUsedForPromotions() {
        return readOnlyCustomerDataCanBeUsedForPromotions;
    }

    /**
     * Define el valor de la propiedad readOnlyCustomerDataCanBeUsedForPromotions.
     * 
     */
    public void setReadOnlyCustomerDataCanBeUsedForPromotions(boolean value) {
        this.readOnlyCustomerDataCanBeUsedForPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCustomerDataCanBeUsedForStatistics.
     * 
     */
    public boolean isReadOnlyCustomerDataCanBeUsedForStatistics() {
        return readOnlyCustomerDataCanBeUsedForStatistics;
    }

    /**
     * Define el valor de la propiedad readOnlyCustomerDataCanBeUsedForStatistics.
     * 
     */
    public void setReadOnlyCustomerDataCanBeUsedForStatistics(boolean value) {
        this.readOnlyCustomerDataCanBeUsedForStatistics = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCustomerDataCanBeUsedByOthers.
     * 
     */
    public boolean isReadOnlyCustomerDataCanBeUsedByOthers() {
        return readOnlyCustomerDataCanBeUsedByOthers;
    }

    /**
     * Define el valor de la propiedad readOnlyCustomerDataCanBeUsedByOthers.
     * 
     */
    public void setReadOnlyCustomerDataCanBeUsedByOthers(boolean value) {
        this.readOnlyCustomerDataCanBeUsedByOthers = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCustomerDataCanGetCurrentLocation.
     * 
     */
    public boolean isReadOnlyCustomerDataCanGetCurrentLocation() {
        return readOnlyCustomerDataCanGetCurrentLocation;
    }

    /**
     * Define el valor de la propiedad readOnlyCustomerDataCanGetCurrentLocation.
     * 
     */
    public void setReadOnlyCustomerDataCanGetCurrentLocation(boolean value) {
        this.readOnlyCustomerDataCanGetCurrentLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyComunicaVerification.
     * 
     */
    public boolean isReadOnlyComunicaVerification() {
        return readOnlyComunicaVerification;
    }

    /**
     * Define el valor de la propiedad readOnlyComunicaVerification.
     * 
     */
    public void setReadOnlyComunicaVerification(boolean value) {
        this.readOnlyComunicaVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyInterestAreas.
     * 
     */
    public boolean isReadOnlyInterestAreas() {
        return readOnlyInterestAreas;
    }

    /**
     * Define el valor de la propiedad readOnlyInterestAreas.
     * 
     */
    public void setReadOnlyInterestAreas(boolean value) {
        this.readOnlyInterestAreas = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyName.
     * 
     */
    public boolean isReadOnlyName() {
        return readOnlyName;
    }

    /**
     * Define el valor de la propiedad readOnlyName.
     * 
     */
    public void setReadOnlyName(boolean value) {
        this.readOnlyName = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlySurname.
     * 
     */
    public boolean isReadOnlySurname() {
        return readOnlySurname;
    }

    /**
     * Define el valor de la propiedad readOnlySurname.
     * 
     */
    public void setReadOnlySurname(boolean value) {
        this.readOnlySurname = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyBirthdate.
     * 
     */
    public boolean isReadOnlyBirthdate() {
        return readOnlyBirthdate;
    }

    /**
     * Define el valor de la propiedad readOnlyBirthdate.
     * 
     */
    public void setReadOnlyBirthdate(boolean value) {
        this.readOnlyBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyAddress.
     * 
     */
    public boolean isReadOnlyAddress() {
        return readOnlyAddress;
    }

    /**
     * Define el valor de la propiedad readOnlyAddress.
     * 
     */
    public void setReadOnlyAddress(boolean value) {
        this.readOnlyAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyAddressPrefix.
     * 
     */
    public boolean isReadOnlyAddressPrefix() {
        return readOnlyAddressPrefix;
    }

    /**
     * Define el valor de la propiedad readOnlyAddressPrefix.
     * 
     */
    public void setReadOnlyAddressPrefix(boolean value) {
        this.readOnlyAddressPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyZipCode.
     * 
     */
    public boolean isReadOnlyZipCode() {
        return readOnlyZipCode;
    }

    /**
     * Define el valor de la propiedad readOnlyZipCode.
     * 
     */
    public void setReadOnlyZipCode(boolean value) {
        this.readOnlyZipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCountry.
     * 
     */
    public boolean isReadOnlyCountry() {
        return readOnlyCountry;
    }

    /**
     * Define el valor de la propiedad readOnlyCountry.
     * 
     */
    public void setReadOnlyCountry(boolean value) {
        this.readOnlyCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyGeoLevels.
     * 
     */
    public boolean isReadOnlyGeoLevels() {
        return readOnlyGeoLevels;
    }

    /**
     * Define el valor de la propiedad readOnlyGeoLevels.
     * 
     */
    public void setReadOnlyGeoLevels(boolean value) {
        this.readOnlyGeoLevels = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyDNI.
     * 
     */
    public boolean isReadOnlyDNI() {
        return readOnlyDNI;
    }

    /**
     * Define el valor de la propiedad readOnlyDNI.
     * 
     */
    public void setReadOnlyDNI(boolean value) {
        this.readOnlyDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyDNIType.
     * 
     */
    public boolean isReadOnlyDNIType() {
        return readOnlyDNIType;
    }

    /**
     * Define el valor de la propiedad readOnlyDNIType.
     * 
     */
    public void setReadOnlyDNIType(boolean value) {
        this.readOnlyDNIType = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyTelephone.
     * 
     */
    public boolean isReadOnlyTelephone() {
        return readOnlyTelephone;
    }

    /**
     * Define el valor de la propiedad readOnlyTelephone.
     * 
     */
    public void setReadOnlyTelephone(boolean value) {
        this.readOnlyTelephone = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyFax.
     * 
     */
    public boolean isReadOnlyFax() {
        return readOnlyFax;
    }

    /**
     * Define el valor de la propiedad readOnlyFax.
     * 
     */
    public void setReadOnlyFax(boolean value) {
        this.readOnlyFax = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyMobile.
     * 
     */
    public boolean isReadOnlyMobile() {
        return readOnlyMobile;
    }

    /**
     * Define el valor de la propiedad readOnlyMobile.
     * 
     */
    public void setReadOnlyMobile(boolean value) {
        this.readOnlyMobile = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyEmail.
     * 
     */
    public boolean isReadOnlyEmail() {
        return readOnlyEmail;
    }

    /**
     * Define el valor de la propiedad readOnlyEmail.
     * 
     */
    public void setReadOnlyEmail(boolean value) {
        this.readOnlyEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyGender.
     * 
     */
    public boolean isReadOnlyGender() {
        return readOnlyGender;
    }

    /**
     * Define el valor de la propiedad readOnlyGender.
     * 
     */
    public void setReadOnlyGender(boolean value) {
        this.readOnlyGender = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyNotes.
     * 
     */
    public boolean isReadOnlyNotes() {
        return readOnlyNotes;
    }

    /**
     * Define el valor de la propiedad readOnlyNotes.
     * 
     */
    public void setReadOnlyNotes(boolean value) {
        this.readOnlyNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyZone.
     * 
     */
    public boolean isReadOnlyZone() {
        return readOnlyZone;
    }

    /**
     * Define el valor de la propiedad readOnlyZone.
     * 
     */
    public void setReadOnlyZone(boolean value) {
        this.readOnlyZone = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyCanNotModCustInTerminals.
     * 
     */
    public boolean isReadOnlyCanNotModCustInTerminals() {
        return readOnlyCanNotModCustInTerminals;
    }

    /**
     * Define el valor de la propiedad readOnlyCanNotModCustInTerminals.
     * 
     */
    public void setReadOnlyCanNotModCustInTerminals(boolean value) {
        this.readOnlyCanNotModCustInTerminals = value;
    }

    /**
     * Obtiene el valor de la propiedad showDNIType.
     * 
     */
    public boolean isShowDNIType() {
        return showDNIType;
    }

    /**
     * Define el valor de la propiedad showDNIType.
     * 
     */
    public void setShowDNIType(boolean value) {
        this.showDNIType = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryDNIType.
     * 
     */
    public boolean isMandatoryDNIType() {
        return mandatoryDNIType;
    }

    /**
     * Define el valor de la propiedad mandatoryDNIType.
     * 
     */
    public void setMandatoryDNIType(boolean value) {
        this.mandatoryDNIType = value;
    }

    /**
     * Obtiene el valor de la propiedad showZone.
     * 
     */
    public boolean isShowZone() {
        return showZone;
    }

    /**
     * Define el valor de la propiedad showZone.
     * 
     */
    public void setShowZone(boolean value) {
        this.showZone = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryZone.
     * 
     */
    public boolean isMandatoryZone() {
        return mandatoryZone;
    }

    /**
     * Define el valor de la propiedad mandatoryZone.
     * 
     */
    public void setMandatoryZone(boolean value) {
        this.mandatoryZone = value;
    }

    /**
     * Obtiene el valor de la propiedad showCanNotModCustInTerminals.
     * 
     */
    public boolean isShowCanNotModCustInTerminals() {
        return showCanNotModCustInTerminals;
    }

    /**
     * Define el valor de la propiedad showCanNotModCustInTerminals.
     * 
     */
    public void setShowCanNotModCustInTerminals(boolean value) {
        this.showCanNotModCustInTerminals = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatoryCanNotModCustInTerminals.
     * 
     */
    public boolean isMandatoryCanNotModCustInTerminals() {
        return mandatoryCanNotModCustInTerminals;
    }

    /**
     * Define el valor de la propiedad mandatoryCanNotModCustInTerminals.
     * 
     */
    public void setMandatoryCanNotModCustInTerminals(boolean value) {
        this.mandatoryCanNotModCustInTerminals = value;
    }

    /**
     * Obtiene el valor de la propiedad showAccountNumber.
     * 
     */
    public boolean isShowAccountNumber() {
        return showAccountNumber;
    }

    /**
     * Define el valor de la propiedad showAccountNumber.
     * 
     */
    public void setShowAccountNumber(boolean value) {
        this.showAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryAccountNumber.
     * 
     */
    public boolean isIsMandatoryAccountNumber() {
        return isMandatoryAccountNumber;
    }

    /**
     * Define el valor de la propiedad isMandatoryAccountNumber.
     * 
     */
    public void setIsMandatoryAccountNumber(boolean value) {
        this.isMandatoryAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyAccountNumber.
     * 
     */
    public boolean isReadOnlyAccountNumber() {
        return readOnlyAccountNumber;
    }

    /**
     * Define el valor de la propiedad readOnlyAccountNumber.
     * 
     */
    public void setReadOnlyAccountNumber(boolean value) {
        this.readOnlyAccountNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad showFrequentFlyerNumber.
     * 
     */
    public boolean isShowFrequentFlyerNumber() {
        return showFrequentFlyerNumber;
    }

    /**
     * Define el valor de la propiedad showFrequentFlyerNumber.
     * 
     */
    public void setShowFrequentFlyerNumber(boolean value) {
        this.showFrequentFlyerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad isMandatoryFrequentFlyerNumber.
     * 
     */
    public boolean isIsMandatoryFrequentFlyerNumber() {
        return isMandatoryFrequentFlyerNumber;
    }

    /**
     * Define el valor de la propiedad isMandatoryFrequentFlyerNumber.
     * 
     */
    public void setIsMandatoryFrequentFlyerNumber(boolean value) {
        this.isMandatoryFrequentFlyerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad readOnlyFrequentFlyerNumber.
     * 
     */
    public boolean isReadOnlyFrequentFlyerNumber() {
        return readOnlyFrequentFlyerNumber;
    }

    /**
     * Define el valor de la propiedad readOnlyFrequentFlyerNumber.
     * 
     */
    public void setReadOnlyFrequentFlyerNumber(boolean value) {
        this.readOnlyFrequentFlyerNumber = value;
    }

}
