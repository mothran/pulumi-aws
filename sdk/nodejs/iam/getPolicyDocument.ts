// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `aws.iam.Policy`.
 *
 * Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplePolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             sid: "1",
 *             actions: [
 *                 "s3:ListAllMyBuckets",
 *                 "s3:GetBucketLocation",
 *             ],
 *             resources: ["arn:aws:s3:::*"],
 *         },
 *         {
 *             actions: ["s3:ListBucket"],
 *             resources: [`arn:aws:s3:::${_var.s3_bucket_name}`],
 *             conditions: [{
 *                 test: "StringLike",
 *                 variable: "s3:prefix",
 *                 values: [
 *                     "",
 *                     "home/",
 *                     "home/&{aws:username}/",
 *                 ],
 *             }],
 *         },
 *         {
 *             actions: ["s3:*"],
 *             resources: [
 *                 `arn:aws:s3:::${_var.s3_bucket_name}/home/&{aws:username}`,
 *                 `arn:aws:s3:::${_var.s3_bucket_name}/home/&{aws:username}/*`,
 *             ],
 *         },
 *     ],
 * });
 * const examplePolicy = new aws.iam.Policy("examplePolicy", {
 *     path: "/",
 *     policy: examplePolicyDocument.then(examplePolicyDocument => examplePolicyDocument.json),
 * });
 * ```
 * ### Example Multiple Condition Keys and Values
 *
 * You can specify a [condition with multiple keys and values](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_multi-value-conditions.html) by supplying multiple `condition` blocks with the same `test` value, but differing `variable` and `values` values.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleMultipleConditionKeysAndValues = pulumi.output(aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: [
 *             "kms:Decrypt",
 *             "kms:GenerateDataKey",
 *         ],
 *         conditions: [
 *             {
 *                 test: "ForAnyValue:StringEquals",
 *                 values: ["pi"],
 *                 variable: "kms:EncryptionContext:service",
 *             },
 *             {
 *                 test: "ForAnyValue:StringEquals",
 *                 values: ["rds"],
 *                 variable: "kms:EncryptionContext:aws:pi:service",
 *             },
 *             {
 *                 test: "ForAnyValue:StringEquals",
 *                 values: [
 *                     "db-AAAAABBBBBCCCCCDDDDDEEEEE",
 *                     "db-EEEEEDDDDDCCCCCBBBBBAAAAA",
 *                 ],
 *                 variable: "kms:EncryptionContext:aws:rds:db-id",
 *             },
 *         ],
 *         resources: ["*"],
 *     }],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.example_multiple_condition_keys_and_values.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with Multiple Principals
 *
 * You can specify multiple principal blocks with different types. You can also use this data source to generate an assume-role policy.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const eventStreamBucketRoleAssumeRolePolicy = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         principals: [
 *             {
 *                 type: "Service",
 *                 identifiers: ["firehose.amazonaws.com"],
 *             },
 *             {
 *                 type: "AWS",
 *                 identifiers: [_var.trusted_role_arn],
 *             },
 *             {
 *                 type: "Federated",
 *                 identifiers: [
 *                     `arn:aws:iam::${_var.account_id}:saml-provider/${_var.provider_name}`,
 *                     "cognito-identity.amazonaws.com",
 *                 ],
 *             },
 *         ],
 *     }],
 * });
 * ```
 * ### Example Using A Source Document
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const source = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             actions: ["ec2:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "SidToOverride",
 *             actions: ["s3:*"],
 *             resources: ["*"],
 *         },
 *     ],
 * });
 * const sourceDocumentExample = source.then(source => aws.iam.getPolicyDocument({
 *     sourcePolicyDocuments: [source.json],
 *     statements: [{
 *         sid: "SidToOverride",
 *         actions: ["s3:*"],
 *         resources: [
 *             "arn:aws:s3:::somebucket",
 *             "arn:aws:s3:::somebucket/*",
 *         ],
 *     }],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.source_document_example.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Using An Override Document
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const override = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "SidToOverride",
 *         actions: ["s3:*"],
 *         resources: ["*"],
 *     }],
 * });
 * const overridePolicyDocumentExample = override.then(override => aws.iam.getPolicyDocument({
 *     overridePolicyDocuments: [override.json],
 *     statements: [
 *         {
 *             actions: ["ec2:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "SidToOverride",
 *             actions: ["s3:*"],
 *             resources: [
 *                 "arn:aws:s3:::somebucket",
 *                 "arn:aws:s3:::somebucket/*",
 *             ],
 *         },
 *     ],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.override_policy_document_example.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example with Both Source and Override Documents
 *
 * You can also combine `sourcePolicyDocuments` and `overridePolicyDocuments` in the same document.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const source = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "OverridePlaceholder",
 *         actions: ["ec2:DescribeAccountAttributes"],
 *         resources: ["*"],
 *     }],
 * });
 * const override = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "OverridePlaceholder",
 *         actions: ["s3:GetObject"],
 *         resources: ["*"],
 *     }],
 * });
 * const politik = Promise.all([source, override]).then(([source, override]) => aws.iam.getPolicyDocument({
 *     sourcePolicyDocuments: [source.json],
 *     overridePolicyDocuments: [override.json],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.politik.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example of Merging Source Documents
 *
 * Multiple documents can be combined using the `sourcePolicyDocuments` or `overridePolicyDocuments` attributes. `sourcePolicyDocuments` requires that all documents have unique Sids, while `overridePolicyDocuments` will iteratively override matching Sids.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sourceOne = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             actions: ["ec2:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "UniqueSidOne",
 *             actions: ["s3:*"],
 *             resources: ["*"],
 *         },
 *     ],
 * });
 * const sourceTwo = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             sid: "UniqueSidTwo",
 *             actions: ["iam:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             actions: ["lambda:*"],
 *             resources: ["*"],
 *         },
 *     ],
 * });
 * const combined = Promise.all([sourceOne, sourceTwo]).then(([sourceOne, sourceTwo]) => aws.iam.getPolicyDocument({
 *     sourcePolicyDocuments: [
 *         sourceOne.json,
 *         sourceTwo.json,
 *     ],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.combined.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example of Merging Override Documents
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const policyOne = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "OverridePlaceHolderOne",
 *         effect: "Allow",
 *         actions: ["s3:*"],
 *         resources: ["*"],
 *     }],
 * });
 * const policyTwo = aws.iam.getPolicyDocument({
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: ["ec2:*"],
 *             resources: ["*"],
 *         },
 *         {
 *             sid: "OverridePlaceHolderTwo",
 *             effect: "Allow",
 *             actions: ["iam:*"],
 *             resources: ["*"],
 *         },
 *     ],
 * });
 * const policyThree = aws.iam.getPolicyDocument({
 *     statements: [{
 *         sid: "OverridePlaceHolderOne",
 *         effect: "Deny",
 *         actions: ["logs:*"],
 *         resources: ["*"],
 *     }],
 * });
 * const combined = Promise.all([policyOne, policyTwo, policyThree]).then(([policyOne, policyTwo, policyThree]) => aws.iam.getPolicyDocument({
 *     overridePolicyDocuments: [
 *         policyOne.json,
 *         policyTwo.json,
 *         policyThree.json,
 *     ],
 *     statements: [{
 *         sid: "OverridePlaceHolderTwo",
 *         effect: "Deny",
 *         actions: ["*"],
 *         resources: ["*"],
 *     }],
 * }));
 * ```
 *
 * `data.aws_iam_policy_document.combined.json` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 */
export function getPolicyDocument(args?: GetPolicyDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyDocumentResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:iam/getPolicyDocument:getPolicyDocument", {
        "overrideJson": args.overrideJson,
        "overridePolicyDocuments": args.overridePolicyDocuments,
        "policyId": args.policyId,
        "sourceJson": args.sourceJson,
        "sourcePolicyDocuments": args.sourcePolicyDocuments,
        "statements": args.statements,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentArgs {
    /**
     * - IAM policy document whose statements with non-blank `sid`s will override statements with the same `sid` from documents assigned to the `sourceJson`, `sourcePolicyDocuments`, and `overridePolicyDocuments` arguments. Non-overriding statements will be added to the exported document.
     *
     * @deprecated Use the attribute "override_policy_documents" instead.
     */
    overrideJson?: string;
    /**
     * List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from documents provided in the `sourceJson` and `sourcePolicyDocuments` arguments.  Non-overriding statements will be added to the exported document.
     */
    overridePolicyDocuments?: string[];
    /**
     * ID for the policy document.
     */
    policyId?: string;
    /**
     * - IAM policy document used as a base for the exported policy document. Statements with the same `sid` from documents assigned to the `overrideJson` and `overridePolicyDocuments` arguments will override source statements.
     *
     * @deprecated Use the attribute "source_policy_documents" instead.
     */
    sourceJson?: string;
    /**
     * List of IAM policy documents that are merged together into the exported document. Statements defined in `sourcePolicyDocuments` or `sourceJson` must have unique `sid`s. Statements with the same `sid` from documents assigned to the `overrideJson` and `overridePolicyDocuments` arguments will override source statements.
     */
    sourcePolicyDocuments?: string[];
    /**
     * Configuration block for a policy statement. Detailed below.
     */
    statements?: inputs.iam.GetPolicyDocumentStatement[];
    /**
     * IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
     */
    version?: string;
}

/**
 * A collection of values returned by getPolicyDocument.
 */
export interface GetPolicyDocumentResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Standard JSON policy document rendered based on the arguments above.
     */
    readonly json: string;
    /**
     * @deprecated Use the attribute "override_policy_documents" instead.
     */
    readonly overrideJson?: string;
    readonly overridePolicyDocuments?: string[];
    readonly policyId?: string;
    /**
     * @deprecated Use the attribute "source_policy_documents" instead.
     */
    readonly sourceJson?: string;
    readonly sourcePolicyDocuments?: string[];
    readonly statements?: outputs.iam.GetPolicyDocumentStatement[];
    readonly version?: string;
}

export function getPolicyDocumentOutput(args?: GetPolicyDocumentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyDocumentResult> {
    return pulumi.output(args).apply(a => getPolicyDocument(a, opts))
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentOutputArgs {
    /**
     * - IAM policy document whose statements with non-blank `sid`s will override statements with the same `sid` from documents assigned to the `sourceJson`, `sourcePolicyDocuments`, and `overridePolicyDocuments` arguments. Non-overriding statements will be added to the exported document.
     *
     * @deprecated Use the attribute "override_policy_documents" instead.
     */
    overrideJson?: pulumi.Input<string>;
    /**
     * List of IAM policy documents that are merged together into the exported document. In merging, statements with non-blank `sid`s will override statements with the same `sid` from earlier documents in the list. Statements with non-blank `sid`s will also override statements with the same `sid` from documents provided in the `sourceJson` and `sourcePolicyDocuments` arguments.  Non-overriding statements will be added to the exported document.
     */
    overridePolicyDocuments?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID for the policy document.
     */
    policyId?: pulumi.Input<string>;
    /**
     * - IAM policy document used as a base for the exported policy document. Statements with the same `sid` from documents assigned to the `overrideJson` and `overridePolicyDocuments` arguments will override source statements.
     *
     * @deprecated Use the attribute "source_policy_documents" instead.
     */
    sourceJson?: pulumi.Input<string>;
    /**
     * List of IAM policy documents that are merged together into the exported document. Statements defined in `sourcePolicyDocuments` or `sourceJson` must have unique `sid`s. Statements with the same `sid` from documents assigned to the `overrideJson` and `overridePolicyDocuments` arguments will override source statements.
     */
    sourcePolicyDocuments?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration block for a policy statement. Detailed below.
     */
    statements?: pulumi.Input<pulumi.Input<inputs.iam.GetPolicyDocumentStatementArgs>[]>;
    /**
     * IAM policy document version. Valid values are `2008-10-17` and `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
     */
    version?: pulumi.Input<string>;
}
