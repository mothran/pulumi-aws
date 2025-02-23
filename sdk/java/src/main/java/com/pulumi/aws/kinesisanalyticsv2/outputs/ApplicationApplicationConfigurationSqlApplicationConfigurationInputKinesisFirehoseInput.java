// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput {
    /**
     * @return The ARN of the delivery stream.
     * 
     */
    private String resourceArn;

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput() {}
    /**
     * @return The ARN of the delivery stream.
     * 
     */
    public String resourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceArn;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        @CustomType.Setter
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput build() {
            final var o = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput();
            o.resourceArn = resourceArn;
            return o;
        }
    }
}
