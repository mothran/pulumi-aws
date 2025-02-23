// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSourceFlowConfigSourceConnectorPropertiesS3Args extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceFlowConfigSourceConnectorPropertiesS3Args Empty = new FlowSourceFlowConfigSourceConnectorPropertiesS3Args();

    /**
     * The Amazon S3 bucket name where the source files are stored.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    /**
     * When you use Amazon S3 as the source, the configuration format that you provide the flow input data. See S3 Input Format Config for details.
     * 
     */
    @Import(name="s3InputFormatConfig")
    private @Nullable Output<FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs> s3InputFormatConfig;

    /**
     * @return When you use Amazon S3 as the source, the configuration format that you provide the flow input data. See S3 Input Format Config for details.
     * 
     */
    public Optional<Output<FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs>> s3InputFormatConfig() {
        return Optional.ofNullable(this.s3InputFormatConfig);
    }

    private FlowSourceFlowConfigSourceConnectorPropertiesS3Args() {}

    private FlowSourceFlowConfigSourceConnectorPropertiesS3Args(FlowSourceFlowConfigSourceConnectorPropertiesS3Args $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.s3InputFormatConfig = $.s3InputFormatConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceFlowConfigSourceConnectorPropertiesS3Args $;

        public Builder() {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesS3Args();
        }

        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesS3Args defaults) {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The Amazon S3 bucket name where the source files are stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The Amazon S3 bucket name where the source files are stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * @param bucketPrefix The object key for the Amazon S3 bucket in which the source files are stored.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        /**
         * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format that you provide the flow input data. See S3 Input Format Config for details.
         * 
         * @return builder
         * 
         */
        public Builder s3InputFormatConfig(@Nullable Output<FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs> s3InputFormatConfig) {
            $.s3InputFormatConfig = s3InputFormatConfig;
            return this;
        }

        /**
         * @param s3InputFormatConfig When you use Amazon S3 as the source, the configuration format that you provide the flow input data. See S3 Input Format Config for details.
         * 
         * @return builder
         * 
         */
        public Builder s3InputFormatConfig(FlowSourceFlowConfigSourceConnectorPropertiesS3S3InputFormatConfigArgs s3InputFormatConfig) {
            return s3InputFormatConfig(Output.of(s3InputFormatConfig));
        }

        public FlowSourceFlowConfigSourceConnectorPropertiesS3Args build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
