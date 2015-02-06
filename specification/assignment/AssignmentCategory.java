package assignment;

import util.GraderData;

import java.util.Collection;
/** An AssignmentCategory contains an AssignmentCategory parent to which it  
 *  belongs, a collection of AssignmentCategory to be subcategories, and
 *  a collection of Assignments that are a part of AsignemntCategory.
 *
 */

public abstract class AssignmentCategory implements GraderData {
   AssignmentCategory parent;
   Collection<AssignmentCategory> subcategories;
   Collection<Assignment> assignments;
}
