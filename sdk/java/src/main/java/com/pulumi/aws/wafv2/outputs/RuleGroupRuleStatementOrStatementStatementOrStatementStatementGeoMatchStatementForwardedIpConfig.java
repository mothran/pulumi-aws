// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig {
    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    private String fallbackBehavior;
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    private String headerName;

    private RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig() {}
    /**
     * @return - The match status to assign to the web request if the request doesn&#39;t have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
     * 
     */
    public String fallbackBehavior() {
        return this.fallbackBehavior;
    }
    /**
     * @return - The name of the HTTP header to use for the IP address.
     * 
     */
    public String headerName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fallbackBehavior;
        private String headerName;
        public Builder() {}
        public Builder(RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        @CustomType.Setter
        public Builder fallbackBehavior(String fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig build() {
            final var o = new RuleGroupRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementForwardedIpConfig();
            o.fallbackBehavior = fallbackBehavior;
            o.headerName = headerName;
            return o;
        }
    }
}
