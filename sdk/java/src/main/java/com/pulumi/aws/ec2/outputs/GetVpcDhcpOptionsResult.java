// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetVpcDhcpOptionsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcDhcpOptionsResult {
    /**
     * @return The ARN of the DHCP Options Set.
     * 
     */
    private String arn;
    /**
     * @return EC2 DHCP Options ID
     * 
     */
    private String dhcpOptionsId;
    /**
     * @return The suffix domain name to used when resolving non Fully Qualified Domain NamesE.g., the `search` value in the `/etc/resolv.conf` file.
     * 
     */
    private String domainName;
    /**
     * @return List of name servers.
     * 
     */
    private List<String> domainNameServers;
    private @Nullable List<GetVpcDhcpOptionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of NETBIOS name servers.
     * 
     */
    private List<String> netbiosNameServers;
    /**
     * @return The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    private String netbiosNodeType;
    /**
     * @return List of NTP servers.
     * 
     */
    private List<String> ntpServers;
    /**
     * @return The ID of the AWS account that owns the DHCP options set.
     * 
     */
    private String ownerId;
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetVpcDhcpOptionsResult() {}
    /**
     * @return The ARN of the DHCP Options Set.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return EC2 DHCP Options ID
     * 
     */
    public String dhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * @return The suffix domain name to used when resolving non Fully Qualified Domain NamesE.g., the `search` value in the `/etc/resolv.conf` file.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return List of name servers.
     * 
     */
    public List<String> domainNameServers() {
        return this.domainNameServers;
    }
    public List<GetVpcDhcpOptionsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of NETBIOS name servers.
     * 
     */
    public List<String> netbiosNameServers() {
        return this.netbiosNameServers;
    }
    /**
     * @return The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    public String netbiosNodeType() {
        return this.netbiosNodeType;
    }
    /**
     * @return List of NTP servers.
     * 
     */
    public List<String> ntpServers() {
        return this.ntpServers;
    }
    /**
     * @return The ID of the AWS account that owns the DHCP options set.
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcDhcpOptionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String dhcpOptionsId;
        private String domainName;
        private List<String> domainNameServers;
        private @Nullable List<GetVpcDhcpOptionsFilter> filters;
        private String id;
        private List<String> netbiosNameServers;
        private String netbiosNodeType;
        private List<String> ntpServers;
        private String ownerId;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetVpcDhcpOptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = Objects.requireNonNull(dhcpOptionsId);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder domainNameServers(List<String> domainNameServers) {
            this.domainNameServers = Objects.requireNonNull(domainNameServers);
            return this;
        }
        public Builder domainNameServers(String... domainNameServers) {
            return domainNameServers(List.of(domainNameServers));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetVpcDhcpOptionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcDhcpOptionsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder netbiosNameServers(List<String> netbiosNameServers) {
            this.netbiosNameServers = Objects.requireNonNull(netbiosNameServers);
            return this;
        }
        public Builder netbiosNameServers(String... netbiosNameServers) {
            return netbiosNameServers(List.of(netbiosNameServers));
        }
        @CustomType.Setter
        public Builder netbiosNodeType(String netbiosNodeType) {
            this.netbiosNodeType = Objects.requireNonNull(netbiosNodeType);
            return this;
        }
        @CustomType.Setter
        public Builder ntpServers(List<String> ntpServers) {
            this.ntpServers = Objects.requireNonNull(ntpServers);
            return this;
        }
        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetVpcDhcpOptionsResult build() {
            final var o = new GetVpcDhcpOptionsResult();
            o.arn = arn;
            o.dhcpOptionsId = dhcpOptionsId;
            o.domainName = domainName;
            o.domainNameServers = domainNameServers;
            o.filters = filters;
            o.id = id;
            o.netbiosNameServers = netbiosNameServers;
            o.netbiosNodeType = netbiosNodeType;
            o.ntpServers = ntpServers;
            o.ownerId = ownerId;
            o.tags = tags;
            return o;
        }
    }
}
