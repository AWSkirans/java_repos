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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartSentimentDetectionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSentimentDetectionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The status of the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. To get details, use the operation.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     * </p>
     * 
     * @param jobId
     *        The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     * </p>
     * 
     * @return The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     * </p>
     * 
     * @param jobId
     *        The identifier generated for the job. To get the status of a job, use this identifier with the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSentimentDetectionJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier
     *        for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:</p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     *        </p>
     *        <p>
     *        The following is an example job ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier
     *         for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as
     *         follows:</p>
     *         <p>
     *         <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     *         </p>
     *         <p>
     *         The following is an example job ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier for the
     * job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:
     * </p>
     * <p>
     * <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     * </p>
     * <p>
     * The following is an example job ARN:
     * </p>
     * <p>
     * <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the sentiment detection job. It is a unique, fully qualified identifier
     *        for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:</p>
     *        <p>
     *        <code>arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:sentiment-detection-job/&lt;job-id&gt;</code>
     *        </p>
     *        <p>
     *        The following is an example job ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:comprehend:us-west-2:111122223333:sentiment-detection-job/1234abcd12ab34cd56ef1234567890ab</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSentimentDetectionJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. To get details, use the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SUBMITTED - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - Amazon Comprehend is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The job did not complete. To get details, use the operation.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. To get details, use the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the job. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SUBMITTED - The job has been received and is queued for processing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN_PROGRESS - Amazon Comprehend is processing the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED - The job was successfully completed and the output is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED - The job did not complete. To get details, use the operation.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. To get details, use the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SUBMITTED - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - Amazon Comprehend is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The job did not complete. To get details, use the operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartSentimentDetectionJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * SUBMITTED - The job has been received and is queued for processing.
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS - Amazon Comprehend is processing the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED - The job was successfully completed and the output is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED - The job did not complete. To get details, use the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the job. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        SUBMITTED - The job has been received and is queued for processing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS - Amazon Comprehend is processing the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED - The job was successfully completed and the output is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED - The job did not complete. To get details, use the operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartSentimentDetectionJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSentimentDetectionJobResult == false)
            return false;
        StartSentimentDetectionJobResult other = (StartSentimentDetectionJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public StartSentimentDetectionJobResult clone() {
        try {
            return (StartSentimentDetectionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}