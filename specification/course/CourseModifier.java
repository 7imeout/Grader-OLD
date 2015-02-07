package course;

import command.CommandTarget;
import user.student.StudentRecord;
import util.GraderObject;

import java.util.Collection;

/**
 * Changes course data.
 */

public interface CourseModifier extends GraderObject {
   void setName(String name);
   void setGradeSchema(GradeSchema gradeSchema);
   void setLatePolicy(LatePolicy latePolicy);
   void setCourseSnapshot(CourseAccessor courseAccessor);
}
