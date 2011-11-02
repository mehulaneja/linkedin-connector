/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema.xpp;

import com.google.code.linkedinapi.schema.RecommendationCode;
import com.google.code.linkedinapi.schema.RecommendationType;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;

public class RecommendationTypeImpl
        extends BaseSchemaEntity
        implements RecommendationType {

    private final static long serialVersionUID = 2461660169443089969L;
    protected RecommendationCode code;

    public RecommendationCode getCode() {
        return code;
    }

    public void setCode(RecommendationCode value) {
        this.code = value;
    }

    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();

            if (name.equals("code")) {
                setCode(RecommendationCode.fromValue(XppUtils.getElementValueFromNode(parser)));
            } else {
                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }

    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
        XmlSerializer element = serializer.startTag(null, "recommendation-type");
        XppUtils.setElementValueToNode(element, "code", getCode().value());
        element.endTag(null, "recommendation-type");
    }
}