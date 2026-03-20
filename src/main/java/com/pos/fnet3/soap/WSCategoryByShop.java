
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CategoryByShop complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CategoryByShop">
 *   <complexContent>
 *     <extension base="{http://FidelyNET3_SW_01_89_00}WS_CategoryByShopBase">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaign" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CategoryFlags"/>
 *         <element name="labelPointsValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="urlImage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryByShop", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "code",
    "campaign",
    "name",
    "flags",
    "labelPointsValue",
    "urlImage"
})
public class WSCategoryByShop
    extends WSCategoryByShopBase
{

    protected long code;
    protected long campaign;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected WSCategoryFlags flags;
    @XmlElement(required = true)
    protected String labelPointsValue;
    @XmlElement(required = true)
    protected String urlImage;

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
     * Obtiene el valor de la propiedad campaign.
     * 
     */
    public long getCampaign() {
        return campaign;
    }

    /**
     * Define el valor de la propiedad campaign.
     * 
     */
    public void setCampaign(long value) {
        this.campaign = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCategoryFlags }
     *     
     */
    public WSCategoryFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCategoryFlags }
     *     
     */
    public void setFlags(WSCategoryFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad labelPointsValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPointsValue() {
        return labelPointsValue;
    }

    /**
     * Define el valor de la propiedad labelPointsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPointsValue(String value) {
        this.labelPointsValue = value;
    }

    /**
     * Obtiene el valor de la propiedad urlImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImage() {
        return urlImage;
    }

    /**
     * Define el valor de la propiedad urlImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImage(String value) {
        this.urlImage = value;
    }

}
