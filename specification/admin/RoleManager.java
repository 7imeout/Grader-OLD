package admin;

import java.util.Collection;

/**
 * Manages user role assignments. Used by CommandTarget to authorize users
 * who issue commands.
 */
public abstract class RoleManager {

   /**
    * One-to-one assignment of <code>User</code> and a <code>Role</code>.
    */
   abstract class UserRoleAssignment {
      Role Role;
      User User;
   }

   /**
    * Assignment between a <code>Role</code> and the <code>Permission</code>s
    * it was given.
    */
   abstract class RolePermission {
      Role role;
      Collection<Permission> permissions;
   }

   /**
    * Collection of <code>User</code>-<code>Role</code> assignments.
    */
   Collection<UserRoleAssignment> userRoleAssignmentCollection;

   /**
    * Collection of <code>Role</code>-<code>Permission</code>s assignment.
    */
   Collection<RolePermission> rolePermissioncollection;


   /**
    * TODO
    *
    * @param role
    * @param user
    */
   abstract void assign(Role role, User user);

   /**
    * TODO
    *
    * @param role
    * @param user
    */
   abstract void revoke(Role role, User user);

   /**
    * TODO
    *
    * @return
    */
   abstract Collection<UserRoleAssignment> getUserRoleAssignments();

   /**
    * TODO
    *
    * @return
    */
   abstract Collection<User> getAllUsers();

   /**
    * TODO
    *
    * @param role
    * @return
    */
   abstract Collection<User> getUsers(Role role);

   /**
    * TODO
    *
    * @param user
    * @return
    */
   abstract Collection<Role> getRoles(User user);

   /**
    * Accessor for the <code>Permissions</code>s a given <code>User</code> has.
    * @param u the <code>User</code> to find <code>Permissions</code>s for.
    * @return all <code>Permissions</code>s the given <code>User</code> has.
    * <p/>
    * <pre>
    * pre:
    *    // none
    * post:
    *    if (getRoles(u).contains(Role.INSTRUCTOR))
    *    forall(Permission p; return.contains(p))
    */
   abstract Collection<Permission> getPerms(User u);

   /**
    * TODO
    *
    * @param role
    * @param perm
    */
   abstract void grantRolePerm(Role role, Permission perm);

   /**
    * TODO
    *
    * @param role
    * @param perm
    */
   abstract void revokeRolePerm(Role role, Permission perm);
}
