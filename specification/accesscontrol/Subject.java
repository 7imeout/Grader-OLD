package accesscontrol;

import command.Command;

import java.util.List;

public interface Subject {
   public Identity getIdentity();
   public boolean isAuthorized(Command command);
}
