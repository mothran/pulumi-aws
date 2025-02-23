// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionCidrBlockSet;
import com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionFilter;
import com.pulumi.aws.ec2.outputs.GetVpcPeeringConnectionPeerCidrBlockSet;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcPeeringConnectionResult {
    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    private Map<String,Boolean> accepter;
    /**
     * @return A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
     */
    private String cidrBlock;
    /**
     * @return List of objects with CIDR blocks of the requester VPC.
     * 
     */
    private List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
    private @Nullable List<GetVpcPeeringConnectionFilter> filters;
    private String id;
    private String ownerId;
    private String peerCidrBlock;
    /**
     * @return List of objects with CIDR blocks of the accepter VPC.
     * 
     */
    private List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
    private String peerOwnerId;
    private String peerRegion;
    private String peerVpcId;
    private String region;
    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    private Map<String,Boolean> requester;
    private String status;
    private Map<String,String> tags;
    private String vpcId;

    private GetVpcPeeringConnectionResult() {}
    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the accepter VPC.
     * 
     */
    public Map<String,Boolean> accepter() {
        return this.accepter;
    }
    /**
     * @return A CIDR block associated to the VPC of the specific VPC Peering Connection.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return List of objects with CIDR blocks of the requester VPC.
     * 
     */
    public List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets() {
        return this.cidrBlockSets;
    }
    public List<GetVpcPeeringConnectionFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    public String ownerId() {
        return this.ownerId;
    }
    public String peerCidrBlock() {
        return this.peerCidrBlock;
    }
    /**
     * @return List of objects with CIDR blocks of the accepter VPC.
     * 
     */
    public List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets() {
        return this.peerCidrBlockSets;
    }
    public String peerOwnerId() {
        return this.peerOwnerId;
    }
    public String peerRegion() {
        return this.peerRegion;
    }
    public String peerVpcId() {
        return this.peerVpcId;
    }
    public String region() {
        return this.region;
    }
    /**
     * @return A configuration block that describes [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options set for the requester VPC.
     * 
     */
    public Map<String,Boolean> requester() {
        return this.requester;
    }
    public String status() {
        return this.status;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Boolean> accepter;
        private String cidrBlock;
        private List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets;
        private @Nullable List<GetVpcPeeringConnectionFilter> filters;
        private String id;
        private String ownerId;
        private String peerCidrBlock;
        private List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets;
        private String peerOwnerId;
        private String peerRegion;
        private String peerVpcId;
        private String region;
        private Map<String,Boolean> requester;
        private String status;
        private Map<String,String> tags;
        private String vpcId;
        public Builder() {}
        public Builder(GetVpcPeeringConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.cidrBlockSets = defaults.cidrBlockSets;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ownerId = defaults.ownerId;
    	      this.peerCidrBlock = defaults.peerCidrBlock;
    	      this.peerCidrBlockSets = defaults.peerCidrBlockSets;
    	      this.peerOwnerId = defaults.peerOwnerId;
    	      this.peerRegion = defaults.peerRegion;
    	      this.peerVpcId = defaults.peerVpcId;
    	      this.region = defaults.region;
    	      this.requester = defaults.requester;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder accepter(Map<String,Boolean> accepter) {
            this.accepter = Objects.requireNonNull(accepter);
            return this;
        }
        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder cidrBlockSets(List<GetVpcPeeringConnectionCidrBlockSet> cidrBlockSets) {
            this.cidrBlockSets = Objects.requireNonNull(cidrBlockSets);
            return this;
        }
        public Builder cidrBlockSets(GetVpcPeeringConnectionCidrBlockSet... cidrBlockSets) {
            return cidrBlockSets(List.of(cidrBlockSets));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetVpcPeeringConnectionFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcPeeringConnectionFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder peerCidrBlock(String peerCidrBlock) {
            this.peerCidrBlock = Objects.requireNonNull(peerCidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder peerCidrBlockSets(List<GetVpcPeeringConnectionPeerCidrBlockSet> peerCidrBlockSets) {
            this.peerCidrBlockSets = Objects.requireNonNull(peerCidrBlockSets);
            return this;
        }
        public Builder peerCidrBlockSets(GetVpcPeeringConnectionPeerCidrBlockSet... peerCidrBlockSets) {
            return peerCidrBlockSets(List.of(peerCidrBlockSets));
        }
        @CustomType.Setter
        public Builder peerOwnerId(String peerOwnerId) {
            this.peerOwnerId = Objects.requireNonNull(peerOwnerId);
            return this;
        }
        @CustomType.Setter
        public Builder peerRegion(String peerRegion) {
            this.peerRegion = Objects.requireNonNull(peerRegion);
            return this;
        }
        @CustomType.Setter
        public Builder peerVpcId(String peerVpcId) {
            this.peerVpcId = Objects.requireNonNull(peerVpcId);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder requester(Map<String,Boolean> requester) {
            this.requester = Objects.requireNonNull(requester);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetVpcPeeringConnectionResult build() {
            final var o = new GetVpcPeeringConnectionResult();
            o.accepter = accepter;
            o.cidrBlock = cidrBlock;
            o.cidrBlockSets = cidrBlockSets;
            o.filters = filters;
            o.id = id;
            o.ownerId = ownerId;
            o.peerCidrBlock = peerCidrBlock;
            o.peerCidrBlockSets = peerCidrBlockSets;
            o.peerOwnerId = peerOwnerId;
            o.peerRegion = peerRegion;
            o.peerVpcId = peerVpcId;
            o.region = region;
            o.requester = requester;
            o.status = status;
            o.tags = tags;
            o.vpcId = vpcId;
            return o;
        }
    }
}
