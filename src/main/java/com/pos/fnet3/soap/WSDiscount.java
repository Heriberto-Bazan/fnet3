
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Discount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Discount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="discountProductList" type="{http://FidelyNET3_SW_01_89_00}WS_Discount4Product" maxOccurs="unbounded"/>
 *         <element name="discountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Discount", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "kind",
    "value",
    "discountProductList",
    "discountInMoney"
})
public class WSDiscount {

    protected long id;
    protected int kind;
    protected double value;
    @XmlElement(required = true)
    protected List<WSDiscount4Product> discountProductList;
    protected double discountInMoney;

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
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the discountProductList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the discountProductList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDiscount4Product }
     * 
     * 
     * @return
     *     The value of the discountProductList property.
     */
    public List<WSDiscount4Product> getDiscountProductList() {
        if (discountProductList == null) {
            discountProductList = new ArrayList<>();
        }
        return this.discountProductList;
    }

    /**
     * Obtiene el valor de la propiedad discountInMoney.
     * 
     */
    public double getDiscountInMoney() {
        return discountInMoney;
    }

    /**
     * Define el valor de la propiedad discountInMoney.
     * 
     */
    public void setDiscountInMoney(double value) {
        this.discountInMoney = value;
    }

}
