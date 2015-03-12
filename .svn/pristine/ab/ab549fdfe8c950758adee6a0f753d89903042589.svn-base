package assignment;

import util.GraderObject;

import java.util.Collection;

/**
 * An Assignment has a category, a collection of submissions and a collection of assignment grades.  
 */

public interface Assignment extends GraderObject {
   AssignmentCategory getCategory();

    /**
     * Accessor for the assignement submissions.
     *
     * pre: ()
     * post: (getSubmissions() !=)
     * @return
     */
    /**
     * Gets the assignment submission from the model.
     * As an instructor or an admin, the user accesses all submissions made to
     * the class, and for TAs, students, and public users, the scope of
     * accessible submissions is determined at runtime.
     *
     */
    Collection<AssignmentSubmission> getSubmissions();
   Collection<AssignmentGrade> getGrades();
}
