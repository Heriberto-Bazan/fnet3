
package com.pos.fnet3.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_TerminalInformativeFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="WS_TerminalInformativeFlags">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="informativeFlags" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="hasToUpdateLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="errorInUpdateLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hasToUpdateFW" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hasToUpdateCampaignByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hasToUpdateShopBanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="errorInUpdateShopBanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hasToUpdateGeoLevelsFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalInformativeFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "informativeFlags",
    "hasToUpdateLogo",
    "errorInUpdateLogo",
    "hasToUpdateFW",
    "hasToUpdateCampaignByDefault",
    "hasToUpdateShopBanner",
    "errorInUpdateShopBanner",
    "hasToUpdateGeoLevelsFile"
})
public class WSTerminalInformativeFlags {

    protected long informativeFlags;
    protected boolean hasToUpdateLogo;
    protected boolean errorInUpdateLogo;
    protected boolean hasToUpdateFW;
    protected boolean hasToUpdateCampaignByDefault;
    protected boolean hasToUpdateShopBanner;
    protected boolean errorInUpdateShopBanner;
    protected boolean hasToUpdateGeoLevelsFile;

    /**
     * Obtiene el valor de la propiedad informativeFlags.
     * 
     */
    public long getInformativeFlags() {
        return informativeFlags;
    }

    /**
     * Define el valor de la propiedad informativeFlags.
     * 
     */
    public void setInformativeFlags(long value) {
        this.informativeFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateLogo.
     * 
     */
    public boolean isHasToUpdateLogo() {
        return hasToUpdateLogo;
    }

    /**
     * Define el valor de la propiedad hasToUpdateLogo.
     * 
     */
    public void setHasToUpdateLogo(boolean value) {
        this.hasToUpdateLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateLogo.
     * 
     */
    public boolean isErrorInUpdateLogo() {
        return errorInUpdateLogo;
    }

    /**
     * Define el valor de la propiedad errorInUpdateLogo.
     * 
     */
    public void setErrorInUpdateLogo(boolean value) {
        this.errorInUpdateLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateFW.
     * 
     */
    public boolean isHasToUpdateFW() {
        return hasToUpdateFW;
    }

    /**
     * Define el valor de la propiedad hasToUpdateFW.
     * 
     */
    public void setHasToUpdateFW(boolean value) {
        this.hasToUpdateFW = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateCampaignByDefault.
     * 
     */
    public boolean isHasToUpdateCampaignByDefault() {
        return hasToUpdateCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad hasToUpdateCampaignByDefault.
     * 
     */
    public void setHasToUpdateCampaignByDefault(boolean value) {
        this.hasToUpdateCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateShopBanner.
     * 
     */
    public boolean isHasToUpdateShopBanner() {
        return hasToUpdateShopBanner;
    }

    /**
     * Define el valor de la propiedad hasToUpdateShopBanner.
     * 
     */
    public void setHasToUpdateShopBanner(boolean value) {
        this.hasToUpdateShopBanner = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateShopBanner.
     * 
     */
    public boolean isErrorInUpdateShopBanner() {
        return errorInUpdateShopBanner;
    }

    /**
     * Define el valor de la propiedad errorInUpdateShopBanner.
     * 
     */
    public void setErrorInUpdateShopBanner(boolean value) {
        this.errorInUpdateShopBanner = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateGeoLevelsFile.
     * 
     */
    public boolean isHasToUpdateGeoLevelsFile() {
        return hasToUpdateGeoLevelsFile;
    }

    /**
     * Define el valor de la propiedad hasToUpdateGeoLevelsFile.
     * 
     */
    public void setHasToUpdateGeoLevelsFile(boolean value) {
        this.hasToUpdateGeoLevelsFile = value;
    }

}
