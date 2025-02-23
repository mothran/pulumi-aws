// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.WorkforceCognitoConfigArgs;
import com.pulumi.aws.sagemaker.inputs.WorkforceOidcConfigArgs;
import com.pulumi.aws.sagemaker.inputs.WorkforceSourceIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkforceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkforceState Empty = new WorkforceState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workforce.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Workforce.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    @Import(name="cognitoConfig")
    private @Nullable Output<WorkforceCognitoConfigArgs> cognitoConfig;

    /**
     * @return Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
     * 
     */
    public Optional<Output<WorkforceCognitoConfigArgs>> cognitoConfig() {
        return Optional.ofNullable(this.cognitoConfig);
    }

    /**
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    @Import(name="oidcConfig")
    private @Nullable Output<WorkforceOidcConfigArgs> oidcConfig;

    /**
     * @return Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
     * 
     */
    public Optional<Output<WorkforceOidcConfigArgs>> oidcConfig() {
        return Optional.ofNullable(this.oidcConfig);
    }

    /**
     * A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    @Import(name="sourceIpConfig")
    private @Nullable Output<WorkforceSourceIpConfigArgs> sourceIpConfig;

    /**
     * @return A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
     * 
     */
    public Optional<Output<WorkforceSourceIpConfigArgs>> sourceIpConfig() {
        return Optional.ofNullable(this.sourceIpConfig);
    }

    /**
     * The subdomain for your OIDC Identity Provider.
     * 
     */
    @Import(name="subdomain")
    private @Nullable Output<String> subdomain;

    /**
     * @return The subdomain for your OIDC Identity Provider.
     * 
     */
    public Optional<Output<String>> subdomain() {
        return Optional.ofNullable(this.subdomain);
    }

    /**
     * The name of the Workforce (must be unique).
     * 
     */
    @Import(name="workforceName")
    private @Nullable Output<String> workforceName;

    /**
     * @return The name of the Workforce (must be unique).
     * 
     */
    public Optional<Output<String>> workforceName() {
        return Optional.ofNullable(this.workforceName);
    }

    private WorkforceState() {}

    private WorkforceState(WorkforceState $) {
        this.arn = $.arn;
        this.cognitoConfig = $.cognitoConfig;
        this.oidcConfig = $.oidcConfig;
        this.sourceIpConfig = $.sourceIpConfig;
        this.subdomain = $.subdomain;
        this.workforceName = $.workforceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforceState $;

        public Builder() {
            $ = new WorkforceState();
        }

        public Builder(WorkforceState defaults) {
            $ = new WorkforceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Workforce.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) assigned by AWS to this Workforce.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoConfig(@Nullable Output<WorkforceCognitoConfigArgs> cognitoConfig) {
            $.cognitoConfig = cognitoConfig;
            return this;
        }

        /**
         * @param cognitoConfig Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using and corresponds to a single Amazon Cognito user pool. Conflicts with `oidc_config`. see Cognito Config details below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoConfig(WorkforceCognitoConfigArgs cognitoConfig) {
            return cognitoConfig(Output.of(cognitoConfig));
        }

        /**
         * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
         * 
         * @return builder
         * 
         */
        public Builder oidcConfig(@Nullable Output<WorkforceOidcConfigArgs> oidcConfig) {
            $.oidcConfig = oidcConfig;
            return this;
        }

        /**
         * @param oidcConfig Use this parameter to configure a private workforce using your own OIDC Identity Provider. Conflicts with `cognito_config`. see OIDC Config details below.
         * 
         * @return builder
         * 
         */
        public Builder oidcConfig(WorkforceOidcConfigArgs oidcConfig) {
            return oidcConfig(Output.of(oidcConfig));
        }

        /**
         * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpConfig(@Nullable Output<WorkforceSourceIpConfigArgs> sourceIpConfig) {
            $.sourceIpConfig = sourceIpConfig;
            return this;
        }

        /**
         * @param sourceIpConfig A list of IP address ranges Used to create an allow list of IP addresses for a private workforce. By default, a workforce isn&#39;t restricted to specific IP addresses. see Source Ip Config details below.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpConfig(WorkforceSourceIpConfigArgs sourceIpConfig) {
            return sourceIpConfig(Output.of(sourceIpConfig));
        }

        /**
         * @param subdomain The subdomain for your OIDC Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(@Nullable Output<String> subdomain) {
            $.subdomain = subdomain;
            return this;
        }

        /**
         * @param subdomain The subdomain for your OIDC Identity Provider.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(String subdomain) {
            return subdomain(Output.of(subdomain));
        }

        /**
         * @param workforceName The name of the Workforce (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder workforceName(@Nullable Output<String> workforceName) {
            $.workforceName = workforceName;
            return this;
        }

        /**
         * @param workforceName The name of the Workforce (must be unique).
         * 
         * @return builder
         * 
         */
        public Builder workforceName(String workforceName) {
            return workforceName(Output.of(workforceName));
        }

        public WorkforceState build() {
            return $;
        }
    }

}
