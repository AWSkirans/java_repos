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
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InterruptionFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InterruptionFilterMarshaller {

    private static final MarshallingInfo<Long> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<String> PARTICIPANTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParticipantRole").build();
    private static final MarshallingInfo<StructuredPojo> ABSOLUTETIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AbsoluteTimeRange").build();
    private static final MarshallingInfo<StructuredPojo> RELATIVETIMERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RelativeTimeRange").build();
    private static final MarshallingInfo<Boolean> NEGATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Negate").build();

    private static final InterruptionFilterMarshaller instance = new InterruptionFilterMarshaller();

    public static InterruptionFilterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InterruptionFilter interruptionFilter, ProtocolMarshaller protocolMarshaller) {

        if (interruptionFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(interruptionFilter.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(interruptionFilter.getParticipantRole(), PARTICIPANTROLE_BINDING);
            protocolMarshaller.marshall(interruptionFilter.getAbsoluteTimeRange(), ABSOLUTETIMERANGE_BINDING);
            protocolMarshaller.marshall(interruptionFilter.getRelativeTimeRange(), RELATIVETIMERANGE_BINDING);
            protocolMarshaller.marshall(interruptionFilter.getNegate(), NEGATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}