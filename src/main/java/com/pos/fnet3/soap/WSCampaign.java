
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Campaign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Campaign">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dirLogo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pointsTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="creditsTag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="amountLastMovement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="amountDaysExpiration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="amountPrizes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="deferredDaysToSendPrizeReview" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="completeCustomerFields" type="{http://FidelyNET3_SW_01_89_00}WS_CompleteCustomerFields"/>
 *         <element name="ticket" type="{http://FidelyNET3_SW_01_89_00}WS_CampaignTicket"/>
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/>
 *         <element name="minimumCustomersFields" type="{http://FidelyNET3_SW_01_89_00}WS_MinimumCustomerFields"/>
 *         <element name="pathImageAbsolute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Campaign", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "code",
    "name",
    "description",
    "dirLogo",
    "pointsTag",
    "creditsTag",
    "amountLastMovement",
    "amountDaysExpiration",
    "amountPrizes",
    "deferredDaysToSendPrizeReview",
    "completeCustomerFields",
    "ticket",
    "shop",
    "minimumCustomersFields",
    "pathImageAbsolute"
})
public class WSCampaign {

    protected long id;
    protected long code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String dirLogo;
    @XmlElement(required = true)
    protected String pointsTag;
    @XmlElement(required = true)
    protected String creditsTag;
    protected int amountLastMovement;
    protected int amountDaysExpiration;
    protected int amountPrizes;
    protected long deferredDaysToSendPrizeReview;
    @XmlElement(required = true)
    protected WSCompleteCustomerFields completeCustomerFields;
    @XmlElement(required = true)
    protected WSCampaignTicket ticket;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shop;
    @XmlElement(required = true)
    protected WSMinimumCustomerFields minimumCustomersFields;
    @XmlElement(required = true)
    protected String pathImageAbsolute;

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
     * Obtiene el valor de la propiedad code.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad dirLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirLogo() {
        return dirLogo;
    }

    /**
     * Define el valor de la propiedad dirLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirLogo(String value) {
        this.dirLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointsTag() {
        return pointsTag;
    }

    /**
     * Define el valor de la propiedad pointsTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointsTag(String value) {
        this.pointsTag = value;
    }

    /**
     * Obtiene el valor de la propiedad creditsTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditsTag() {
        return creditsTag;
    }

    /**
     * Define el valor de la propiedad creditsTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditsTag(String value) {
        this.creditsTag = value;
    }

    /**
     * Obtiene el valor de la propiedad amountLastMovement.
     * 
     */
    public int getAmountLastMovement() {
        return amountLastMovement;
    }

    /**
     * Define el valor de la propiedad amountLastMovement.
     * 
     */
    public void setAmountLastMovement(int value) {
        this.amountLastMovement = value;
    }

    /**
     * Obtiene el valor de la propiedad amountDaysExpiration.
     * 
     */
    public int getAmountDaysExpiration() {
        return amountDaysExpiration;
    }

    /**
     * Define el valor de la propiedad amountDaysExpiration.
     * 
     */
    public void setAmountDaysExpiration(int value) {
        this.amountDaysExpiration = value;
    }

    /**
     * Obtiene el valor de la propiedad amountPrizes.
     * 
     */
    public int getAmountPrizes() {
        return amountPrizes;
    }

    /**
     * Define el valor de la propiedad amountPrizes.
     * 
     */
    public void setAmountPrizes(int value) {
        this.amountPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad deferredDaysToSendPrizeReview.
     * 
     */
    public long getDeferredDaysToSendPrizeReview() {
        return deferredDaysToSendPrizeReview;
    }

    /**
     * Define el valor de la propiedad deferredDaysToSendPrizeReview.
     * 
     */
    public void setDeferredDaysToSendPrizeReview(long value) {
        this.deferredDaysToSendPrizeReview = value;
    }

    /**
     * Obtiene el valor de la propiedad completeCustomerFields.
     * 
     * @return
     *     possible object is
     *     {@link WSCompleteCustomerFields }
     *     
     */
    public WSCompleteCustomerFields getCompleteCustomerFields() {
        return completeCustomerFields;
    }

    /**
     * Define el valor de la propiedad completeCustomerFields.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCompleteCustomerFields }
     *     
     */
    public void setCompleteCustomerFields(WSCompleteCustomerFields value) {
        this.completeCustomerFields = value;
    }

    /**
     * Obtiene el valor de la propiedad ticket.
     * 
     * @return
     *     possible object is
     *     {@link WSCampaignTicket }
     *     
     */
    public WSCampaignTicket getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCampaignTicket }
     *     
     */
    public void setTicket(WSCampaignTicket value) {
        this.ticket = value;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShop(WSShopByCampaignBehavior value) {
        this.shop = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumCustomersFields.
     * 
     * @return
     *     possible object is
     *     {@link WSMinimumCustomerFields }
     *     
     */
    public WSMinimumCustomerFields getMinimumCustomersFields() {
        return minimumCustomersFields;
    }

    /**
     * Define el valor de la propiedad minimumCustomersFields.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMinimumCustomerFields }
     *     
     */
    public void setMinimumCustomersFields(WSMinimumCustomerFields value) {
        this.minimumCustomersFields = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImageAbsolute.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImageAbsolute() {
        return pathImageAbsolute;
    }

    /**
     * Define el valor de la propiedad pathImageAbsolute.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImageAbsolute(String value) {
        this.pathImageAbsolute = value;
    }

}
