package assignment;

import util.GraderData;

import java.util.Date;

/** An AssignemntSubmission contains an Assignment representing the specific
 *  assignment to be submitted, and a Date representign the date and time of the
 *  submission.
 */

public class AssignmentSubmission implements GraderData {
   Assignment assignment;
   Date timestamp;
}
