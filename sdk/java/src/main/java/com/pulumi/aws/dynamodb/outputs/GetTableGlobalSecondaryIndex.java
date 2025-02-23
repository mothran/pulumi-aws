// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableGlobalSecondaryIndex {
    private String hashKey;
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    private String name;
    private List<String> nonKeyAttributes;
    private String projectionType;
    private String rangeKey;
    private Integer readCapacity;
    private Integer writeCapacity;

    private GetTableGlobalSecondaryIndex() {}
    public String hashKey() {
        return this.hashKey;
    }
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<String> nonKeyAttributes() {
        return this.nonKeyAttributes;
    }
    public String projectionType() {
        return this.projectionType;
    }
    public String rangeKey() {
        return this.rangeKey;
    }
    public Integer readCapacity() {
        return this.readCapacity;
    }
    public Integer writeCapacity() {
        return this.writeCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableGlobalSecondaryIndex defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hashKey;
        private String name;
        private List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;
        private Integer readCapacity;
        private Integer writeCapacity;
        public Builder() {}
        public Builder(GetTableGlobalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKey = defaults.hashKey;
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
    	      this.readCapacity = defaults.readCapacity;
    	      this.writeCapacity = defaults.writeCapacity;
        }

        @CustomType.Setter
        public Builder hashKey(String hashKey) {
            this.hashKey = Objects.requireNonNull(hashKey);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
            return this;
        }
        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }
        @CustomType.Setter
        public Builder projectionType(String projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }
        @CustomType.Setter
        public Builder rangeKey(String rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }
        @CustomType.Setter
        public Builder readCapacity(Integer readCapacity) {
            this.readCapacity = Objects.requireNonNull(readCapacity);
            return this;
        }
        @CustomType.Setter
        public Builder writeCapacity(Integer writeCapacity) {
            this.writeCapacity = Objects.requireNonNull(writeCapacity);
            return this;
        }
        public GetTableGlobalSecondaryIndex build() {
            final var o = new GetTableGlobalSecondaryIndex();
            o.hashKey = hashKey;
            o.name = name;
            o.nonKeyAttributes = nonKeyAttributes;
            o.projectionType = projectionType;
            o.rangeKey = rangeKey;
            o.readCapacity = readCapacity;
            o.writeCapacity = writeCapacity;
            return o;
        }
    }
}
