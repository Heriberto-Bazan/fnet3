
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Product4Sale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Product4Sale">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="saleTicketId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="productCategoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="productCategoryCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="productCategoryForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="chargedPoints" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Product4Sale", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "code",
    "price",
    "amount",
    "saleTicketId",
    "nameProduct",
    "productCategoryId",
    "productCategoryCode",
    "cost",
    "productCategoryForeignId",
    "chargedPoints",
    "pathImage"
})
public class WSProduct4Sale {

    @XmlElement(required = true, nillable = true)
    protected String code;
    protected double price;
    protected double amount;
    @XmlElement(required = true)
    protected String saleTicketId;
    @XmlElement(required = true)
    protected String nameProduct;
    protected long productCategoryId;
    protected long productCategoryCode;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cost;
    protected long productCategoryForeignId;
    protected long chargedPoints;
    @XmlElement(required = true)
    protected String pathImage;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad saleTicketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTicketId() {
        return saleTicketId;
    }

    /**
     * Define el valor de la propiedad saleTicketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTicketId(String value) {
        this.saleTicketId = value;
    }

    /**
     * Obtiene el valor de la propiedad nameProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * Define el valor de la propiedad nameProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProduct(String value) {
        this.nameProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryId.
     * 
     */
    public long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * Define el valor de la propiedad productCategoryId.
     * 
     */
    public void setProductCategoryId(long value) {
        this.productCategoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryCode.
     * 
     */
    public long getProductCategoryCode() {
        return productCategoryCode;
    }

    /**
     * Define el valor de la propiedad productCategoryCode.
     * 
     */
    public void setProductCategoryCode(long value) {
        this.productCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Define el valor de la propiedad cost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryForeignId.
     * 
     */
    public long getProductCategoryForeignId() {
        return productCategoryForeignId;
    }

    /**
     * Define el valor de la propiedad productCategoryForeignId.
     * 
     */
    public void setProductCategoryForeignId(long value) {
        this.productCategoryForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedPoints.
     * 
     */
    public long getChargedPoints() {
        return chargedPoints;
    }

    /**
     * Define el valor de la propiedad chargedPoints.
     * 
     */
    public void setChargedPoints(long value) {
        this.chargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Define el valor de la propiedad pathImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImage(String value) {
        this.pathImage = value;
    }

}
