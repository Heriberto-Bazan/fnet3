
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fatherId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="geoLevel" type="{http://FidelyNET3_SW_01_89_00}WS_GeoLevel" maxOccurs="unbounded"/>
 *         <element name="pagination" type="{http://FidelyNET3_SW_01_89_00}WS_PaginationResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "level",
    "fatherId",
    "geoLevel",
    "pagination"
})
@XmlRootElement(name = "GetGeoLevelsResponse")
public class GetGeoLevelsResponse {

    protected int answerCode;
    protected int level;
    protected long fatherId;
    @XmlElement(required = true)
    protected List<WSGeoLevel> geoLevel;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad fatherId.
     * 
     */
    public long getFatherId() {
        return fatherId;
    }

    /**
     * Define el valor de la propiedad fatherId.
     * 
     */
    public void setFatherId(long value) {
        this.fatherId = value;
    }

    /**
     * Gets the value of the geoLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSGeoLevel }
     * 
     * 
     * @return
     *     The value of the geoLevel property.
     */
    public List<WSGeoLevel> getGeoLevel() {
        if (geoLevel == null) {
            geoLevel = new ArrayList<>();
        }
        return this.geoLevel;
    }

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link WSPaginationResult }
     *     
     */
    public WSPaginationResult getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaginationResult }
     *     
     */
    public void setPagination(WSPaginationResult value) {
        this.pagination = value;
    }

}
