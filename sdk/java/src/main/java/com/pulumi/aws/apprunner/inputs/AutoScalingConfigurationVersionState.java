// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScalingConfigurationVersionState extends com.pulumi.resources.ResourceArgs {

    public static final AutoScalingConfigurationVersionState Empty = new AutoScalingConfigurationVersionState();

    /**
     * ARN of this auto scaling configuration version.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of this auto scaling configuration version.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the auto scaling configuration.
     * 
     */
    @Import(name="autoScalingConfigurationName")
    private @Nullable Output<String> autoScalingConfigurationName;

    /**
     * @return Name of the auto scaling configuration.
     * 
     */
    public Optional<Output<String>> autoScalingConfigurationName() {
        return Optional.ofNullable(this.autoScalingConfigurationName);
    }

    /**
     * The revision of this auto scaling configuration.
     * 
     */
    @Import(name="autoScalingConfigurationRevision")
    private @Nullable Output<Integer> autoScalingConfigurationRevision;

    /**
     * @return The revision of this auto scaling configuration.
     * 
     */
    public Optional<Output<Integer>> autoScalingConfigurationRevision() {
        return Optional.ofNullable(this.autoScalingConfigurationRevision);
    }

    /**
     * Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
     * 
     */
    @Import(name="latest")
    private @Nullable Output<Boolean> latest;

    /**
     * @return Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
     * 
     */
    public Optional<Output<Boolean>> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    @Import(name="maxConcurrency")
    private @Nullable Output<Integer> maxConcurrency;

    /**
     * @return The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
     * 
     */
    public Optional<Output<Integer>> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }

    /**
     * The maximal number of instances that App Runner provisions for your service.
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return The maximal number of instances that App Runner provisions for your service.
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * The minimal number of instances that App Runner provisions for your service.
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return The minimal number of instances that App Runner provisions for your service.
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private AutoScalingConfigurationVersionState() {}

    private AutoScalingConfigurationVersionState(AutoScalingConfigurationVersionState $) {
        this.arn = $.arn;
        this.autoScalingConfigurationName = $.autoScalingConfigurationName;
        this.autoScalingConfigurationRevision = $.autoScalingConfigurationRevision;
        this.latest = $.latest;
        this.maxConcurrency = $.maxConcurrency;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.status = $.status;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScalingConfigurationVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScalingConfigurationVersionState $;

        public Builder() {
            $ = new AutoScalingConfigurationVersionState();
        }

        public Builder(AutoScalingConfigurationVersionState defaults) {
            $ = new AutoScalingConfigurationVersionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of this auto scaling configuration version.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of this auto scaling configuration version.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param autoScalingConfigurationName Name of the auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationName(@Nullable Output<String> autoScalingConfigurationName) {
            $.autoScalingConfigurationName = autoScalingConfigurationName;
            return this;
        }

        /**
         * @param autoScalingConfigurationName Name of the auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationName(String autoScalingConfigurationName) {
            return autoScalingConfigurationName(Output.of(autoScalingConfigurationName));
        }

        /**
         * @param autoScalingConfigurationRevision The revision of this auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationRevision(@Nullable Output<Integer> autoScalingConfigurationRevision) {
            $.autoScalingConfigurationRevision = autoScalingConfigurationRevision;
            return this;
        }

        /**
         * @param autoScalingConfigurationRevision The revision of this auto scaling configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoScalingConfigurationRevision(Integer autoScalingConfigurationRevision) {
            return autoScalingConfigurationRevision(Output.of(autoScalingConfigurationRevision));
        }

        /**
         * @param latest Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
         * 
         * @return builder
         * 
         */
        public Builder latest(@Nullable Output<Boolean> latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param latest Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
         * 
         * @return builder
         * 
         */
        public Builder latest(Boolean latest) {
            return latest(Output.of(latest));
        }

        /**
         * @param maxConcurrency The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(@Nullable Output<Integer> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * @param maxConcurrency The maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        /**
         * @param maxSize The maximal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize The maximal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize The minimal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize The minimal number of instances that App Runner provisions for your service.
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param status The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can&#39;t be used. It is permanently removed some time after deletion.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public AutoScalingConfigurationVersionState build() {
            return $;
        }
    }

}
