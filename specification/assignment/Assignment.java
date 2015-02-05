package assignment;

import util.GraderData;

import java.util.Collection;

public class Assignment implements GraderData{
   AssignmentCategory category;
   Collection<AssignmentSubmission> submissions;
   Collection<AssignmentGrade> grades;
}
