// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.apprunner.inputs.ObservabilityConfigurationTraceConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObservabilityConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObservabilityConfigurationArgs Empty = new ObservabilityConfigurationArgs();

    /**
     * Name of the observability configuration.
     * 
     */
    @Import(name="observabilityConfigurationName", required=true)
    private Output<String> observabilityConfigurationName;

    /**
     * @return Name of the observability configuration.
     * 
     */
    public Output<String> observabilityConfigurationName() {
        return this.observabilityConfigurationName;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * 
     */
    @Import(name="traceConfiguration")
    private @Nullable Output<ObservabilityConfigurationTraceConfigurationArgs> traceConfiguration;

    /**
     * @return The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
     * 
     */
    public Optional<Output<ObservabilityConfigurationTraceConfigurationArgs>> traceConfiguration() {
        return Optional.ofNullable(this.traceConfiguration);
    }

    private ObservabilityConfigurationArgs() {}

    private ObservabilityConfigurationArgs(ObservabilityConfigurationArgs $) {
        this.observabilityConfigurationName = $.observabilityConfigurationName;
        this.tags = $.tags;
        this.traceConfiguration = $.traceConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObservabilityConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObservabilityConfigurationArgs $;

        public Builder() {
            $ = new ObservabilityConfigurationArgs();
        }

        public Builder(ObservabilityConfigurationArgs defaults) {
            $ = new ObservabilityConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param observabilityConfigurationName Name of the observability configuration.
         * 
         * @return builder
         * 
         */
        public Builder observabilityConfigurationName(Output<String> observabilityConfigurationName) {
            $.observabilityConfigurationName = observabilityConfigurationName;
            return this;
        }

        /**
         * @param observabilityConfigurationName Name of the observability configuration.
         * 
         * @return builder
         * 
         */
        public Builder observabilityConfigurationName(String observabilityConfigurationName) {
            return observabilityConfigurationName(Output.of(observabilityConfigurationName));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param traceConfiguration The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder traceConfiguration(@Nullable Output<ObservabilityConfigurationTraceConfigurationArgs> traceConfiguration) {
            $.traceConfiguration = traceConfiguration;
            return this;
        }

        /**
         * @param traceConfiguration The configuration of the tracing feature within this observability configuration. If you don&#39;t specify it, App Runner doesn&#39;t enable tracing. See Trace Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder traceConfiguration(ObservabilityConfigurationTraceConfigurationArgs traceConfiguration) {
            return traceConfiguration(Output.of(traceConfiguration));
        }

        public ObservabilityConfigurationArgs build() {
            $.observabilityConfigurationName = Objects.requireNonNull($.observabilityConfigurationName, "expected parameter 'observabilityConfigurationName' to be non-null");
            return $;
        }
    }

}
