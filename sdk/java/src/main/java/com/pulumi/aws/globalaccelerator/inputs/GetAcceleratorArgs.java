// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAcceleratorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAcceleratorArgs Empty = new GetAcceleratorArgs();

    /**
     * The full ARN of the Global Accelerator.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The full ARN of the Global Accelerator.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The unique name of the Global Accelerator.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the Global Accelerator.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetAcceleratorArgs() {}

    private GetAcceleratorArgs(GetAcceleratorArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAcceleratorArgs $;

        public Builder() {
            $ = new GetAcceleratorArgs();
        }

        public Builder(GetAcceleratorArgs defaults) {
            $ = new GetAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The full ARN of the Global Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The full ARN of the Global Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name The unique name of the Global Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the Global Accelerator.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetAcceleratorArgs build() {
            return $;
        }
    }

}
