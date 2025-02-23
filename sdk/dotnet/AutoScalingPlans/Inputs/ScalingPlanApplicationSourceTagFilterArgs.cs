// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScalingPlans.Inputs
{

    public sealed class ScalingPlanApplicationSourceTagFilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tag key.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// The tag values.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public ScalingPlanApplicationSourceTagFilterArgs()
        {
        }
        public static new ScalingPlanApplicationSourceTagFilterArgs Empty => new ScalingPlanApplicationSourceTagFilterArgs();
    }
}
