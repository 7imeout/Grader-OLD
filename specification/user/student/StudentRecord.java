package user.student;

import assignment.AssignmentGrade;
import course.LetterGrade;
import admin.User;
import util.GraderObject;

import java.util.Collection;

/**
 * Class containing all of the information for a student's record.
 */
public class StudentRecord implements GraderObject
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
}
