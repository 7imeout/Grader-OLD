package user.student;

import assignment.AssignmentGrade;
import course.LetterGrade;
import accesscontrol.User;
import util.GraderObject;

import java.util.Collection;

/*
 * Class containing all of the informatoin for a student's record
 * 
 */

public class StudentRecord implements GraderObject {
   int rosterPosition;
   User student;
   String comment;
   Collection<AssignmentGrade> grades;
   double rawPercentage;
   LetterGrade letterGrade;
}
