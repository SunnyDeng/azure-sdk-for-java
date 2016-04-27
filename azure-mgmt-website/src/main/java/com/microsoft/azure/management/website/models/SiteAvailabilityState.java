/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SiteAvailabilityState.
 */
public enum SiteAvailabilityState {
    /** Enum value Normal. */
    NORMAL("Normal"),

    /** Enum value Limited. */
    LIMITED("Limited"),

    /** Enum value DisasterRecoveryMode. */
    DISASTERRECOVERYMODE("DisasterRecoveryMode");

    /** The actual serialized value for a SiteAvailabilityState instance. */
    private String value;

    SiteAvailabilityState(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a SiteAvailabilityState instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a SiteAvailabilityState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SiteAvailabilityState object, or null if unable to parse.
     */
    @JsonCreator
    public static SiteAvailabilityState fromValue(String value) {
        SiteAvailabilityState[] items = SiteAvailabilityState.values();
        for (SiteAvailabilityState item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}