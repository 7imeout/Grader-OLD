package assignment;

import util.GraderData;

import java.util.Collection;

/**
 * An Assignment has a category, a collection of submissions and a collection of assignment grades.  
 */

public class Assignment implements GraderData{
   AssignmentCategory category;
   Collection<AssignmentSubmission> submissions;
   Collection<AssignmentGrade> grades;
}
