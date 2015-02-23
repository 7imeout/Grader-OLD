package command;

import util.GraderObject;

/**
 * A modify operation that requires permission to execute.
 */
public interface WriteCommand<T extends GraderObject> extends Command {
   public void apply(T  on);
   public void unapply();
}