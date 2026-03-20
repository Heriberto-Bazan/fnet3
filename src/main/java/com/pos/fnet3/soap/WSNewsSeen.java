
package com.pos.fnet3.soap;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_NewsSeen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_NewsSeen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="seenCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="seenDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NewsSeen", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "seenCount",
    "seenDate"
})
public class WSNewsSeen {

    protected long seenCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seenDate;

    /**
     * Obtiene el valor de la propiedad seenCount.
     * 
     */
    public long getSeenCount() {
        return seenCount;
    }

    /**
     * Define el valor de la propiedad seenCount.
     * 
     */
    public void setSeenCount(long value) {
        this.seenCount = value;
    }

    /**
     * Obtiene el valor de la propiedad seenDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeenDate() {
        return seenDate;
    }

    /**
     * Define el valor de la propiedad seenDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeenDate(XMLGregorianCalendar value) {
        this.seenDate = value;
    }

}
