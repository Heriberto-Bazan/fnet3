
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PeriodSimple complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PeriodSimple">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="periodId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PeriodSimple", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "periodId",
    "foreignId"
})
public class WSPeriodSimple {

    protected long periodId;
    protected long foreignId;

    /**
     * Obtiene el valor de la propiedad periodId.
     * 
     */
    public long getPeriodId() {
        return periodId;
    }

    /**
     * Define el valor de la propiedad periodId.
     * 
     */
    public void setPeriodId(long value) {
        this.periodId = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     */
    public long getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     */
    public void setForeignId(long value) {
        this.foreignId = value;
    }

}
