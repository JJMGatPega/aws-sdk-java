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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;

/**
 * <p>
 * The capacity configuration for the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ComputeCapacity" target="_top">AWS API
 *      Documentation</a>
 */
public class ComputeCapacity implements Serializable, Cloneable {

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     */
    private Integer desiredInstances;

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @param desiredInstances
     *        The desired number of streaming instances.
     */

    public void setDesiredInstances(Integer desiredInstances) {
        this.desiredInstances = desiredInstances;
    }

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @return The desired number of streaming instances.
     */

    public Integer getDesiredInstances() {
        return this.desiredInstances;
    }

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @param desiredInstances
     *        The desired number of streaming instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeCapacity withDesiredInstances(Integer desiredInstances) {
        setDesiredInstances(desiredInstances);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDesiredInstances() != null)
            sb.append("DesiredInstances: ").append(getDesiredInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeCapacity == false)
            return false;
        ComputeCapacity other = (ComputeCapacity) obj;
        if (other.getDesiredInstances() == null ^ this.getDesiredInstances() == null)
            return false;
        if (other.getDesiredInstances() != null && other.getDesiredInstances().equals(this.getDesiredInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredInstances() == null) ? 0 : getDesiredInstances().hashCode());
        return hashCode;
    }

    @Override
    public ComputeCapacity clone() {
        try {
            return (ComputeCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
