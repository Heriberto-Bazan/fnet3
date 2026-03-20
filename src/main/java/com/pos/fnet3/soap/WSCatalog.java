
package com.pos.fnet3.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_Catalog complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_Catalog">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CatalogFlags"/>
 *         <element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="pdfPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="periods" type="{http://FidelyNET3_SW_01_89_00}WS_PeriodSimple" maxOccurs="unbounded"/>
 *         <element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Catalog", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "description",
    "dateFrom",
    "dateTo",
    "flags",
    "campaignId",
    "pdfPath",
    "periods",
    "orderBy"
})
public class WSCatalog {

    protected long id;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(required = true)
    protected WSCatalogFlags flags;
    protected long campaignId;
    @XmlElement(required = true)
    protected String pdfPath;
    @XmlElement(required = true)
    protected List<WSPeriodSimple> periods;
    protected long orderBy;

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
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogFlags }
     *     
     */
    public WSCatalogFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogFlags }
     *     
     */
    public void setFlags(WSCatalogFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfPath() {
        return pdfPath;
    }

    /**
     * Define el valor de la propiedad pdfPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfPath(String value) {
        this.pdfPath = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPeriodSimple }
     * 
     * 
     * @return
     *     The value of the periods property.
     */
    public List<WSPeriodSimple> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<>();
        }
        return this.periods;
    }

    /**
     * Obtiene el valor de la propiedad orderBy.
     * 
     */
    public long getOrderBy() {
        return orderBy;
    }

    /**
     * Define el valor de la propiedad orderBy.
     * 
     */
    public void setOrderBy(long value) {
        this.orderBy = value;
    }

}
