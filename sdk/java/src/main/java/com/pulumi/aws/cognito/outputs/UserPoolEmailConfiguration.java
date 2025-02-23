// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolEmailConfiguration {
    /**
     * @return Email configuration set name from SES.
     * 
     */
    private @Nullable String configurationSet;
    /**
     * @return Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    private @Nullable String emailSendingAccount;
    /**
     * @return Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith &lt;john@example.com&gt;` or `\&#34;John Smith Ph.D.\&#34; &lt;john@example.com&gt;`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    private @Nullable String fromEmailAddress;
    /**
     * @return REPLY-TO email address.
     * 
     */
    private @Nullable String replyToEmailAddress;
    /**
     * @return ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    private @Nullable String sourceArn;

    private UserPoolEmailConfiguration() {}
    /**
     * @return Email configuration set name from SES.
     * 
     */
    public Optional<String> configurationSet() {
        return Optional.ofNullable(this.configurationSet);
    }
    /**
     * @return Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    public Optional<String> emailSendingAccount() {
        return Optional.ofNullable(this.emailSendingAccount);
    }
    /**
     * @return Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith &lt;john@example.com&gt;` or `\&#34;John Smith Ph.D.\&#34; &lt;john@example.com&gt;`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    public Optional<String> fromEmailAddress() {
        return Optional.ofNullable(this.fromEmailAddress);
    }
    /**
     * @return REPLY-TO email address.
     * 
     */
    public Optional<String> replyToEmailAddress() {
        return Optional.ofNullable(this.replyToEmailAddress);
    }
    /**
     * @return ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    public Optional<String> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolEmailConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String configurationSet;
        private @Nullable String emailSendingAccount;
        private @Nullable String fromEmailAddress;
        private @Nullable String replyToEmailAddress;
        private @Nullable String sourceArn;
        public Builder() {}
        public Builder(UserPoolEmailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationSet = defaults.configurationSet;
    	      this.emailSendingAccount = defaults.emailSendingAccount;
    	      this.fromEmailAddress = defaults.fromEmailAddress;
    	      this.replyToEmailAddress = defaults.replyToEmailAddress;
    	      this.sourceArn = defaults.sourceArn;
        }

        @CustomType.Setter
        public Builder configurationSet(@Nullable String configurationSet) {
            this.configurationSet = configurationSet;
            return this;
        }
        @CustomType.Setter
        public Builder emailSendingAccount(@Nullable String emailSendingAccount) {
            this.emailSendingAccount = emailSendingAccount;
            return this;
        }
        @CustomType.Setter
        public Builder fromEmailAddress(@Nullable String fromEmailAddress) {
            this.fromEmailAddress = fromEmailAddress;
            return this;
        }
        @CustomType.Setter
        public Builder replyToEmailAddress(@Nullable String replyToEmailAddress) {
            this.replyToEmailAddress = replyToEmailAddress;
            return this;
        }
        @CustomType.Setter
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public UserPoolEmailConfiguration build() {
            final var o = new UserPoolEmailConfiguration();
            o.configurationSet = configurationSet;
            o.emailSendingAccount = emailSendingAccount;
            o.fromEmailAddress = fromEmailAddress;
            o.replyToEmailAddress = replyToEmailAddress;
            o.sourceArn = sourceArn;
            return o;
        }
    }
}
