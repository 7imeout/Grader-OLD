package course.command;

import command.ReadCommand;
import course.LatePolicy;

/**
 * Gets the late policy from the model.
 */
public abstract class AccessLatePolicy implements ReadCommand<LatePolicy> {
}
