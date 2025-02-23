// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionForwardStickiness {
    private Integer duration;
    private Boolean enabled;

    private GetListenerDefaultActionForwardStickiness() {}
    public Integer duration() {
        return this.duration;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForwardStickiness defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer duration;
        private Boolean enabled;
        public Builder() {}
        public Builder(GetListenerDefaultActionForwardStickiness defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder duration(Integer duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetListenerDefaultActionForwardStickiness build() {
            final var o = new GetListenerDefaultActionForwardStickiness();
            o.duration = duration;
            o.enabled = enabled;
            return o;
        }
    }
}
