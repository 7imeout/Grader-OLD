package user.student.command;

import command.ReadCommand;
import course.CourseAccessor;
import user.student.StudentRecord;

/**
 * Gets personal data about a student.
 *
 */
public abstract class AccessStudentPersonalData implements ReadCommand<StudentRecord, CourseAccessor> {
}
