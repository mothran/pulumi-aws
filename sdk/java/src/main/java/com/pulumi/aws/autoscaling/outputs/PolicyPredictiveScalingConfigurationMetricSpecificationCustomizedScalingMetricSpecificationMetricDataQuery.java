// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery {
    /**
     * @return The math expression used on the returned metric. You must specify either `expression` or `metric_stat`, but not both.
     * 
     */
    private @Nullable String expression;
    /**
     * @return A short name for the metric used in predictive scaling policy.
     * 
     */
    private String id;
    /**
     * @return A human-readable label for this metric or expression.
     * 
     */
    private @Nullable String label;
    /**
     * @return A structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metric_stat`, but not both.
     * 
     */
    private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat metricStat;
    /**
     * @return A boolean that indicates whether to return the timestamps and raw data values of this metric, the default it true
     * 
     */
    private @Nullable Boolean returnData;

    private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery() {}
    /**
     * @return The math expression used on the returned metric. You must specify either `expression` or `metric_stat`, but not both.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return A short name for the metric used in predictive scaling policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A human-readable label for this metric or expression.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return A structure that defines CloudWatch metric to be used in predictive scaling policy. You must specify either `expression` or `metric_stat`, but not both.
     * 
     */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat> metricStat() {
        return Optional.ofNullable(this.metricStat);
    }
    /**
     * @return A boolean that indicates whether to return the timestamps and raw data values of this metric, the default it true
     * 
     */
    public Optional<Boolean> returnData() {
        return Optional.ofNullable(this.returnData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private String id;
        private @Nullable String label;
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat metricStat;
        private @Nullable Boolean returnData;
        public Builder() {}
        public Builder(PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.metricStat = defaults.metricStat;
    	      this.returnData = defaults.returnData;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder metricStat(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat metricStat) {
            this.metricStat = metricStat;
            return this;
        }
        @CustomType.Setter
        public Builder returnData(@Nullable Boolean returnData) {
            this.returnData = returnData;
            return this;
        }
        public PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery build() {
            final var o = new PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQuery();
            o.expression = expression;
            o.id = id;
            o.label = label;
            o.metricStat = metricStat;
            o.returnData = returnData;
            return o;
        }
    }
}
