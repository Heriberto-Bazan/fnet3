
package com.pos.fnet3.soap;

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
 *         <element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="fatherId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "sessionID",
    "level",
    "fatherId",
    "countryId",
    "pagination"
})
@XmlRootElement(name = "GetGeoLevelsRequest")
public class GetGeoLevelsRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected int level;
    protected long fatherId;
    protected long countryId;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Obtiene el valor de la propiedad countryId.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Define el valor de la propiedad countryId.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
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
