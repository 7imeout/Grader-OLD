package coursemanager;

import course.Course;
import util.GraderObject;

import java.util.Collection;

/**
 * A CourseManager implements CommandTarget, so that it can perform commands on a
 * given collection of Course(s). It holds a CourseEntry - a Course and CourseSnapshot
 * of what the course is. The RoleManager manages user access to the given courses.
 *                                                                           <p>
 */

public interface CourseManager extends  GraderObject {
   interface CourseEntries extends GraderObject {
      public Collection<Course> getCourses();
   }
   Collection<Course> getCourses();
   void addCourse(Course course);
}
