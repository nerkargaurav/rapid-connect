//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTRPromptNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTRPromptNameType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max4AN">
 *     &lt;enumeration value="BDAY"/>
 *     &lt;enumeration value="BLID"/>
 *     &lt;enumeration value="CNTN"/>
 *     &lt;enumeration value="DLIC"/>
 *     &lt;enumeration value="DLST"/>
 *     &lt;enumeration value="DRID"/>
 *     &lt;enumeration value="DTKT"/>
 *     &lt;enumeration value="FSTI"/>
 *     &lt;enumeration value="HBRD"/>
 *     &lt;enumeration value="HRRD"/>
 *     &lt;enumeration value="LCST"/>
 *     &lt;enumeration value="LSTN"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="ODRD"/>
 *     &lt;enumeration value="PONB"/>
 *     &lt;enumeration value="PPIN"/>
 *     &lt;enumeration value="RTMP"/>
 *     &lt;enumeration value="SSUB"/>
 *     &lt;enumeration value="TRIP"/>
 *     &lt;enumeration value="TRLR"/>
 *     &lt;enumeration value="UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTRPromptNameType")
@XmlEnum
public enum OTRPromptNameType {

    BDAY,
    BLID,
    CNTN,
    DLIC,
    DLST,
    DRID,
    DTKT,
    FSTI,
    HBRD,
    HRRD,
    LCST,
    LSTN,
    NAME,
    ODRD,
    PONB,
    PPIN,
    RTMP,
    SSUB,
    TRIP,
    TRLR,
    UNIT;

    public String value() {
        return name();
    }

    public static OTRPromptNameType fromValue(String v) {
        return valueOf(v);
    }

}
