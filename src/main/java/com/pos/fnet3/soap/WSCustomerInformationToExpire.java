
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CustomerInformationToExpire complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_CustomerInformationToExpire">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pointToExpire" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="periodoForeignid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="dateClose" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerInformationToExpire", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "pointToExpire",
    "periodoForeignid",
    "dateClose"
})
public class WSCustomerInformationToExpire {

    protected double pointToExpire;
    protected long periodoForeignid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClose;

    /**
     * Obtiene el valor de la propiedad pointToExpire.
     * 
     */
    public double getPointToExpire() {
        return pointToExpire;
    }

    /**
     * Define el valor de la propiedad pointToExpire.
     * 
     */
    public void setPointToExpire(double value) {
        this.pointToExpire = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoForeignid.
     * 
     */
    public long getPeriodoForeignid() {
        return periodoForeignid;
    }

    /**
     * Define el valor de la propiedad periodoForeignid.
     * 
     */
    public void setPeriodoForeignid(long value) {
        this.periodoForeignid = value;
    }

    /**
     * Obtiene el valor de la propiedad dateClose.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClose() {
        return dateClose;
    }

    /**
     * Define el valor de la propiedad dateClose.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClose(XMLGregorianCalendar value) {
        this.dateClose = value;
    }

}
