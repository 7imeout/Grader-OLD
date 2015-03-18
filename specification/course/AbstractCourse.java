package course;

import admin.RoleManager;
import admin.Session;
import admin.User;
import assignment.Assignment;
import assignment.AssignmentCategory;
import assignment.AssignmentGrade;
import assignment.AssignmentSubmission;
import user.student.StudentRecord;

import java.util.Collection;

/**
 * A Course consists of several fields necessary for class organization. The
 * RoleManager manages the access a user has to the class. The Name indicates
 * the offered name of a course within a catalog; this is
 * paired with a catalog Description of the course. There is also a GradeSchema
 * and LatePolicy associated with each course, both set by the professor.
 * <p/>
 * CommandTarget is implemented by Course to perform commands on a course
 * spreadsheet, and GraderData is implemented so that a user may add, modify,
 * or remove grade data to a spreadsheet.
 */
public abstract class AbstractCourse implements Course {
   /**
    * Manages user role assignments. Used by CommandTarget to authorize users
    * who issue commands.
    */
   public RoleManager roleManager;

   public Session current;

   /**
    * A GradeSchema contains a function to convert a raw score to a LetterGrade.
    * This can be set by a professor to customize a grading scale. GraderData
    * is implemented to set a letter grade based on the raw score.
    */
   public GradeSchema gradeSchema;

   /**
    * A policy for calculating a grade penalty on late assignments.
    */
   public LatePolicy latePolicy;

   /**
    * Name of the course.
    */
   public String name;

   /**
    * A read only version of the course for students.
    */
   public CourseAccessor snapShot;

   /**
    * Data model for the grade book spreadsheet.
    */
   public Collection<StudentRecord> studentRecords;

   /**
    * All assignment categories in a course.
    */
   public Collection<AssignmentCategory> assignmentCategories;


   /**
    * Accessor for the name of this <code>Course</code>.
    * @return name of this <code>Course</code>.
    *
      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_COURSE_NAME)
      post:
         name' == name
    */
   public abstract String getName();

   /**
    * Sets the name of this <code>Course</code>.
    * @param n desired name of this <code>Course</code>.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.UPDATE_COURSE_NAME)
      post:
         name' == n
    */
   public abstract void setName(String n);

   /**
    * Accessor fot the <code>GradeSchema</code> for this <code>Course</code>.
    * @return <code>GradeSchema</code> for this <code>Course</code>.
    * <p/>
    *
      pre: session != null &&
         session.currentUser != null &&
         gradeSchema != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_COURSE_GRADE_SCHEMA)
      post:
         (gradeSchema' == gradeSchema)
    */
   public abstract GradeSchema getGradeSchema();

   /**
    * Sets the <code>GradeSchema</code> for this <code>Course</code>.
    * @param g desired <code>GradeSchema</code>.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.UPDATE_COURSE_GRADE_SCHEMA)
      post:
         gradeSchema' == g
    */
   public abstract void setGradeSchema(GradeSchema g);

   /**
    * Accessor fot the <code>LatePolicy</code> for this <code>Course</code>.
    * @return <code>LatePolicy</code> for this <code>Course</code>.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         latePolicy != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_COURSE_LATE_POLICY)
      post:
         (latePolicy' == latePolicy)
    */
   public abstract LatePolicy getLatePolicy();

   /**
    * Sets the <code>LatePolicy</code> for this <code>Course</code>.
    * @param l desired <code>LatePolicy</code>.
    *
       pre:
           session != null &&
           session.currentUser != null &&
           roleManager.getPerms(session.currentUser).contains(
           Permission.UPDATE_COURSE_LATE_POLICY)
       post:
           latePolicy' == l
    */
   public abstract void setLatePolicy(LatePolicy l);

   /**
    * Accessor fot the <code>StudentRecord</code>s for this <code>Course</code>.
    * @return <code>StudentRecord</code>s for this <code>Course</code>.
    * <p/>
    *

         session != null &&
         studentRecords != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_STUDENT_GRADE) &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_STUDENT_PERSONAL_DATA)
      post:
          studentRecords' == studentRecord
    */
   public abstract Collection<StudentRecord> getStudentRecords();

   /**
    * Accessor fot the <code>StudentRecord</code> for this <code>Course</code>.
    * @return <code>StudentRecord</code> for this <code>Course</code>.
    * <p/>
    *
      pre:
         session != null && session.currentUser != null &&
         studentRecords != null && (studentRecords.size() > 0) &&
         (student.equals(session.currentUser) ||
            (roleManager.getPerms(session.currentUser).contains(
               Permission.ACCESS_STUDENT_GRADE) &&
            roleManager.getPerms(session.currentUser).contains(
               Permission.ACCESS_STUDENT_PERSONAL_DATA)))
      post:
         studentRecord' == studentRecord
    */
   public abstract StudentRecord getStudentRecord(User student);

   /**
    * Accessor fot the <code>Assignment</code>s for this <code>Course</code>.
    * @return all <code>Assignment</code>s from every
    * <code>AssignmentCategory</code> contained in this <code>Course</code>.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         assignmentCategories != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_ASSIGNMENT)
      post:
    */
   public abstract Collection<Assignment> getAssignments();

   /**
    * Accessor fot the <code>AssignmentCategory</code>'s
    * for this <code>Course</code>.
    *
      pre:
         session != null &&
         session.currentUser != null &&
         assignmentCategories != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_ASSIGNMENT_CATEGORY)
      post:
         assignmentCategories' == assignmentCategories
    * @return <code>StudentRecord</code> for this <code>Course</code>.
    */
   public abstract Collection<AssignmentCategory> getAssignmentCategories();

   /**
    * Accessor for the <code>AssignmentSubmission</code>s for the given
    * <code>Assignment</code>.
    * @param assignment <code>Assignment</code> that the submissions are under.
    * @return submissions submitted under the <code>Assignment</code>.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         assignment != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_ASSIGNMENT_SUBMISSION)
      post:
         // none
    */
   public abstract Collection<AssignmentSubmission> getAssignmentSubmissions(
         Assignment assignment);

   /**
    * Accessor for the <code>AssignmentSubmission</code> of the given
    * <code>User</code> and <code>Assignment</code>.
    * @param assignment assignment associated with the submission to get.
    * @param student    student who submitted the submission.
    * @return <code>AssignmentSubmission</code>
    * for the specified assignment and the student.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         (session.currentUser.equals(student) ||
            roleManager.getPerms(session.currentUser).contains(
               Permission.ACCESS_ASSIGNMENT_SUBMISSION))
      post:
         // none
    */
   public abstract AssignmentSubmission getAssignmentSubmission(
         Assignment assignment, User student);

   /**
    * Accessor for all <code>AssignmentGrade</code>s for the specified
    * <code>Assignment</code>.
    * @param assignment assignment to access grades for.
    * @return All grades for the given assignment.
    *
      pre:
         session != null &&
         session.currentUser != null &&
         (roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_ASSIGNMENT_GRADE)
      post:
         // none
    */
   public abstract Collection<AssignmentGrade> getAssignmentGrades(
         Assignment assignment);

   /**
    * Gets the grade the student earned on an assignment
    * @param assignment The assignment that you like to access the grade for
    * @param student    The student user to access a grade for
    * @return The grade received on the given assignment by the given user
    *
      pre:
         session != null &&
         session.currentUser != null &&
         (roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_ASSIGNMENT_GRADE) ||
         (session.currentUser.equals(student) &&
            roleManager.getRoles(session.currentUser).contains(Role.STUDENT))
      post:
         // none yet
    */
   public abstract AssignmentGrade getAssignmentGrade(
         Assignment assignment, User student);

   /**
    * Creates a <code>Snapshot</code> of the course.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.CREATE_COURSE_SNAPSHOT)
      post:
         roleManage.equals(snapShot.roleManager) &&
         gradeSchema.equals(snapShot.gradeSchema) &&
         latePolicy.equals(snapShot.latePolicy) &&
         name.equals(snapShot.name) &&
         studentRecords.equals(snapShot.studentRecords) &&
         assignmentCategories.equals(snapShot.assignmentCategories) &&

         roleManage'.equals(snapShot.roleManager) &&
         gradeSchema'.equals(snapShot.gradeSchema) &&
         latePolicy'.equals(snapShot.latePolicy) &&
         name'.equals(snapShot.name) &&
         studentRecords'.equals(snapShot.studentRecords) &&
         assignmentCategories'.equals(snapShot.assignmentCategories)
    */
   public abstract void createSnapshot();

   /**
    * Adds an assignment to the course
    * @param assignment The assignment to add to this course
    *
      pre:
          session != null &&
          session.currentUser != null &&
          roleManager.getPerms(session.currentUser).contains(
             Permission.ADD_ASSIGNMENT)
      post:
    */
   public abstract void addAssignment(Assignment assignment);

   /**
    * Updates an specified <code>Assignment</code>.
    * @param assignment The <code>Assignment</code> to update.
    *
      pre:
          session != null &&
          session.currentUser != null &&
          roleManager.getPerms(session.currentUser).contains(
             Permission.UPDATE_ASSIGNMENT)
      post:
    */
   public abstract void updateAssignment(Assignment assignment);

   /**
    * Adds an assignment category to the course
    * @param assignmentCategory The assignment category to add to this course
      <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ADD_ASSIGNMENT_CATEGORY)
      post:
         // none
    */
   public abstract void addAssignmentCategory(
      AssignmentCategory assignmentCategory);

   /**
    * Updates the <code>AssignmentCategory</code> as the given one.
    * @param assignmentCategory new <code>AssignmentCategory</code>.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.UPDATE_ASSIGNMENT_CATEGORY)
      post:
         // none
    */
   public abstract void updateAssignmentCategory(
      AssignmentCategory assignmentCategory);

   /**
    * Adds the given <code>AssignmentSubmission</code>.
    * @param submission <code>AssignmentSubmission</code> to add.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         (session.currentUser.equals(submission.student) &&
         roleManager.getRoles(session.currentUser).contains(Role.STUDENT)) ||
         roleManager.getPerms(session.currentUser).contains(
            Permission.ADD_ASSIGNMENT_SUBMISSION))
      post:
         // none
    */
   public abstract void addAssignmentSubmission(
      AssignmentSubmission submission);

   /**
    * Updates the <code>AssignmentSubmission</code> as the given one.
    * @param submission new <code>AssignmentSubmission</code>.
    * <p/>
    *
      pre:
         session != null &&
         session.currentUser != null &&
         (session.currentUser.equals(submission.student) &&
         if (forall (Role role; roleManager.getRoles(
             session.currentUser).contains(role); role == Role.STUDENT))
            submission.student != null &&
            submission.student.equals(session.currentUser) &&
            roleManager.getPerms(session.currentUser).contains(
               Permission.UPDATE_ASSIGNMENT_SUBMISSION))
         else
            roleManager.getPerms(session.currentUser).contains(
               Permission.UPDATE_ASSIGNMENT_SUBMISSION))
      post:
         // none
    */
   public abstract void updateAssignmentSubmission(
      AssignmentSubmission submission);

   /**
    * Updates the <code>AssignmentGrade</code> as the given one.
    * @param assignmentGrade new <code>AssignmentGrade</code>.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.UPDATE_ASSIGNMENT_GRADE))
      post:
         // none
    */
   public abstract void updateAssignmentGrade(
      AssignmentGrade assignmentGrade);

   /**
    * Gets the current <code>AbstractCourseSnapshot</code>.
    * @return a snapshot for the current course
    * or null if no snapshot was created.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ACCESS_COURSE_SNAPSHOT)
      post:
         snapShot == snapShot'
    */
   public abstract AbstractCourseSnapshot getSnapshot();

   /**
    * Adds a student to the student record this <code>AbstractCourse</code>
    * holds.
    * @param student student <code>User</code> to add to this course.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.ADD_STUDENT)
      post:
         studentRecords.size() == studentRecords'.size() - 1 &&
         exists (AbstractStudentRecord rec; rec.getStudentUserInfo(student))
    */
   public abstract void addStudent(User student);

   /**
    * Removes a student from the student record this <code>AbstractCourse</code>
    * holds.
    * @param student student <code>User</code> to remove from this course.
    * @return <code>true</code> if successful, <code>false</code> otherwise.
    * <p/>

      pre:
         session != null &&
         session.currentUser != null &&
         roleManager.getPerms(session.currentUser).contains(
            Permission.REMOVE_STUDENT)
      post:
         studentRecords.size() == studentRecords'.size() + 1 &&
         !exists (AbstractStudentRecord rec; rec.getStudentUserInfo(student))
    */
   public abstract boolean removeStudent(User student);

   /**
    * Updates the student roster.
    */
   public abstract void updateStudentRoster();

}
