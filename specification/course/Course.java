package course;

import command.CommandTarget;

/**
 * Holds all the methods associated with a course.
 */
public interface Course extends CourseAccessor, CourseModifier, CommandTarget {
    /**
     * Accessor for the course snapshot.
     * @return <code>CourseSnapshot</code>.
     */
    CourseAccessor getCourseSnapshot();

    /**
     * Sets the course snapshot.
     * @param courseAccessor new course snapshot.

       pre: (getCourseSnapshot() == null || getCourseSnapshot != null)
       post: (this'.getCourseSnapshot() == courseAccessor)
     */
    void setCourseSnapshot(CourseAccessor courseAccessor);
}