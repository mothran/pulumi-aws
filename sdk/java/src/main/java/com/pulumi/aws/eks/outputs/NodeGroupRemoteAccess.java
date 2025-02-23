// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupRemoteAccess {
    /**
     * @return EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `source_security_group_ids` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    private @Nullable String ec2SshKey;
    /**
     * @return Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2_ssh_key`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    private @Nullable List<String> sourceSecurityGroupIds;

    private NodeGroupRemoteAccess() {}
    /**
     * @return EC2 Key Pair name that provides access for SSH communication with the worker nodes in the EKS Node Group. If you specify this configuration, but do not specify `source_security_group_ids` when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    public Optional<String> ec2SshKey() {
        return Optional.ofNullable(this.ec2SshKey);
    }
    /**
     * @return Set of EC2 Security Group IDs to allow SSH access (port 22) from on the worker nodes. If you specify `ec2_ssh_key`, but do not specify this configuration when you create an EKS Node Group, port 22 on the worker nodes is opened to the Internet (0.0.0.0/0).
     * 
     */
    public List<String> sourceSecurityGroupIds() {
        return this.sourceSecurityGroupIds == null ? List.of() : this.sourceSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupRemoteAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ec2SshKey;
        private @Nullable List<String> sourceSecurityGroupIds;
        public Builder() {}
        public Builder(NodeGroupRemoteAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2SshKey = defaults.ec2SshKey;
    	      this.sourceSecurityGroupIds = defaults.sourceSecurityGroupIds;
        }

        @CustomType.Setter
        public Builder ec2SshKey(@Nullable String ec2SshKey) {
            this.ec2SshKey = ec2SshKey;
            return this;
        }
        @CustomType.Setter
        public Builder sourceSecurityGroupIds(@Nullable List<String> sourceSecurityGroupIds) {
            this.sourceSecurityGroupIds = sourceSecurityGroupIds;
            return this;
        }
        public Builder sourceSecurityGroupIds(String... sourceSecurityGroupIds) {
            return sourceSecurityGroupIds(List.of(sourceSecurityGroupIds));
        }
        public NodeGroupRemoteAccess build() {
            final var o = new NodeGroupRemoteAccess();
            o.ec2SshKey = ec2SshKey;
            o.sourceSecurityGroupIds = sourceSecurityGroupIds;
            return o;
        }
    }
}
