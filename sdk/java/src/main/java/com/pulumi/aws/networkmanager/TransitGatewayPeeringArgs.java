// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringArgs Empty = new TransitGatewayPeeringArgs();

    /**
     * The ID of a core network.
     * 
     */
    @Import(name="coreNetworkId", required=true)
    private Output<String> coreNetworkId;

    /**
     * @return The ID of a core network.
     * 
     */
    public Output<String> coreNetworkId() {
        return this.coreNetworkId;
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ARN of the transit gateway for the peering request.
     * 
     */
    @Import(name="transitGatewayArn", required=true)
    private Output<String> transitGatewayArn;

    /**
     * @return The ARN of the transit gateway for the peering request.
     * 
     */
    public Output<String> transitGatewayArn() {
        return this.transitGatewayArn;
    }

    private TransitGatewayPeeringArgs() {}

    private TransitGatewayPeeringArgs(TransitGatewayPeeringArgs $) {
        this.coreNetworkId = $.coreNetworkId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.transitGatewayArn = $.transitGatewayArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayPeeringArgs $;

        public Builder() {
            $ = new TransitGatewayPeeringArgs();
        }

        public Builder(TransitGatewayPeeringArgs defaults) {
            $ = new TransitGatewayPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coreNetworkId The ID of a core network.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkId(Output<String> coreNetworkId) {
            $.coreNetworkId = coreNetworkId;
            return this;
        }

        /**
         * @param coreNetworkId The ID of a core network.
         * 
         * @return builder
         * 
         */
        public Builder coreNetworkId(String coreNetworkId) {
            return coreNetworkId(Output.of(coreNetworkId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param transitGatewayArn The ARN of the transit gateway for the peering request.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayArn(Output<String> transitGatewayArn) {
            $.transitGatewayArn = transitGatewayArn;
            return this;
        }

        /**
         * @param transitGatewayArn The ARN of the transit gateway for the peering request.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayArn(String transitGatewayArn) {
            return transitGatewayArn(Output.of(transitGatewayArn));
        }

        public TransitGatewayPeeringArgs build() {
            $.coreNetworkId = Objects.requireNonNull($.coreNetworkId, "expected parameter 'coreNetworkId' to be non-null");
            $.transitGatewayArn = Objects.requireNonNull($.transitGatewayArn, "expected parameter 'transitGatewayArn' to be non-null");
            return $;
        }
    }

}
