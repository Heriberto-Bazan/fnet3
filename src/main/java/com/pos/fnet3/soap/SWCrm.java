
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SW_Crm complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="SW_Crm">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="crmID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="isTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="type_result" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_Crm", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "crmID",
    "name",
    "creationDate",
    "isTemplate",
    "typeResult"
})
public class SWCrm {

    protected long crmID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected boolean isTemplate;
    @XmlElement(name = "type_result")
    protected long typeResult;

    /**
     * Obtiene el valor de la propiedad crmID.
     * 
     */
    public long getCrmID() {
        return crmID;
    }

    /**
     * Define el valor de la propiedad crmID.
     * 
     */
    public void setCrmID(long value) {
        this.crmID = value;
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
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad isTemplate.
     * 
     */
    public boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * Define el valor de la propiedad isTemplate.
     * 
     */
    public void setIsTemplate(boolean value) {
        this.isTemplate = value;
    }

    /**
     * Obtiene el valor de la propiedad typeResult.
     * 
     */
    public long getTypeResult() {
        return typeResult;
    }

    /**
     * Define el valor de la propiedad typeResult.
     * 
     */
    public void setTypeResult(long value) {
        this.typeResult = value;
    }

}
