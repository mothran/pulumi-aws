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
    public sealed class FlowSourceFlowConfigSourceConnectorPropertiesServiceNow
    {
        /// <summary>
        /// The object specified in the Veeva flow source.
        /// </summary>
        public readonly string Object;

        [OutputConstructor]
        private FlowSourceFlowConfigSourceConnectorPropertiesServiceNow(string @object)
        {
            Object = @object;
        }
    }
}
