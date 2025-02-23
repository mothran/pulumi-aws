// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.inputs;

import com.pulumi.aws.identitystore.inputs.GetUserFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPlainArgs Empty = new GetUserPlainArgs();

    /**
     * Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
     * 
     */
    @Import(name="filters", required=true)
    private List<GetUserFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
     * 
     */
    public List<GetUserFilter> filters() {
        return this.filters;
    }

    /**
     * The Identity Store ID associated with the Single Sign-On Instance.
     * 
     */
    @Import(name="identityStoreId", required=true)
    private String identityStoreId;

    /**
     * @return The Identity Store ID associated with the Single Sign-On Instance.
     * 
     */
    public String identityStoreId() {
        return this.identityStoreId;
    }

    /**
     * The identifier for a user in the Identity Store.
     * 
     */
    @Import(name="userId")
    private @Nullable String userId;

    /**
     * @return The identifier for a user in the Identity Store.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GetUserPlainArgs() {}

    private GetUserPlainArgs(GetUserPlainArgs $) {
        this.filters = $.filters;
        this.identityStoreId = $.identityStoreId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPlainArgs $;

        public Builder() {
            $ = new GetUserPlainArgs();
        }

        public Builder(GetUserPlainArgs defaults) {
            $ = new GetUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetUserFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Currently, the AWS Identity Store API supports only 1 filter. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetUserFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param identityStoreId The Identity Store ID associated with the Single Sign-On Instance.
         * 
         * @return builder
         * 
         */
        public Builder identityStoreId(String identityStoreId) {
            $.identityStoreId = identityStoreId;
            return this;
        }

        /**
         * @param userId The identifier for a user in the Identity Store.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable String userId) {
            $.userId = userId;
            return this;
        }

        public GetUserPlainArgs build() {
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            $.identityStoreId = Objects.requireNonNull($.identityStoreId, "expected parameter 'identityStoreId' to be non-null");
            return $;
        }
    }

}
