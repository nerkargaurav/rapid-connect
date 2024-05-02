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
 * <p>Java class for FndSrcType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FndSrcType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max7AN">
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Debit"/>
 *     &lt;enumeration value="Prepaid"/>
 *     &lt;enumeration value="DepAcct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FndSrcType")
@XmlEnum
public enum FndSrcType {

    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("Prepaid")
    PREPAID("Prepaid"),
    @XmlEnumValue("DepAcct")
    DEP_ACCT("DepAcct");
    private final String value;

    FndSrcType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FndSrcType fromValue(String v) {
        for (FndSrcType c: FndSrcType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
