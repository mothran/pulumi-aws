// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Outputs
{

    [OutputType]
    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetric
    {
        /// <summary>
        /// The dimensions of the metric.
        /// </summary>
        public readonly ImmutableArray<Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimension> Dimensions;
        /// <summary>
        /// The name of the metric.
        /// </summary>
        public readonly string MetricName;
        /// <summary>
        /// The namespace of the metric.
        /// </summary>
        public readonly string Namespace;

        [OutputConstructor]
        private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetric(
            ImmutableArray<Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedCapacityMetricSpecificationMetricDataQueryMetricStatMetricDimension> dimensions,

            string metricName,

            string @namespace)
        {
            Dimensions = dimensions;
            MetricName = metricName;
            Namespace = @namespace;
        }
    }
}
