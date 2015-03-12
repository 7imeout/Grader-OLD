package assignment.command;

import assignment.Assignment;
import command.ReadCommand;
import course.Course;
import course.CourseAccessor;

/**
 * Gets the Assignement from the model.
 */
public abstract class AccessAssignment implements ReadCommand<Assignment, CourseAccessor> {
}
