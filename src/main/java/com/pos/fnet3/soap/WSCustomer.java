
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
 * <p>Clase Java para WS_Customer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="zoneForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="customer_area_status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalExchangedPrizes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalManualDischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInSale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInExchanged" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalDischargedPointsInTransfer" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="balanceData" type="{http://FidelyNET3_SW_01_89_00}WS_Balance"/>
 *         <element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "WS_Customer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "campaignName",
    "card",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "zoneId",
    "zoneForeignId",
    "customerAreaStatus",
    "totalExchangedPrizes",
    "totalManualDischargedPoints",
    "totalDischargedPointsInSale",
    "totalDischargedPointsInExchanged",
    "totalDischargedPointsInTransfer",
    "balanceData",
    "activationDate",
    "invitorCode",
    "foreignId",
    "billingData"
})
public class WSCustomer {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String campaignName;
    @XmlElement(required = true)
    protected String card;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    protected long zoneId;
    protected long zoneForeignId;
    @XmlElement(name = "customer_area_status")
    protected int customerAreaStatus;
    protected long totalExchangedPrizes;
    protected double totalManualDischargedPoints;
    protected double totalDischargedPointsInSale;
    protected double totalDischargedPointsInExchanged;
    protected double totalDischargedPointsInTransfer;
    @XmlElement(required = true)
    protected WSBalance balanceData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activationDate;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;
    @XmlElement(required = true)
    protected String foreignId;
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
