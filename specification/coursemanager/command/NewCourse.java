package coursemanager.command;

import command.WriteCommand;
import course.Course;
import coursemanager.CourseManager;

/**
 * Creates a new course spreadsheet.
 */
public interface NewCourse extends WriteCommand<CourseManager>{
}
