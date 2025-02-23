// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkflowOnExceptionStepTagStepDetailsTag {
    /**
     * @return The name assigned to the tag that you create.
     * 
     */
    private String key;
    /**
     * @return The value that corresponds to the key.
     * 
     */
    private String value;

    private WorkflowOnExceptionStepTagStepDetailsTag() {}
    /**
     * @return The name assigned to the tag that you create.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value that corresponds to the key.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowOnExceptionStepTagStepDetailsTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(WorkflowOnExceptionStepTagStepDetailsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public WorkflowOnExceptionStepTagStepDetailsTag build() {
            final var o = new WorkflowOnExceptionStepTagStepDetailsTag();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
