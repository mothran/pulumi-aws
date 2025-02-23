// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecServiceDiscoveryDns {
    /**
     * @return The DNS host name for your virtual node.
     * 
     */
    private String hostname;

    private VirtualNodeSpecServiceDiscoveryDns() {}
    /**
     * @return The DNS host name for your virtual node.
     * 
     */
    public String hostname() {
        return this.hostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        public Builder() {}
        public Builder(VirtualNodeSpecServiceDiscoveryDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public VirtualNodeSpecServiceDiscoveryDns build() {
            final var o = new VirtualNodeSpecServiceDiscoveryDns();
            o.hostname = hostname;
            return o;
        }
    }
}
