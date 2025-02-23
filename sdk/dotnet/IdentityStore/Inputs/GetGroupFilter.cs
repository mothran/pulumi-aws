// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.IdentityStore.Inputs
{

    public sealed class GetGroupFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The attribute path that is used to specify which attribute name to search. Currently, `DisplayName` is the only valid attribute path.
        /// </summary>
        [Input("attributePath", required: true)]
        public string AttributePath { get; set; } = null!;

        /// <summary>
        /// The value for an attribute.
        /// </summary>
        [Input("attributeValue", required: true)]
        public string AttributeValue { get; set; } = null!;

        public GetGroupFilterArgs()
        {
        }
        public static new GetGroupFilterArgs Empty => new GetGroupFilterArgs();
    }
}
