// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLinkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinkPlainArgs Empty = new GetLinkPlainArgs();

    /**
     * The ID of the Global Network of the link to retrieve.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private String globalNetworkId;

    /**
     * @return The ID of the Global Network of the link to retrieve.
     * 
     */
    public String globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The id of the specific link to retrieve.
     * 
     */
    @Import(name="linkId", required=true)
    private String linkId;

    /**
     * @return The id of the specific link to retrieve.
     * 
     */
    public String linkId() {
        return this.linkId;
    }

    /**
     * Key-value tags for the link.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value tags for the link.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLinkPlainArgs() {}

    private GetLinkPlainArgs(GetLinkPlainArgs $) {
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinkPlainArgs $;

        public Builder() {
            $ = new GetLinkPlainArgs();
        }

        public Builder(GetLinkPlainArgs defaults) {
            $ = new GetLinkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalNetworkId The ID of the Global Network of the link to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param linkId The id of the specific link to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder linkId(String linkId) {
            $.linkId = linkId;
            return this;
        }

        /**
         * @param tags Key-value tags for the link.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLinkPlainArgs build() {
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            $.linkId = Objects.requireNonNull($.linkId, "expected parameter 'linkId' to be non-null");
            return $;
        }
    }

}
