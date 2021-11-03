/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import javax.annotation.Generated;

/**
 * <p>
 * Access is throttled.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.quicksight.model.AmazonQuickSightException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The Amazon Web Services request ID for this request.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this request.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this request.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this request.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}