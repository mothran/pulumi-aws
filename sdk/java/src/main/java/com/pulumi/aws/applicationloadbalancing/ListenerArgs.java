// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing;

import com.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Import(name="alpnPolicy")
    private @Nullable Output<String> alpnPolicy;

    /**
     * @return Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    public Optional<Output<String>> alpnPolicy() {
        return Optional.ofNullable(this.alpnPolicy);
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    /**
     * @return ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Import(name="defaultActions", required=true)
    private Output<List<ListenerDefaultActionArgs>> defaultActions;

    /**
     * @return Configuration block for default actions. Detailed below.
     * 
     */
    public Output<List<ListenerDefaultActionArgs>> defaultActions() {
        return this.defaultActions;
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @Import(name="loadBalancerArn", required=true)
    private Output<String> loadBalancerArn;

    /**
     * @return ARN of the load balancer.
     * 
     */
    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable Output<String> sslPolicy;

    /**
     * @return Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    public Optional<Output<String>> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.alpnPolicy = $.alpnPolicy;
        this.certificateArn = $.certificateArn;
        this.defaultActions = $.defaultActions;
        this.loadBalancerArn = $.loadBalancerArn;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sslPolicy = $.sslPolicy;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alpnPolicy Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            $.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * @param alpnPolicy Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
         * 
         * @return builder
         * 
         */
        public Builder alpnPolicy(String alpnPolicy) {
            return alpnPolicy(Output.of(alpnPolicy));
        }

        /**
         * @param certificateArn ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        /**
         * @param certificateArn ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(Output<List<ListenerDefaultActionArgs>> defaultActions) {
            $.defaultActions = defaultActions;
            return this;
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(List<ListenerDefaultActionArgs> defaultActions) {
            return defaultActions(Output.of(defaultActions));
        }

        /**
         * @param defaultActions Configuration block for default actions. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultActions(ListenerDefaultActionArgs... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }

        /**
         * @param loadBalancerArn ARN of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerArn(Output<String> loadBalancerArn) {
            $.loadBalancerArn = loadBalancerArn;
            return this;
        }

        /**
         * @param loadBalancerArn ARN of the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerArn(String loadBalancerArn) {
            return loadBalancerArn(Output.of(loadBalancerArn));
        }

        /**
         * @param port Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sslPolicy Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
         * 
         * @return builder
         * 
         */
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        /**
         * @param sslPolicy Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
         * 
         * @return builder
         * 
         */
        public Builder sslPolicy(String sslPolicy) {
            return sslPolicy(Output.of(sslPolicy));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ListenerArgs build() {
            $.defaultActions = Objects.requireNonNull($.defaultActions, "expected parameter 'defaultActions' to be non-null");
            $.loadBalancerArn = Objects.requireNonNull($.loadBalancerArn, "expected parameter 'loadBalancerArn' to be non-null");
            return $;
        }
    }

}
