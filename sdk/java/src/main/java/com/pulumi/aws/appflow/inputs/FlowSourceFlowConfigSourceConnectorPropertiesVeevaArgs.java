// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs Empty = new FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs();

    /**
     * The document type specified in the Veeva document extract flow.
     * 
     */
    @Import(name="documentType")
    private @Nullable Output<String> documentType;

    /**
     * @return The document type specified in the Veeva document extract flow.
     * 
     */
    public Optional<Output<String>> documentType() {
        return Optional.ofNullable(this.documentType);
    }

    /**
     * Boolean value to include All Versions of files in Veeva document extract flow.
     * 
     */
    @Import(name="includeAllVersions")
    private @Nullable Output<Boolean> includeAllVersions;

    /**
     * @return Boolean value to include All Versions of files in Veeva document extract flow.
     * 
     */
    public Optional<Output<Boolean>> includeAllVersions() {
        return Optional.ofNullable(this.includeAllVersions);
    }

    /**
     * Boolean value to include file renditions in Veeva document extract flow.
     * 
     */
    @Import(name="includeRenditions")
    private @Nullable Output<Boolean> includeRenditions;

    /**
     * @return Boolean value to include file renditions in Veeva document extract flow.
     * 
     */
    public Optional<Output<Boolean>> includeRenditions() {
        return Optional.ofNullable(this.includeRenditions);
    }

    /**
     * Boolean value to include source files in Veeva document extract flow.
     * 
     */
    @Import(name="includeSourceFiles")
    private @Nullable Output<Boolean> includeSourceFiles;

    /**
     * @return Boolean value to include source files in Veeva document extract flow.
     * 
     */
    public Optional<Output<Boolean>> includeSourceFiles() {
        return Optional.ofNullable(this.includeSourceFiles);
    }

    /**
     * The object specified in the Veeva flow source.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return The object specified in the Veeva flow source.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs() {}

    private FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs(FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs $) {
        this.documentType = $.documentType;
        this.includeAllVersions = $.includeAllVersions;
        this.includeRenditions = $.includeRenditions;
        this.includeSourceFiles = $.includeSourceFiles;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs $;

        public Builder() {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs();
        }

        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs defaults) {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param documentType The document type specified in the Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder documentType(@Nullable Output<String> documentType) {
            $.documentType = documentType;
            return this;
        }

        /**
         * @param documentType The document type specified in the Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder documentType(String documentType) {
            return documentType(Output.of(documentType));
        }

        /**
         * @param includeAllVersions Boolean value to include All Versions of files in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeAllVersions(@Nullable Output<Boolean> includeAllVersions) {
            $.includeAllVersions = includeAllVersions;
            return this;
        }

        /**
         * @param includeAllVersions Boolean value to include All Versions of files in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeAllVersions(Boolean includeAllVersions) {
            return includeAllVersions(Output.of(includeAllVersions));
        }

        /**
         * @param includeRenditions Boolean value to include file renditions in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeRenditions(@Nullable Output<Boolean> includeRenditions) {
            $.includeRenditions = includeRenditions;
            return this;
        }

        /**
         * @param includeRenditions Boolean value to include file renditions in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeRenditions(Boolean includeRenditions) {
            return includeRenditions(Output.of(includeRenditions));
        }

        /**
         * @param includeSourceFiles Boolean value to include source files in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeSourceFiles(@Nullable Output<Boolean> includeSourceFiles) {
            $.includeSourceFiles = includeSourceFiles;
            return this;
        }

        /**
         * @param includeSourceFiles Boolean value to include source files in Veeva document extract flow.
         * 
         * @return builder
         * 
         */
        public Builder includeSourceFiles(Boolean includeSourceFiles) {
            return includeSourceFiles(Output.of(includeSourceFiles));
        }

        /**
         * @param object The object specified in the Veeva flow source.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object The object specified in the Veeva flow source.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public FlowSourceFlowConfigSourceConnectorPropertiesVeevaArgs build() {
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
