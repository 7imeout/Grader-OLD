package coursemanager;

import accesscontrol.RoleManager;
import command.CommandTarget;
import course.Course;
import course.CourseSnapshot;

import java.util.Collection;

public abstract class CourseManager implements CommandTarget {
   class CourseEntry {
      public Course course;
      public CourseSnapshot snapshot;
   }
   RoleManager userAccess;
   Collection<Course> courses;
}
