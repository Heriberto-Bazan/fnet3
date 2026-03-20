
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DynamicField complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DynamicField">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dictionaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldFlags"/>
 *         <element name="order" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="options" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldOption" maxOccurs="unbounded"/>
 *         <element name="representation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="type" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DynamicField", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "name",
    "dictionaryKey",
    "defaultValue",
    "flags",
    "order",
    "options",
    "representation",
    "type"
})
public class WSDynamicField {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String dictionaryKey;
    @XmlElement(required = true)
    protected String defaultValue;
    @XmlElement(required = true)
    protected WSDynamicFieldFlags flags;
    protected long order;
    @XmlElement(required = true)
    protected List<WSDynamicFieldOption> options;
    protected int representation;
    @XmlElement(required = true)
    protected WSDynamicFieldType type;

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
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
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
     * Obtiene el valor de la propiedad dictionaryKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryKey() {
        return dictionaryKey;
    }

    /**
     * Define el valor de la propiedad dictionaryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryKey(String value) {
        this.dictionaryKey = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSDynamicFieldFlags }
     *     
     */
    public WSDynamicFieldFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDynamicFieldFlags }
     *     
     */
    public void setFlags(WSDynamicFieldFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public long getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(long value) {
        this.order = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDynamicFieldOption }
     * 
     * 
     * @return
     *     The value of the options property.
     */
    public List<WSDynamicFieldOption> getOptions() {
        if (options == null) {
            options = new ArrayList<>();
        }
        return this.options;
    }

    /**
     * Obtiene el valor de la propiedad representation.
     * 
     */
    public int getRepresentation() {
        return representation;
    }

    /**
     * Define el valor de la propiedad representation.
     * 
     */
    public void setRepresentation(int value) {
        this.representation = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link WSDynamicFieldType }
     *     
     */
    public WSDynamicFieldType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDynamicFieldType }
     *     
     */
    public void setType(WSDynamicFieldType value) {
        this.type = value;
    }

}
