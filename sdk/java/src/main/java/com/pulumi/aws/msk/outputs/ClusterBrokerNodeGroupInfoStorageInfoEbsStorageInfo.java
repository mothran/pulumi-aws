// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo {
    /**
     * @return A block that contains EBS volume provisioned throughput information. To provision storage throughput, you must choose broker type kafka.m5.4xlarge or larger. See below.
     * 
     */
    private @Nullable ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput provisionedThroughput;
    /**
     * @return The size in GiB of the EBS volume for the data drive on each broker node. Minimum value of `1` and maximum value of `16384`.
     * 
     */
    private @Nullable Integer volumeSize;

    private ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo() {}
    /**
     * @return A block that contains EBS volume provisioned throughput information. To provision storage throughput, you must choose broker type kafka.m5.4xlarge or larger. See below.
     * 
     */
    public Optional<ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput> provisionedThroughput() {
        return Optional.ofNullable(this.provisionedThroughput);
    }
    /**
     * @return The size in GiB of the EBS volume for the data drive on each broker node. Minimum value of `1` and maximum value of `16384`.
     * 
     */
    public Optional<Integer> volumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput provisionedThroughput;
        private @Nullable Integer volumeSize;
        public Builder() {}
        public Builder(ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisionedThroughput = defaults.provisionedThroughput;
    	      this.volumeSize = defaults.volumeSize;
        }

        @CustomType.Setter
        public Builder provisionedThroughput(@Nullable ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput provisionedThroughput) {
            this.provisionedThroughput = provisionedThroughput;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }
        public ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo build() {
            final var o = new ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfo();
            o.provisionedThroughput = provisionedThroughput;
            o.volumeSize = volumeSize;
            return o;
        }
    }
}
