
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="totalPointsPrizes" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="totalAmountPrizes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="exchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrize" maxOccurs="unbounded"/>
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
    "totalPointsPrizes",
    "totalAmountPrizes",
    "exchangeDate",
    "prizesList",
    "pagination"
})
@XmlRootElement(name = "GetDeliverablePrizesResponse")
public class GetDeliverablePrizesResponse {

    protected int answerCode;
    protected double totalPointsPrizes;
    protected int totalAmountPrizes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(required = true)
    protected List<WSExchangedPrize> prizesList;
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
     * Obtiene el valor de la propiedad totalPointsPrizes.
     * 
     */
    public double getTotalPointsPrizes() {
        return totalPointsPrizes;
    }

    /**
     * Define el valor de la propiedad totalPointsPrizes.
     * 
     */
    public void setTotalPointsPrizes(double value) {
        this.totalPointsPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmountPrizes.
     * 
     */
    public int getTotalAmountPrizes() {
        return totalAmountPrizes;
    }

    /**
     * Define el valor de la propiedad totalAmountPrizes.
     * 
     */
    public void setTotalAmountPrizes(int value) {
        this.totalAmountPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Define el valor de la propiedad exchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
    }

    /**
     * Gets the value of the prizesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prizesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangedPrize }
     * 
     * 
     * @return
     *     The value of the prizesList property.
     */
    public List<WSExchangedPrize> getPrizesList() {
        if (prizesList == null) {
            prizesList = new ArrayList<>();
        }
        return this.prizesList;
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
