// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecListenerPortMapping {
    /**
     * @return The port used for the port mapping.
     * 
     */
    private Integer port;
    /**
     * @return The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    private String protocol;

    private VirtualNodeSpecListenerPortMapping() {}
    /**
     * @return The port used for the port mapping.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerPortMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String protocol;
        public Builder() {}
        public Builder(VirtualNodeSpecListenerPortMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public VirtualNodeSpecListenerPortMapping build() {
            final var o = new VirtualNodeSpecListenerPortMapping();
            o.port = port;
            o.protocol = protocol;
            return o;
        }
    }
}
