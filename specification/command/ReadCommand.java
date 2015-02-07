package command;

import util.GraderData;

/**
 * An fetch operation that requires permission to execute.
 */
public interface ReadCommand<T extends GraderData> extends Command
{
   public T get();
}