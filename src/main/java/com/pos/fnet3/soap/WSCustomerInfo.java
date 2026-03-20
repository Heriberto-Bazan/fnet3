
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
 * <p>Clase Java para WS_CustomerInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customer_area_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalExchangedPrizes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="balanceData" type="{http://FidelyNET3_SW_01_89_00}WS_Balance"/>
 *         <element name="personalInfo" type="{http://FidelyNET3_SW_01_89_00}WS_PersonalInfo"/>
 *         <element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="campaign_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="totalManualDischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInSale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInExchanged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInTransfer" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "WS_CustomerInfo", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "card",
    "status",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "zoneId",
    "zoneForeignId",
    "customerAreaStatus",
    "totalExchangedPrizes",
    "issuedDate",
    "balanceData",
    "personalInfo",
    "activationDate",
    "invitorCode",
    "campaignName",
    "totalManualDischargedPoints",
    "totalDischargedPointsInSale",
    "totalDischargedPointsInExchanged",
    "totalDischargedPointsInTransfer",
    "billingData"
})
public class WSCustomerInfo {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String card;
    protected int status;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    protected long zoneId;
    protected long zoneForeignId;
    @XmlElement(name = "customer_area_status")
    protected int customerAreaStatus;
    protected long totalExchangedPrizes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(required = true)
    protected WSBalance balanceData;
    @XmlElement(required = true)
    protected WSPersonalInfo personalInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;
    @XmlElement(name = "campaign_name", required = true)
    protected String campaignName;
    protected double totalManualDischargedPoints;
    protected double totalDischargedPointsInSale;
    protected double totalDischargedPointsInExchanged;
    protected double totalDischargedPointsInTransfer;
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
     * Obtiene el valor de la propiedad status.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
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
     * Obtiene el valor de la propiedad activationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Define el valor de la propiedad activationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
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
     * Obtiene el valor de la propiedad campaignName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Define el valor de la propiedad campaignName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
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
