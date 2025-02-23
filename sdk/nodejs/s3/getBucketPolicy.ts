// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The bucket policy data source returns IAM policy of an S3 bucket.
 *
 * ## Example Usage
 *
 * The following example retrieves IAM policy of a specified S3 bucket.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.s3.getBucketPolicy({
 *     bucket: "example-bucket-name",
 * });
 * export const foo = example.then(example => example.policy);
 * ```
 */
export function getBucketPolicy(args: GetBucketPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetBucketPolicyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:s3/getBucketPolicy:getBucketPolicy", {
        "bucket": args.bucket,
    }, opts);
}

/**
 * A collection of arguments for invoking getBucketPolicy.
 */
export interface GetBucketPolicyArgs {
    /**
     * The bucket name.
     */
    bucket: string;
}

/**
 * A collection of values returned by getBucketPolicy.
 */
export interface GetBucketPolicyResult {
    readonly bucket: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IAM bucket policy.
     */
    readonly policy: string;
}

export function getBucketPolicyOutput(args: GetBucketPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBucketPolicyResult> {
    return pulumi.output(args).apply(a => getBucketPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getBucketPolicy.
 */
export interface GetBucketPolicyOutputArgs {
    /**
     * The bucket name.
     */
    bucket: pulumi.Input<string>;
}
