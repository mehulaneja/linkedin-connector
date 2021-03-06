/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package com.google.code.linkedinapi.schema;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="business-partner"/>
 *               &lt;enumeration value="colleague"/>
 *               &lt;enumeration value="education"/>
 *               &lt;enumeration value="service-provider"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public interface RecommendationType
        extends SchemaEntity {


    /**
     * Gets the value of the code property.
     *
     * @return possible object is
     *         {@link RecommendationCode }
     */
    RecommendationCode getCode();

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is
     *              {@link RecommendationCode }
     */
    void setCode(RecommendationCode value);

}
