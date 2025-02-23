// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.outputs;

import com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeLoggingConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudFormationTypeResult {
    private String arn;
    /**
     * @return Identifier of the CloudFormation Type default version.
     * 
     */
    private String defaultVersionId;
    /**
     * @return Deprecation status of the CloudFormation Type.
     * 
     */
    private String deprecatedStatus;
    /**
     * @return Description of the CloudFormation Type.
     * 
     */
    private String description;
    /**
     * @return URL of the documentation for the CloudFormation Type.
     * 
     */
    private String documentationUrl;
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role used to register the CloudFormation Type.
     * 
     */
    private String executionRoleArn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether the CloudFormation Type version is the default version.
     * 
     */
    private Boolean isDefaultVersion;
    /**
     * @return List of objects containing logging configuration.
     * 
     */
    private List<GetCloudFormationTypeLoggingConfig> loggingConfigs;
    /**
     * @return Provisioning behavior of the CloudFormation Type.
     * 
     */
    private String provisioningType;
    /**
     * @return JSON document of the CloudFormation Type schema.
     * 
     */
    private String schema;
    /**
     * @return URL of the source code for the CloudFormation Type.
     * 
     */
    private String sourceUrl;
    private String type;
    private String typeArn;
    private String typeName;
    private @Nullable String versionId;
    /**
     * @return Scope of the CloudFormation Type.
     * 
     */
    private String visibility;

    private GetCloudFormationTypeResult() {}
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier of the CloudFormation Type default version.
     * 
     */
    public String defaultVersionId() {
        return this.defaultVersionId;
    }
    /**
     * @return Deprecation status of the CloudFormation Type.
     * 
     */
    public String deprecatedStatus() {
        return this.deprecatedStatus;
    }
    /**
     * @return Description of the CloudFormation Type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return URL of the documentation for the CloudFormation Type.
     * 
     */
    public String documentationUrl() {
        return this.documentationUrl;
    }
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role used to register the CloudFormation Type.
     * 
     */
    public String executionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the CloudFormation Type version is the default version.
     * 
     */
    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * @return List of objects containing logging configuration.
     * 
     */
    public List<GetCloudFormationTypeLoggingConfig> loggingConfigs() {
        return this.loggingConfigs;
    }
    /**
     * @return Provisioning behavior of the CloudFormation Type.
     * 
     */
    public String provisioningType() {
        return this.provisioningType;
    }
    /**
     * @return JSON document of the CloudFormation Type schema.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return URL of the source code for the CloudFormation Type.
     * 
     */
    public String sourceUrl() {
        return this.sourceUrl;
    }
    public String type() {
        return this.type;
    }
    public String typeArn() {
        return this.typeArn;
    }
    public String typeName() {
        return this.typeName;
    }
    public Optional<String> versionId() {
        return Optional.ofNullable(this.versionId);
    }
    /**
     * @return Scope of the CloudFormation Type.
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudFormationTypeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String defaultVersionId;
        private String deprecatedStatus;
        private String description;
        private String documentationUrl;
        private String executionRoleArn;
        private String id;
        private Boolean isDefaultVersion;
        private List<GetCloudFormationTypeLoggingConfig> loggingConfigs;
        private String provisioningType;
        private String schema;
        private String sourceUrl;
        private String type;
        private String typeArn;
        private String typeName;
        private @Nullable String versionId;
        private String visibility;
        public Builder() {}
        public Builder(GetCloudFormationTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultVersionId = defaults.defaultVersionId;
    	      this.deprecatedStatus = defaults.deprecatedStatus;
    	      this.description = defaults.description;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.id = defaults.id;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.loggingConfigs = defaults.loggingConfigs;
    	      this.provisioningType = defaults.provisioningType;
    	      this.schema = defaults.schema;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.type = defaults.type;
    	      this.typeArn = defaults.typeArn;
    	      this.typeName = defaults.typeName;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder defaultVersionId(String defaultVersionId) {
            this.defaultVersionId = Objects.requireNonNull(defaultVersionId);
            return this;
        }
        @CustomType.Setter
        public Builder deprecatedStatus(String deprecatedStatus) {
            this.deprecatedStatus = Objects.requireNonNull(deprecatedStatus);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = Objects.requireNonNull(documentationUrl);
            return this;
        }
        @CustomType.Setter
        public Builder executionRoleArn(String executionRoleArn) {
            this.executionRoleArn = Objects.requireNonNull(executionRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = Objects.requireNonNull(isDefaultVersion);
            return this;
        }
        @CustomType.Setter
        public Builder loggingConfigs(List<GetCloudFormationTypeLoggingConfig> loggingConfigs) {
            this.loggingConfigs = Objects.requireNonNull(loggingConfigs);
            return this;
        }
        public Builder loggingConfigs(GetCloudFormationTypeLoggingConfig... loggingConfigs) {
            return loggingConfigs(List.of(loggingConfigs));
        }
        @CustomType.Setter
        public Builder provisioningType(String provisioningType) {
            this.provisioningType = Objects.requireNonNull(provisioningType);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder typeArn(String typeArn) {
            this.typeArn = Objects.requireNonNull(typeArn);
            return this;
        }
        @CustomType.Setter
        public Builder typeName(String typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        @CustomType.Setter
        public Builder versionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }
        @CustomType.Setter
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }
        public GetCloudFormationTypeResult build() {
            final var o = new GetCloudFormationTypeResult();
            o.arn = arn;
            o.defaultVersionId = defaultVersionId;
            o.deprecatedStatus = deprecatedStatus;
            o.description = description;
            o.documentationUrl = documentationUrl;
            o.executionRoleArn = executionRoleArn;
            o.id = id;
            o.isDefaultVersion = isDefaultVersion;
            o.loggingConfigs = loggingConfigs;
            o.provisioningType = provisioningType;
            o.schema = schema;
            o.sourceUrl = sourceUrl;
            o.type = type;
            o.typeArn = typeArn;
            o.typeName = typeName;
            o.versionId = versionId;
            o.visibility = visibility;
            return o;
        }
    }
}
