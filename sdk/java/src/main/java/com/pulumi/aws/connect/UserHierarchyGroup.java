// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.UserHierarchyGroupArgs;
import com.pulumi.aws.connect.inputs.UserHierarchyGroupState;
import com.pulumi.aws.connect.outputs.UserHierarchyGroupHierarchyPath;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect User Hierarchy Group resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * &gt; **NOTE:** The User Hierarchy Structure must be created before creating a User Hierarchy Group.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.UserHierarchyGroup;
 * import com.pulumi.aws.connect.UserHierarchyGroupArgs;
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
 *         var example = new UserHierarchyGroup(&#34;example&#34;, UserHierarchyGroupArgs.builder()        
 *             .instanceId(&#34;aaaaaaaa-bbbb-cccc-dddd-111111111111&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example User Hierarchy Group&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With a parent group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.UserHierarchyGroup;
 * import com.pulumi.aws.connect.UserHierarchyGroupArgs;
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
 *         var parent = new UserHierarchyGroup(&#34;parent&#34;, UserHierarchyGroupArgs.builder()        
 *             .instanceId(&#34;aaaaaaaa-bbbb-cccc-dddd-111111111111&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example User Hierarchy Group Parent&#34;))
 *             .build());
 * 
 *         var child = new UserHierarchyGroup(&#34;child&#34;, UserHierarchyGroupArgs.builder()        
 *             .instanceId(&#34;aaaaaaaa-bbbb-cccc-dddd-111111111111&#34;)
 *             .parentGroupId(parent.hierarchyGroupId())
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example User Hierarchy Group Child&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amazon Connect User Hierarchy Groups can be imported using the `instance_id` and `hierarchy_group_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/userHierarchyGroup:UserHierarchyGroup example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/userHierarchyGroup:UserHierarchyGroup")
public class UserHierarchyGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the hierarchy group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the hierarchy group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier for the hierarchy group.
     * 
     */
    @Export(name="hierarchyGroupId", type=String.class, parameters={})
    private Output<String> hierarchyGroupId;

    /**
     * @return The identifier for the hierarchy group.
     * 
     */
    public Output<String> hierarchyGroupId() {
        return this.hierarchyGroupId;
    }
    /**
     * A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
     * 
     */
    @Export(name="hierarchyPaths", type=List.class, parameters={UserHierarchyGroupHierarchyPath.class})
    private Output<List<UserHierarchyGroupHierarchyPath>> hierarchyPaths;

    /**
     * @return A block that contains information about the levels in the hierarchy group. The `hierarchy_path` block is documented below.
     * 
     */
    public Output<List<UserHierarchyGroupHierarchyPath>> hierarchyPaths() {
        return this.hierarchyPaths;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The identifier of the level in the hierarchy group.
     * 
     */
    @Export(name="levelId", type=String.class, parameters={})
    private Output<String> levelId;

    /**
     * @return The identifier of the level in the hierarchy group.
     * 
     */
    public Output<String> levelId() {
        return this.levelId;
    }
    /**
     * The name of the user hierarchy group. Must not be more than 100 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the user hierarchy group. Must not be more than 100 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
     * 
     */
    @Export(name="parentGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> parentGroupId;

    /**
     * @return The identifier for the parent hierarchy group. The user hierarchy is created at level one if the parent group ID is null.
     * 
     */
    public Output<Optional<String>> parentGroupId() {
        return Codegen.optional(this.parentGroupId);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserHierarchyGroup(String name) {
        this(name, UserHierarchyGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserHierarchyGroup(String name, UserHierarchyGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserHierarchyGroup(String name, UserHierarchyGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/userHierarchyGroup:UserHierarchyGroup", name, args == null ? UserHierarchyGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserHierarchyGroup(String name, Output<String> id, @Nullable UserHierarchyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/userHierarchyGroup:UserHierarchyGroup", name, state, makeResourceOptions(options, id));
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
    public static UserHierarchyGroup get(String name, Output<String> id, @Nullable UserHierarchyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserHierarchyGroup(name, id, state, options);
    }
}
