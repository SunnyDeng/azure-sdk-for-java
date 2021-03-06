/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.microsoft.azure.keyvault.webkey.JsonWebKeySignatureAlgorithm;
import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key verify parameters.
 */
public class KeyVerifyParameters {
    /**
     * The signing/verification algorithm. For more information on possible
     * algorithm types, see JsonWebKeySignatureAlgorithm. Possible values
     * include: 'RS256', 'RS384', 'RS512', 'RSNULL'.
     */
    @JsonProperty(value = "alg", required = true)
    private JsonWebKeySignatureAlgorithm algorithm;

    /**
     * The digest used for signing.
     */
    @JsonProperty(value = "digest", required = true)
    private Base64Url digest;

    /**
     * The signature to be verified.
     */
    @JsonProperty(value = "value", required = true)
    private Base64Url signature;

    /**
     * Get the algorithm value.
     *
     * @return the algorithm value
     */
    public JsonWebKeySignatureAlgorithm algorithm() {
        return this.algorithm;
    }

    /**
     * Set the algorithm value.
     *
     * @param algorithm the algorithm value to set
     * @return the KeyVerifyParameters object itself.
     */
    public KeyVerifyParameters withAlgorithm(JsonWebKeySignatureAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Get the digest value.
     *
     * @return the digest value
     */
    public byte[] digest() {
        if (this.digest == null) {
            return null;
        }
        return this.digest.decodedBytes();
    }

    /**
     * Set the digest value.
     *
     * @param digest the digest value to set
     * @return the KeyVerifyParameters object itself.
     */
    public KeyVerifyParameters withDigest(byte[] digest) {
        if (digest == null) {
            this.digest = null;
        } else {
            this.digest = Base64Url.encode(digest);
        }
        return this;
    }

    /**
     * Get the signature value.
     *
     * @return the signature value
     */
    public byte[] signature() {
        if (this.signature == null) {
            return null;
        }
        return this.signature.decodedBytes();
    }

    /**
     * Set the signature value.
     *
     * @param signature the signature value to set
     * @return the KeyVerifyParameters object itself.
     */
    public KeyVerifyParameters withSignature(byte[] signature) {
        if (signature == null) {
            this.signature = null;
        } else {
            this.signature = Base64Url.encode(signature);
        }
        return this;
    }

}
