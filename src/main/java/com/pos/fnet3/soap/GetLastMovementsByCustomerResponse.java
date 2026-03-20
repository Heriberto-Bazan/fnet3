
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
 *         <element name="generalBillingData" type="{http://FidelyNET3_SW_01_89_00}SW_GeneralBillingData"/>
 *         <element name="customer" type="{http://FidelyNET3_SW_01_89_00}WS_Customer"/>
 *         <element name="movements" type="{http://FidelyNET3_SW_01_89_00}WS_MovementWithPromotions" maxOccurs="unbounded"/>
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
    "generalBillingData",
    "customer",
    "movements",
    "pagination"
})
@XmlRootElement(name = "GetLastMovementsByCustomerResponse")
public class GetLastMovementsByCustomerResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected SWGeneralBillingData generalBillingData;
    @XmlElement(required = true)
    protected WSCustomer customer;
    @XmlElement(required = true)
    protected List<WSMovementWithPromotions> movements;
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
     * Obtiene el valor de la propiedad generalBillingData.
     * 
     * @return
     *     possible object is
     *     {@link SWGeneralBillingData }
     *     
     */
    public SWGeneralBillingData getGeneralBillingData() {
        return generalBillingData;
    }

    /**
     * Define el valor de la propiedad generalBillingData.
     * 
     * @param value
     *     allowed object is
     *     {@link SWGeneralBillingData }
     *     
     */
    public void setGeneralBillingData(SWGeneralBillingData value) {
        this.generalBillingData = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomer }
     *     
     */
    public WSCustomer getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomer }
     *     
     */
    public void setCustomer(WSCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the movements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the movements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMovementWithPromotions }
     * 
     * 
     * @return
     *     The value of the movements property.
     */
    public List<WSMovementWithPromotions> getMovements() {
        if (movements == null) {
            movements = new ArrayList<>();
        }
        return this.movements;
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
