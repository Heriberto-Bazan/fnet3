
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
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="voucherCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="productList" type="{http://FidelyNET3_SW_01_89_00}WS_Product4SaleLittle" maxOccurs="unbounded"/>
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
    "sessionID",
    "customerID",
    "card",
    "mobile",
    "email",
    "identityCard",
    "voucherCode",
    "totalMoney",
    "productList"
})
@XmlRootElement(name = "ValidateVoucherRequest")
public class ValidateVoucherRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long customerID;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String identityCard;
    protected long voucherCode;
    protected double totalMoney;
    @XmlElement(required = true)
    protected List<WSProduct4SaleLittle> productList;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(long value) {
        this.customerID = value;
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
     * Obtiene el valor de la propiedad mobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Define el valor de la propiedad mobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad identityCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * Define el valor de la propiedad identityCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCard(String value) {
        this.identityCard = value;
    }

    /**
     * Obtiene el valor de la propiedad voucherCode.
     * 
     */
    public long getVoucherCode() {
        return voucherCode;
    }

    /**
     * Define el valor de la propiedad voucherCode.
     * 
     */
    public void setVoucherCode(long value) {
        this.voucherCode = value;
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
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProduct4SaleLittle }
     * 
     * 
     * @return
     *     The value of the productList property.
     */
    public List<WSProduct4SaleLittle> getProductList() {
        if (productList == null) {
            productList = new ArrayList<>();
        }
        return this.productList;
    }

}
