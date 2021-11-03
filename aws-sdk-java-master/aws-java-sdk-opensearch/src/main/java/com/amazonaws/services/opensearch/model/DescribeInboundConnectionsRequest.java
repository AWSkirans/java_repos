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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code> <a>DescribeInboundConnections</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInboundConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> values are:
     * <ul>
     * <li>connection-id</li>
     * <li>local-domain-info.domain-name</li>
     * <li>local-domain-info.owner-id</li>
     * <li>local-domain-info.region</li>
     * <li>remote-domain-info.domain-name</li>
     * </ul>
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> values are:
     * <ul>
     * <li>connection-id</li>
     * <li>local-domain-info.domain-name</li>
     * <li>local-domain-info.owner-id</li>
     * <li>local-domain-info.region</li>
     * <li>remote-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @return A list of filters used to match properties for inbound cross-cluster connections. Available
     *         <code> <a>Filter</a> </code> values are:
     *         <ul>
     *         <li>connection-id</li>
     *         <li>local-domain-info.domain-name</li>
     *         <li>local-domain-info.owner-id</li>
     *         <li>local-domain-info.region</li>
     *         <li>remote-domain-info.domain-name</li>
     *         </ul>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> values are:
     * <ul>
     * <li>connection-id</li>
     * <li>local-domain-info.domain-name</li>
     * <li>local-domain-info.owner-id</li>
     * <li>local-domain-info.region</li>
     * <li>remote-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for inbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> values are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>local-domain-info.domain-name</li>
     *        <li>local-domain-info.owner-id</li>
     *        <li>local-domain-info.region</li>
     *        <li>remote-domain-info.domain-name</li>
     *        </ul>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> values are:
     * <ul>
     * <li>connection-id</li>
     * <li>local-domain-info.domain-name</li>
     * <li>local-domain-info.owner-id</li>
     * <li>local-domain-info.region</li>
     * <li>remote-domain-info.domain-name</li>
     * </ul>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for inbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> values are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>local-domain-info.domain-name</li>
     *        <li>local-domain-info.owner-id</li>
     *        <li>local-domain-info.region</li>
     *        <li>remote-domain-info.domain-name</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInboundConnectionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filters used to match properties for inbound cross-cluster connections. Available
     * <code> <a>Filter</a> </code> values are:
     * <ul>
     * <li>connection-id</li>
     * <li>local-domain-info.domain-name</li>
     * <li>local-domain-info.owner-id</li>
     * <li>local-domain-info.region</li>
     * <li>remote-domain-info.domain-name</li>
     * </ul>
     * </p>
     * 
     * @param filters
     *        A list of filters used to match properties for inbound cross-cluster connections. Available
     *        <code> <a>Filter</a> </code> values are:
     *        <ul>
     *        <li>connection-id</li>
     *        <li>local-domain-info.domain-name</li>
     *        <li>local-domain-info.owner-id</li>
     *        <li>local-domain-info.region</li>
     *        <li>remote-domain-info.domain-name</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInboundConnectionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @return Set this value to limit the number of results returned. If not specified, defaults to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. If not specified, defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. If not specified, defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInboundConnectionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @return If more results are available and NextToken is present, make the next request to the same API with the
     *         received NextToken to paginate the remaining results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If more results are available and NextToken is present, make the next request to the same API with the received
     * NextToken to paginate the remaining results.
     * </p>
     * 
     * @param nextToken
     *        If more results are available and NextToken is present, make the next request to the same API with the
     *        received NextToken to paginate the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInboundConnectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInboundConnectionsRequest == false)
            return false;
        DescribeInboundConnectionsRequest other = (DescribeInboundConnectionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInboundConnectionsRequest clone() {
        return (DescribeInboundConnectionsRequest) super.clone();
    }

}