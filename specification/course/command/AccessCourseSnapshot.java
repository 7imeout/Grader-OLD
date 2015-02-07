package course.command;

import command.ReadCommand;
import course.CourseSnapshot;
import course.Course;

/**
 * Reads Course Snapshot, does not alter any information but displays course snapshot
 * 
 */

public abstract class AccessCourseSnapshot implements ReadCommand<CourseSnapshot, Course> {
}
