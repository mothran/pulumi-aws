// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.aws.alb.outputs.GetListenerDefaultAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetListenerResult {
    private String alpnPolicy;
    private String arn;
    private String certificateArn;
    private List<GetListenerDefaultAction> defaultActions;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String loadBalancerArn;
    private Integer port;
    private String protocol;
    private String sslPolicy;
    private Map<String,String> tags;

    private GetListenerResult() {}
    public String alpnPolicy() {
        return this.alpnPolicy;
    }
    public String arn() {
        return this.arn;
    }
    public String certificateArn() {
        return this.certificateArn;
    }
    public List<GetListenerDefaultAction> defaultActions() {
        return this.defaultActions;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String loadBalancerArn() {
        return this.loadBalancerArn;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public String sslPolicy() {
        return this.sslPolicy;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alpnPolicy;
        private String arn;
        private String certificateArn;
        private List<GetListenerDefaultAction> defaultActions;
        private String id;
        private String loadBalancerArn;
        private Integer port;
        private String protocol;
        private String sslPolicy;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.id = defaults.id;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder alpnPolicy(String alpnPolicy) {
            this.alpnPolicy = Objects.requireNonNull(alpnPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        @CustomType.Setter
        public Builder defaultActions(List<GetListenerDefaultAction> defaultActions) {
            this.defaultActions = Objects.requireNonNull(defaultActions);
            return this;
        }
        public Builder defaultActions(GetListenerDefaultAction... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerArn(String loadBalancerArn) {
            this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn);
            return this;
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
        @CustomType.Setter
        public Builder sslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetListenerResult build() {
            final var o = new GetListenerResult();
            o.alpnPolicy = alpnPolicy;
            o.arn = arn;
            o.certificateArn = certificateArn;
            o.defaultActions = defaultActions;
            o.id = id;
            o.loadBalancerArn = loadBalancerArn;
            o.port = port;
            o.protocol = protocol;
            o.sslPolicy = sslPolicy;
            o.tags = tags;
            return o;
        }
    }
}
