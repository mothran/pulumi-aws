// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceGroupsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayVirtualInterfaceGroupsResult {
    private @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set of EC2 Local Gateway Virtual Interface Group identifiers.
     * 
     */
    private List<String> ids;
    /**
     * @return Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
     */
    private List<String> localGatewayVirtualInterfaceIds;
    private Map<String,String> tags;

    private GetLocalGatewayVirtualInterfaceGroupsResult() {}
    public List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters() {
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
     * @return Set of EC2 Local Gateway Virtual Interface Group identifiers.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return Set of EC2 Local Gateway Virtual Interface identifiers.
     * 
     */
    public List<String> localGatewayVirtualInterfaceIds() {
        return this.localGatewayVirtualInterfaceIds;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters;
        private String id;
        private List<String> ids;
        private List<String> localGatewayVirtualInterfaceIds;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetLocalGatewayVirtualInterfaceGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.localGatewayVirtualInterfaceIds = defaults.localGatewayVirtualInterfaceIds;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayVirtualInterfaceGroupsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder localGatewayVirtualInterfaceIds(List<String> localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
            return this;
        }
        public Builder localGatewayVirtualInterfaceIds(String... localGatewayVirtualInterfaceIds) {
            return localGatewayVirtualInterfaceIds(List.of(localGatewayVirtualInterfaceIds));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupsResult build() {
            final var o = new GetLocalGatewayVirtualInterfaceGroupsResult();
            o.filters = filters;
            o.id = id;
            o.ids = ids;
            o.localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds;
            o.tags = tags;
            return o;
        }
    }
}
