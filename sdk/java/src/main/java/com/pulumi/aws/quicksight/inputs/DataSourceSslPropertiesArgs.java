// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DataSourceSslPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSslPropertiesArgs Empty = new DataSourceSslPropertiesArgs();

    /**
     * A Boolean option to control whether SSL should be disabled.
     * 
     */
    @Import(name="disableSsl", required=true)
    private Output<Boolean> disableSsl;

    /**
     * @return A Boolean option to control whether SSL should be disabled.
     * 
     */
    public Output<Boolean> disableSsl() {
        return this.disableSsl;
    }

    private DataSourceSslPropertiesArgs() {}

    private DataSourceSslPropertiesArgs(DataSourceSslPropertiesArgs $) {
        this.disableSsl = $.disableSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSslPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSslPropertiesArgs $;

        public Builder() {
            $ = new DataSourceSslPropertiesArgs();
        }

        public Builder(DataSourceSslPropertiesArgs defaults) {
            $ = new DataSourceSslPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableSsl A Boolean option to control whether SSL should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disableSsl(Output<Boolean> disableSsl) {
            $.disableSsl = disableSsl;
            return this;
        }

        /**
         * @param disableSsl A Boolean option to control whether SSL should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disableSsl(Boolean disableSsl) {
            return disableSsl(Output.of(disableSsl));
        }

        public DataSourceSslPropertiesArgs build() {
            $.disableSsl = Objects.requireNonNull($.disableSsl, "expected parameter 'disableSsl' to be non-null");
            return $;
        }
    }

}
