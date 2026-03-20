
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PaginationResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_PaginationResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="initLimit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="orders" type="{http://FidelyNET3_SW_01_89_00}WS_OrderFields" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="recordsTotal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="actualPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PaginationResult", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "initLimit",
    "rowCount",
    "orders",
    "recordsTotal",
    "actualPage",
    "totalPages"
})
public class WSPaginationResult {

    protected long initLimit;
    protected long rowCount;
    protected List<WSOrderFields> orders;
    protected long recordsTotal;
    protected int actualPage;
    protected int totalPages;

    /**
     * Obtiene el valor de la propiedad initLimit.
     * 
     */
    public long getInitLimit() {
        return initLimit;
    }

    /**
     * Define el valor de la propiedad initLimit.
     * 
     */
    public void setInitLimit(long value) {
        this.initLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad rowCount.
     * 
     */
    public long getRowCount() {
        return rowCount;
    }

    /**
     * Define el valor de la propiedad rowCount.
     * 
     */
    public void setRowCount(long value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOrderFields }
     * 
     * 
     * @return
     *     The value of the orders property.
     */
    public List<WSOrderFields> getOrders() {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        return this.orders;
    }

    /**
     * Obtiene el valor de la propiedad recordsTotal.
     * 
     */
    public long getRecordsTotal() {
        return recordsTotal;
    }

    /**
     * Define el valor de la propiedad recordsTotal.
     * 
     */
    public void setRecordsTotal(long value) {
        this.recordsTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPage.
     * 
     */
    public int getActualPage() {
        return actualPage;
    }

    /**
     * Define el valor de la propiedad actualPage.
     * 
     */
    public void setActualPage(int value) {
        this.actualPage = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPages.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Define el valor de la propiedad totalPages.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
