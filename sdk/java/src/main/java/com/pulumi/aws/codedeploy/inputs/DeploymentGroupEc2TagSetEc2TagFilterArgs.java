// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupEc2TagSetEc2TagFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupEc2TagSetEc2TagFilterArgs Empty = new DeploymentGroupEc2TagSetEc2TagFilterArgs();

    /**
     * The key of the tag filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The key of the tag filter.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value of the tag filter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the tag filter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DeploymentGroupEc2TagSetEc2TagFilterArgs() {}

    private DeploymentGroupEc2TagSetEc2TagFilterArgs(DeploymentGroupEc2TagSetEc2TagFilterArgs $) {
        this.key = $.key;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupEc2TagSetEc2TagFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupEc2TagSetEc2TagFilterArgs $;

        public Builder() {
            $ = new DeploymentGroupEc2TagSetEc2TagFilterArgs();
        }

        public Builder(DeploymentGroupEc2TagSetEc2TagFilterArgs defaults) {
            $ = new DeploymentGroupEc2TagSetEc2TagFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of the tag filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the tag filter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param type The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the tag filter, either `KEY_ONLY`, `VALUE_ONLY`, or `KEY_AND_VALUE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value of the tag filter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the tag filter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DeploymentGroupEc2TagSetEc2TagFilterArgs build() {
            return $;
        }
    }

}
