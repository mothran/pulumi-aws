// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * Basic usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ec2.ManagedPrefixList("example", {
 *     addressFamily: "IPv4",
 *     maxEntries: 5,
 *     entries: [
 *         {
 *             cidr: aws_vpc.example.cidr_block,
 *             description: "Primary",
 *         },
 *         {
 *             cidr: aws_vpc_ipv4_cidr_block_association.example.cidr_block,
 *             description: "Secondary",
 *         },
 *     ],
 *     tags: {
 *         Env: "live",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Prefix Lists can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:ec2/managedPrefixList:ManagedPrefixList default pl-0570a1d2d725c16be
 * ```
 */
export class ManagedPrefixList extends pulumi.CustomResource {
    /**
     * Get an existing ManagedPrefixList resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedPrefixListState, opts?: pulumi.CustomResourceOptions): ManagedPrefixList {
        return new ManagedPrefixList(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/managedPrefixList:ManagedPrefixList';

    /**
     * Returns true if the given object is an instance of ManagedPrefixList.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedPrefixList {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedPrefixList.__pulumiType;
    }

    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    public readonly addressFamily!: pulumi.Output<string>;
    /**
     * ARN of the prefix list.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    public readonly entries!: pulumi.Output<outputs.ec2.ManagedPrefixListEntry[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    public readonly maxEntries!: pulumi.Output<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the AWS account that owns this prefix list.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Latest version of this prefix list.
     */
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a ManagedPrefixList resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedPrefixListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedPrefixListArgs | ManagedPrefixListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedPrefixListState | undefined;
            resourceInputs["addressFamily"] = state ? state.addressFamily : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["maxEntries"] = state ? state.maxEntries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as ManagedPrefixListArgs | undefined;
            if ((!args || args.addressFamily === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addressFamily'");
            }
            if ((!args || args.maxEntries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxEntries'");
            }
            resourceInputs["addressFamily"] = args ? args.addressFamily : undefined;
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["maxEntries"] = args ? args.maxEntries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedPrefixList.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedPrefixList resources.
 */
export interface ManagedPrefixListState {
    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    addressFamily?: pulumi.Input<string>;
    /**
     * ARN of the prefix list.
     */
    arn?: pulumi.Input<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ec2.ManagedPrefixListEntry>[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    maxEntries?: pulumi.Input<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the AWS account that owns this prefix list.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Latest version of this prefix list.
     */
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ManagedPrefixList resource.
 */
export interface ManagedPrefixListArgs {
    /**
     * Address family (`IPv4` or `IPv6`) of this prefix list.
     */
    addressFamily: pulumi.Input<string>;
    /**
     * Configuration block for prefix list entry. Detailed below. Different entries may have overlapping CIDR blocks, but a particular CIDR should not be duplicated.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.ec2.ManagedPrefixListEntry>[]>;
    /**
     * Maximum number of entries that this prefix list can contain.
     */
    maxEntries: pulumi.Input<number>;
    /**
     * Name of this resource. The name must not start with `com.amazonaws`.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of tags to assign to this resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
