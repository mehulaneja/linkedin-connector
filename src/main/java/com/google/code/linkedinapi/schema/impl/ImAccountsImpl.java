/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package com.google.code.linkedinapi.schema.impl;

import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.ImAccount;
import com.google.code.linkedinapi.schema.ImAccounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "imAccountList"
})
@XmlRootElement(name = "im-accounts")
public class ImAccountsImpl
        implements Serializable, ImAccounts {

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "im-account", type = ImAccountImpl.class)
    protected List<ImAccount> imAccountList;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1.class)
    protected Long total;

    public List<ImAccount> getImAccountList() {
        if (imAccountList == null) {
            imAccountList = new ArrayList<ImAccount>();
        }
        return this.imAccountList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

}
