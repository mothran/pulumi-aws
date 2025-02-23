// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.aws.identitystore.outputs.GetGroupFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return The group&#39;s display name value.
     * 
     */
    private String displayName;
    private List<GetGroupFilter> filters;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String identityStoreId;

    private GetGroupResult() {}
    /**
     * @return The group&#39;s display name value.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public List<GetGroupFilter> filters() {
        return this.filters;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String identityStoreId() {
        return this.identityStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private List<GetGroupFilter> filters;
        private String groupId;
        private String id;
        private String identityStoreId;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.identityStoreId = defaults.identityStoreId;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder filters(List<GetGroupFilter> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public Builder filters(GetGroupFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identityStoreId(String identityStoreId) {
            this.identityStoreId = Objects.requireNonNull(identityStoreId);
            return this;
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.displayName = displayName;
            o.filters = filters;
            o.groupId = groupId;
            o.id = id;
            o.identityStoreId = identityStoreId;
            return o;
        }
    }
}
