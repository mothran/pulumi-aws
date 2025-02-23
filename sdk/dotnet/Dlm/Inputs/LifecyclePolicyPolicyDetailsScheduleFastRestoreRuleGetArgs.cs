// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Dlm.Inputs
{

    public sealed class LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones", required: true)]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// The Availability Zones in which to enable fast snapshot restore.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// How many snapshots to keep. Must be an integer between `1` and `1000`.
        /// </summary>
        [Input("count")]
        public Input<int>? Count { get; set; }

        /// <summary>
        /// The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
        /// </summary>
        [Input("intervalUnit")]
        public Input<string>? IntervalUnit { get; set; }

        public LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs()
        {
        }
        public static new LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs Empty => new LifecyclePolicyPolicyDetailsScheduleFastRestoreRuleGetArgs();
    }
}
