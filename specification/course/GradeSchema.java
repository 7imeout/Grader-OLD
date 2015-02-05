package course;

import util.GraderData;

public abstract class GradeSchema implements GraderData {
   public abstract LetterGrade convertRawScore(int raw);
}
