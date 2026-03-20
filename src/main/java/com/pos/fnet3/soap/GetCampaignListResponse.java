
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
 *         <element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/>
 *         <element name="terminal" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalByCampaign"/>
 *         <element name="campaigns" type="{http://FidelyNET3_SW_01_89_00}WS_Campaign" maxOccurs="unbounded"/>
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
    "shop",
    "terminal",
    "campaigns",
    "pagination"
})
@XmlRootElement(name = "GetCampaignListResponse")
public class GetCampaignListResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shop;
    @XmlElement(required = true)
    protected WSTerminalByCampaign terminal;
    @XmlElement(required = true)
    protected List<WSCampaign> campaigns;
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
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShop(WSShopByCampaignBehavior value) {
        this.shop = value;
    }

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public WSTerminalByCampaign getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public void setTerminal(WSTerminalByCampaign value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCampaign }
     * 
     * 
     * @return
     *     The value of the campaigns property.
     */
    public List<WSCampaign> getCampaigns() {
        if (campaigns == null) {
            campaigns = new ArrayList<>();
        }
        return this.campaigns;
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
