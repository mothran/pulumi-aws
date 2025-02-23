// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control;

import com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointArgs Empty = new ObjectLambdaAccessPointArgs();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @Import(name="configuration", required=true)
    private Output<ObjectLambdaAccessPointConfigurationArgs> configuration;

    /**
     * @return A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    public Output<ObjectLambdaAccessPointConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for this Object Lambda Access Point.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ObjectLambdaAccessPointArgs() {}

    private ObjectLambdaAccessPointArgs(ObjectLambdaAccessPointArgs $) {
        this.accountId = $.accountId;
        this.configuration = $.configuration;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectLambdaAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectLambdaAccessPointArgs $;

        public Builder() {
            $ = new ObjectLambdaAccessPointArgs();
        }

        public Builder(ObjectLambdaAccessPointArgs defaults) {
            $ = new ObjectLambdaAccessPointArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configuration A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<ObjectLambdaAccessPointConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder configuration(ObjectLambdaAccessPointConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param name The name for this Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for this Object Lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ObjectLambdaAccessPointArgs build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            return $;
        }
    }

}
