
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DiscountExchange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DiscountExchange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="discountPrizeList" type="{http://FidelyNET3_SW_01_89_00}WS_Discount4Prize" maxOccurs="unbounded"/>
 *         <element name="totalDiscountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DiscountExchange", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "discountPrizeList",
    "totalDiscountInMoney"
})
public class WSDiscountExchange {

    @XmlElement(required = true)
    protected List<WSDiscount4Prize> discountPrizeList;
    protected double totalDiscountInMoney;

    /**
     * Gets the value of the discountPrizeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the discountPrizeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPrizeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDiscount4Prize }
     * 
     * 
     * @return
     *     The value of the discountPrizeList property.
     */
    public List<WSDiscount4Prize> getDiscountPrizeList() {
        if (discountPrizeList == null) {
            discountPrizeList = new ArrayList<>();
        }
        return this.discountPrizeList;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountInMoney.
     * 
     */
    public double getTotalDiscountInMoney() {
        return totalDiscountInMoney;
    }

    /**
     * Define el valor de la propiedad totalDiscountInMoney.
     * 
     */
    public void setTotalDiscountInMoney(double value) {
        this.totalDiscountInMoney = value;
    }

}
