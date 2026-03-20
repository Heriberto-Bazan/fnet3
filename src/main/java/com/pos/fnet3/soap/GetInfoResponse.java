
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="customer" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerComplete"/>
 *         <element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/>
 *         <element name="promotions" type="{http://FidelyNET3_SW_01_89_00}WS_Promotion" maxOccurs="unbounded"/>
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_ShopStatus"/>
 *         <element name="prizes" type="{http://FidelyNET3_SW_01_89_00}WS_ProductPrice" maxOccurs="unbounded"/>
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
    "customer",
    "movement",
    "promotions",
    "shop",
    "prizes"
})
@XmlRootElement(name = "GetInfoResponse")
public class GetInfoResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSCustomerComplete customer;
    @XmlElement(required = true)
    protected WSMovement movement;
    @XmlElement(required = true)
    protected List<WSPromotion> promotions;
    @XmlElement(required = true)
    protected WSShopStatus shop;
    @XmlElement(required = true)
    protected List<WSProductPrice> prizes;

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
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerComplete }
     *     
     */
    public WSCustomerComplete getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerComplete }
     *     
     */
    public void setCustomer(WSCustomerComplete value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad movement.
     * 
     * @return
     *     possible object is
     *     {@link WSMovement }
     *     
     */
    public WSMovement getMovement() {
        return movement;
    }

    /**
     * Define el valor de la propiedad movement.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMovement }
     *     
     */
    public void setMovement(WSMovement value) {
        this.movement = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotion }
     * 
     * 
     * @return
     *     The value of the promotions property.
     */
    public List<WSPromotion> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<>();
        }
        return this.promotions;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShopStatus }
     *     
     */
    public WSShopStatus getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopStatus }
     *     
     */
    public void setShop(WSShopStatus value) {
        this.shop = value;
    }

    /**
     * Gets the value of the prizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProductPrice }
     * 
     * 
     * @return
     *     The value of the prizes property.
     */
    public List<WSProductPrice> getPrizes() {
        if (prizes == null) {
            prizes = new ArrayList<>();
        }
        return this.prizes;
    }

}
