// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCostCategoryRuleInheritedValue {
    /**
     * @return Key to extract cost category values.
     * 
     */
    private String dimensionKey;
    /**
     * @return Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
     * 
     */
    private String dimensionName;

    private GetCostCategoryRuleInheritedValue() {}
    /**
     * @return Key to extract cost category values.
     * 
     */
    public String dimensionKey() {
        return this.dimensionKey;
    }
    /**
     * @return Name of the dimension that&#39;s used to group costs. If you specify `LINKED_ACCOUNT_NAME`, the cost category value is based on account name. If you specify `TAG`, the cost category value will be based on the value of the specified tag key. Valid values are `LINKED_ACCOUNT_NAME`, `TAG`
     * 
     */
    public String dimensionName() {
        return this.dimensionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryRuleInheritedValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dimensionKey;
        private String dimensionName;
        public Builder() {}
        public Builder(GetCostCategoryRuleInheritedValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionKey = defaults.dimensionKey;
    	      this.dimensionName = defaults.dimensionName;
        }

        @CustomType.Setter
        public Builder dimensionKey(String dimensionKey) {
            this.dimensionKey = Objects.requireNonNull(dimensionKey);
            return this;
        }
        @CustomType.Setter
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public GetCostCategoryRuleInheritedValue build() {
            final var o = new GetCostCategoryRuleInheritedValue();
            o.dimensionKey = dimensionKey;
            o.dimensionName = dimensionName;
            return o;
        }
    }
}
