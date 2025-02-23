// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.glue.inputs.TriggerActionArgs;
import com.pulumi.aws.glue.inputs.TriggerEventBatchingConditionArgs;
import com.pulumi.aws.glue.inputs.TriggerPredicateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * List of actions initiated by this trigger when it fires. See Actions Below.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<TriggerActionArgs>> actions;

    /**
     * @return List of actions initiated by this trigger when it fires. See Actions Below.
     * 
     */
    public Output<List<TriggerActionArgs>> actions() {
        return this.actions;
    }

    /**
     * A description of the new trigger.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the new trigger.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Start the trigger. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Start the trigger. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
     * 
     */
    @Import(name="eventBatchingConditions")
    private @Nullable Output<List<TriggerEventBatchingConditionArgs>> eventBatchingConditions;

    /**
     * @return Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
     * 
     */
    public Optional<Output<List<TriggerEventBatchingConditionArgs>>> eventBatchingConditions() {
        return Optional.ofNullable(this.eventBatchingConditions);
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the trigger.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
     * 
     */
    @Import(name="predicate")
    private @Nullable Output<TriggerPredicateArgs> predicate;

    /**
     * @return A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
     * 
     */
    public Optional<Output<TriggerPredicateArgs>> predicate() {
        return Optional.ofNullable(this.predicate);
    }

    /**
     * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created. True is not supported for `ON_DEMAND` triggers.
     * 
     */
    @Import(name="startOnCreation")
    private @Nullable Output<Boolean> startOnCreation;

    /**
     * @return Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created. True is not supported for `ON_DEMAND` triggers.
     * 
     */
    public Optional<Output<Boolean>> startOnCreation() {
        return Optional.ofNullable(this.startOnCreation);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
     * 
     */
    @Import(name="workflowName")
    private @Nullable Output<String> workflowName;

    /**
     * @return A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
     * 
     */
    public Optional<Output<String>> workflowName() {
        return Optional.ofNullable(this.workflowName);
    }

    private TriggerArgs() {}

    private TriggerArgs(TriggerArgs $) {
        this.actions = $.actions;
        this.description = $.description;
        this.enabled = $.enabled;
        this.eventBatchingConditions = $.eventBatchingConditions;
        this.name = $.name;
        this.predicate = $.predicate;
        this.schedule = $.schedule;
        this.startOnCreation = $.startOnCreation;
        this.tags = $.tags;
        this.type = $.type;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerArgs $;

        public Builder() {
            $ = new TriggerArgs();
        }

        public Builder(TriggerArgs defaults) {
            $ = new TriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actions List of actions initiated by this trigger when it fires. See Actions Below.
         * 
         * @return builder
         * 
         */
        public Builder actions(Output<List<TriggerActionArgs>> actions) {
            $.actions = actions;
            return this;
        }

        /**
         * @param actions List of actions initiated by this trigger when it fires. See Actions Below.
         * 
         * @return builder
         * 
         */
        public Builder actions(List<TriggerActionArgs> actions) {
            return actions(Output.of(actions));
        }

        /**
         * @param actions List of actions initiated by this trigger when it fires. See Actions Below.
         * 
         * @return builder
         * 
         */
        public Builder actions(TriggerActionArgs... actions) {
            return actions(List.of(actions));
        }

        /**
         * @param description A description of the new trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the new trigger.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Start the trigger. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Start the trigger. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
         * 
         * @return builder
         * 
         */
        public Builder eventBatchingConditions(@Nullable Output<List<TriggerEventBatchingConditionArgs>> eventBatchingConditions) {
            $.eventBatchingConditions = eventBatchingConditions;
            return this;
        }

        /**
         * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
         * 
         * @return builder
         * 
         */
        public Builder eventBatchingConditions(List<TriggerEventBatchingConditionArgs> eventBatchingConditions) {
            return eventBatchingConditions(Output.of(eventBatchingConditions));
        }

        /**
         * @param eventBatchingConditions Batch condition that must be met (specified number of events received or batch time window expired) before EventBridge event trigger fires. See Event Batching Condition.
         * 
         * @return builder
         * 
         */
        public Builder eventBatchingConditions(TriggerEventBatchingConditionArgs... eventBatchingConditions) {
            return eventBatchingConditions(List.of(eventBatchingConditions));
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param predicate A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
         * 
         * @return builder
         * 
         */
        public Builder predicate(@Nullable Output<TriggerPredicateArgs> predicate) {
            $.predicate = predicate;
            return this;
        }

        /**
         * @param predicate A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. See Predicate Below.
         * 
         * @return builder
         * 
         */
        public Builder predicate(TriggerPredicateArgs predicate) {
            return predicate(Output.of(predicate));
        }

        /**
         * @param schedule A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created. True is not supported for `ON_DEMAND` triggers.
         * 
         * @return builder
         * 
         */
        public Builder startOnCreation(@Nullable Output<Boolean> startOnCreation) {
            $.startOnCreation = startOnCreation;
            return this;
        }

        /**
         * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created. True is not supported for `ON_DEMAND` triggers.
         * 
         * @return builder
         * 
         */
        public Builder startOnCreation(Boolean startOnCreation) {
            return startOnCreation(Output.of(startOnCreation));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param workflowName A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(@Nullable Output<String> workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        /**
         * @param workflowName A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(String workflowName) {
            return workflowName(Output.of(workflowName));
        }

        public TriggerArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
