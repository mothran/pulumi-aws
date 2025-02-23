// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecretVersionResult {
    /**
     * @return The ARN of the secret.
     * 
     */
    private String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The decrypted part of the protected secret information that was originally provided as a binary.
     * 
     */
    private String secretBinary;
    private String secretId;
    /**
     * @return The decrypted part of the protected secret information that was originally provided as a string.
     * 
     */
    private String secretString;
    /**
     * @return The unique identifier of this version of the secret.
     * 
     */
    private String versionId;
    private @Nullable String versionStage;
    private List<String> versionStages;

    private GetSecretVersionResult() {}
    /**
     * @return The ARN of the secret.
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
     * @return The decrypted part of the protected secret information that was originally provided as a binary.
     * 
     */
    public String secretBinary() {
        return this.secretBinary;
    }
    public String secretId() {
        return this.secretId;
    }
    /**
     * @return The decrypted part of the protected secret information that was originally provided as a string.
     * 
     */
    public String secretString() {
        return this.secretString;
    }
    /**
     * @return The unique identifier of this version of the secret.
     * 
     */
    public String versionId() {
        return this.versionId;
    }
    public Optional<String> versionStage() {
        return Optional.ofNullable(this.versionStage);
    }
    public List<String> versionStages() {
        return this.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String secretBinary;
        private String secretId;
        private String secretString;
        private String versionId;
        private @Nullable String versionStage;
        private List<String> versionStages;
        public Builder() {}
        public Builder(GetSecretVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.secretBinary = defaults.secretBinary;
    	      this.secretId = defaults.secretId;
    	      this.secretString = defaults.secretString;
    	      this.versionId = defaults.versionId;
    	      this.versionStage = defaults.versionStage;
    	      this.versionStages = defaults.versionStages;
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
        public Builder secretBinary(String secretBinary) {
            this.secretBinary = Objects.requireNonNull(secretBinary);
            return this;
        }
        @CustomType.Setter
        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        @CustomType.Setter
        public Builder secretString(String secretString) {
            this.secretString = Objects.requireNonNull(secretString);
            return this;
        }
        @CustomType.Setter
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        @CustomType.Setter
        public Builder versionStage(@Nullable String versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        @CustomType.Setter
        public Builder versionStages(List<String> versionStages) {
            this.versionStages = Objects.requireNonNull(versionStages);
            return this;
        }
        public Builder versionStages(String... versionStages) {
            return versionStages(List.of(versionStages));
        }
        public GetSecretVersionResult build() {
            final var o = new GetSecretVersionResult();
            o.arn = arn;
            o.id = id;
            o.secretBinary = secretBinary;
            o.secretId = secretId;
            o.secretString = secretString;
            o.versionId = versionId;
            o.versionStage = versionStage;
            o.versionStages = versionStages;
            return o;
        }
    }
}
