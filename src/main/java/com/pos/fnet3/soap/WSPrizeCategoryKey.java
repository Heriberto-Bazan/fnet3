
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeCategoryKey complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PrizeCategoryKey">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCategoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCategoryKeyFlags"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCategoryKey", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "prizeCategoryId",
    "description",
    "flags"
})
public class WSPrizeCategoryKey {

    protected long id;
    protected long prizeCategoryId;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected WSPrizeCategoryKeyFlags flags;

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
     * Obtiene el valor de la propiedad prizeCategoryId.
     * 
     */
    public long getPrizeCategoryId() {
        return prizeCategoryId;
    }

    /**
     * Define el valor de la propiedad prizeCategoryId.
     * 
     */
    public void setPrizeCategoryId(long value) {
        this.prizeCategoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeCategoryKeyFlags }
     *     
     */
    public WSPrizeCategoryKeyFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeCategoryKeyFlags }
     *     
     */
    public void setFlags(WSPrizeCategoryKeyFlags value) {
        this.flags = value;
    }

}
