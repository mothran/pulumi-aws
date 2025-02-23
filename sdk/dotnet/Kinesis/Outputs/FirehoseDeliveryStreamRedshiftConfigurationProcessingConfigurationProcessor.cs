// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Outputs
{

    [OutputType]
    public sealed class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor
    {
        /// <summary>
        /// Array of processor parameters. More details are given below
        /// </summary>
        public readonly ImmutableArray<Outputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter> Parameters;
        /// <summary>
        /// The type of processor. Valid Values: `RecordDeAggregation`, `Lambda`, `MetadataExtraction`, `AppendDelimiterToRecord`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor(
            ImmutableArray<Outputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter> parameters,

            string type)
        {
            Parameters = parameters;
            Type = type;
        }
    }
}
