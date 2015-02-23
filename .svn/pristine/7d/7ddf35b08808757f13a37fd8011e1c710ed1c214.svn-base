package command;

import accesscontrol.Subject;

import java.util.List;

/**
 * Records command execution events
 */
public interface CommandHistory {
   interface CommandEntry {
      Command getCommand();
      CommandTarget getTarget();
      Subject getSubject();
      String getTimeStamp();
   }

   List<CommandEntry> getHistory();
   CommandEntry peek();
   CommandEntry pop();
   void push(Command command, CommandTarget target, Subject subject);
}
