// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudWatch.Inputs
{

    public sealed class EventTargetDeadLetterConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// - ARN of the SQS queue specified as the target for the dead-letter queue.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        public EventTargetDeadLetterConfigArgs()
        {
        }
        public static new EventTargetDeadLetterConfigArgs Empty => new EventTargetDeadLetterConfigArgs();
    }
}
