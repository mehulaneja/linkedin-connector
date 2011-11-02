/**
 * Mule LinkedIn Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package com.google.code.linkedinapi.schema.impl;

import com.google.code.linkedinapi.schema.MemberUrl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "url",
        "name"
})
@XmlRootElement(name = "member-url")
public class MemberUrlImpl
        implements Serializable, MemberUrl {

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String name;

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
