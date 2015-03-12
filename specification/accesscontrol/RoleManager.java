package accesscontrol;

import java.util.Collection;

/**
 * Manages user role assignments. Used by CommandTarget to authorize users
 * who issue commands.
 */
public interface RoleManager {

   interface UserRoleAssignment {
      Role getRole();
      User getUser();
   }

   void assign(Role role, User user);
   void revoke(Role role, User user);

   Collection<UserRoleAssignment> getUserRoleAssignments();
   Collection<User> getUsers(Role role);
   Collection<Role> getRoles(User user);
}
