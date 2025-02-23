// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserFilter {
    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    private String attributePath;
    /**
     * @return The value for an attribute.
     * 
     */
    private String attributeValue;

    private GetUserFilter() {}
    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    public String attributePath() {
        return this.attributePath;
    }
    /**
     * @return The value for an attribute.
     * 
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attributePath;
        private String attributeValue;
        public Builder() {}
        public Builder(GetUserFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePath = defaults.attributePath;
    	      this.attributeValue = defaults.attributeValue;
        }

        @CustomType.Setter
        public Builder attributePath(String attributePath) {
            this.attributePath = Objects.requireNonNull(attributePath);
            return this;
        }
        @CustomType.Setter
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public GetUserFilter build() {
            final var o = new GetUserFilter();
            o.attributePath = attributePath;
            o.attributeValue = attributeValue;
            return o;
        }
    }
}
