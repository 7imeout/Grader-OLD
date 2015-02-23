package command;

import admin.RoleManager;
import admin.Subject;
import util.GraderObject;

/**
 * An object that executes an operation that requires permission.
 */
public interface CommandTarget<S extends GraderObject> {
   CommandHistory getCommandHistory();
   RoleManager getRoleManager();
   <T extends GraderObject> T read(ReadCommand<T, S> command, Subject invoker);
   void write(WriteCommand<S> command, Subject invoker);
}
