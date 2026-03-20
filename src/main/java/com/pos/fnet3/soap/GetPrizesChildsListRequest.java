
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
 *         <element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "session",
    "prizeId",
    "prizeCode",
    "catalogId",
    "pagination"
})
@XmlRootElement(name = "GetPrizesChildsListRequest")
public class GetPrizesChildsListRequest {

    @XmlElement(required = true)
    protected String session;
    protected long prizeId;
    @XmlElement(required = true)
    protected String prizeCode;
    protected long catalogId;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

    /**
     * Obtiene el valor de la propiedad session.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSession(String value) {
        this.session = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeId.
     * 
     */
    public long getPrizeId() {
        return prizeId;
    }

    /**
     * Define el valor de la propiedad prizeId.
     * 
     */
    public void setPrizeId(long value) {
        this.prizeId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeCode() {
        return prizeCode;
    }

    /**
     * Define el valor de la propiedad prizeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeCode(String value) {
        this.prizeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
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
