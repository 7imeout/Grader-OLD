package user.student.command;

import command.WriteCommand;
import course.CourseModifier;

/**
 * RemoveStudent implements WriteCommand to remove student data from a course
 * spreadsheet by overwriting the data.
 *                                                                           <p>
 */
public abstract class RemoveStudent implements WriteCommand<CourseModifier> {
}
