// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVaultResult {
    /**
     * @return The ARN of the vault.
     * 
     */
    private String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The server-side encryption key that is used to protect your backups.
     * 
     */
    private String kmsKeyArn;
    private String name;
    /**
     * @return The number of recovery points that are stored in a backup vault.
     * 
     */
    private Integer recoveryPoints;
    /**
     * @return Metadata that you can assign to help organize the resources that you create.
     * 
     */
    private Map<String,String> tags;

    private GetVaultResult() {}
    /**
     * @return The ARN of the vault.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The server-side encryption key that is used to protect your backups.
     * 
     */
    public String kmsKeyArn() {
        return this.kmsKeyArn;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The number of recovery points that are stored in a backup vault.
     * 
     */
    public Integer recoveryPoints() {
        return this.recoveryPoints;
    }
    /**
     * @return Metadata that you can assign to help organize the resources that you create.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVaultResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String kmsKeyArn;
        private String name;
        private Integer recoveryPoints;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetVaultResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.name = defaults.name;
    	      this.recoveryPoints = defaults.recoveryPoints;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder recoveryPoints(Integer recoveryPoints) {
            this.recoveryPoints = Objects.requireNonNull(recoveryPoints);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetVaultResult build() {
            final var o = new GetVaultResult();
            o.arn = arn;
            o.id = id;
            o.kmsKeyArn = kmsKeyArn;
            o.name = name;
            o.recoveryPoints = recoveryPoints;
            o.tags = tags;
            return o;
        }
    }
}
