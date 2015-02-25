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
    * Assigns a <code>Role</code> to a <code>User</code>.
    * @param role <code>Role</code> to assign.
    * @param user <code>User</code> to assign to.
    */
   abstract void assign(Role role, User user);

   /**
    * Revokes a <code>Role</code> from a <code>User</code>.
    * @param role <code>Role</code> to revoke.
    * @param user <code>User</code> to revoke from.
    */
   abstract void revoke(Role role, User user);

   /**
    * Accessor for <code>User</code>-<code>Role</code> assignments.
    * @return all <code>User</code>-<code>Role</code> assignments.
    */
   abstract Collection<UserRoleAssignment> getUserRoleAssignments();

   /**
    * Accessor for all <code>User</code>s enrolled in a course.
    * @return all <code>User</code>s enrolled in a course.
    */
   abstract Collection<User> getAllUsers();

   /**
    * Returns all <code>User</code>s with the specified <code>Role</code>.
    * @param role <code>Role</code> to use as a key to
    *             look for <code>User</code>s.
    * @return all <code>User</code>s with the specified <code>Role</code>.
    */
   abstract Collection<User> getUsers(Role role);

   /**
    * Returns all <code>Role</code>s that a given <code>User</code> has.
    * @param user <code>User</code> to get <code>Roles</code> from.
    * @return all <code>Role</code>s that the <code>User</code> has.
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
