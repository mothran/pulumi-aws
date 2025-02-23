// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionRedirect {
    private String host;
    private String path;
    /**
     * @return Port of the listener. Required if `arn` is not set.
     * 
     */
    private String port;
    private String protocol;
    private String query;
    private String statusCode;

    private GetListenerDefaultActionRedirect() {}
    public String host() {
        return this.host;
    }
    public String path() {
        return this.path;
    }
    /**
     * @return Port of the listener. Required if `arn` is not set.
     * 
     */
    public String port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public String query() {
        return this.query;
    }
    public String statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String host;
        private String path;
        private String port;
        private String protocol;
        private String query;
        private String statusCode;
        public Builder() {}
        public Builder(GetListenerDefaultActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public GetListenerDefaultActionRedirect build() {
            final var o = new GetListenerDefaultActionRedirect();
            o.host = host;
            o.path = path;
            o.port = port;
            o.protocol = protocol;
            o.query = query;
            o.statusCode = statusCode;
            return o;
        }
    }
}
