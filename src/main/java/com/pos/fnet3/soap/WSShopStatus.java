
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShopStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShopStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/>
 *         <element name="shopCurrentCampaign" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/>
 *         <element name="shopCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShopStatus", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "shop",
    "shopCurrentCampaign",
    "shopCampaignByDefault"
})
public class WSShopStatus {

    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shopCurrentCampaign;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shopCampaignByDefault;

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
     * Obtiene el valor de la propiedad shopCurrentCampaign.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopCurrentCampaign() {
        return shopCurrentCampaign;
    }

    /**
     * Define el valor de la propiedad shopCurrentCampaign.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopCurrentCampaign(WSShopByCampaignBehavior value) {
        this.shopCurrentCampaign = value;
    }

    /**
     * Obtiene el valor de la propiedad shopCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopCampaignByDefault() {
        return shopCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad shopCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopCampaignByDefault(WSShopByCampaignBehavior value) {
        this.shopCampaignByDefault = value;
    }

}
