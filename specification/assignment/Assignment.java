package assignment;

import util.GraderObject;

import java.util.Collection;

/**
 * An Assignment has a category, a collection of submissions and a collection of assignment grades.  
 */

public interface Assignment extends GraderObject {
   AssignmentCategory getCategory();
   Collection<AssignmentSubmission> getSubmissions();
   Collection<AssignmentGrade> getGrades();
}
