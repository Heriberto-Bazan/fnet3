
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_NetFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_NetFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="useProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useAmountProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NetFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useProducts",
    "useAmountProducts"
})
public class WSNetFlags {

    protected long flags;
    protected boolean useProducts;
    protected boolean useAmountProducts;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad useProducts.
     * 
     */
    public boolean isUseProducts() {
        return useProducts;
    }

    /**
     * Define el valor de la propiedad useProducts.
     * 
     */
    public void setUseProducts(boolean value) {
        this.useProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad useAmountProducts.
     * 
     */
    public boolean isUseAmountProducts() {
        return useAmountProducts;
    }

    /**
     * Define el valor de la propiedad useAmountProducts.
     * 
     */
    public void setUseAmountProducts(boolean value) {
        this.useAmountProducts = value;
    }

}
