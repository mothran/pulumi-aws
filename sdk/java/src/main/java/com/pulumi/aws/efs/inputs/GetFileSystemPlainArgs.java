// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFileSystemPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileSystemPlainArgs Empty = new GetFileSystemPlainArgs();

    /**
     * Restricts the list to the file system with this creation token.
     * 
     */
    @Import(name="creationToken")
    private @Nullable String creationToken;

    /**
     * @return Restricts the list to the file system with this creation token.
     * 
     */
    public Optional<String> creationToken() {
        return Optional.ofNullable(this.creationToken);
    }

    /**
     * The ID that identifies the file system (e.g., fs-ccfc0d65).
     * 
     */
    @Import(name="fileSystemId")
    private @Nullable String fileSystemId;

    /**
     * @return The ID that identifies the file system (e.g., fs-ccfc0d65).
     * 
     */
    public Optional<String> fileSystemId() {
        return Optional.ofNullable(this.fileSystemId);
    }

    /**
     * Restricts the list to the file system with these tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Restricts the list to the file system with these tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetFileSystemPlainArgs() {}

    private GetFileSystemPlainArgs(GetFileSystemPlainArgs $) {
        this.creationToken = $.creationToken;
        this.fileSystemId = $.fileSystemId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileSystemPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileSystemPlainArgs $;

        public Builder() {
            $ = new GetFileSystemPlainArgs();
        }

        public Builder(GetFileSystemPlainArgs defaults) {
            $ = new GetFileSystemPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationToken Restricts the list to the file system with this creation token.
         * 
         * @return builder
         * 
         */
        public Builder creationToken(@Nullable String creationToken) {
            $.creationToken = creationToken;
            return this;
        }

        /**
         * @param fileSystemId The ID that identifies the file system (e.g., fs-ccfc0d65).
         * 
         * @return builder
         * 
         */
        public Builder fileSystemId(@Nullable String fileSystemId) {
            $.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * @param tags Restricts the list to the file system with these tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetFileSystemPlainArgs build() {
            return $;
        }
    }

}
