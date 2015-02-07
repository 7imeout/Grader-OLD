package course;

import command.CommandTarget;

/**
 * A read only version of the course for students.
 */
public interface CourseSnapshot extends CourseAccessor, CommandTarget {

}
