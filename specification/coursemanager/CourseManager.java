package coursemanager;

import accesscontrol.RoleManager;
import command.CommandTarget;
import course.Course;
import course.CourseSnapshot;

import java.util.Collection;

/**
 * A CourseManager implements CommandTarget, so that it can perform commands on a
 * given collection of Course(s). It holds a CourseEntry - a Course and CourseSnapshot
 * of what the course is. The RoleManager manages user access to the given courses.
 *                                                                           <p>
 */

public abstract class CourseManager implements CommandTarget {
   class CourseEntry {
      public Course course;
      public CourseSnapshot snapshot;
   }
   RoleManager userAccess;
   Collection<Course> courses;
}
