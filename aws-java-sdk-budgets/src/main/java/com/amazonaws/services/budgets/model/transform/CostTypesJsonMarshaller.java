/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.budgets.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CostTypesMarshaller
 */
public class CostTypesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CostTypes costTypes, StructuredJsonGenerator jsonGenerator) {

        if (costTypes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (costTypes.getIncludeTax() != null) {
                jsonGenerator.writeFieldName("IncludeTax").writeValue(costTypes.getIncludeTax());
            }
            if (costTypes.getIncludeSubscription() != null) {
                jsonGenerator.writeFieldName("IncludeSubscription").writeValue(costTypes.getIncludeSubscription());
            }
            if (costTypes.getUseBlended() != null) {
                jsonGenerator.writeFieldName("UseBlended").writeValue(costTypes.getUseBlended());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CostTypesJsonMarshaller instance;

    public static CostTypesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CostTypesJsonMarshaller();
        return instance;
    }

}
