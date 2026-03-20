
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerComplete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerComplete">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalMlmChildren" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="registration_shop_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="registration_net_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="registration_shop_foreign_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="registration_net_foreign_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customer_area_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="mailContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobileContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="contactNameContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="faxContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="telephoneContactData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalExchangedPrizes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalMoneyInSale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="paidMoneyInSale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalManualDischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInSale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInExchanged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInTransfer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="expiredPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="weightPointValueMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weightPointValuePoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weightPointValueBPMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weightPointValueBPPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="personalInfo" type="{http://FidelyNET3_SW_01_89_00}WS_PersonalInfo"/>
 *         <element name="balanceData" type="{http://FidelyNET3_SW_01_89_00}WS_Balance"/>
 *         <element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="customerAreaFlags" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerAreaFlags"/>
 *         <element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerInformationToExpired" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInformationToExpire"/>
 *         <element name="levelBadge" type="{http://FidelyNET3_SW_01_89_00}WS_BadgeLevel"/>
 *         <element name="pointStatus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="badges" type="{http://FidelyNET3_SW_01_89_00}WS_Badge" maxOccurs="unbounded"/>
 *         <element name="billingData" type="{http://FidelyNET3_SW_01_89_00}WS_GeneralBillingDataInf" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerComplete", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "card",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "totalMlmChildren",
    "registrationShopId",
    "registrationNetId",
    "registrationShopForeignId",
    "registrationNetForeignId",
    "zoneId",
    "zoneForeignId",
    "customerAreaStatus",
    "mailContactData",
    "mobileContactData",
    "contactNameContactData",
    "faxContactData",
    "telephoneContactData",
    "totalExchangedPrizes",
    "totalMoneyInSale",
    "paidMoneyInSale",
    "totalManualDischargedPoints",
    "totalDischargedPointsInSale",
    "totalDischargedPointsInExchanged",
    "totalDischargedPointsInTransfer",
    "expiredPoints",
    "foreignId",
    "weightPointValueMoney",
    "weightPointValuePoints",
    "weightPointValueBPMoney",
    "weightPointValueBPPoints",
    "personalInfo",
    "balanceData",
    "issuedDate",
    "customerAreaFlags",
    "invitorCode",
    "customerInformationToExpired",
    "levelBadge",
    "pointStatus",
    "badges",
    "billingData"
})
public class WSCustomerComplete {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String card;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    protected long totalMlmChildren;
    @XmlElement(name = "registration_shop_id")
    protected long registrationShopId;
    @XmlElement(name = "registration_net_id")
    protected long registrationNetId;
    @XmlElement(name = "registration_shop_foreign_id")
    protected long registrationShopForeignId;
    @XmlElement(name = "registration_net_foreign_id")
    protected long registrationNetForeignId;
    protected long zoneId;
    protected long zoneForeignId;
    @XmlElement(name = "customer_area_status")
    protected int customerAreaStatus;
    @XmlElement(required = true)
    protected String mailContactData;
    @XmlElement(required = true)
    protected String mobileContactData;
    @XmlElement(required = true)
    protected String contactNameContactData;
    @XmlElement(required = true)
    protected String faxContactData;
    @XmlElement(required = true)
    protected String telephoneContactData;
    protected long totalExchangedPrizes;
    protected double totalMoneyInSale;
    protected double paidMoneyInSale;
    protected double totalManualDischargedPoints;
    protected double totalDischargedPointsInSale;
    protected double totalDischargedPointsInExchanged;
    protected double totalDischargedPointsInTransfer;
    protected double expiredPoints;
    @XmlElement(required = true)
    protected String foreignId;
    protected double weightPointValueMoney;
    protected double weightPointValuePoints;
    protected double weightPointValueBPMoney;
    protected double weightPointValueBPPoints;
    @XmlElement(required = true)
    protected WSPersonalInfo personalInfo;
    @XmlElement(required = true)
    protected WSBalance balanceData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(required = true)
    protected WSCustomerAreaFlags customerAreaFlags;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;
    @XmlElement(required = true)
    protected WSCustomerInformationToExpire customerInformationToExpired;
    @XmlElement(required = true)
    protected WSBadgeLevel levelBadge;
    protected double pointStatus;
    @XmlElement(required = true)
    protected List<WSBadge> badges;
    @XmlElement(required = true)
    protected List<WSGeneralBillingDataInf> billingData;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

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
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad fidelyCode.
     * 
     */
    public long getFidelyCode() {
        return fidelyCode;
    }

    /**
     * Define el valor de la propiedad fidelyCode.
     * 
     */
    public void setFidelyCode(long value) {
        this.fidelyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad parentCustomerId.
     * 
     */
    public long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Define el valor de la propiedad parentCustomerId.
     * 
     */
    public void setParentCustomerId(long value) {
        this.parentCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmCustomerId.
     * 
     */
    public long getMlmCustomerId() {
        return mlmCustomerId;
    }

    /**
     * Define el valor de la propiedad mlmCustomerId.
     * 
     */
    public void setMlmCustomerId(long value) {
        this.mlmCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMlmChildren.
     * 
     */
    public long getTotalMlmChildren() {
        return totalMlmChildren;
    }

    /**
     * Define el valor de la propiedad totalMlmChildren.
     * 
     */
    public void setTotalMlmChildren(long value) {
        this.totalMlmChildren = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationShopId.
     * 
     */
    public long getRegistrationShopId() {
        return registrationShopId;
    }

    /**
     * Define el valor de la propiedad registrationShopId.
     * 
     */
    public void setRegistrationShopId(long value) {
        this.registrationShopId = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationNetId.
     * 
     */
    public long getRegistrationNetId() {
        return registrationNetId;
    }

    /**
     * Define el valor de la propiedad registrationNetId.
     * 
     */
    public void setRegistrationNetId(long value) {
        this.registrationNetId = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationShopForeignId.
     * 
     */
    public long getRegistrationShopForeignId() {
        return registrationShopForeignId;
    }

    /**
     * Define el valor de la propiedad registrationShopForeignId.
     * 
     */
    public void setRegistrationShopForeignId(long value) {
        this.registrationShopForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationNetForeignId.
     * 
     */
    public long getRegistrationNetForeignId() {
        return registrationNetForeignId;
    }

    /**
     * Define el valor de la propiedad registrationNetForeignId.
     * 
     */
    public void setRegistrationNetForeignId(long value) {
        this.registrationNetForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneId.
     * 
     */
    public long getZoneId() {
        return zoneId;
    }

    /**
     * Define el valor de la propiedad zoneId.
     * 
     */
    public void setZoneId(long value) {
        this.zoneId = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneForeignId.
     * 
     */
    public long getZoneForeignId() {
        return zoneForeignId;
    }

    /**
     * Define el valor de la propiedad zoneForeignId.
     * 
     */
    public void setZoneForeignId(long value) {
        this.zoneForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAreaStatus.
     * 
     */
    public int getCustomerAreaStatus() {
        return customerAreaStatus;
    }

    /**
     * Define el valor de la propiedad customerAreaStatus.
     * 
     */
    public void setCustomerAreaStatus(int value) {
        this.customerAreaStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad mailContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailContactData() {
        return mailContactData;
    }

    /**
     * Define el valor de la propiedad mailContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailContactData(String value) {
        this.mailContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileContactData() {
        return mobileContactData;
    }

    /**
     * Define el valor de la propiedad mobileContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileContactData(String value) {
        this.mobileContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad contactNameContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameContactData() {
        return contactNameContactData;
    }

    /**
     * Define el valor de la propiedad contactNameContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameContactData(String value) {
        this.contactNameContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad faxContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxContactData() {
        return faxContactData;
    }

    /**
     * Define el valor de la propiedad faxContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxContactData(String value) {
        this.faxContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad telephoneContactData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneContactData() {
        return telephoneContactData;
    }

    /**
     * Define el valor de la propiedad telephoneContactData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneContactData(String value) {
        this.telephoneContactData = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExchangedPrizes.
     * 
     */
    public long getTotalExchangedPrizes() {
        return totalExchangedPrizes;
    }

    /**
     * Define el valor de la propiedad totalExchangedPrizes.
     * 
     */
    public void setTotalExchangedPrizes(long value) {
        this.totalExchangedPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoneyInSale.
     * 
     */
    public double getTotalMoneyInSale() {
        return totalMoneyInSale;
    }

    /**
     * Define el valor de la propiedad totalMoneyInSale.
     * 
     */
    public void setTotalMoneyInSale(double value) {
        this.totalMoneyInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad paidMoneyInSale.
     * 
     */
    public double getPaidMoneyInSale() {
        return paidMoneyInSale;
    }

    /**
     * Define el valor de la propiedad paidMoneyInSale.
     * 
     */
    public void setPaidMoneyInSale(double value) {
        this.paidMoneyInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad totalManualDischargedPoints.
     * 
     */
    public double getTotalManualDischargedPoints() {
        return totalManualDischargedPoints;
    }

    /**
     * Define el valor de la propiedad totalManualDischargedPoints.
     * 
     */
    public void setTotalManualDischargedPoints(double value) {
        this.totalManualDischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDischargedPointsInSale.
     * 
     */
    public double getTotalDischargedPointsInSale() {
        return totalDischargedPointsInSale;
    }

    /**
     * Define el valor de la propiedad totalDischargedPointsInSale.
     * 
     */
    public void setTotalDischargedPointsInSale(double value) {
        this.totalDischargedPointsInSale = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDischargedPointsInExchanged.
     * 
     */
    public double getTotalDischargedPointsInExchanged() {
        return totalDischargedPointsInExchanged;
    }

    /**
     * Define el valor de la propiedad totalDischargedPointsInExchanged.
     * 
     */
    public void setTotalDischargedPointsInExchanged(double value) {
        this.totalDischargedPointsInExchanged = value;
    }

    /**
     * Obtiene el valor de la propiedad totalDischargedPointsInTransfer.
     * 
     */
    public double getTotalDischargedPointsInTransfer() {
        return totalDischargedPointsInTransfer;
    }

    /**
     * Define el valor de la propiedad totalDischargedPointsInTransfer.
     * 
     */
    public void setTotalDischargedPointsInTransfer(double value) {
        this.totalDischargedPointsInTransfer = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredPoints.
     * 
     */
    public double getExpiredPoints() {
        return expiredPoints;
    }

    /**
     * Define el valor de la propiedad expiredPoints.
     * 
     */
    public void setExpiredPoints(double value) {
        this.expiredPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignId(String value) {
        this.foreignId = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueMoney.
     * 
     */
    public double getWeightPointValueMoney() {
        return weightPointValueMoney;
    }

    /**
     * Define el valor de la propiedad weightPointValueMoney.
     * 
     */
    public void setWeightPointValueMoney(double value) {
        this.weightPointValueMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValuePoints.
     * 
     */
    public double getWeightPointValuePoints() {
        return weightPointValuePoints;
    }

    /**
     * Define el valor de la propiedad weightPointValuePoints.
     * 
     */
    public void setWeightPointValuePoints(double value) {
        this.weightPointValuePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueBPMoney.
     * 
     */
    public double getWeightPointValueBPMoney() {
        return weightPointValueBPMoney;
    }

    /**
     * Define el valor de la propiedad weightPointValueBPMoney.
     * 
     */
    public void setWeightPointValueBPMoney(double value) {
        this.weightPointValueBPMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueBPPoints.
     * 
     */
    public double getWeightPointValueBPPoints() {
        return weightPointValueBPPoints;
    }

    /**
     * Define el valor de la propiedad weightPointValueBPPoints.
     * 
     */
    public void setWeightPointValueBPPoints(double value) {
        this.weightPointValueBPPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInfo.
     * 
     * @return
     *     possible object is
     *     {@link WSPersonalInfo }
     *     
     */
    public WSPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Define el valor de la propiedad personalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPersonalInfo }
     *     
     */
    public void setPersonalInfo(WSPersonalInfo value) {
        this.personalInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceData.
     * 
     * @return
     *     possible object is
     *     {@link WSBalance }
     *     
     */
    public WSBalance getBalanceData() {
        return balanceData;
    }

    /**
     * Define el valor de la propiedad balanceData.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBalance }
     *     
     */
    public void setBalanceData(WSBalance value) {
        this.balanceData = value;
    }

    /**
     * Obtiene el valor de la propiedad issuedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Define el valor de la propiedad issuedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAreaFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerAreaFlags }
     *     
     */
    public WSCustomerAreaFlags getCustomerAreaFlags() {
        return customerAreaFlags;
    }

    /**
     * Define el valor de la propiedad customerAreaFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerAreaFlags }
     *     
     */
    public void setCustomerAreaFlags(WSCustomerAreaFlags value) {
        this.customerAreaFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad invitorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitorCode() {
        return invitorCode;
    }

    /**
     * Define el valor de la propiedad invitorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitorCode(String value) {
        this.invitorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customerInformationToExpired.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInformationToExpire }
     *     
     */
    public WSCustomerInformationToExpire getCustomerInformationToExpired() {
        return customerInformationToExpired;
    }

    /**
     * Define el valor de la propiedad customerInformationToExpired.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInformationToExpire }
     *     
     */
    public void setCustomerInformationToExpired(WSCustomerInformationToExpire value) {
        this.customerInformationToExpired = value;
    }

    /**
     * Obtiene el valor de la propiedad levelBadge.
     * 
     * @return
     *     possible object is
     *     {@link WSBadgeLevel }
     *     
     */
    public WSBadgeLevel getLevelBadge() {
        return levelBadge;
    }

    /**
     * Define el valor de la propiedad levelBadge.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBadgeLevel }
     *     
     */
    public void setLevelBadge(WSBadgeLevel value) {
        this.levelBadge = value;
    }

    /**
     * Obtiene el valor de la propiedad pointStatus.
     * 
     */
    public double getPointStatus() {
        return pointStatus;
    }

    /**
     * Define el valor de la propiedad pointStatus.
     * 
     */
    public void setPointStatus(double value) {
        this.pointStatus = value;
    }

    /**
     * Gets the value of the badges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the badges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBadges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSBadge }
     * 
     * 
     * @return
     *     The value of the badges property.
     */
    public List<WSBadge> getBadges() {
        if (badges == null) {
            badges = new ArrayList<>();
        }
        return this.badges;
    }

    /**
     * Gets the value of the billingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSGeneralBillingDataInf }
     * 
     * 
     * @return
     *     The value of the billingData property.
     */
    public List<WSGeneralBillingDataInf> getBillingData() {
        if (billingData == null) {
            billingData = new ArrayList<>();
        }
        return this.billingData;
    }

}
