// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "./types";
import * as utilities from "./utilities";

/**
 * The Autoscaling Groups data source allows access to the list of AWS
 * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const groups = aws.autoscaling.getAmiIds({
 *     filters: [
 *         {
 *             name: "tag:Team",
 *             values: ["Pets"],
 *         },
 *         {
 *             name: "tag-key",
 *             values: ["Environment"],
 *         },
 *     ],
 * });
 * const slackNotifications = new aws.autoscaling.Notification("slackNotifications", {
 *     groupNames: groups.then(groups => groups.names),
 *     notifications: [
 *         "autoscaling:EC2_INSTANCE_LAUNCH",
 *         "autoscaling:EC2_INSTANCE_TERMINATE",
 *         "autoscaling:EC2_INSTANCE_LAUNCH_ERROR",
 *         "autoscaling:EC2_INSTANCE_TERMINATE_ERROR",
 *     ],
 *     topicArn: "TOPIC ARN",
 * });
 * ```
 */
/** @deprecated aws.getAutoscalingGroups has been deprecated in favor of aws.autoscaling.getAmiIds */
export function getAutoscalingGroups(args?: GetAutoscalingGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetAutoscalingGroupsResult> {
    pulumi.log.warn("getAutoscalingGroups is deprecated: aws.getAutoscalingGroups has been deprecated in favor of aws.autoscaling.getAmiIds")
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:index/getAutoscalingGroups:getAutoscalingGroups", {
        "filters": args.filters,
        "names": args.names,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutoscalingGroups.
 */
export interface GetAutoscalingGroupsArgs {
    /**
     * A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     */
    filters?: inputs.GetAutoscalingGroupsFilter[];
    /**
     * A list of autoscaling group names
     */
    names?: string[];
}

/**
 * A collection of values returned by getAutoscalingGroups.
 */
export interface GetAutoscalingGroupsResult {
    /**
     * A list of the Autoscaling Groups Arns in the current region.
     */
    readonly arns: string[];
    readonly filters?: outputs.GetAutoscalingGroupsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of the Autoscaling Groups in the current region.
     */
    readonly names: string[];
}

export function getAutoscalingGroupsOutput(args?: GetAutoscalingGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAutoscalingGroupsResult> {
    return pulumi.output(args).apply(a => getAutoscalingGroups(a, opts))
}

/**
 * A collection of arguments for invoking getAutoscalingGroups.
 */
export interface GetAutoscalingGroupsOutputArgs {
    /**
     * A filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
     */
    filters?: pulumi.Input<pulumi.Input<inputs.GetAutoscalingGroupsFilterArgs>[]>;
    /**
     * A list of autoscaling group names
     */
    names?: pulumi.Input<pulumi.Input<string>[]>;
}
