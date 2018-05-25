/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.1.2-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.02.26 at 11:38:19 PM PST
//

package com.mirth.connect.plugins.datatypes.edi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dataType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="dataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="N0"/>
 *     &lt;enumeration value="N1"/>
 *     &lt;enumeration value="N2"/>
 *     &lt;enumeration value="N3"/>
 *     &lt;enumeration value="N4"/>
 *     &lt;enumeration value="N5"/>
 *     &lt;enumeration value="N6"/>
 *     &lt;enumeration value="N7"/>
 *     &lt;enumeration value="N8"/>
 *     &lt;enumeration value="N9"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="DT"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="O"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataType")
@XmlEnum
public enum DataType {

    N("N"), @XmlEnumValue("N0")
    N_0("N0"), @XmlEnumValue("N1")
    N_1("N1"), @XmlEnumValue("N2")
    N_2("N2"), @XmlEnumValue("N3")
    N_3("N3"), @XmlEnumValue("N4")
    N_4("N4"), @XmlEnumValue("N5")
    N_5("N5"), @XmlEnumValue("N6")
    N_6("N6"), @XmlEnumValue("N7")
    N_7("N7"), @XmlEnumValue("N8")
    N_8("N8"), @XmlEnumValue("N9")
    N_9("N9"), R("R"), ID("ID"), AN("AN"), DT("DT"), TM("TM"), B("B"), D("D"), O("O");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c : DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
