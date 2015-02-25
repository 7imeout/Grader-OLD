package course;

import admin.User;
import assignment.Assignment;
import assignment.AssignmentCategory;
import assignment.AssignmentGrade;
import assignment.AssignmentSubmission;
import user.student.StudentRecord;
import util.GraderObject;

import java.util.Collection;

/**
 * Provides fetch access to course data.
 */
public interface CourseAccessor extends GraderObject {
   String getName();

   GradeSchema getGradeSchema();
   LatePolicy getLatePolicy();

   Collection<StudentRecord> getStudentRecords();
   StudentRecord getStudentRecord(User student);

   Collection<Assignment> getAssignments();
   Collection<AssignmentCategory>  getAssignmentCategories();

   Collection<AssignmentSubmission> getAssignmentSubmissions(Assignment assignment);
   AssignmentSubmission getAssignmentSubmission(Assignment assignment, User student);

   Collection<AssignmentGrade> getAssignmentGrades(Assignment assignment);
   AssignmentGrade getAssignmentGrade(Assignment assignment, User student);
}
