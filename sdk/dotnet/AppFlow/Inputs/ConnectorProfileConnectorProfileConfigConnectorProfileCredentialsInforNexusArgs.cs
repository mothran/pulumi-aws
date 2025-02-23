// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Access Key portion of the credentials.
        /// </summary>
        [Input("accessKeyId", required: true)]
        public Input<string> AccessKeyId { get; set; } = null!;

        /// <summary>
        /// The encryption keys used to encrypt data.
        /// </summary>
        [Input("datakey", required: true)]
        public Input<string> Datakey { get; set; } = null!;

        /// <summary>
        /// The secret key used to sign requests.
        /// </summary>
        [Input("secretAccessKey", required: true)]
        public Input<string> SecretAccessKey { get; set; } = null!;

        /// <summary>
        /// The identifier for the user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsInforNexusArgs();
    }
}
