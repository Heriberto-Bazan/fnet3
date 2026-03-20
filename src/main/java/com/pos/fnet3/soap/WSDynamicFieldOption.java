
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DynamicFieldOption complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DynamicFieldOption">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="useDefaultValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dictionaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DynamicFieldOption", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "value",
    "useDefaultValue",
    "dictionaryKey"
})
public class WSDynamicFieldOption {

    protected long id;
    @XmlElement(required = true)
    protected String value;
    protected boolean useDefaultValue;
    @XmlElement(required = true)
    protected String dictionaryKey;

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
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad useDefaultValue.
     * 
     */
    public boolean isUseDefaultValue() {
        return useDefaultValue;
    }

    /**
     * Define el valor de la propiedad useDefaultValue.
     * 
     */
    public void setUseDefaultValue(boolean value) {
        this.useDefaultValue = value;
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

}
