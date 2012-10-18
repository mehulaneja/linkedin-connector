/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package com.google.code.linkedinapi.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for null.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linkedin-html"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlEnum
public enum NetworkUpdateContentType {

    @XmlEnumValue("linkedin-html")
    LINKED_IN_HTML("linkedin-html");
    private final String value;

    NetworkUpdateContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkUpdateContentType fromValue(String v) {
        for (NetworkUpdateContentType c : NetworkUpdateContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
