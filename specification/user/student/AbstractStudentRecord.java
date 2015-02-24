package user.student;

import assignment.AssignmentGrade;
import course.LetterGrade;
import admin.User;
import util.GraderObject;

import java.util.Collection;

/**
 * Class containing all of the information for a student's record.
 */
public abstract class AbstractStudentRecord implements GraderObject
{
   /**
    * Student's position in roster.
    */
   int rosterPosition;

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

   public abstract AssignmentGrade getStudentAssignmentGrade();

   public abstract Collection<AssignmentGrade> getAllStudentAasignmentGrades();

   public abstract User getStudentUserInfo();

   public abstract String getStudentComment();

   public abstract void setStudentComment();

   public abstract double getStudentRawPercentageGrade();

   public abstract LetterGrade getStudentLetterGrade();


}
