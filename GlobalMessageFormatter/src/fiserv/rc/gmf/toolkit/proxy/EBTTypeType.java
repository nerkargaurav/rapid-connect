//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBTTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EBTTypeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max7AN">
 *     &lt;enumeration value="EBTCash"/>
 *     &lt;enumeration value="SNAP"/>
 *     &lt;enumeration value="eWIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EBTTypeType")
@XmlEnum
public enum EBTTypeType {

    @XmlEnumValue("EBTCash")
    EBT_CASH("EBTCash"),
    SNAP("SNAP"),
    @XmlEnumValue("eWIC")
    E_WIC("eWIC");
    private final String value;

    EBTTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EBTTypeType fromValue(String v) {
        for (EBTTypeType c: EBTTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
