package assignment;

import course.LetterGrade;
import util.GraderData;

/** An AssignmentGrade contains an Assignment for which the grade is associated
 *  with, an integer, rawScore, which is the points assignment has earned, and
 *  a LetterGrade which represents the letter grade the assignment has earned.
 */

public class AssignmentGrade implements GraderData {
   Assignment assignment;
   int rawScore;
   LetterGrade letter;
}
