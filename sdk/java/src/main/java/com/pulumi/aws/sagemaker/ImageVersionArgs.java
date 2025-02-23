// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ImageVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageVersionArgs Empty = new ImageVersionArgs();

    /**
     * The registry path of the container image on which this image version is based.
     * 
     */
    @Import(name="baseImage", required=true)
    private Output<String> baseImage;

    /**
     * @return The registry path of the container image on which this image version is based.
     * 
     */
    public Output<String> baseImage() {
        return this.baseImage;
    }

    /**
     * The name of the image. Must be unique to your account.
     * 
     */
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    /**
     * @return The name of the image. Must be unique to your account.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }

    private ImageVersionArgs() {}

    private ImageVersionArgs(ImageVersionArgs $) {
        this.baseImage = $.baseImage;
        this.imageName = $.imageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageVersionArgs $;

        public Builder() {
            $ = new ImageVersionArgs();
        }

        public Builder(ImageVersionArgs defaults) {
            $ = new ImageVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseImage The registry path of the container image on which this image version is based.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(Output<String> baseImage) {
            $.baseImage = baseImage;
            return this;
        }

        /**
         * @param baseImage The registry path of the container image on which this image version is based.
         * 
         * @return builder
         * 
         */
        public Builder baseImage(String baseImage) {
            return baseImage(Output.of(baseImage));
        }

        /**
         * @param imageName The name of the image. Must be unique to your account.
         * 
         * @return builder
         * 
         */
        public Builder imageName(Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the image. Must be unique to your account.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        public ImageVersionArgs build() {
            $.baseImage = Objects.requireNonNull($.baseImage, "expected parameter 'baseImage' to be non-null");
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            return $;
        }
    }

}
