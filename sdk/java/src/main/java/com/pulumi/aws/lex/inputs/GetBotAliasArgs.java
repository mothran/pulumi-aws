// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotAliasArgs Empty = new GetBotAliasArgs();

    /**
     * The name of the bot.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the bot.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * The name of the bot alias. The name is case sensitive.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the bot alias. The name is case sensitive.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetBotAliasArgs() {}

    private GetBotAliasArgs(GetBotAliasArgs $) {
        this.botName = $.botName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotAliasArgs $;

        public Builder() {
            $ = new GetBotAliasArgs();
        }

        public Builder(GetBotAliasArgs defaults) {
            $ = new GetBotAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the bot.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param name The name of the bot alias. The name is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the bot alias. The name is case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetBotAliasArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
