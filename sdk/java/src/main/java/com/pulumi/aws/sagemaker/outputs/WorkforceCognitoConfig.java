// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkforceCognitoConfig {
    /**
     * @return The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    private String clientId;
    /**
     * @return The id for your Amazon Cognito user pool.
     * 
     */
    private String userPool;

    private WorkforceCognitoConfig() {}
    /**
     * @return The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The id for your Amazon Cognito user pool.
     * 
     */
    public String userPool() {
        return this.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceCognitoConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String userPool;
        public Builder() {}
        public Builder(WorkforceCognitoConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.userPool = defaults.userPool;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder userPool(String userPool) {
            this.userPool = Objects.requireNonNull(userPool);
            return this;
        }
        public WorkforceCognitoConfig build() {
            final var o = new WorkforceCognitoConfig();
            o.clientId = clientId;
            o.userPool = userPool;
            return o;
        }
    }
}
