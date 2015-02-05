package command;

import util.GraderData;

public interface ReadCommand<T extends GraderData> extends Command
{
   public T get();
}