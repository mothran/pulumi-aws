// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class VirtualNodeSpecListenerTlsCertificateAcmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) for the certificate.
        /// </summary>
        [Input("certificateArn", required: true)]
        public Input<string> CertificateArn { get; set; } = null!;

        public VirtualNodeSpecListenerTlsCertificateAcmGetArgs()
        {
        }
        public static new VirtualNodeSpecListenerTlsCertificateAcmGetArgs Empty => new VirtualNodeSpecListenerTlsCertificateAcmGetArgs();
    }
}
