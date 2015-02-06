package course;

import accesscontrol.RoleManager;
import command.CommandTarget;
import command.ReadCommand;
import command.CommandHistory;
import command.WriteCommand;
import util.GraderData;

/**
 * A Course consists of several fields necessary for class organization. The
 * RoleManager manages the access a user has to the class. The Name indicates
 * the offered name of a course within a catalog; this is
 * paired with a catalog Description of the course. There is also a GradeSchema
 * and LatePolicy associated with each course, both set by the professor.
 *                                                                           <p>
 * CommandTarget is implemented by Course to perform commands on a course spreadsheet,
 * and GraderData is implemented so that a user may add, modify, or remove grade data
 * to a spreadsheet.
 */

public abstract class Course implements CommandTarget, GraderData {
   RoleManager userAccess;
   String name;
   GradeSchema gradeSchema;
   LatePolicy latePolicy;
}