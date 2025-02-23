// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate;
import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTls {
    /**
     * @return The listener&#39;s TLS certificate.
     * 
     */
    private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate certificate;
    /**
     * @return Whether the policy is enforced. Default is `true`.
     * 
     */
    private @Nullable Boolean enforce;
    /**
     * @return One or more ports that the policy is enforced for.
     * 
     */
    private @Nullable List<Integer> ports;
    /**
     * @return The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation validation;

    private VirtualGatewaySpecBackendDefaultsClientPolicyTls() {}
    /**
     * @return The listener&#39;s TLS certificate.
     * 
     */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return Whether the policy is enforced. Default is `true`.
     * 
     */
    public Optional<Boolean> enforce() {
        return Optional.ofNullable(this.enforce);
    }
    /**
     * @return One or more ports that the policy is enforced for.
     * 
     */
    public List<Integer> ports() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * @return The listener&#39;s Transport Layer Security (TLS) validation context.
     * 
     */
    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation validation() {
        return this.validation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate certificate;
        private @Nullable Boolean enforce;
        private @Nullable List<Integer> ports;
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation validation;
        public Builder() {}
        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder validation(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTls build() {
            final var o = new VirtualGatewaySpecBackendDefaultsClientPolicyTls();
            o.certificate = certificate;
            o.enforce = enforce;
            o.ports = ports;
            o.validation = validation;
            return o;
        }
    }
}
