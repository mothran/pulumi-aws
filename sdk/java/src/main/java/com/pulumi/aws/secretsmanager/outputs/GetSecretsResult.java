// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.outputs;

import com.pulumi.aws.secretsmanager.outputs.GetSecretsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretsResult {
    /**
     * @return Set of ARNs of the matched Secrets Manager secrets.
     * 
     */
    private List<String> arns;
    private @Nullable List<GetSecretsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set of names of the matched Secrets Manager secrets.
     * 
     */
    private List<String> names;

    private GetSecretsResult() {}
    /**
     * @return Set of ARNs of the matched Secrets Manager secrets.
     * 
     */
    public List<String> arns() {
        return this.arns;
    }
    public List<GetSecretsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of names of the matched Secrets Manager secrets.
     * 
     */
    public List<String> names() {
        return this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> arns;
        private @Nullable List<GetSecretsFilter> filters;
        private String id;
        private List<String> names;
        public Builder() {}
        public Builder(GetSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.names = defaults.names;
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
        public Builder filters(@Nullable List<GetSecretsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSecretsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public GetSecretsResult build() {
            final var o = new GetSecretsResult();
            o.arns = arns;
            o.filters = filters;
            o.id = id;
            o.names = names;
            return o;
        }
    }
}
