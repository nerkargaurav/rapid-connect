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
 * <p>Java class for CofSchdIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CofSchdIndType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max11AN">
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Unscheduled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CofSchdIndType")
@XmlEnum
public enum CofSchdIndType {

    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Unscheduled")
    UNSCHEDULED("Unscheduled");
    private final String value;

    CofSchdIndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CofSchdIndType fromValue(String v) {
        for (CofSchdIndType c: CofSchdIndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
