// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteTimeoutIdle;
import com.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteTimeoutPerRequest;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecGrpcRouteTimeout {
    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private @Nullable RouteSpecGrpcRouteTimeoutIdle idle;
    /**
     * @return The per request timeout.
     * 
     */
    private @Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest;

    private RouteSpecGrpcRouteTimeout() {}
    /**
     * @return The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<RouteSpecGrpcRouteTimeoutIdle> idle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * @return The per request timeout.
     * 
     */
    public Optional<RouteSpecGrpcRouteTimeoutPerRequest> perRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteTimeout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RouteSpecGrpcRouteTimeoutIdle idle;
        private @Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest;
        public Builder() {}
        public Builder(RouteSpecGrpcRouteTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        @CustomType.Setter
        public Builder idle(@Nullable RouteSpecGrpcRouteTimeoutIdle idle) {
            this.idle = idle;
            return this;
        }
        @CustomType.Setter
        public Builder perRequest(@Nullable RouteSpecGrpcRouteTimeoutPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public RouteSpecGrpcRouteTimeout build() {
            final var o = new RouteSpecGrpcRouteTimeout();
            o.idle = idle;
            o.perRequest = perRequest;
            return o;
        }
    }
}
