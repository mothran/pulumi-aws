// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDelegatedServicesDelegatedService {
    /**
     * @return The date that the account became a delegated administrator for this service.
     * 
     */
    private String delegationEnabledDate;
    /**
     * @return The name of an AWS service that can request an operation for the specified service.
     * 
     */
    private String servicePrincipal;

    private GetDelegatedServicesDelegatedService() {}
    /**
     * @return The date that the account became a delegated administrator for this service.
     * 
     */
    public String delegationEnabledDate() {
        return this.delegationEnabledDate;
    }
    /**
     * @return The name of an AWS service that can request an operation for the specified service.
     * 
     */
    public String servicePrincipal() {
        return this.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDelegatedServicesDelegatedService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String delegationEnabledDate;
        private String servicePrincipal;
        public Builder() {}
        public Builder(GetDelegatedServicesDelegatedService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationEnabledDate = defaults.delegationEnabledDate;
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        @CustomType.Setter
        public Builder delegationEnabledDate(String delegationEnabledDate) {
            this.delegationEnabledDate = Objects.requireNonNull(delegationEnabledDate);
            return this;
        }
        @CustomType.Setter
        public Builder servicePrincipal(String servicePrincipal) {
            this.servicePrincipal = Objects.requireNonNull(servicePrincipal);
            return this;
        }
        public GetDelegatedServicesDelegatedService build() {
            final var o = new GetDelegatedServicesDelegatedService();
            o.delegationEnabledDate = delegationEnabledDate;
            o.servicePrincipal = servicePrincipal;
            return o;
        }
    }
}
