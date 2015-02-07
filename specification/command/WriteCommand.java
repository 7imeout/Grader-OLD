package command;

/**
 * A revertible modify operation that requires permission to execute.
 */
public interface WriteCommand extends Command {
   public void apply();
   public void unapply();
}