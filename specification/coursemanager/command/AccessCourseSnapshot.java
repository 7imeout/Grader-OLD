package coursemanager.command;

import command.ReadCommand;
import course.CourseSnapshot;
import course.Course;

public abstract class AccessCourseSnapshot implements ReadCommand<CourseSnapshot, Course> {
}
