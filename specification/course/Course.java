package course;

import command.CommandTarget;
import util.GraderObject;

/**
 * A Course consists of several fields necessary for class organization. The
 * RoleManager manages the access a user has to the class. The Name indicates
 * the offered name of a course within a catalog; this is
 * paired with a catalog Description of the course. There is also a GradeSchema
 * and LatePolicy associated with each course, both set by the professor.
 *                                                                           <p>
 * CommandTarget is implemented by Course to perform commands on a course spreadsheet,
 * and GraderData is implemented so that a user may add, modify, or remove grade data
 * to a spreadsheet.
 */

public interface Course extends CourseAccessor, CourseModifier, CommandTarget {
   CourseAccessor getCourseSnapshot();
   void setCourseSnapshot(CourseAccessor courseAccessor);
}