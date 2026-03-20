
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_FoilList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_FoilList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="foilNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_Prize"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_FoilList", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "foilNumber",
    "prize"
})
public class WSFoilList {

    @XmlElement(required = true)
    protected String foilNumber;
    @XmlElement(required = true)
    protected WSPrize prize;

    /**
     * Obtiene el valor de la propiedad foilNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoilNumber() {
        return foilNumber;
    }

    /**
     * Define el valor de la propiedad foilNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoilNumber(String value) {
        this.foilNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrize }
     *     
     */
    public WSPrize getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrize }
     *     
     */
    public void setPrize(WSPrize value) {
        this.prize = value;
    }

}
