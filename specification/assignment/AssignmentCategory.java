package assignment;

import util.GraderData;

import java.util.Collection;

public abstract class AssignmentCategory implements GraderData {
   AssignmentCategory parent;
   Collection<AssignmentCategory> subcategories;
   Collection<Assignment> assignments;
}
