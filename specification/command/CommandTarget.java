package command;

import accesscontrol.RoleManager;
import accesscontrol.Subject;
import util.GraderData;

/**
 * An object that executes an operations that requires permission.
 */
public interface CommandTarget {
   CommandHistory getCommandHistory();
   RoleManager getRoleManager();
   <T extends GraderData> T read(ReadCommand<T> command, Subject invoker);
   void write(WriteCommand command, Subject invoker);
}
