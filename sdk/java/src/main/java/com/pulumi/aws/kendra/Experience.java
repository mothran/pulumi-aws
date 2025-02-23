// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kendra.ExperienceArgs;
import com.pulumi.aws.kendra.inputs.ExperienceState;
import com.pulumi.aws.kendra.outputs.ExperienceConfiguration;
import com.pulumi.aws.kendra.outputs.ExperienceEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kendra.Experience;
 * import com.pulumi.aws.kendra.ExperienceArgs;
 * import com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs;
 * import com.pulumi.aws.kendra.inputs.ExperienceConfigurationContentSourceConfigurationArgs;
 * import com.pulumi.aws.kendra.inputs.ExperienceConfigurationUserIdentityConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Experience(&#34;example&#34;, ExperienceArgs.builder()        
 *             .indexId(aws_kendra_index.example().id())
 *             .description(&#34;My Kendra Experience&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .configuration(ExperienceConfigurationArgs.builder()
 *                 .contentSourceConfiguration(ExperienceConfigurationContentSourceConfigurationArgs.builder()
 *                     .directPutContent(true)
 *                     .faqIds(aws_kendra_faq.example().faq_id())
 *                     .build())
 *                 .userIdentityConfiguration(ExperienceConfigurationUserIdentityConfigurationArgs.builder()
 *                     .identityAttributeName(&#34;12345ec453-1546651e-79c4-4554-91fa-00b43ccfa245&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Kendra Experience can be imported using the unique identifiers of the experience and index separated by a slash (`/`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kendra/experience:Experience example 1045d08d-66ef-4882-b3ed-dfb7df183e90/b34dfdf7-1f2b-4704-9581-79e00296845f
 * ```
 * 
 */
@ResourceType(type="aws:kendra/experience:Experience")
public class Experience extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Experience.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Experience.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="configuration", type=ExperienceConfiguration.class, parameters={})
    private Output<ExperienceConfiguration> configuration;

    public Output<ExperienceConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * A description for your Amazon Kendra experience.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for your Amazon Kendra experience.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by AWS.
     * 
     */
    @Export(name="endpoints", type=List.class, parameters={ExperienceEndpoint.class})
    private Output<List<ExperienceEndpoint>> endpoints;

    /**
     * @return Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by AWS.
     * 
     */
    public Output<List<ExperienceEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * The unique identifier of the experience.
     * 
     */
    @Export(name="experienceId", type=String.class, parameters={})
    private Output<String> experienceId;

    /**
     * @return The unique identifier of the experience.
     * 
     */
    public Output<String> experienceId() {
        return this.experienceId;
    }
    /**
     * The identifier of the index for your Amazon Kendra experience.
     * 
     */
    @Export(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    /**
     * @return The identifier of the index for your Amazon Kendra experience.
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }
    /**
     * A name for your Amazon Kendra experience.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for your Amazon Kendra experience.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of a role with permission to access `Query API`, `QuerySuggestions API`, `SubmitFeedback API`, and `AWS SSO` that stores your user and group information. For more information, see [IAM roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of a role with permission to access `Query API`, `QuerySuggestions API`, `SubmitFeedback API`, and `AWS SSO` that stores your user and group information. For more information, see [IAM roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The current processing status of your Amazon Kendra experience.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current processing status of your Amazon Kendra experience.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Experience(String name) {
        this(name, ExperienceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Experience(String name, ExperienceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Experience(String name, ExperienceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kendra/experience:Experience", name, args == null ? ExperienceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Experience(String name, Output<String> id, @Nullable ExperienceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kendra/experience:Experience", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Experience get(String name, Output<String> id, @Nullable ExperienceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Experience(name, id, state, options);
    }
}
