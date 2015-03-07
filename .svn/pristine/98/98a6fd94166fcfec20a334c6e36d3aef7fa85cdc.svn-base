package course;

import accesscontrol.User;
import assignment.Assignment;
import assignment.AssignmentCategory;
import assignment.AssignmentGrade;
import assignment.AssignmentSubmission;
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

   void addAssignment(Assignment assignment);
   void updateAssignment(Assignment assignment);

   void addAssignmentCategory(AssignmentCategory assignmentCategory);
   void updateAssignmentCategory(AssignmentCategory assignmentCategory);

   void addAssignmentSubmission(AssignmentSubmission submission);
   void updateAssignmentSubmission(AssignmentSubmission submission);

   void  updateAssignmentGrade(AssignmentGrade assignmentGrade);
}
