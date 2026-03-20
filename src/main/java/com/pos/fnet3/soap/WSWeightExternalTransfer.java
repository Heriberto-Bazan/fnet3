
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_WeightExternalTransfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_WeightExternalTransfer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pvPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="pvUnits" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_WeightExternalTransfer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "categoryId",
    "pvPoints",
    "pvUnits"
})
public class WSWeightExternalTransfer {

    protected long id;
    protected long categoryId;
    protected double pvPoints;
    protected double pvUnits;

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
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad pvPoints.
     * 
     */
    public double getPvPoints() {
        return pvPoints;
    }

    /**
     * Define el valor de la propiedad pvPoints.
     * 
     */
    public void setPvPoints(double value) {
        this.pvPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad pvUnits.
     * 
     */
    public double getPvUnits() {
        return pvUnits;
    }

    /**
     * Define el valor de la propiedad pvUnits.
     * 
     */
    public void setPvUnits(double value) {
        this.pvUnits = value;
    }

}
