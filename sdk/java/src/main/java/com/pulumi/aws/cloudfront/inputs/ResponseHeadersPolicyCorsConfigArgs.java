// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs;
import com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCorsConfigArgs Empty = new ResponseHeadersPolicyCorsConfigArgs();

    /**
     * A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
     */
    @Import(name="accessControlAllowCredentials", required=true)
    private Output<Boolean> accessControlAllowCredentials;

    /**
     * @return A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
     */
    public Output<Boolean> accessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
     */
    @Import(name="accessControlAllowHeaders", required=true)
    private Output<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders;

    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
     */
    public Output<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    @Import(name="accessControlAllowMethods", required=true)
    private Output<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods;

    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    public Output<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
     */
    @Import(name="accessControlAllowOrigins", required=true)
    private Output<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins;

    /**
     * @return Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
     */
    public Output<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
     */
    @Import(name="accessControlExposeHeaders")
    private @Nullable Output<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders;

    /**
     * @return Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
     */
    public Optional<Output<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs>> accessControlExposeHeaders() {
        return Optional.ofNullable(this.accessControlExposeHeaders);
    }

    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
     */
    @Import(name="accessControlMaxAgeSec")
    private @Nullable Output<Integer> accessControlMaxAgeSec;

    /**
     * @return A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
     */
    public Optional<Output<Integer>> accessControlMaxAgeSec() {
        return Optional.ofNullable(this.accessControlMaxAgeSec);
    }

    /**
     * A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
     */
    @Import(name="originOverride", required=true)
    private Output<Boolean> originOverride;

    /**
     * @return A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
     */
    public Output<Boolean> originOverride() {
        return this.originOverride;
    }

    private ResponseHeadersPolicyCorsConfigArgs() {}

    private ResponseHeadersPolicyCorsConfigArgs(ResponseHeadersPolicyCorsConfigArgs $) {
        this.accessControlAllowCredentials = $.accessControlAllowCredentials;
        this.accessControlAllowHeaders = $.accessControlAllowHeaders;
        this.accessControlAllowMethods = $.accessControlAllowMethods;
        this.accessControlAllowOrigins = $.accessControlAllowOrigins;
        this.accessControlExposeHeaders = $.accessControlExposeHeaders;
        this.accessControlMaxAgeSec = $.accessControlMaxAgeSec;
        this.originOverride = $.originOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyCorsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyCorsConfigArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyCorsConfigArgs();
        }

        public Builder(ResponseHeadersPolicyCorsConfigArgs defaults) {
            $ = new ResponseHeadersPolicyCorsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControlAllowCredentials A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowCredentials(Output<Boolean> accessControlAllowCredentials) {
            $.accessControlAllowCredentials = accessControlAllowCredentials;
            return this;
        }

        /**
         * @param accessControlAllowCredentials A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            return accessControlAllowCredentials(Output.of(accessControlAllowCredentials));
        }

        /**
         * @param accessControlAllowHeaders Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowHeaders(Output<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs> accessControlAllowHeaders) {
            $.accessControlAllowHeaders = accessControlAllowHeaders;
            return this;
        }

        /**
         * @param accessControlAllowHeaders Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowHeaders(ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs accessControlAllowHeaders) {
            return accessControlAllowHeaders(Output.of(accessControlAllowHeaders));
        }

        /**
         * @param accessControlAllowMethods Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowMethods(Output<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs> accessControlAllowMethods) {
            $.accessControlAllowMethods = accessControlAllowMethods;
            return this;
        }

        /**
         * @param accessControlAllowMethods Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowMethods(ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs accessControlAllowMethods) {
            return accessControlAllowMethods(Output.of(accessControlAllowMethods));
        }

        /**
         * @param accessControlAllowOrigins Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowOrigins(Output<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs> accessControlAllowOrigins) {
            $.accessControlAllowOrigins = accessControlAllowOrigins;
            return this;
        }

        /**
         * @param accessControlAllowOrigins Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlAllowOrigins(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs accessControlAllowOrigins) {
            return accessControlAllowOrigins(Output.of(accessControlAllowOrigins));
        }

        /**
         * @param accessControlExposeHeaders Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlExposeHeaders(@Nullable Output<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs> accessControlExposeHeaders) {
            $.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }

        /**
         * @param accessControlExposeHeaders Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlExposeHeaders(ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs accessControlExposeHeaders) {
            return accessControlExposeHeaders(Output.of(accessControlExposeHeaders));
        }

        /**
         * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlMaxAgeSec(@Nullable Output<Integer> accessControlMaxAgeSec) {
            $.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        /**
         * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            return accessControlMaxAgeSec(Output.of(accessControlMaxAgeSec));
        }

        /**
         * @param originOverride A Boolean value that determines how CloudFront behaves for the HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder originOverride(Output<Boolean> originOverride) {
            $.originOverride = originOverride;
            return this;
        }

        /**
         * @param originOverride A Boolean value that determines how CloudFront behaves for the HTTP response header.
         * 
         * @return builder
         * 
         */
        public Builder originOverride(Boolean originOverride) {
            return originOverride(Output.of(originOverride));
        }

        public ResponseHeadersPolicyCorsConfigArgs build() {
            $.accessControlAllowCredentials = Objects.requireNonNull($.accessControlAllowCredentials, "expected parameter 'accessControlAllowCredentials' to be non-null");
            $.accessControlAllowHeaders = Objects.requireNonNull($.accessControlAllowHeaders, "expected parameter 'accessControlAllowHeaders' to be non-null");
            $.accessControlAllowMethods = Objects.requireNonNull($.accessControlAllowMethods, "expected parameter 'accessControlAllowMethods' to be non-null");
            $.accessControlAllowOrigins = Objects.requireNonNull($.accessControlAllowOrigins, "expected parameter 'accessControlAllowOrigins' to be non-null");
            $.originOverride = Objects.requireNonNull($.originOverride, "expected parameter 'originOverride' to be non-null");
            return $;
        }
    }

}
