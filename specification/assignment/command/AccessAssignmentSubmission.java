package assignment.command;

import assignment.AssignmentSubmission;
import command.ReadCommand;
import course.Course;
import course.CourseAccessor;

/**
 * Gets the assignment submission from the model.
 */
public abstract class AccessAssignmentSubmission implements ReadCommand<AssignmentSubmission, CourseAccessor> {
}
