package course;

import util.GraderData;

/**
 * A GradeSchema contains a function to convert a raw score to a LetterGrade.
 *                                                                           <p>
 * This can be set by a professor to customize a grading scale. GraderData is
 * implemented to set a letter grade based on the raw score.
 */

public abstract class GradeSchema implements GraderData {
   public abstract LetterGrade convertRawScore(int raw);
}
