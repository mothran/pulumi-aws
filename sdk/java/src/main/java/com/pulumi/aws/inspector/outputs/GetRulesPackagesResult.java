// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesPackagesResult {
    /**
     * @return A list of the AWS Inspector Rules Packages arns available in the AWS region.
     * 
     */
    private List<String> arns;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetRulesPackagesResult() {}
    /**
     * @return A list of the AWS Inspector Rules Packages arns available in the AWS region.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesPackagesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> arns;
        private String id;
        public Builder() {}
        public Builder(GetRulesPackagesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetRulesPackagesResult build() {
            final var o = new GetRulesPackagesResult();
            o.arns = arns;
            o.id = id;
            return o;
        }
    }
}
