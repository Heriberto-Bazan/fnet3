
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangeCode complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_ExchangeCode">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeCodeFlags"/>
 *         <element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrize" maxOccurs="unbounded"/>
 *         <element name="voucher" type="{http://FidelyNET3_SW_01_89_00}WS_Voucher"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangeCode", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "code",
    "flags",
    "prize",
    "voucher"
})
public class WSExchangeCode {

    protected long id;
    protected long code;
    @XmlElement(required = true)
    protected WSExchangeCodeFlags flags;
    @XmlElement(required = true)
    protected List<WSExchangedPrize> prize;
    @XmlElement(required = true, nillable = true)
    protected WSVoucher voucher;

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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangeCodeFlags }
     *     
     */
    public WSExchangeCodeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangeCodeFlags }
     *     
     */
    public void setFlags(WSExchangeCodeFlags value) {
        this.flags = value;
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
     * {@link WSExchangedPrize }
     * 
     * 
     * @return
     *     The value of the prize property.
     */
    public List<WSExchangedPrize> getPrize() {
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

}
