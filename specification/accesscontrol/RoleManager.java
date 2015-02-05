package accesscontrol;

import user.UserSet;

import java.util.Collection;
import java.util.List;

public abstract class RoleManager {

   public static interface RoleEntry {
      public Role role();
      public UserSet users();
   }

   Collection<RoleEntry> users;

   public abstract Collection<Identity> get(Role role);

   public abstract List<Role> get(Identity user);
}
