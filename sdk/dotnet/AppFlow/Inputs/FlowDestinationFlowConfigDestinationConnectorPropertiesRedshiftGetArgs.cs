// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The object key for the Amazon S3 bucket in which the source files are stored.
        /// </summary>
        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        /// <summary>
        /// The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        [Input("errorHandlingConfig")]
        public Input<Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfigGetArgs>? ErrorHandlingConfig { get; set; }

        /// <summary>
        /// The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Snowflake.
        /// </summary>
        [Input("intermediateBucketName", required: true)]
        public Input<string> IntermediateBucketName { get; set; } = null!;

        /// <summary>
        /// The object specified in the Veeva flow source.
        /// </summary>
        [Input("object", required: true)]
        public Input<string> Object { get; set; } = null!;

        public FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftGetArgs()
        {
        }
        public static new FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftGetArgs Empty => new FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftGetArgs();
    }
}
