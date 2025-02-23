// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiLaunchPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmiLaunchPermissionArgs Empty = new AmiLaunchPermissionArgs();

    /**
     * The AWS account ID for the launch permission.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The AWS account ID for the launch permission.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The name of the group for the launch permission. Valid values: `&#34;all&#34;`.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The name of the group for the launch permission. Valid values: `&#34;all&#34;`.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The ID of the AMI.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The ID of the AMI.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    /**
     * The ARN of an organization for the launch permission.
     * 
     */
    @Import(name="organizationArn")
    private @Nullable Output<String> organizationArn;

    /**
     * @return The ARN of an organization for the launch permission.
     * 
     */
    public Optional<Output<String>> organizationArn() {
        return Optional.ofNullable(this.organizationArn);
    }

    /**
     * The ARN of an organizational unit for the launch permission.
     * 
     */
    @Import(name="organizationalUnitArn")
    private @Nullable Output<String> organizationalUnitArn;

    /**
     * @return The ARN of an organizational unit for the launch permission.
     * 
     */
    public Optional<Output<String>> organizationalUnitArn() {
        return Optional.ofNullable(this.organizationalUnitArn);
    }

    private AmiLaunchPermissionArgs() {}

    private AmiLaunchPermissionArgs(AmiLaunchPermissionArgs $) {
        this.accountId = $.accountId;
        this.group = $.group;
        this.imageId = $.imageId;
        this.organizationArn = $.organizationArn;
        this.organizationalUnitArn = $.organizationalUnitArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiLaunchPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiLaunchPermissionArgs $;

        public Builder() {
            $ = new AmiLaunchPermissionArgs();
        }

        public Builder(AmiLaunchPermissionArgs defaults) {
            $ = new AmiLaunchPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The AWS account ID for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The AWS account ID for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param group The name of the group for the launch permission. Valid values: `&#34;all&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The name of the group for the launch permission. Valid values: `&#34;all&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param imageId The ID of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The ID of the AMI.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param organizationArn The ARN of an organization for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder organizationArn(@Nullable Output<String> organizationArn) {
            $.organizationArn = organizationArn;
            return this;
        }

        /**
         * @param organizationArn The ARN of an organization for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder organizationArn(String organizationArn) {
            return organizationArn(Output.of(organizationArn));
        }

        /**
         * @param organizationalUnitArn The ARN of an organizational unit for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitArn(@Nullable Output<String> organizationalUnitArn) {
            $.organizationalUnitArn = organizationalUnitArn;
            return this;
        }

        /**
         * @param organizationalUnitArn The ARN of an organizational unit for the launch permission.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitArn(String organizationalUnitArn) {
            return organizationalUnitArn(Output.of(organizationalUnitArn));
        }

        public AmiLaunchPermissionArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            return $;
        }
    }

}
