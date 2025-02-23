// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroups.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupResourceQuery {
    /**
     * @return The resource query as a JSON string.
     * 
     */
    private String query;
    /**
     * @return The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
     */
    private @Nullable String type;

    private GroupResourceQuery() {}
    /**
     * @return The resource query as a JSON string.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupResourceQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        private @Nullable String type;
        public Builder() {}
        public Builder(GroupResourceQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GroupResourceQuery build() {
            final var o = new GroupResourceQuery();
            o.query = query;
            o.type = type;
            return o;
        }
    }
}
