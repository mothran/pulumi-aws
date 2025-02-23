// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProxyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProxyArgs Empty = new GetProxyArgs();

    /**
     * The name of the DB proxy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the DB proxy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetProxyArgs() {}

    private GetProxyArgs(GetProxyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProxyArgs $;

        public Builder() {
            $ = new GetProxyArgs();
        }

        public Builder(GetProxyArgs defaults) {
            $ = new GetProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DB proxy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the DB proxy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetProxyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
