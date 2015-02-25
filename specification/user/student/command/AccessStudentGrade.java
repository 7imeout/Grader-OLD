package user.student.command;

import command.ReadCommand;
import course.CourseAccessor;
import user.student.StudentRecord;

/**
 * AccessStudentGrade implements ReadCommand to read a raw score or letter
 * grade from a student's record.
 *                                                                           <p>
 */

public abstract class AccessStudentGrade implements ReadCommand<StudentRecord, CourseAccessor> {
}
