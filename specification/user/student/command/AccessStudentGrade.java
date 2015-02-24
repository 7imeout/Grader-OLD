package user.student.command;

import command.ReadCommand;
import course.CourseAccessor;
import user.student.AbstractStudentRecord;

/**
 * AccessStudentGrade implements ReadCommand to read a raw score or letter
 * grade from a student's record.
 *                                                                           <p>
 */

public abstract class AccessStudentGrade implements ReadCommand<AbstractStudentRecord, CourseAccessor> {
}
