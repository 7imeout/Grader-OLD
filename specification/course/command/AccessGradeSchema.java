package course.command;

import command.ReadCommand;
import course.Course;
import course.CourseAccessor;
import course.GradeSchema;

/**
 * Gets the grade schema from the model.
 */
public abstract class AccessGradeSchema implements ReadCommand<GradeSchema, CourseAccessor> {
}
