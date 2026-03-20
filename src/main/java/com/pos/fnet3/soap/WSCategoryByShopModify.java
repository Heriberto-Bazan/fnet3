
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CategoryByShopModify complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CategoryByShopModify">
 *   <complexContent>
 *     <extension base="{http://FidelyNET3_SW_01_89_00}WS_CategoryByShopBase">
 *       <sequence>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CategoryFlagsBase"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryByShopModify", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags"
})
public class WSCategoryByShopModify
    extends WSCategoryByShopBase
{

    @XmlElement(required = true)
    protected WSCategoryFlagsBase flags;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCategoryFlagsBase }
     *     
     */
    public WSCategoryFlagsBase getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCategoryFlagsBase }
     *     
     */
    public void setFlags(WSCategoryFlagsBase value) {
        this.flags = value;
    }

}
