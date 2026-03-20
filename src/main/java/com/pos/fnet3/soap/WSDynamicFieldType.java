
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DynamicFieldType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_DynamicFieldType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         <element name="minValue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         <element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DynamicFieldType", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "dataType",
    "maxValue",
    "minValue",
    "length"
})
public class WSDynamicFieldType {

    protected long id;
    protected int dataType;
    @XmlElement(required = true)
    protected Object maxValue;
    @XmlElement(required = true)
    protected Object minValue;
    protected int length;

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
     * Obtiene el valor de la propiedad dataType.
     * 
     */
    public int getDataType() {
        return dataType;
    }

    /**
     * Define el valor de la propiedad dataType.
     * 
     */
    public void setDataType(int value) {
        this.dataType = value;
    }

    /**
     * Obtiene el valor de la propiedad maxValue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMaxValue() {
        return maxValue;
    }

    /**
     * Define el valor de la propiedad maxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMaxValue(Object value) {
        this.maxValue = value;
    }

    /**
     * Obtiene el valor de la propiedad minValue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMinValue() {
        return minValue;
    }

    /**
     * Define el valor de la propiedad minValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMinValue(Object value) {
        this.minValue = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

}
