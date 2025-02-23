// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationTokenArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationTokenArgs Empty = new GetAuthorizationTokenArgs();

    /**
     * The name of the domain that is in scope for the generated authorization token.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The name of the domain that is in scope for the generated authorization token.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The account number of the AWS account that owns the domain.
     * 
     */
    @Import(name="domainOwner")
    private @Nullable Output<String> domainOwner;

    /**
     * @return The account number of the AWS account that owns the domain.
     * 
     */
    public Optional<Output<String>> domainOwner() {
        return Optional.ofNullable(this.domainOwner);
    }

    /**
     * The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     * 
     */
    @Import(name="durationSeconds")
    private @Nullable Output<Integer> durationSeconds;

    /**
     * @return The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
     * 
     */
    public Optional<Output<Integer>> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }

    private GetAuthorizationTokenArgs() {}

    private GetAuthorizationTokenArgs(GetAuthorizationTokenArgs $) {
        this.domain = $.domain;
        this.domainOwner = $.domainOwner;
        this.durationSeconds = $.durationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationTokenArgs $;

        public Builder() {
            $ = new GetAuthorizationTokenArgs();
        }

        public Builder(GetAuthorizationTokenArgs defaults) {
            $ = new GetAuthorizationTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The name of the domain that is in scope for the generated authorization token.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The name of the domain that is in scope for the generated authorization token.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(@Nullable Output<String> domainOwner) {
            $.domainOwner = domainOwner;
            return this;
        }

        /**
         * @param domainOwner The account number of the AWS account that owns the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainOwner(String domainOwner) {
            return domainOwner(Output.of(domainOwner));
        }

        /**
         * @param durationSeconds The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            $.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * @param durationSeconds The time, in seconds, that the generated authorization token is valid. Valid values are `0` and between `900` and `43200`.
         * 
         * @return builder
         * 
         */
        public Builder durationSeconds(Integer durationSeconds) {
            return durationSeconds(Output.of(durationSeconds));
        }

        public GetAuthorizationTokenArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            return $;
        }
    }

}
