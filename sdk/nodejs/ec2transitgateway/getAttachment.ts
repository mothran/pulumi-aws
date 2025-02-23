// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Get information on an EC2 Transit Gateway's attachment to a resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.ec2transitgateway.getAttachment({
 *     filters: [
 *         {
 *             name: "transit-gateway-id",
 *             values: [aws_ec2_transit_gateway.example.id],
 *         },
 *         {
 *             name: "resource-type",
 *             values: ["peering"],
 *         },
 *     ],
 * });
 * ```
 */
export function getAttachment(args?: GetAttachmentArgs, opts?: pulumi.InvokeOptions): Promise<GetAttachmentResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:ec2transitgateway/getAttachment:getAttachment", {
        "filters": args.filters,
        "tags": args.tags,
        "transitGatewayAttachmentId": args.transitGatewayAttachmentId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAttachment.
 */
export interface GetAttachmentArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: inputs.ec2transitgateway.GetAttachmentFilter[];
    /**
     * Key-value tags for the attachment.
     */
    tags?: {[key: string]: string};
    /**
     * The ID of the attachment.
     */
    transitGatewayAttachmentId?: string;
}

/**
 * A collection of values returned by getAttachment.
 */
export interface GetAttachmentResult {
    /**
     * The ARN of the attachment.
     */
    readonly arn: string;
    readonly filters?: outputs.ec2transitgateway.GetAttachmentFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the resource.
     */
    readonly resourceId: string;
    /**
     * The ID of the AWS account that owns the resource.
     */
    readonly resourceOwnerId: string;
    /**
     * The resource type.
     */
    readonly resourceType: string;
    /**
     * The attachment state.
     */
    readonly state: string;
    /**
     * Key-value tags for the attachment.
     */
    readonly tags: {[key: string]: string};
    readonly transitGatewayAttachmentId: string;
    /**
     * The ID of the transit gateway.
     */
    readonly transitGatewayId: string;
    /**
     * The ID of the AWS account that owns the transit gateway.
     */
    readonly transitGatewayOwnerId: string;
}

export function getAttachmentOutput(args?: GetAttachmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAttachmentResult> {
    return pulumi.output(args).apply(a => getAttachment(a, opts))
}

/**
 * A collection of arguments for invoking getAttachment.
 */
export interface GetAttachmentOutputArgs {
    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.ec2transitgateway.GetAttachmentFilterArgs>[]>;
    /**
     * Key-value tags for the attachment.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the attachment.
     */
    transitGatewayAttachmentId?: pulumi.Input<string>;
}
