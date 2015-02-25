package user.student;

import assignment.Assignment;
import assignment.AssignmentGrade;
import course.CurveSetting;
import course.LetterGrade;
import admin.User;
import util.GraderObject;

import java.util.Collection;

/**
 * Class containing all of the information for a student's record.
 */
public abstract class StudentRecord implements GraderObject {
   /**
    * Student's user information
    */
   User student;

   /**
    * Student-specific comment from the instructor.
    */
   String comment;

   /**
    * Student's assignment grades.
    */
   Collection<AssignmentGrade> grades;

   /**
    * Raw percentage grade of the student.
    */
   double rawPercentage;

   /**
    * Letter grade of the student.
    */
   LetterGrade letterGrade;

   /**
    * Accessor for the student's grade on the specified <code>Assignment</code>.
    * @return grade the student received for the <code>Assignment</code>.
    * <p/>
    * <pre>
    * pre:
    *    grades != null &&
    *    exists (int i; i >= 0 && i < grades.size();
    *       grades.get(i).getAssignment().equals(assignment))
    * post:
    *    grades.contains(return) &&
    *    grades'.size() == grades.size()
    */
   public abstract AssignmentGrade getAssignmentGrade(Assignment assignment);

   /**
    * Accessor for the entire <code>Collection</code> of
    * <code>AssignmentGrade</code>s for the student.
    * @return all <code>AssignmentGrades</code>s of this student.
    * <p/>
    * <pre>
    * pre:
    *    grades != null;
    * post:
    *    forall (AssignmentGrade ag; grades.contains(ag)
    */
   public abstract Collection<AssignmentGrade> getAllassignmentGrades();

   /**
    * Accessor for the personal <code>User</code> information of the student.
    * @return <code>User</code> information of the student.
    * <p/>
    * <pre>
    * pre:
    *    student != null
    * post:
    *    return.equals(student)
    */
   public abstract User getUserInfo();

   /**
    * Accessor for the comment written by the instructor about the student.
    * @return comment written by the instructor.
    * <p/>
    * <pre>
    * pre:
    *    student != null
    * post:
    *    // none
    */
   public abstract String getStudentComment();

   /**
    * Sets the comment for the student.
    * @param studentComment comment for the student.
    * <p/>
    * <pre>
    * pre:
    *    user != null &&
    *    studentComment != null
    * post:
    *    comment' != null &&
    *    comment'.equals(studentComment)
    */
   public abstract void setStudentComment(String studentComment);

   /**
    * Calculates and returns the raw percentage grade of the student.
    * @return raw percentage grade.
    * <p/>
    * <pre>
    * pre:
    *    user != null
    * post:
    *    // none
    */
   public abstract double getRawPercentageGrade();

   /**
    * Calculates and returns the letter grade of the student.
    * @param curve <code>CurveSetting</code> of the course a student is in.
    * @return letter grade.
    * <p/>
    * <pre>
    * pre:
    *    curve != null &&
    *    user != null &&
    *    getRawPercentageGrade() >= 0
    * post:
    *    // none
    */
   public abstract LetterGrade getLetterGrade(CurveSetting curve);


}
