// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesS3
    {
        /// <summary>
        /// The Amazon S3 bucket name where the source files are stored.
        /// </summary>
        public readonly string BucketName;
        /// <summary>
        /// The object key for the Amazon S3 bucket in which the source files are stored.
        /// </summary>
        public readonly string? BucketPrefix;
        /// <summary>
        /// The configuration that determines how Amazon AppFlow should format the flow output data when Upsolver is used as the destination. See Upsolver S3 Output Format Config for more details.
        /// </summary>
        public readonly Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig? S3OutputFormatConfig;

        [OutputConstructor]
        private FlowDestinationFlowConfigDestinationConnectorPropertiesS3(
            string bucketName,

            string? bucketPrefix,

            Outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfig? s3OutputFormatConfig)
        {
            BucketName = bucketName;
            BucketPrefix = bucketPrefix;
            S3OutputFormatConfig = s3OutputFormatConfig;
        }
    }
}
