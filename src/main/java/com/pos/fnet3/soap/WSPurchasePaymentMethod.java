
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PurchasePaymentMethod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PurchasePaymentMethod">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="money" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PurchasePaymentMethod", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "foreignId",
    "code",
    "money"
})
public class WSPurchasePaymentMethod {

    protected long id;
    protected long foreignId;
    @XmlElement(required = true)
    protected String code;
    protected double money;

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
     * Obtiene el valor de la propiedad foreignId.
     * 
     */
    public long getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     */
    public void setForeignId(long value) {
        this.foreignId = value;
    }

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
     * Obtiene el valor de la propiedad money.
     * 
     */
    public double getMoney() {
        return money;
    }

    /**
     * Define el valor de la propiedad money.
     * 
     */
    public void setMoney(double value) {
        this.money = value;
    }

}
