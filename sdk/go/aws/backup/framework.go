// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Backup Framework resource.
//
// > **Note:** For the Deployment Status of the Framework to be successful, please turn on resource tracking to enable AWS Config recording to track configuration changes of your backup resources. This can be done from the AWS Console.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/backup"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := backup.NewFramework(ctx, "example", &backup.FrameworkArgs{
//				Controls: backup.FrameworkControlArray{
//					&backup.FrameworkControlArgs{
//						InputParameters: backup.FrameworkControlInputParameterArray{
//							&backup.FrameworkControlInputParameterArgs{
//								Name:  pulumi.String("requiredRetentionDays"),
//								Value: pulumi.String("35"),
//							},
//						},
//						Name: pulumi.String("BACKUP_RECOVERY_POINT_MINIMUM_RETENTION_CHECK"),
//					},
//					&backup.FrameworkControlArgs{
//						InputParameters: backup.FrameworkControlInputParameterArray{
//							&backup.FrameworkControlInputParameterArgs{
//								Name:  pulumi.String("requiredFrequencyUnit"),
//								Value: pulumi.String("hours"),
//							},
//							&backup.FrameworkControlInputParameterArgs{
//								Name:  pulumi.String("requiredRetentionDays"),
//								Value: pulumi.String("35"),
//							},
//							&backup.FrameworkControlInputParameterArgs{
//								Name:  pulumi.String("requiredFrequencyValue"),
//								Value: pulumi.String("1"),
//							},
//						},
//						Name: pulumi.String("BACKUP_PLAN_MIN_FREQUENCY_AND_MIN_RETENTION_CHECK"),
//					},
//					&backup.FrameworkControlArgs{
//						Name: pulumi.String("BACKUP_RECOVERY_POINT_ENCRYPTED"),
//					},
//					&backup.FrameworkControlArgs{
//						Name: pulumi.String("BACKUP_RESOURCES_PROTECTED_BY_BACKUP_PLAN"),
//						Scope: &backup.FrameworkControlScopeArgs{
//							ComplianceResourceTypes: pulumi.StringArray{
//								pulumi.String("EBS"),
//							},
//						},
//					},
//					&backup.FrameworkControlArgs{
//						Name: pulumi.String("BACKUP_RECOVERY_POINT_MANUAL_DELETION_DISABLED"),
//					},
//				},
//				Description: pulumi.String("this is an example framework"),
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("Example Framework"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Backup Framework can be imported using the `id` which corresponds to the name of the Backup Framework, e.g.,
//
// ```sh
//
//	$ pulumi import aws:backup/framework:Framework test <id>
//
// ```
type Framework struct {
	pulumi.CustomResourceState

	// The ARN of the backup framework.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls FrameworkControlArrayOutput `pulumi:"controls"`
	// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
	DeploymentStatus pulumi.StringOutput `pulumi:"deploymentStatus"`
	// The description of the framework with a maximum of 1,024 characters
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of a parameter, for example, BackupPlanFrequency.
	Name pulumi.StringOutput `pulumi:"name"`
	// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewFramework registers a new resource with the given unique name, arguments, and options.
func NewFramework(ctx *pulumi.Context,
	name string, args *FrameworkArgs, opts ...pulumi.ResourceOption) (*Framework, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Controls == nil {
		return nil, errors.New("invalid value for required argument 'Controls'")
	}
	var resource Framework
	err := ctx.RegisterResource("aws:backup/framework:Framework", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFramework gets an existing Framework resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFramework(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FrameworkState, opts ...pulumi.ResourceOption) (*Framework, error) {
	var resource Framework
	err := ctx.ReadResource("aws:backup/framework:Framework", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Framework resources.
type frameworkState struct {
	// The ARN of the backup framework.
	Arn *string `pulumi:"arn"`
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls []FrameworkControl `pulumi:"controls"`
	// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
	CreationTime *string `pulumi:"creationTime"`
	// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
	DeploymentStatus *string `pulumi:"deploymentStatus"`
	// The description of the framework with a maximum of 1,024 characters
	Description *string `pulumi:"description"`
	// The name of a parameter, for example, BackupPlanFrequency.
	Name *string `pulumi:"name"`
	// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
	Status *string `pulumi:"status"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type FrameworkState struct {
	// The ARN of the backup framework.
	Arn pulumi.StringPtrInput
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls FrameworkControlArrayInput
	// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
	CreationTime pulumi.StringPtrInput
	// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
	DeploymentStatus pulumi.StringPtrInput
	// The description of the framework with a maximum of 1,024 characters
	Description pulumi.StringPtrInput
	// The name of a parameter, for example, BackupPlanFrequency.
	Name pulumi.StringPtrInput
	// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
	Status pulumi.StringPtrInput
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (FrameworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*frameworkState)(nil)).Elem()
}

type frameworkArgs struct {
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls []FrameworkControl `pulumi:"controls"`
	// The description of the framework with a maximum of 1,024 characters
	Description *string `pulumi:"description"`
	// The name of a parameter, for example, BackupPlanFrequency.
	Name *string `pulumi:"name"`
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Framework resource.
type FrameworkArgs struct {
	// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
	Controls FrameworkControlArrayInput
	// The description of the framework with a maximum of 1,024 characters
	Description pulumi.StringPtrInput
	// The name of a parameter, for example, BackupPlanFrequency.
	Name pulumi.StringPtrInput
	// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
	Tags pulumi.StringMapInput
}

func (FrameworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*frameworkArgs)(nil)).Elem()
}

type FrameworkInput interface {
	pulumi.Input

	ToFrameworkOutput() FrameworkOutput
	ToFrameworkOutputWithContext(ctx context.Context) FrameworkOutput
}

func (*Framework) ElementType() reflect.Type {
	return reflect.TypeOf((**Framework)(nil)).Elem()
}

func (i *Framework) ToFrameworkOutput() FrameworkOutput {
	return i.ToFrameworkOutputWithContext(context.Background())
}

func (i *Framework) ToFrameworkOutputWithContext(ctx context.Context) FrameworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrameworkOutput)
}

// FrameworkArrayInput is an input type that accepts FrameworkArray and FrameworkArrayOutput values.
// You can construct a concrete instance of `FrameworkArrayInput` via:
//
//	FrameworkArray{ FrameworkArgs{...} }
type FrameworkArrayInput interface {
	pulumi.Input

	ToFrameworkArrayOutput() FrameworkArrayOutput
	ToFrameworkArrayOutputWithContext(context.Context) FrameworkArrayOutput
}

type FrameworkArray []FrameworkInput

func (FrameworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Framework)(nil)).Elem()
}

func (i FrameworkArray) ToFrameworkArrayOutput() FrameworkArrayOutput {
	return i.ToFrameworkArrayOutputWithContext(context.Background())
}

func (i FrameworkArray) ToFrameworkArrayOutputWithContext(ctx context.Context) FrameworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrameworkArrayOutput)
}

// FrameworkMapInput is an input type that accepts FrameworkMap and FrameworkMapOutput values.
// You can construct a concrete instance of `FrameworkMapInput` via:
//
//	FrameworkMap{ "key": FrameworkArgs{...} }
type FrameworkMapInput interface {
	pulumi.Input

	ToFrameworkMapOutput() FrameworkMapOutput
	ToFrameworkMapOutputWithContext(context.Context) FrameworkMapOutput
}

type FrameworkMap map[string]FrameworkInput

func (FrameworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Framework)(nil)).Elem()
}

func (i FrameworkMap) ToFrameworkMapOutput() FrameworkMapOutput {
	return i.ToFrameworkMapOutputWithContext(context.Background())
}

func (i FrameworkMap) ToFrameworkMapOutputWithContext(ctx context.Context) FrameworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FrameworkMapOutput)
}

type FrameworkOutput struct{ *pulumi.OutputState }

func (FrameworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Framework)(nil)).Elem()
}

func (o FrameworkOutput) ToFrameworkOutput() FrameworkOutput {
	return o
}

func (o FrameworkOutput) ToFrameworkOutputWithContext(ctx context.Context) FrameworkOutput {
	return o
}

// The ARN of the backup framework.
func (o FrameworkOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// One or more control blocks that make up the framework. Each control in the list has a name, input parameters, and scope. Detailed below.
func (o FrameworkOutput) Controls() FrameworkControlArrayOutput {
	return o.ApplyT(func(v *Framework) FrameworkControlArrayOutput { return v.Controls }).(FrameworkControlArrayOutput)
}

// The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC).
func (o FrameworkOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// The deployment status of a framework. The statuses are: `CREATE_IN_PROGRESS` | `UPDATE_IN_PROGRESS` | `DELETE_IN_PROGRESS` | `COMPLETED` | `FAILED`.
func (o FrameworkOutput) DeploymentStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringOutput { return v.DeploymentStatus }).(pulumi.StringOutput)
}

// The description of the framework with a maximum of 1,024 characters
func (o FrameworkOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of a parameter, for example, BackupPlanFrequency.
func (o FrameworkOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn AWS Config recording on or off for each resource. For more information refer to the [AWS documentation for Framework Status](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_DescribeFramework.html#Backup-DescribeFramework-response-FrameworkStatus)
func (o FrameworkOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag key-value pair applied to those AWS resources that you want to trigger an evaluation for a rule. A maximum of one key-value pair can be provided.
func (o FrameworkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o FrameworkOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Framework) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type FrameworkArrayOutput struct{ *pulumi.OutputState }

func (FrameworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Framework)(nil)).Elem()
}

func (o FrameworkArrayOutput) ToFrameworkArrayOutput() FrameworkArrayOutput {
	return o
}

func (o FrameworkArrayOutput) ToFrameworkArrayOutputWithContext(ctx context.Context) FrameworkArrayOutput {
	return o
}

func (o FrameworkArrayOutput) Index(i pulumi.IntInput) FrameworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Framework {
		return vs[0].([]*Framework)[vs[1].(int)]
	}).(FrameworkOutput)
}

type FrameworkMapOutput struct{ *pulumi.OutputState }

func (FrameworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Framework)(nil)).Elem()
}

func (o FrameworkMapOutput) ToFrameworkMapOutput() FrameworkMapOutput {
	return o
}

func (o FrameworkMapOutput) ToFrameworkMapOutputWithContext(ctx context.Context) FrameworkMapOutput {
	return o
}

func (o FrameworkMapOutput) MapIndex(k pulumi.StringInput) FrameworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Framework {
		return vs[0].(map[string]*Framework)[vs[1].(string)]
	}).(FrameworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FrameworkInput)(nil)).Elem(), &Framework{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrameworkArrayInput)(nil)).Elem(), FrameworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FrameworkMapInput)(nil)).Elem(), FrameworkMap{})
	pulumi.RegisterOutputType(FrameworkOutput{})
	pulumi.RegisterOutputType(FrameworkArrayOutput{})
	pulumi.RegisterOutputType(FrameworkMapOutput{})
}
