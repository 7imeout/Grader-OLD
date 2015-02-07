package command;

import util.GraderObject;

/**
 * An fetch operation that requires permission to execute.
 */
public interface ReadCommand<T extends GraderObject, S extends GraderObject> extends Command
{
   public T get(S from);
}