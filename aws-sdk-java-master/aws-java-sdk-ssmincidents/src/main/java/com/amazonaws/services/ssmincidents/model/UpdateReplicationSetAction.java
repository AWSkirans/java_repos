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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details used when updating the replication set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/UpdateReplicationSetAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationSetAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're adding to the replication set.
     * </p>
     */
    private AddRegionAction addRegionAction;
    /**
     * <p>
     * Details about the Amazon Web Services Region that you're deleting to the replication set.
     * </p>
     */
    private DeleteRegionAction deleteRegionAction;

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're adding to the replication set.
     * </p>
     * 
     * @param addRegionAction
     *        Details about the Amazon Web Services Region that you're adding to the replication set.
     */

    public void setAddRegionAction(AddRegionAction addRegionAction) {
        this.addRegionAction = addRegionAction;
    }

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're adding to the replication set.
     * </p>
     * 
     * @return Details about the Amazon Web Services Region that you're adding to the replication set.
     */

    public AddRegionAction getAddRegionAction() {
        return this.addRegionAction;
    }

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're adding to the replication set.
     * </p>
     * 
     * @param addRegionAction
     *        Details about the Amazon Web Services Region that you're adding to the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetAction withAddRegionAction(AddRegionAction addRegionAction) {
        setAddRegionAction(addRegionAction);
        return this;
    }

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're deleting to the replication set.
     * </p>
     * 
     * @param deleteRegionAction
     *        Details about the Amazon Web Services Region that you're deleting to the replication set.
     */

    public void setDeleteRegionAction(DeleteRegionAction deleteRegionAction) {
        this.deleteRegionAction = deleteRegionAction;
    }

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're deleting to the replication set.
     * </p>
     * 
     * @return Details about the Amazon Web Services Region that you're deleting to the replication set.
     */

    public DeleteRegionAction getDeleteRegionAction() {
        return this.deleteRegionAction;
    }

    /**
     * <p>
     * Details about the Amazon Web Services Region that you're deleting to the replication set.
     * </p>
     * 
     * @param deleteRegionAction
     *        Details about the Amazon Web Services Region that you're deleting to the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationSetAction withDeleteRegionAction(DeleteRegionAction deleteRegionAction) {
        setDeleteRegionAction(deleteRegionAction);
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
        if (getAddRegionAction() != null)
            sb.append("AddRegionAction: ").append(getAddRegionAction()).append(",");
        if (getDeleteRegionAction() != null)
            sb.append("DeleteRegionAction: ").append(getDeleteRegionAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReplicationSetAction == false)
            return false;
        UpdateReplicationSetAction other = (UpdateReplicationSetAction) obj;
        if (other.getAddRegionAction() == null ^ this.getAddRegionAction() == null)
            return false;
        if (other.getAddRegionAction() != null && other.getAddRegionAction().equals(this.getAddRegionAction()) == false)
            return false;
        if (other.getDeleteRegionAction() == null ^ this.getDeleteRegionAction() == null)
            return false;
        if (other.getDeleteRegionAction() != null && other.getDeleteRegionAction().equals(this.getDeleteRegionAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddRegionAction() == null) ? 0 : getAddRegionAction().hashCode());
        hashCode = prime * hashCode + ((getDeleteRegionAction() == null) ? 0 : getDeleteRegionAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationSetAction clone() {
        try {
            return (UpdateReplicationSetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.UpdateReplicationSetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}