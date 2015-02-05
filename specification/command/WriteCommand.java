package command;

public interface WriteCommand extends Command {
   public void apply();
   public void unapply();
}