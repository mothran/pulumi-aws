// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acm.inputs;

import com.pulumi.aws.acm.inputs.CertificateDomainValidationOptionArgs;
import com.pulumi.aws.acm.inputs.CertificateOptionsArgs;
import com.pulumi.aws.acm.inputs.CertificateValidationOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateState extends com.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * The ARN of the certificate
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the certificate
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ARN of an ACM PCA
     * 
     */
    @Import(name="certificateAuthorityArn")
    private @Nullable Output<String> certificateAuthorityArn;

    /**
     * @return ARN of an ACM PCA
     * 
     */
    public Optional<Output<String>> certificateAuthorityArn() {
        return Optional.ofNullable(this.certificateAuthorityArn);
    }

    /**
     * The certificate&#39;s PEM-formatted public key
     * 
     */
    @Import(name="certificateBody")
    private @Nullable Output<String> certificateBody;

    /**
     * @return The certificate&#39;s PEM-formatted public key
     * 
     */
    public Optional<Output<String>> certificateBody() {
        return Optional.ofNullable(this.certificateBody);
    }

    /**
     * The certificate&#39;s PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    @Import(name="certificateChain")
    private @Nullable Output<String> certificateChain;

    /**
     * @return The certificate&#39;s PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    public Optional<Output<String>> certificateChain() {
        return Optional.ofNullable(this.certificateChain);
    }

    /**
     * A fully qualified domain name (FQDN) in the certificate.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return A fully qualified domain name (FQDN) in the certificate.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
     * 
     */
    @Import(name="domainValidationOptions")
    private @Nullable Output<List<CertificateDomainValidationOptionArgs>> domainValidationOptions;

    /**
     * @return Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
     * 
     */
    public Optional<Output<List<CertificateDomainValidationOptionArgs>>> domainValidationOptions() {
        return Optional.ofNullable(this.domainValidationOptions);
    }

    /**
     * The expiration date and time of the certificate.
     * 
     */
    @Import(name="notAfter")
    private @Nullable Output<String> notAfter;

    /**
     * @return The expiration date and time of the certificate.
     * 
     */
    public Optional<Output<String>> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The start of the validity period of the certificate.
     * 
     */
    @Import(name="notBefore")
    private @Nullable Output<String> notBefore;

    /**
     * @return The start of the validity period of the certificate.
     * 
     */
    public Optional<Output<String>> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }

    /**
     * Configuration block used to set certificate options. Detailed below.
     * 
     */
    @Import(name="options")
    private @Nullable Output<CertificateOptionsArgs> options;

    /**
     * @return Configuration block used to set certificate options. Detailed below.
     * 
     */
    public Optional<Output<CertificateOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The certificate&#39;s PEM-formatted private key
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The certificate&#39;s PEM-formatted private key
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Status of the certificate.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of the certificate.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<List<String>> subjectAlternativeNames;

    /**
     * @return Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    public Optional<Output<List<String>>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
     * 
     */
    @Import(name="validationEmails")
    private @Nullable Output<List<String>> validationEmails;

    /**
     * @return A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
     * 
     */
    public Optional<Output<List<String>>> validationEmails() {
        return Optional.ofNullable(this.validationEmails);
    }

    /**
     * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    @Import(name="validationMethod")
    private @Nullable Output<String> validationMethod;

    /**
     * @return Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    public Optional<Output<String>> validationMethod() {
        return Optional.ofNullable(this.validationMethod);
    }

    /**
     * Configuration block used to specify information about the initial validation of each domain name. Detailed below.
     * * Importing an existing certificate
     * 
     */
    @Import(name="validationOptions")
    private @Nullable Output<List<CertificateValidationOptionArgs>> validationOptions;

    /**
     * @return Configuration block used to specify information about the initial validation of each domain name. Detailed below.
     * * Importing an existing certificate
     * 
     */
    public Optional<Output<List<CertificateValidationOptionArgs>>> validationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    private CertificateState() {}

    private CertificateState(CertificateState $) {
        this.arn = $.arn;
        this.certificateAuthorityArn = $.certificateAuthorityArn;
        this.certificateBody = $.certificateBody;
        this.certificateChain = $.certificateChain;
        this.domainName = $.domainName;
        this.domainValidationOptions = $.domainValidationOptions;
        this.notAfter = $.notAfter;
        this.notBefore = $.notBefore;
        this.options = $.options;
        this.privateKey = $.privateKey;
        this.status = $.status;
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.validationEmails = $.validationEmails;
        this.validationMethod = $.validationMethod;
        this.validationOptions = $.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateState $;

        public Builder() {
            $ = new CertificateState();
        }

        public Builder(CertificateState defaults) {
            $ = new CertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the certificate
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the certificate
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param certificateAuthorityArn ARN of an ACM PCA
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(@Nullable Output<String> certificateAuthorityArn) {
            $.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }

        /**
         * @param certificateAuthorityArn ARN of an ACM PCA
         * 
         * @return builder
         * 
         */
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            return certificateAuthorityArn(Output.of(certificateAuthorityArn));
        }

        /**
         * @param certificateBody The certificate&#39;s PEM-formatted public key
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(@Nullable Output<String> certificateBody) {
            $.certificateBody = certificateBody;
            return this;
        }

        /**
         * @param certificateBody The certificate&#39;s PEM-formatted public key
         * 
         * @return builder
         * 
         */
        public Builder certificateBody(String certificateBody) {
            return certificateBody(Output.of(certificateBody));
        }

        /**
         * @param certificateChain The certificate&#39;s PEM-formatted chain
         * * Creating a private CA issued certificate
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            $.certificateChain = certificateChain;
            return this;
        }

        /**
         * @param certificateChain The certificate&#39;s PEM-formatted chain
         * * Creating a private CA issued certificate
         * 
         * @return builder
         * 
         */
        public Builder certificateChain(String certificateChain) {
            return certificateChain(Output.of(certificateChain));
        }

        /**
         * @param domainName A fully qualified domain name (FQDN) in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName A fully qualified domain name (FQDN) in the certificate.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder domainValidationOptions(@Nullable Output<List<CertificateDomainValidationOptionArgs>> domainValidationOptions) {
            $.domainValidationOptions = domainValidationOptions;
            return this;
        }

        /**
         * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder domainValidationOptions(List<CertificateDomainValidationOptionArgs> domainValidationOptions) {
            return domainValidationOptions(Output.of(domainValidationOptions));
        }

        /**
         * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Only set if `DNS`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder domainValidationOptions(CertificateDomainValidationOptionArgs... domainValidationOptions) {
            return domainValidationOptions(List.of(domainValidationOptions));
        }

        /**
         * @param notAfter The expiration date and time of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(@Nullable Output<String> notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        /**
         * @param notAfter The expiration date and time of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(String notAfter) {
            return notAfter(Output.of(notAfter));
        }

        /**
         * @param notBefore The start of the validity period of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(@Nullable Output<String> notBefore) {
            $.notBefore = notBefore;
            return this;
        }

        /**
         * @param notBefore The start of the validity period of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder notBefore(String notBefore) {
            return notBefore(Output.of(notBefore));
        }

        /**
         * @param options Configuration block used to set certificate options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<CertificateOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Configuration block used to set certificate options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder options(CertificateOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param privateKey The certificate&#39;s PEM-formatted private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The certificate&#39;s PEM-formatted private key
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param status Status of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subjectAlternativeNames Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * @param subjectAlternativeNames Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(List<String> subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        /**
         * @param subjectAlternativeNames Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param validationEmails A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder validationEmails(@Nullable Output<List<String>> validationEmails) {
            $.validationEmails = validationEmails;
            return this;
        }

        /**
         * @param validationEmails A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder validationEmails(List<String> validationEmails) {
            return validationEmails(Output.of(validationEmails));
        }

        /**
         * @param validationEmails A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
         * 
         * @return builder
         * 
         */
        public Builder validationEmails(String... validationEmails) {
            return validationEmails(List.of(validationEmails));
        }

        /**
         * @param validationMethod Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
         * 
         * @return builder
         * 
         */
        public Builder validationMethod(@Nullable Output<String> validationMethod) {
            $.validationMethod = validationMethod;
            return this;
        }

        /**
         * @param validationMethod Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
         * 
         * @return builder
         * 
         */
        public Builder validationMethod(String validationMethod) {
            return validationMethod(Output.of(validationMethod));
        }

        /**
         * @param validationOptions Configuration block used to specify information about the initial validation of each domain name. Detailed below.
         * * Importing an existing certificate
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(@Nullable Output<List<CertificateValidationOptionArgs>> validationOptions) {
            $.validationOptions = validationOptions;
            return this;
        }

        /**
         * @param validationOptions Configuration block used to specify information about the initial validation of each domain name. Detailed below.
         * * Importing an existing certificate
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(List<CertificateValidationOptionArgs> validationOptions) {
            return validationOptions(Output.of(validationOptions));
        }

        /**
         * @param validationOptions Configuration block used to specify information about the initial validation of each domain name. Detailed below.
         * * Importing an existing certificate
         * 
         * @return builder
         * 
         */
        public Builder validationOptions(CertificateValidationOptionArgs... validationOptions) {
            return validationOptions(List.of(validationOptions));
        }

        public CertificateState build() {
            return $;
        }
    }

}
