// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoryRadiusSetting {
    /**
     * @return The protocol specified for your RADIUS endpoints.
     * 
     */
    private String authenticationProtocol;
    /**
     * @return Display label.
     * 
     */
    private String displayLabel;
    /**
     * @return The port that your RADIUS server is using for communications.
     * 
     */
    private Integer radiusPort;
    /**
     * @return The maximum number of times that communication with the RADIUS server is attempted.
     * 
     */
    private Integer radiusRetries;
    /**
     * @return A set of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
     * 
     */
    private List<String> radiusServers;
    /**
     * @return The amount of time, in seconds, to wait for the RADIUS server to respond.
     * 
     */
    private Integer radiusTimeout;
    /**
     * @return Not currently used.
     * 
     */
    private Boolean useSameUsername;

    private GetDirectoryRadiusSetting() {}
    /**
     * @return The protocol specified for your RADIUS endpoints.
     * 
     */
    public String authenticationProtocol() {
        return this.authenticationProtocol;
    }
    /**
     * @return Display label.
     * 
     */
    public String displayLabel() {
        return this.displayLabel;
    }
    /**
     * @return The port that your RADIUS server is using for communications.
     * 
     */
    public Integer radiusPort() {
        return this.radiusPort;
    }
    /**
     * @return The maximum number of times that communication with the RADIUS server is attempted.
     * 
     */
    public Integer radiusRetries() {
        return this.radiusRetries;
    }
    /**
     * @return A set of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
     * 
     */
    public List<String> radiusServers() {
        return this.radiusServers;
    }
    /**
     * @return The amount of time, in seconds, to wait for the RADIUS server to respond.
     * 
     */
    public Integer radiusTimeout() {
        return this.radiusTimeout;
    }
    /**
     * @return Not currently used.
     * 
     */
    public Boolean useSameUsername() {
        return this.useSameUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryRadiusSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authenticationProtocol;
        private String displayLabel;
        private Integer radiusPort;
        private Integer radiusRetries;
        private List<String> radiusServers;
        private Integer radiusTimeout;
        private Boolean useSameUsername;
        public Builder() {}
        public Builder(GetDirectoryRadiusSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationProtocol = defaults.authenticationProtocol;
    	      this.displayLabel = defaults.displayLabel;
    	      this.radiusPort = defaults.radiusPort;
    	      this.radiusRetries = defaults.radiusRetries;
    	      this.radiusServers = defaults.radiusServers;
    	      this.radiusTimeout = defaults.radiusTimeout;
    	      this.useSameUsername = defaults.useSameUsername;
        }

        @CustomType.Setter
        public Builder authenticationProtocol(String authenticationProtocol) {
            this.authenticationProtocol = Objects.requireNonNull(authenticationProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder displayLabel(String displayLabel) {
            this.displayLabel = Objects.requireNonNull(displayLabel);
            return this;
        }
        @CustomType.Setter
        public Builder radiusPort(Integer radiusPort) {
            this.radiusPort = Objects.requireNonNull(radiusPort);
            return this;
        }
        @CustomType.Setter
        public Builder radiusRetries(Integer radiusRetries) {
            this.radiusRetries = Objects.requireNonNull(radiusRetries);
            return this;
        }
        @CustomType.Setter
        public Builder radiusServers(List<String> radiusServers) {
            this.radiusServers = Objects.requireNonNull(radiusServers);
            return this;
        }
        public Builder radiusServers(String... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }
        @CustomType.Setter
        public Builder radiusTimeout(Integer radiusTimeout) {
            this.radiusTimeout = Objects.requireNonNull(radiusTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder useSameUsername(Boolean useSameUsername) {
            this.useSameUsername = Objects.requireNonNull(useSameUsername);
            return this;
        }
        public GetDirectoryRadiusSetting build() {
            final var o = new GetDirectoryRadiusSetting();
            o.authenticationProtocol = authenticationProtocol;
            o.displayLabel = displayLabel;
            o.radiusPort = radiusPort;
            o.radiusRetries = radiusRetries;
            o.radiusServers = radiusServers;
            o.radiusTimeout = radiusTimeout;
            o.useSameUsername = useSameUsername;
            return o;
        }
    }
}
