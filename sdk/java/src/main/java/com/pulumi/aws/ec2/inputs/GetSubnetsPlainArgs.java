// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSubnetsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetsPlainArgs Empty = new GetSubnetsPlainArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSubnetsFilter> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<List<GetSubnetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSubnetsPlainArgs() {}

    private GetSubnetsPlainArgs(GetSubnetsPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetsPlainArgs $;

        public Builder() {
            $ = new GetSubnetsPlainArgs();
        }

        public Builder(GetSubnetsPlainArgs defaults) {
            $ = new GetSubnetsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSubnetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSubnetsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired subnets.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetSubnetsPlainArgs build() {
            return $;
        }
    }

}
