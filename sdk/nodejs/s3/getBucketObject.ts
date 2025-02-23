// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * > **NOTE:** The `aws.s3.BucketObject` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.BucketObjectv2` instead, where new features and fixes will be added.
 *
 * The S3 object data source allows access to the metadata and
 * _optionally_ (see below) content of an object stored inside S3 bucket.
 *
 * > **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type` (`text/*` and `application/json`). This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favour of metadata.
 *
 * ## Example Usage
 *
 * The following example retrieves a text object (which must have a `Content-Type`
 * value starting with `text/`) and uses it as the `userData` for an EC2 instance:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const bootstrapScript = aws.s3.getBucketObject({
 *     bucket: "ourcorp-deploy-config",
 *     key: "ec2-bootstrap-script.sh",
 * });
 * const example = new aws.ec2.Instance("example", {
 *     instanceType: "t2.micro",
 *     ami: "ami-2757f631",
 *     userData: bootstrapScript.then(bootstrapScript => bootstrapScript.body),
 * });
 * ```
 *
 * The following, more-complex example retrieves only the metadata for a zip
 * file stored in S3, which is then used to pass the most recent `versionId`
 * to AWS Lambda for use as a function implementation. More information about
 * Lambda functions is available in the documentation for
 * `aws.lambda.Function`.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const lambda = aws.s3.getBucketObject({
 *     bucket: "ourcorp-lambda-functions",
 *     key: "hello-world.zip",
 * });
 * const testLambda = new aws.lambda.Function("testLambda", {
 *     s3Bucket: lambda.then(lambda => lambda.bucket),
 *     s3Key: lambda.then(lambda => lambda.key),
 *     s3ObjectVersion: lambda.then(lambda => lambda.versionId),
 *     role: aws_iam_role.iam_for_lambda.arn,
 *     handler: "exports.test",
 * });
 * ```
 */
export function getBucketObject(args: GetBucketObjectArgs, opts?: pulumi.InvokeOptions): Promise<GetBucketObjectResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:s3/getBucketObject:getBucketObject", {
        "bucket": args.bucket,
        "key": args.key,
        "range": args.range,
        "tags": args.tags,
        "versionId": args.versionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getBucketObject.
 */
export interface GetBucketObjectArgs {
    /**
     * The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     *
     * @deprecated Use the aws_s3_object data source instead
     */
    bucket: string;
    /**
     * The full path to the object inside the bucket
     */
    key: string;
    range?: string;
    /**
     * A map of tags assigned to the object.
     */
    tags?: {[key: string]: string};
    /**
     * Specific version ID of the object returned (defaults to latest version)
     */
    versionId?: string;
}

/**
 * A collection of values returned by getBucketObject.
 */
export interface GetBucketObjectResult {
    /**
     * Object data (see **limitations above** to understand cases in which this field is actually available)
     */
    readonly body: string;
    /**
     * @deprecated Use the aws_s3_object data source instead
     */
    readonly bucket: string;
    /**
     * (Optional) Whether or not to use [Amazon S3 Bucket Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) for SSE-KMS.
     */
    readonly bucketKeyEnabled: boolean;
    /**
     * Specifies caching behavior along the request/reply chain.
     */
    readonly cacheControl: string;
    /**
     * Specifies presentational information for the object.
     */
    readonly contentDisposition: string;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
     */
    readonly contentEncoding: string;
    /**
     * The language the content is in.
     */
    readonly contentLanguage: string;
    /**
     * Size of the body in bytes.
     */
    readonly contentLength: number;
    /**
     * A standard MIME type describing the format of the object data.
     */
    readonly contentType: string;
    /**
     * [ETag](https://en.wikipedia.org/wiki/HTTP_ETag) generated for the object (an MD5 sum of the object content in case it's not encrypted)
     */
    readonly etag: string;
    /**
     * If the object expiration is configured (see [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)), the field includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
     */
    readonly expiration: string;
    /**
     * The date and time at which the object is no longer cacheable.
     */
    readonly expires: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly key: string;
    /**
     * Last modified date of the object in RFC1123 format (e.g., `Mon, 02 Jan 2006 15:04:05 MST`)
     */
    readonly lastModified: string;
    /**
     * A map of metadata stored with the object in S3
     */
    readonly metadata: {[key: string]: string};
    /**
     * Indicates whether this object has an active [legal hold](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-legal-holds). This field is only returned if you have permission to view an object's legal hold status.
     */
    readonly objectLockLegalHoldStatus: string;
    /**
     * The object lock [retention mode](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes) currently in place for this object.
     */
    readonly objectLockMode: string;
    /**
     * The date and time when this object's object lock will expire.
     */
    readonly objectLockRetainUntilDate: string;
    readonly range?: string;
    /**
     * If the object is stored using server-side encryption (KMS or Amazon S3-managed encryption key), this field includes the chosen encryption and algorithm used.
     */
    readonly serverSideEncryption: string;
    /**
     * If present, specifies the ID of the Key Management Service (KMS) master encryption key that was used for the object.
     */
    readonly sseKmsKeyId: string;
    /**
     * [Storage class](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html) information of the object. Available for all objects except for `Standard` storage class objects.
     */
    readonly storageClass: string;
    /**
     * A map of tags assigned to the object.
     */
    readonly tags: {[key: string]: string};
    /**
     * The latest version ID of the object returned.
     */
    readonly versionId: string;
    /**
     * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
     */
    readonly websiteRedirectLocation: string;
}

export function getBucketObjectOutput(args: GetBucketObjectOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBucketObjectResult> {
    return pulumi.output(args).apply(a => getBucketObject(a, opts))
}

/**
 * A collection of arguments for invoking getBucketObject.
 */
export interface GetBucketObjectOutputArgs {
    /**
     * The name of the bucket to read the object from. Alternatively, an [S3 access point](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html) ARN can be specified
     *
     * @deprecated Use the aws_s3_object data source instead
     */
    bucket: pulumi.Input<string>;
    /**
     * The full path to the object inside the bucket
     */
    key: pulumi.Input<string>;
    range?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the object.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specific version ID of the object returned (defaults to latest version)
     */
    versionId?: pulumi.Input<string>;
}
