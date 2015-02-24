package admin;

/**
 * All possible permissions in this program.
 */
public enum Permission
{
    /* Permissions added by Michael Murphy */
    ACCESS_ASSIGNMENT_CATEGORY,
    ACCESS_ASSIGNMENT,
    ACCESS_ASSIGNEMENT_GRADE,
   
    /* Permissions Added Previously */
    ACCESS_COURSE_NAME,
    ACCESS_COURSE_SNAPSHOT,
    ACCESS_COURSE_GRADE_SCHEMA,
    ACCESS_COURSE_LATE_POLICY,
    CREATE_COURSE_SNAPSHOT,
    UPDATE_COURSE_NAME,
    UPDATE_COURSE_GRADE_SCHEMA,
    UPDATE_COURSE_LATE_POLICY

   /* Permissions added by Mike Ryu */
   ACCESS_STUDENT_GRADE,
   ACCESS_STUDENT_PERSONAL_DATA,
   ADD_STUDENT,
   REMOVE_STUDENT,
   UPDATE_STUDENT_ROSTER
}
