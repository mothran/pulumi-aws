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
    public sealed class FlowSourceFlowConfigIncrementalPullConfig
    {
        /// <summary>
        /// A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source.
        /// </summary>
        public readonly string? DatetimeTypeFieldName;

        [OutputConstructor]
        private FlowSourceFlowConfigIncrementalPullConfig(string? datetimeTypeFieldName)
        {
            DatetimeTypeFieldName = datetimeTypeFieldName;
        }
    }
}
