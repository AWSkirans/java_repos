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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * One or more targets associated with the event window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceEventWindowAssociationTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowAssociationTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the instances associated with the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The instance tags associated with the event window. Any instances associated with the tags will be associated
     * with the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dedicatedHostIds;

    /**
     * <p>
     * The IDs of the instances associated with the event window.
     * </p>
     * 
     * @return The IDs of the instances associated with the event window.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the instances associated with the event window.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances associated with the event window.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The IDs of the instances associated with the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances associated with the event window.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The instance tags associated with the event window. Any instances associated with the tags will be associated
     * with the event window.
     * </p>
     * 
     * @return The instance tags associated with the event window. Any instances associated with the tags will be
     *         associated with the event window.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The instance tags associated with the event window. Any instances associated with the tags will be associated
     * with the event window.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window. Any instances associated with the tags will be
     *        associated with the event window.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The instance tags associated with the event window. Any instances associated with the tags will be associated
     * with the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window. Any instances associated with the tags will be
     *        associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance tags associated with the event window. Any instances associated with the tags will be associated
     * with the event window.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window. Any instances associated with the tags will be
     *        associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the event window.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts associated with the event window.
     */

    public java.util.List<String> getDedicatedHostIds() {
        if (dedicatedHostIds == null) {
            dedicatedHostIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dedicatedHostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the event window.
     * </p>
     * 
     * @param dedicatedHostIds
     *        The IDs of the Dedicated Hosts associated with the event window.
     */

    public void setDedicatedHostIds(java.util.Collection<String> dedicatedHostIds) {
        if (dedicatedHostIds == null) {
            this.dedicatedHostIds = null;
            return;
        }

        this.dedicatedHostIds = new com.amazonaws.internal.SdkInternalList<String>(dedicatedHostIds);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDedicatedHostIds(java.util.Collection)} or {@link #withDedicatedHostIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dedicatedHostIds
     *        The IDs of the Dedicated Hosts associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withDedicatedHostIds(String... dedicatedHostIds) {
        if (this.dedicatedHostIds == null) {
            setDedicatedHostIds(new com.amazonaws.internal.SdkInternalList<String>(dedicatedHostIds.length));
        }
        for (String ele : dedicatedHostIds) {
            this.dedicatedHostIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the event window.
     * </p>
     * 
     * @param dedicatedHostIds
     *        The IDs of the Dedicated Hosts associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowAssociationTarget withDedicatedHostIds(java.util.Collection<String> dedicatedHostIds) {
        setDedicatedHostIds(dedicatedHostIds);
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDedicatedHostIds() != null)
            sb.append("DedicatedHostIds: ").append(getDedicatedHostIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceEventWindowAssociationTarget == false)
            return false;
        InstanceEventWindowAssociationTarget other = (InstanceEventWindowAssociationTarget) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDedicatedHostIds() == null ^ this.getDedicatedHostIds() == null)
            return false;
        if (other.getDedicatedHostIds() != null && other.getDedicatedHostIds().equals(this.getDedicatedHostIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDedicatedHostIds() == null) ? 0 : getDedicatedHostIds().hashCode());
        return hashCode;
    }

    @Override
    public InstanceEventWindowAssociationTarget clone() {
        try {
            return (InstanceEventWindowAssociationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}