package assignment.command;

import assignment.AssignmentGrade;
import command.ReadCommand;
import course.Course;
import course.CourseAccessor;

/**
 * Gets the assignment grade from the model.
 */
public abstract class AccessAssignmentGrade implements ReadCommand<AssignmentGrade, CourseAccessor> {
}
