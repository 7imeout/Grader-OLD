package command;

import accesscontrol.Subject;
import util.GraderData;

public interface CommandTarget {
   <T extends GraderData> T read(ReadCommand<T> command, Subject invoker);
   void write(WriteCommand command, Subject invoker);
}
