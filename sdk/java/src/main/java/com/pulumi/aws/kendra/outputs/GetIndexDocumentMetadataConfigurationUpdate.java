// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetIndexDocumentMetadataConfigurationUpdateRelevance;
import com.pulumi.aws.kendra.outputs.GetIndexDocumentMetadataConfigurationUpdateSearch;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIndexDocumentMetadataConfigurationUpdate {
    /**
     * @return The name of the index field. Minimum length of 1. Maximum length of 30.
     * 
     */
    private String name;
    /**
     * @return A block that provides manual tuning parameters to determine how the field affects the search results. Documented below.
     * 
     */
    private List<GetIndexDocumentMetadataConfigurationUpdateRelevance> relevances;
    /**
     * @return A block that provides information about how the field is used during a search. Documented below.
     * 
     */
    private List<GetIndexDocumentMetadataConfigurationUpdateSearch> searches;
    /**
     * @return The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
     * 
     */
    private String type;

    private GetIndexDocumentMetadataConfigurationUpdate() {}
    /**
     * @return The name of the index field. Minimum length of 1. Maximum length of 30.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A block that provides manual tuning parameters to determine how the field affects the search results. Documented below.
     * 
     */
    public List<GetIndexDocumentMetadataConfigurationUpdateRelevance> relevances() {
        return this.relevances;
    }
    /**
     * @return A block that provides information about how the field is used during a search. Documented below.
     * 
     */
    public List<GetIndexDocumentMetadataConfigurationUpdateSearch> searches() {
        return this.searches;
    }
    /**
     * @return The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexDocumentMetadataConfigurationUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetIndexDocumentMetadataConfigurationUpdateRelevance> relevances;
        private List<GetIndexDocumentMetadataConfigurationUpdateSearch> searches;
        private String type;
        public Builder() {}
        public Builder(GetIndexDocumentMetadataConfigurationUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.relevances = defaults.relevances;
    	      this.searches = defaults.searches;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder relevances(List<GetIndexDocumentMetadataConfigurationUpdateRelevance> relevances) {
            this.relevances = Objects.requireNonNull(relevances);
            return this;
        }
        public Builder relevances(GetIndexDocumentMetadataConfigurationUpdateRelevance... relevances) {
            return relevances(List.of(relevances));
        }
        @CustomType.Setter
        public Builder searches(List<GetIndexDocumentMetadataConfigurationUpdateSearch> searches) {
            this.searches = Objects.requireNonNull(searches);
            return this;
        }
        public Builder searches(GetIndexDocumentMetadataConfigurationUpdateSearch... searches) {
            return searches(List.of(searches));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIndexDocumentMetadataConfigurationUpdate build() {
            final var o = new GetIndexDocumentMetadataConfigurationUpdate();
            o.name = name;
            o.relevances = relevances;
            o.searches = searches;
            o.type = type;
            return o;
        }
    }
}
