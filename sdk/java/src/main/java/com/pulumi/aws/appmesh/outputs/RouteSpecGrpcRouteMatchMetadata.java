// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteMatchMetadataMatch;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecGrpcRouteMatchMetadata {
    /**
     * @return If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
     * 
     */
    private @Nullable Boolean invert;
    /**
     * @return The data to match from the request.
     * 
     */
    private @Nullable RouteSpecGrpcRouteMatchMetadataMatch match;
    /**
     * @return The name of the route. Must be between 1 and 50 characters in length.
     * 
     */
    private String name;

    private RouteSpecGrpcRouteMatchMetadata() {}
    /**
     * @return If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
     * 
     */
    public Optional<Boolean> invert() {
        return Optional.ofNullable(this.invert);
    }
    /**
     * @return The data to match from the request.
     * 
     */
    public Optional<RouteSpecGrpcRouteMatchMetadataMatch> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return The name of the route. Must be between 1 and 50 characters in length.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean invert;
        private @Nullable RouteSpecGrpcRouteMatchMetadataMatch match;
        private String name;
        public Builder() {}
        public Builder(RouteSpecGrpcRouteMatchMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder invert(@Nullable Boolean invert) {
            this.invert = invert;
            return this;
        }
        @CustomType.Setter
        public Builder match(@Nullable RouteSpecGrpcRouteMatchMetadataMatch match) {
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public RouteSpecGrpcRouteMatchMetadata build() {
            final var o = new RouteSpecGrpcRouteMatchMetadata();
            o.invert = invert;
            o.match = match;
            o.name = name;
            return o;
        }
    }
}
