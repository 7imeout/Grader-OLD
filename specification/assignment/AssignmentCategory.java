package assignment;

import util.GraderObject;

import java.util.Collection;
/**
 * An AssignmentCategory contains an AssignmentCategory parent to which it
 * belongs, a collection of AssignmentCategory to be subcategories, and
 * a collection of Assignments that are a part of AsignemntCategory.
 */
public abstract class AssignmentCategory implements GraderObject {

   /**
    * Parent <code>AssignmentCategory</code> of this
    * <code>AssignmentCategory</code>.
    */
   AssignmentCategory parent;

   /**
    * Sub-<code>AssignmentCategory</code>'s of this
    * <code>AssignmentCategory</code>.
    */
   Collection<AssignmentCategory> subcategories;

   /**
    * Assignments that fall under this category.
    */
   Collection<Assignment> assignments;
}
