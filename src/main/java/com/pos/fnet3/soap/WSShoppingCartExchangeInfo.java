
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShoppingCartExchangeInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ShoppingCartExchangeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="shoppingCartStatus" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeWithPromotions" maxOccurs="unbounded"/>
 *         <element name="voucher" type="{http://FidelyNET3_SW_01_89_00}WS_Voucher"/>
 *         <element name="shoppingCartBalance" type="{http://FidelyNET3_SW_01_89_00}WS_ShoppingCartBalance"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShoppingCartExchangeInfo", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "shoppingCartId",
    "shoppingCartStatus",
    "prize",
    "voucher",
    "shoppingCartBalance"
})
public class WSShoppingCartExchangeInfo {

    protected long shoppingCartId;
    protected long shoppingCartStatus;
    @XmlElement(required = true)
    protected List<WSExchangedPrizeWithPromotions> prize;
    @XmlElement(required = true, nillable = true)
    protected WSVoucher voucher;
    @XmlElement(required = true)
    protected WSShoppingCartBalance shoppingCartBalance;

    /**
     * Obtiene el valor de la propiedad shoppingCartId.
     * 
     */
    public long getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Define el valor de la propiedad shoppingCartId.
     * 
     */
    public void setShoppingCartId(long value) {
        this.shoppingCartId = value;
    }

    /**
     * Obtiene el valor de la propiedad shoppingCartStatus.
     * 
     */
    public long getShoppingCartStatus() {
        return shoppingCartStatus;
    }

    /**
     * Define el valor de la propiedad shoppingCartStatus.
     * 
     */
    public void setShoppingCartStatus(long value) {
        this.shoppingCartStatus = value;
    }

    /**
     * Gets the value of the prize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangedPrizeWithPromotions }
     * 
     * 
     * @return
     *     The value of the prize property.
     */
    public List<WSExchangedPrizeWithPromotions> getPrize() {
        if (prize == null) {
            prize = new ArrayList<>();
        }
        return this.prize;
    }

    /**
     * Obtiene el valor de la propiedad voucher.
     * 
     * @return
     *     possible object is
     *     {@link WSVoucher }
     *     
     */
    public WSVoucher getVoucher() {
        return voucher;
    }

    /**
     * Define el valor de la propiedad voucher.
     * 
     * @param value
     *     allowed object is
     *     {@link WSVoucher }
     *     
     */
    public void setVoucher(WSVoucher value) {
        this.voucher = value;
    }

    /**
     * Obtiene el valor de la propiedad shoppingCartBalance.
     * 
     * @return
     *     possible object is
     *     {@link WSShoppingCartBalance }
     *     
     */
    public WSShoppingCartBalance getShoppingCartBalance() {
        return shoppingCartBalance;
    }

    /**
     * Define el valor de la propiedad shoppingCartBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShoppingCartBalance }
     *     
     */
    public void setShoppingCartBalance(WSShoppingCartBalance value) {
        this.shoppingCartBalance = value;
    }

}
