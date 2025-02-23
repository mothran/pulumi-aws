// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			privateS3VpcEndpoint, err := ec2.NewVpcEndpoint(ctx, "privateS3VpcEndpoint", &ec2.VpcEndpointArgs{
//				VpcId:       pulumi.Any(aws_vpc.Foo.Id),
//				ServiceName: pulumi.String("com.amazonaws.us-west-2.s3"),
//			})
//			if err != nil {
//				return err
//			}
//			privateS3PrefixList := ec2.GetPrefixListOutput(ctx, ec2.GetPrefixListOutputArgs{
//				PrefixListId: privateS3VpcEndpoint.PrefixListId,
//			}, nil)
//			bar, err := ec2.NewNetworkAcl(ctx, "bar", &ec2.NetworkAclArgs{
//				VpcId: pulumi.Any(aws_vpc.Foo.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ec2.NewNetworkAclRule(ctx, "privateS3NetworkAclRule", &ec2.NetworkAclRuleArgs{
//				NetworkAclId: bar.ID(),
//				RuleNumber:   pulumi.Int(200),
//				Egress:       pulumi.Bool(false),
//				Protocol:     pulumi.String("tcp"),
//				RuleAction:   pulumi.String("allow"),
//				CidrBlock: privateS3PrefixList.ApplyT(func(privateS3PrefixList ec2.GetPrefixListResult) (string, error) {
//					return privateS3PrefixList.CidrBlocks[0], nil
//				}).(pulumi.StringOutput),
//				FromPort: pulumi.Int(443),
//				ToPort:   pulumi.Int(443),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Filter
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ec2.GetPrefixList(ctx, &ec2.GetPrefixListArgs{
//				Filters: []ec2.GetPrefixListFilter{
//					ec2.GetPrefixListFilter{
//						Name: "prefix-list-id",
//						Values: []string{
//							"pl-68a54001",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPrefixList(ctx *pulumi.Context, args *GetPrefixListArgs, opts ...pulumi.InvokeOption) (*GetPrefixListResult, error) {
	var rv GetPrefixListResult
	err := ctx.Invoke("aws:ec2/getPrefixList:getPrefixList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrefixList.
type GetPrefixListArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters []GetPrefixListFilter `pulumi:"filters"`
	// The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
	Name *string `pulumi:"name"`
	// The ID of the prefix list to select.
	PrefixListId *string `pulumi:"prefixListId"`
}

// A collection of values returned by getPrefixList.
type GetPrefixListResult struct {
	// The list of CIDR blocks for the AWS service associated with the prefix list.
	CidrBlocks []string              `pulumi:"cidrBlocks"`
	Filters    []GetPrefixListFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the selected prefix list.
	Name         string  `pulumi:"name"`
	PrefixListId *string `pulumi:"prefixListId"`
}

func GetPrefixListOutput(ctx *pulumi.Context, args GetPrefixListOutputArgs, opts ...pulumi.InvokeOption) GetPrefixListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPrefixListResult, error) {
			args := v.(GetPrefixListArgs)
			r, err := GetPrefixList(ctx, &args, opts...)
			var s GetPrefixListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPrefixListResultOutput)
}

// A collection of arguments for invoking getPrefixList.
type GetPrefixListOutputArgs struct {
	// Configuration block(s) for filtering. Detailed below.
	Filters GetPrefixListFilterArrayInput `pulumi:"filters"`
	// The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the prefix list to select.
	PrefixListId pulumi.StringPtrInput `pulumi:"prefixListId"`
}

func (GetPrefixListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrefixListArgs)(nil)).Elem()
}

// A collection of values returned by getPrefixList.
type GetPrefixListResultOutput struct{ *pulumi.OutputState }

func (GetPrefixListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrefixListResult)(nil)).Elem()
}

func (o GetPrefixListResultOutput) ToGetPrefixListResultOutput() GetPrefixListResultOutput {
	return o
}

func (o GetPrefixListResultOutput) ToGetPrefixListResultOutputWithContext(ctx context.Context) GetPrefixListResultOutput {
	return o
}

// The list of CIDR blocks for the AWS service associated with the prefix list.
func (o GetPrefixListResultOutput) CidrBlocks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrefixListResult) []string { return v.CidrBlocks }).(pulumi.StringArrayOutput)
}

func (o GetPrefixListResultOutput) Filters() GetPrefixListFilterArrayOutput {
	return o.ApplyT(func(v GetPrefixListResult) []GetPrefixListFilter { return v.Filters }).(GetPrefixListFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPrefixListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrefixListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the selected prefix list.
func (o GetPrefixListResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrefixListResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetPrefixListResultOutput) PrefixListId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrefixListResult) *string { return v.PrefixListId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPrefixListResultOutput{})
}
