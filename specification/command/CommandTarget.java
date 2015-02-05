package command;

import accesscontrol.Subject;
import util.GraderData;

public interface CommandTarget {
   public abstract <T extends GraderData> T read(ReadCommand<T> command, Subject invoker);
   public abstract void write(WriteCommand command, Subject invoker);
}
