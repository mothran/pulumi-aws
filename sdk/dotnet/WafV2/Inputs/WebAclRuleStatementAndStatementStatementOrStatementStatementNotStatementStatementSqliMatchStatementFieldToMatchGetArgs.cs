// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        [Input("allQueryArguments")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs>? AllQueryArguments { get; set; }

        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        [Input("body")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs>? Body { get; set; }

        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        [Input("method")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs>? Method { get; set; }

        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        [Input("queryString")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs>? QueryString { get; set; }

        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        [Input("singleHeader")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs>? SingleHeader { get; set; }

        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        [Input("singleQueryArgument")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs>? SingleQueryArgument { get; set; }

        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        [Input("uriPath")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs>? UriPath { get; set; }

        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs()
        {
        }
        public static new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs Empty => new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs();
    }
}
