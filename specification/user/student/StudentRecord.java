package user.student;

import assignment.AssignmentGrade;
import course.LetterGrade;
import user.User;
import util.GraderData;

import java.util.Collection;

public class StudentRecord implements GraderData {
   int rosterPosition;
   User student;
   String comment;
   Collection<AssignmentGrade> grades;
   double rawPercentage;
   LetterGrade letterGrade;
}
