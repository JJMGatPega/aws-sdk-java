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
package com.amazonaws.services.stepfunctions.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HistoryEvent JSON Unmarshaller
 */
public class HistoryEventJsonUnmarshaller implements Unmarshaller<HistoryEvent, JsonUnmarshallerContext> {

    public HistoryEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        HistoryEvent historyEvent = new HistoryEvent();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("timestamp", targetDepth)) {
                    context.nextToken();
                    historyEvent.setTimestamp(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    historyEvent.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    historyEvent.setId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("previousEventId", targetDepth)) {
                    context.nextToken();
                    historyEvent.setPreviousEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("activityFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityFailedEventDetails(ActivityFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityScheduleFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityScheduledEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityScheduledEventDetails(ActivityScheduledEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityStartedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityStartedEventDetails(ActivityStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activitySucceededEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivitySucceededEventDetails(ActivitySucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTimedOutEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setActivityTimedOutEventDetails(ActivityTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExecutionFailedEventDetails(ExecutionFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionStartedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExecutionStartedEventDetails(ExecutionStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionSucceededEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExecutionSucceededEventDetails(ExecutionSucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionAbortedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExecutionAbortedEventDetails(ExecutionAbortedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionTimedOutEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setExecutionTimedOutEventDetails(ExecutionTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionScheduleFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionScheduledEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionStartFailedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionSucceededEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionTimedOutEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stateEnteredEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStateEnteredEventDetails(StateEnteredEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stateExitedEventDetails", targetDepth)) {
                    context.nextToken();
                    historyEvent.setStateExitedEventDetails(StateExitedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return historyEvent;
    }

    private static HistoryEventJsonUnmarshaller instance;

    public static HistoryEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HistoryEventJsonUnmarshaller();
        return instance;
    }
}
