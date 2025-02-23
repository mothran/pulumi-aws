// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassifierGrokClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassifierGrokClassifierArgs Empty = new ClassifierGrokClassifierArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @Import(name="classification", required=true)
    private Output<String> classification;

    /**
     * @return An identifier of the data format that the classifier matches.
     * 
     */
    public Output<String> classification() {
        return this.classification;
    }

    /**
     * Custom grok patterns used by this classifier.
     * 
     */
    @Import(name="customPatterns")
    private @Nullable Output<String> customPatterns;

    /**
     * @return Custom grok patterns used by this classifier.
     * 
     */
    public Optional<Output<String>> customPatterns() {
        return Optional.ofNullable(this.customPatterns);
    }

    /**
     * The grok pattern used by this classifier.
     * 
     */
    @Import(name="grokPattern", required=true)
    private Output<String> grokPattern;

    /**
     * @return The grok pattern used by this classifier.
     * 
     */
    public Output<String> grokPattern() {
        return this.grokPattern;
    }

    private ClassifierGrokClassifierArgs() {}

    private ClassifierGrokClassifierArgs(ClassifierGrokClassifierArgs $) {
        this.classification = $.classification;
        this.customPatterns = $.customPatterns;
        this.grokPattern = $.grokPattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassifierGrokClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassifierGrokClassifierArgs $;

        public Builder() {
            $ = new ClassifierGrokClassifierArgs();
        }

        public Builder(ClassifierGrokClassifierArgs defaults) {
            $ = new ClassifierGrokClassifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classification An identifier of the data format that the classifier matches.
         * 
         * @return builder
         * 
         */
        public Builder classification(Output<String> classification) {
            $.classification = classification;
            return this;
        }

        /**
         * @param classification An identifier of the data format that the classifier matches.
         * 
         * @return builder
         * 
         */
        public Builder classification(String classification) {
            return classification(Output.of(classification));
        }

        /**
         * @param customPatterns Custom grok patterns used by this classifier.
         * 
         * @return builder
         * 
         */
        public Builder customPatterns(@Nullable Output<String> customPatterns) {
            $.customPatterns = customPatterns;
            return this;
        }

        /**
         * @param customPatterns Custom grok patterns used by this classifier.
         * 
         * @return builder
         * 
         */
        public Builder customPatterns(String customPatterns) {
            return customPatterns(Output.of(customPatterns));
        }

        /**
         * @param grokPattern The grok pattern used by this classifier.
         * 
         * @return builder
         * 
         */
        public Builder grokPattern(Output<String> grokPattern) {
            $.grokPattern = grokPattern;
            return this;
        }

        /**
         * @param grokPattern The grok pattern used by this classifier.
         * 
         * @return builder
         * 
         */
        public Builder grokPattern(String grokPattern) {
            return grokPattern(Output.of(grokPattern));
        }

        public ClassifierGrokClassifierArgs build() {
            $.classification = Objects.requireNonNull($.classification, "expected parameter 'classification' to be non-null");
            $.grokPattern = Objects.requireNonNull($.grokPattern, "expected parameter 'grokPattern' to be non-null");
            return $;
        }
    }

}
