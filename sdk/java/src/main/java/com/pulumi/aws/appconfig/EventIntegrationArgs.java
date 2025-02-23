// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.appconfig.inputs.EventIntegrationEventFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventIntegrationArgs Empty = new EventIntegrationArgs();

    /**
     * Specifies the description of the Event Integration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies the description of the Event Integration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * 
     */
    @Import(name="eventFilter", required=true)
    private Output<EventIntegrationEventFilterArgs> eventFilter;

    /**
     * @return A block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * 
     */
    public Output<EventIntegrationEventFilterArgs> eventFilter() {
        return this.eventFilter;
    }

    /**
     * Specifies the EventBridge bus.
     * 
     */
    @Import(name="eventbridgeBus", required=true)
    private Output<String> eventbridgeBus;

    /**
     * @return Specifies the EventBridge bus.
     * 
     */
    public Output<String> eventbridgeBus() {
        return this.eventbridgeBus;
    }

    /**
     * Specifies the name of the Event Integration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Event Integration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private EventIntegrationArgs() {}

    private EventIntegrationArgs(EventIntegrationArgs $) {
        this.description = $.description;
        this.eventFilter = $.eventFilter;
        this.eventbridgeBus = $.eventbridgeBus;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventIntegrationArgs $;

        public Builder() {
            $ = new EventIntegrationArgs();
        }

        public Builder(EventIntegrationArgs defaults) {
            $ = new EventIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Specifies the description of the Event Integration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies the description of the Event Integration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param eventFilter A block that defines the configuration information for the event filter. The Event Filter block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder eventFilter(Output<EventIntegrationEventFilterArgs> eventFilter) {
            $.eventFilter = eventFilter;
            return this;
        }

        /**
         * @param eventFilter A block that defines the configuration information for the event filter. The Event Filter block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder eventFilter(EventIntegrationEventFilterArgs eventFilter) {
            return eventFilter(Output.of(eventFilter));
        }

        /**
         * @param eventbridgeBus Specifies the EventBridge bus.
         * 
         * @return builder
         * 
         */
        public Builder eventbridgeBus(Output<String> eventbridgeBus) {
            $.eventbridgeBus = eventbridgeBus;
            return this;
        }

        /**
         * @param eventbridgeBus Specifies the EventBridge bus.
         * 
         * @return builder
         * 
         */
        public Builder eventbridgeBus(String eventbridgeBus) {
            return eventbridgeBus(Output.of(eventbridgeBus));
        }

        /**
         * @param name Specifies the name of the Event Integration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Event Integration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public EventIntegrationArgs build() {
            $.eventFilter = Objects.requireNonNull($.eventFilter, "expected parameter 'eventFilter' to be non-null");
            $.eventbridgeBus = Objects.requireNonNull($.eventbridgeBus, "expected parameter 'eventbridgeBus' to be non-null");
            return $;
        }
    }

}
