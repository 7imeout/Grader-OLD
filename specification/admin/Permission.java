package admin;

/**
 * All possible permissions in this program.
 */
public enum Permission
{
    /**
     * The permission that allows a user to access an assignment category
     */
   ACCESS_ASSIGNMENT_CATEGORY,

    /**
     * The permission that allows a user to access an assignment
     */
   ACCESS_ASSIGNMENT,

    /**
     * The permission that allows a user to access an assignment grade
     */
   ACCESS_ASSIGNMENT_GRADE,

    /**
     * The permission that allows a user to access assignment a submission
     */
   ACCESS_ASSIGNMENT_SUBMISSION,

    /**
     * The permission that allows a user to add an assignment
     */
   ADD_ASSIGNMENT,

    /**
     * The permission that allows a user to update an assignment
     */
   UPDATE_ASSIGNMENT,

    /**
     * The permission that allows a user to ad an assignment category
     */
   ADD_ASSIGNMENT_CATEGORY,

    /**
     * The permission that allows a user to
     */
   ACCESS_COURSE_NAME,

    /**
     * The permission that allows a user to access a course snapshot
     */
   ACCESS_COURSE_SNAPSHOT,

    /**
     * The permission that allows a user to access a course grade schema
     */
   ACCESS_COURSE_GRADE_SCHEMA,

    /**
     * The permission that allows a user to access a course late policy
     */
   ACCESS_COURSE_LATE_POLICY,

    /**
     * The permission that allows a user to create a course snapshot
     */
   CREATE_COURSE_SNAPSHOT,

    /**
     * The permission that allows a user to update the name of a course
     */
   UPDATE_COURSE_NAME,

    /**
     * The permission that allows a user to change a course's grade schema
     */
   UPDATE_COURSE_GRADE_SCHEMA,

    /**
     * The permission that allows a user to change a course's late policy
     */
   UPDATE_COURSE_LATE_POLICY,

    /**
     * The permission that allows a user to change an assignment category
     */
   UPDATE_ASSIGNMENT_CATEGORY,

    /**
     * The permission that allows a user to submit an assignment for grading
     */
   ADD_ASSIGNMENT_SUBMISSION,

    /**
     * The permission that allows a user to change an assignment submission for grading
     */
   UPDATE_ASSIGNMENT_SUBMISSION,

    /**
     * The permission that allows a user to change the grade given to a student for an assignment
     */
   UPDATE_ASSIGNMENT_GRADE,

    /**
     * The permission that allows a user to see the confidential user data
     */
   ACCESS_USER_PERSONAL_DATA,

    /**
     * The permission that allows a user to add a student, TA, instructor or other user to the course
     */
   ADD_COURSE_USER,

    /**
     * The permission that allows a user to remove a student, TA, instructor or other user from the course
     */
   REMOVE_COURSE_USER,

    /**
     * The permission that allows a user to see a student's grade on an assignment
     */
   ACCESS_STUDENT_GRADE,

    /**
     * The permission that allows a user to see the confidential student data
     */
   ACCESS_STUDENT_PERSONAL_DATA,

    /**
     * The permission that allows a user to add a student to the course
     */
   ADD_STUDENT,

    /**
     * The permission that allows a user to remove a student from the course
     */
   REMOVE_STUDENT,

    /**
     * The permission that allows a user to change the student roster
     */
   UPDATE_STUDENT_ROSTER
}
