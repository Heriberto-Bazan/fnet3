
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
 *         <element name="superiorLevelCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo"/>
 *         <element name="mlmChargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="mlmDischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="mlmChargedPointsCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="mlmDischargedPointsCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="inferiorLevelCustomers" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo" maxOccurs="unbounded"/>
 *         <element name="currentCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo"/>
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
    "superiorLevelCustomer",
    "mlmChargedPoints",
    "mlmDischargedPoints",
    "mlmChargedPointsCount",
    "mlmDischargedPointsCount",
    "inferiorLevelCustomers",
    "currentCustomer",
    "pagination"
})
@XmlRootElement(name = "GetMLMInfoResponse")
public class GetMLMInfoResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSCustomerInfo superiorLevelCustomer;
    protected double mlmChargedPoints;
    protected double mlmDischargedPoints;
    protected long mlmChargedPointsCount;
    protected long mlmDischargedPointsCount;
    @XmlElement(required = true)
    protected List<WSCustomerInfo> inferiorLevelCustomers;
    @XmlElement(required = true)
    protected WSCustomerInfo currentCustomer;
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
     * Obtiene el valor de la propiedad superiorLevelCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInfo }
     *     
     */
    public WSCustomerInfo getSuperiorLevelCustomer() {
        return superiorLevelCustomer;
    }

    /**
     * Define el valor de la propiedad superiorLevelCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInfo }
     *     
     */
    public void setSuperiorLevelCustomer(WSCustomerInfo value) {
        this.superiorLevelCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmChargedPoints.
     * 
     */
    public double getMlmChargedPoints() {
        return mlmChargedPoints;
    }

    /**
     * Define el valor de la propiedad mlmChargedPoints.
     * 
     */
    public void setMlmChargedPoints(double value) {
        this.mlmChargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmDischargedPoints.
     * 
     */
    public double getMlmDischargedPoints() {
        return mlmDischargedPoints;
    }

    /**
     * Define el valor de la propiedad mlmDischargedPoints.
     * 
     */
    public void setMlmDischargedPoints(double value) {
        this.mlmDischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmChargedPointsCount.
     * 
     */
    public long getMlmChargedPointsCount() {
        return mlmChargedPointsCount;
    }

    /**
     * Define el valor de la propiedad mlmChargedPointsCount.
     * 
     */
    public void setMlmChargedPointsCount(long value) {
        this.mlmChargedPointsCount = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmDischargedPointsCount.
     * 
     */
    public long getMlmDischargedPointsCount() {
        return mlmDischargedPointsCount;
    }

    /**
     * Define el valor de la propiedad mlmDischargedPointsCount.
     * 
     */
    public void setMlmDischargedPointsCount(long value) {
        this.mlmDischargedPointsCount = value;
    }

    /**
     * Gets the value of the inferiorLevelCustomers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inferiorLevelCustomers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInferiorLevelCustomers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCustomerInfo }
     * 
     * 
     * @return
     *     The value of the inferiorLevelCustomers property.
     */
    public List<WSCustomerInfo> getInferiorLevelCustomers() {
        if (inferiorLevelCustomers == null) {
            inferiorLevelCustomers = new ArrayList<>();
        }
        return this.inferiorLevelCustomers;
    }

    /**
     * Obtiene el valor de la propiedad currentCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInfo }
     *     
     */
    public WSCustomerInfo getCurrentCustomer() {
        return currentCustomer;
    }

    /**
     * Define el valor de la propiedad currentCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInfo }
     *     
     */
    public void setCurrentCustomer(WSCustomerInfo value) {
        this.currentCustomer = value;
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
