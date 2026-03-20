
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_OrderFields complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_OrderFields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="criteria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OrderFields", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "criteria",
    "columnName"
})
public class WSOrderFields {

    protected boolean criteria;
    @XmlElement(required = true)
    protected String columnName;

    /**
     * Obtiene el valor de la propiedad criteria.
     * 
     */
    public boolean isCriteria() {
        return criteria;
    }

    /**
     * Define el valor de la propiedad criteria.
     * 
     */
    public void setCriteria(boolean value) {
        this.criteria = value;
    }

    /**
     * Obtiene el valor de la propiedad columnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Define el valor de la propiedad columnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

}
