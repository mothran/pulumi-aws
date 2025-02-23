// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVpcLinkResult {
    /**
     * @return The description of the VPC link.
     * 
     */
    private String description;
    /**
     * @return Set to the ID of the found API Gateway VPC Link.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The status of the VPC link.
     * 
     */
    private String status;
    /**
     * @return The status message of the VPC link.
     * 
     */
    private String statusMessage;
    /**
     * @return Key-value map of resource tags
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    private List<String> targetArns;

    private GetVpcLinkResult() {}
    /**
     * @return The description of the VPC link.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Set to the ID of the found API Gateway VPC Link.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The status of the VPC link.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The status message of the VPC link.
     * 
     */
    public String statusMessage() {
        return this.statusMessage;
    }
    /**
     * @return Key-value map of resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    public List<String> targetArns() {
        return this.targetArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcLinkResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String status;
        private String statusMessage;
        private Map<String,String> tags;
        private List<String> targetArns;
        public Builder() {}
        public Builder(GetVpcLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder targetArns(List<String> targetArns) {
            this.targetArns = Objects.requireNonNull(targetArns);
            return this;
        }
        public Builder targetArns(String... targetArns) {
            return targetArns(List.of(targetArns));
        }
        public GetVpcLinkResult build() {
            final var o = new GetVpcLinkResult();
            o.description = description;
            o.id = id;
            o.name = name;
            o.status = status;
            o.statusMessage = statusMessage;
            o.tags = tags;
            o.targetArns = targetArns;
            return o;
        }
    }
}
