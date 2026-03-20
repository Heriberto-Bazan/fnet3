
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/>
 *         <element name="shopByCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/>
 *         <element name="terminalByCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalByCampaign"/>
 *         <element name="terminalBehavior" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalBehavior"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "shop",
    "shopByCampaignByDefault",
    "terminalByCampaignByDefault",
    "terminalBehavior"
})
@XmlRootElement(name = "GetInfoShopResponse")
public class GetInfoShopResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true, nillable = true)
    protected WSShopByCampaignBehavior shopByCampaignByDefault;
    @XmlElement(required = true, nillable = true)
    protected WSTerminalByCampaign terminalByCampaignByDefault;
    @XmlElement(required = true, nillable = true)
    protected WSTerminalBehavior terminalBehavior;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShop }
     *     
     */
    public WSShop getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShop }
     *     
     */
    public void setShop(WSShop value) {
        this.shop = value;
    }

    /**
     * Obtiene el valor de la propiedad shopByCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopByCampaignByDefault() {
        return shopByCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad shopByCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopByCampaignByDefault(WSShopByCampaignBehavior value) {
        this.shopByCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalByCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public WSTerminalByCampaign getTerminalByCampaignByDefault() {
        return terminalByCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad terminalByCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public void setTerminalByCampaignByDefault(WSTerminalByCampaign value) {
        this.terminalByCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalBehavior.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalBehavior }
     *     
     */
    public WSTerminalBehavior getTerminalBehavior() {
        return terminalBehavior;
    }

    /**
     * Define el valor de la propiedad terminalBehavior.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalBehavior }
     *     
     */
    public void setTerminalBehavior(WSTerminalBehavior value) {
        this.terminalBehavior = value;
    }

}
