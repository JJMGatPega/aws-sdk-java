/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.stepfunctions.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ActivityListItemMarshaller
 */
public class ActivityListItemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActivityListItem activityListItem, StructuredJsonGenerator jsonGenerator) {

        if (activityListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (activityListItem.getActivityArn() != null) {
                jsonGenerator.writeFieldName("activityArn").writeValue(activityListItem.getActivityArn());
            }
            if (activityListItem.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(activityListItem.getName());
            }
            if (activityListItem.getCreationDate() != null) {
                jsonGenerator.writeFieldName("creationDate").writeValue(activityListItem.getCreationDate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActivityListItemJsonMarshaller instance;

    public static ActivityListItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityListItemJsonMarshaller();
        return instance;
    }

}