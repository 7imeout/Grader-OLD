package command;

import accesscontrol.RoleManager;
import accesscontrol.Subject;
import util.GraderData;

public interface CommandTarget {
   RoleManager getRoleManager();
   <T extends GraderData> T read(ReadCommand<T> command, Subject invoker);
   void write(WriteCommand command, Subject invoker);
}
