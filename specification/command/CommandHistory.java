package command;

import java.util.List;

public abstract class CommandHistory {
   class WriteCommandEntry {
      public WriteCommand command;
      public CommandTarget target;
   }

   List<WriteCommandEntry> history;

   public abstract WriteCommandEntry peek();
   public abstract WriteCommandEntry pop();
   public abstract void push(WriteCommand command, CommandTarget target);
   public abstract void push(WriteCommandEntry entry);
}
