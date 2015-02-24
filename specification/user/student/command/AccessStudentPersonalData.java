package user.student.command;

import command.ReadCommand;
import course.CourseAccessor;
import user.student.AbstractStudentRecord;

/**
 * Gets personal data about a student.
 *
 */
public abstract class AccessStudentPersonalData implements ReadCommand<AbstractStudentRecord, CourseAccessor> {
}
