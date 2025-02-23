// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey {
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    private String apiKey;
    /**
     * @return The Secret Access Key portion of the credentials.
     * 
     */
    private @Nullable String apiSecretKey;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey() {}
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    public String apiKey() {
        return this.apiKey;
    }
    /**
     * @return The Secret Access Key portion of the credentials.
     * 
     */
    public Optional<String> apiSecretKey() {
        return Optional.ofNullable(this.apiSecretKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKey;
        private @Nullable String apiSecretKey;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.apiSecretKey = defaults.apiSecretKey;
        }

        @CustomType.Setter
        public Builder apiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }
        @CustomType.Setter
        public Builder apiSecretKey(@Nullable String apiSecretKey) {
            this.apiSecretKey = apiSecretKey;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey();
            o.apiKey = apiKey;
            o.apiSecretKey = apiSecretKey;
            return o;
        }
    }
}
