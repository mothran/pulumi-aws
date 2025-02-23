// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.aws.opensearch.outputs.GetDomainClusterConfigColdStorageOption;
import com.pulumi.aws.opensearch.outputs.GetDomainClusterConfigZoneAwarenessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainClusterConfig {
    /**
     * @return Configuration block containing cold storage configuration.
     * 
     */
    private List<GetDomainClusterConfigColdStorageOption> coldStorageOptions;
    /**
     * @return Number of dedicated master nodes in the cluster.
     * 
     */
    private Integer dedicatedMasterCount;
    /**
     * @return Indicates whether dedicated master nodes are enabled for the cluster.
     * 
     */
    private Boolean dedicatedMasterEnabled;
    /**
     * @return Instance type of the dedicated master nodes in the cluster.
     * 
     */
    private String dedicatedMasterType;
    /**
     * @return Number of instances in the cluster.
     * 
     */
    private Integer instanceCount;
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    private String instanceType;
    /**
     * @return Number of warm nodes in the cluster.
     * 
     */
    private Integer warmCount;
    /**
     * @return Indicates warm storage is enabled.
     * 
     */
    private @Nullable Boolean warmEnabled;
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes.
     * 
     */
    private String warmType;
    /**
     * @return Configuration block containing zone awareness settings.
     * 
     */
    private List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;
    /**
     * @return Indicates whether zone awareness is enabled.
     * 
     */
    private Boolean zoneAwarenessEnabled;

    private GetDomainClusterConfig() {}
    /**
     * @return Configuration block containing cold storage configuration.
     * 
     */
    public List<GetDomainClusterConfigColdStorageOption> coldStorageOptions() {
        return this.coldStorageOptions;
    }
    /**
     * @return Number of dedicated master nodes in the cluster.
     * 
     */
    public Integer dedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }
    /**
     * @return Indicates whether dedicated master nodes are enabled for the cluster.
     * 
     */
    public Boolean dedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }
    /**
     * @return Instance type of the dedicated master nodes in the cluster.
     * 
     */
    public String dedicatedMasterType() {
        return this.dedicatedMasterType;
    }
    /**
     * @return Number of instances in the cluster.
     * 
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Number of warm nodes in the cluster.
     * 
     */
    public Integer warmCount() {
        return this.warmCount;
    }
    /**
     * @return Indicates warm storage is enabled.
     * 
     */
    public Optional<Boolean> warmEnabled() {
        return Optional.ofNullable(this.warmEnabled);
    }
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes.
     * 
     */
    public String warmType() {
        return this.warmType;
    }
    /**
     * @return Configuration block containing zone awareness settings.
     * 
     */
    public List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs() {
        return this.zoneAwarenessConfigs;
    }
    /**
     * @return Indicates whether zone awareness is enabled.
     * 
     */
    public Boolean zoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainClusterConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDomainClusterConfigColdStorageOption> coldStorageOptions;
        private Integer dedicatedMasterCount;
        private Boolean dedicatedMasterEnabled;
        private String dedicatedMasterType;
        private Integer instanceCount;
        private String instanceType;
        private Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private String warmType;
        private List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;
        private Boolean zoneAwarenessEnabled;
        public Builder() {}
        public Builder(GetDomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageOptions = defaults.coldStorageOptions;
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfigs = defaults.zoneAwarenessConfigs;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        @CustomType.Setter
        public Builder coldStorageOptions(List<GetDomainClusterConfigColdStorageOption> coldStorageOptions) {
            this.coldStorageOptions = Objects.requireNonNull(coldStorageOptions);
            return this;
        }
        public Builder coldStorageOptions(GetDomainClusterConfigColdStorageOption... coldStorageOptions) {
            return coldStorageOptions(List.of(coldStorageOptions));
        }
        @CustomType.Setter
        public Builder dedicatedMasterCount(Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Objects.requireNonNull(dedicatedMasterCount);
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Objects.requireNonNull(dedicatedMasterEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder dedicatedMasterType(String dedicatedMasterType) {
            this.dedicatedMasterType = Objects.requireNonNull(dedicatedMasterType);
            return this;
        }
        @CustomType.Setter
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        @CustomType.Setter
        public Builder warmCount(Integer warmCount) {
            this.warmCount = Objects.requireNonNull(warmCount);
            return this;
        }
        @CustomType.Setter
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder warmType(String warmType) {
            this.warmType = Objects.requireNonNull(warmType);
            return this;
        }
        @CustomType.Setter
        public Builder zoneAwarenessConfigs(List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs) {
            this.zoneAwarenessConfigs = Objects.requireNonNull(zoneAwarenessConfigs);
            return this;
        }
        public Builder zoneAwarenessConfigs(GetDomainClusterConfigZoneAwarenessConfig... zoneAwarenessConfigs) {
            return zoneAwarenessConfigs(List.of(zoneAwarenessConfigs));
        }
        @CustomType.Setter
        public Builder zoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Objects.requireNonNull(zoneAwarenessEnabled);
            return this;
        }
        public GetDomainClusterConfig build() {
            final var o = new GetDomainClusterConfig();
            o.coldStorageOptions = coldStorageOptions;
            o.dedicatedMasterCount = dedicatedMasterCount;
            o.dedicatedMasterEnabled = dedicatedMasterEnabled;
            o.dedicatedMasterType = dedicatedMasterType;
            o.instanceCount = instanceCount;
            o.instanceType = instanceType;
            o.warmCount = warmCount;
            o.warmEnabled = warmEnabled;
            o.warmType = warmType;
            o.zoneAwarenessConfigs = zoneAwarenessConfigs;
            o.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return o;
        }
    }
}
