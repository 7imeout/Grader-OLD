package course;

import accesscontrol.RoleManager;
import command.CommandTarget;
import command.ReadCommand;
import command.CommandHistory;
import command.WriteCommand;
import util.GraderData;

public abstract class Course implements CommandTarget, GraderData {
   RoleManager userAccess;
   String name;
   GradeSchema gradeSchema;
   LatePolicy latePolicy;
}