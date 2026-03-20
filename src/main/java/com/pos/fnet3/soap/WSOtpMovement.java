
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Otp_Movement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Otp_Movement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaign" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="terminal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="customer" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="operator" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="localTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="dischargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedGiftCredits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalBenefits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="otpStatus" type="{http://FidelyNET3_SW_01_89_00}WS_OtpFlags"/>
 *         <element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="externalRefMixedPaymentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="inscription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="forGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="totalMoneyPaid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Otp_Movement", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaign",
    "terminal",
    "kind",
    "customer",
    "operator",
    "dateTime",
    "localTime",
    "dischargedCredits",
    "dischargedGiftCredits",
    "dischargedPoints",
    "totalMoney",
    "totalBenefits",
    "otpStatus",
    "notes",
    "discount",
    "shopId",
    "currencyId",
    "externalRefMixedPaymentId",
    "inscription",
    "forGift",
    "totalMoneyPaid",
    "useFeeFix"
})
public class WSOtpMovement {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long id;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long campaign;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long terminal;
    protected int kind;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long customer;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long operator;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localTime;
    protected double dischargedCredits;
    protected double dischargedGiftCredits;
    protected double dischargedPoints;
    protected double totalMoney;
    protected double totalBenefits;
    @XmlElement(required = true)
    protected WSOtpFlags otpStatus;
    @XmlElement(required = true)
    protected String notes;
    protected double discount;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long shopId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long currencyId;
    @XmlElement(required = true)
    protected String externalRefMixedPaymentId;
    @XmlElement(required = true)
    protected String inscription;
    protected boolean forGift;
    protected double totalMoneyPaid;
    protected boolean useFeeFix;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad campaign.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaign() {
        return campaign;
    }

    /**
     * Define el valor de la propiedad campaign.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaign(Long value) {
        this.campaign = value;
    }

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerminal(Long value) {
        this.terminal = value;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     */
    public int getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     */
    public void setKind(int value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomer(Long value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperator(Long value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad localTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTime() {
        return localTime;
    }

    /**
     * Define el valor de la propiedad localTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTime(XMLGregorianCalendar value) {
        this.localTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedCredits.
     * 
     */
    public double getDischargedCredits() {
        return dischargedCredits;
    }

    /**
     * Define el valor de la propiedad dischargedCredits.
     * 
     */
    public void setDischargedCredits(double value) {
        this.dischargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedGiftCredits.
     * 
     */
    public double getDischargedGiftCredits() {
        return dischargedGiftCredits;
    }

    /**
     * Define el valor de la propiedad dischargedGiftCredits.
     * 
     */
    public void setDischargedGiftCredits(double value) {
        this.dischargedGiftCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPoints.
     * 
     */
    public double getDischargedPoints() {
        return dischargedPoints;
    }

    /**
     * Define el valor de la propiedad dischargedPoints.
     * 
     */
    public void setDischargedPoints(double value) {
        this.dischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoney.
     * 
     */
    public double getTotalMoney() {
        return totalMoney;
    }

    /**
     * Define el valor de la propiedad totalMoney.
     * 
     */
    public void setTotalMoney(double value) {
        this.totalMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBenefits.
     * 
     */
    public double getTotalBenefits() {
        return totalBenefits;
    }

    /**
     * Define el valor de la propiedad totalBenefits.
     * 
     */
    public void setTotalBenefits(double value) {
        this.totalBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad otpStatus.
     * 
     * @return
     *     possible object is
     *     {@link WSOtpFlags }
     *     
     */
    public WSOtpFlags getOtpStatus() {
        return otpStatus;
    }

    /**
     * Define el valor de la propiedad otpStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOtpFlags }
     *     
     */
    public void setOtpStatus(WSOtpFlags value) {
        this.otpStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad discount.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Obtiene el valor de la propiedad shopId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * Define el valor de la propiedad shopId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShopId(Long value) {
        this.shopId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyId(Long value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRefMixedPaymentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefMixedPaymentId() {
        return externalRefMixedPaymentId;
    }

    /**
     * Define el valor de la propiedad externalRefMixedPaymentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefMixedPaymentId(String value) {
        this.externalRefMixedPaymentId = value;
    }

    /**
     * Obtiene el valor de la propiedad inscription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscription() {
        return inscription;
    }

    /**
     * Define el valor de la propiedad inscription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscription(String value) {
        this.inscription = value;
    }

    /**
     * Obtiene el valor de la propiedad forGift.
     * 
     */
    public boolean isForGift() {
        return forGift;
    }

    /**
     * Define el valor de la propiedad forGift.
     * 
     */
    public void setForGift(boolean value) {
        this.forGift = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMoneyPaid.
     * 
     */
    public double getTotalMoneyPaid() {
        return totalMoneyPaid;
    }

    /**
     * Define el valor de la propiedad totalMoneyPaid.
     * 
     */
    public void setTotalMoneyPaid(double value) {
        this.totalMoneyPaid = value;
    }

    /**
     * Obtiene el valor de la propiedad useFeeFix.
     * 
     */
    public boolean isUseFeeFix() {
        return useFeeFix;
    }

    /**
     * Define el valor de la propiedad useFeeFix.
     * 
     */
    public void setUseFeeFix(boolean value) {
        this.useFeeFix = value;
    }

}
