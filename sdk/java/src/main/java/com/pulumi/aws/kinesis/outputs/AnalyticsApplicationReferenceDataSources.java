// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesS3;
import com.pulumi.aws.kinesis.outputs.AnalyticsApplicationReferenceDataSourcesSchema;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationReferenceDataSources {
    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    private @Nullable String id;
    /**
     * @return The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
     */
    private AnalyticsApplicationReferenceDataSourcesS3 s3;
    /**
     * @return The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    private AnalyticsApplicationReferenceDataSourcesSchema schema;
    /**
     * @return The in-application Table Name.
     * 
     */
    private String tableName;

    private AnalyticsApplicationReferenceDataSources() {}
    /**
     * @return The ARN of the Kinesis Analytics Application.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The S3 configuration for the reference data source. See S3 Reference below for more details.
     * 
     */
    public AnalyticsApplicationReferenceDataSourcesS3 s3() {
        return this.s3;
    }
    /**
     * @return The Schema format of the data in the streaming source. See Source Schema below for more details.
     * 
     */
    public AnalyticsApplicationReferenceDataSourcesSchema schema() {
        return this.schema;
    }
    /**
     * @return The in-application Table Name.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSources defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private AnalyticsApplicationReferenceDataSourcesS3 s3;
        private AnalyticsApplicationReferenceDataSourcesSchema schema;
        private String tableName;
        public Builder() {}
        public Builder(AnalyticsApplicationReferenceDataSources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.s3 = defaults.s3;
    	      this.schema = defaults.schema;
    	      this.tableName = defaults.tableName;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder s3(AnalyticsApplicationReferenceDataSourcesS3 s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }
        @CustomType.Setter
        public Builder schema(AnalyticsApplicationReferenceDataSourcesSchema schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public AnalyticsApplicationReferenceDataSources build() {
            final var o = new AnalyticsApplicationReferenceDataSources();
            o.id = id;
            o.s3 = s3;
            o.schema = schema;
            o.tableName = tableName;
            return o;
        }
    }
}
