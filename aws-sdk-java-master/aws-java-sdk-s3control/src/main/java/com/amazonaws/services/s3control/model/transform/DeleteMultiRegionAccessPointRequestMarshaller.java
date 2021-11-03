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
package com.amazonaws.services.s3control.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;

/**
 * DeleteMultiRegionAccessPointRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMultiRegionAccessPointRequestMarshaller implements
        Marshaller<Request<DeleteMultiRegionAccessPointRequest>, DeleteMultiRegionAccessPointRequest> {

    public Request<DeleteMultiRegionAccessPointRequest> marshall(DeleteMultiRegionAccessPointRequest deleteMultiRegionAccessPointRequest) {

        if (deleteMultiRegionAccessPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMultiRegionAccessPointRequest> request = new DefaultRequest<DeleteMultiRegionAccessPointRequest>(deleteMultiRegionAccessPointRequest,
                "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (deleteMultiRegionAccessPointRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(deleteMultiRegionAccessPointRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/async-requests/mrap/delete";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://awss3control.amazonaws.com/doc/2018-08-20/");

            xmlWriter.startElement("DeleteMultiRegionAccessPointRequest");
            if (deleteMultiRegionAccessPointRequest != null) {

                xmlWriter.startElement("ClientToken").value(IdempotentUtils.resolveString(deleteMultiRegionAccessPointRequest.getClientToken())).endElement();

                {
                    DeleteMultiRegionAccessPointInput details = deleteMultiRegionAccessPointRequest.getDetails();
                    if (details != null) {
                        xmlWriter.startElement("Details");

                        if (details.getName() != null) {
                            xmlWriter.startElement("Name").value(details.getName()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
            }
            xmlWriter.endElement();

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}