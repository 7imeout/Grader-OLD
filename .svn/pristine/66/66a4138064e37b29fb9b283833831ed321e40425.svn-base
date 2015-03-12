package admin;

import java.util.Collection;

/**
 * Manages user role assignments. Used by CommandTarget to authorize users
 * who issue commands.
 */
public abstract class RoleManager
{

    abstract class UserRoleAssignment
    {
        Role Role;
        User User;
    }

    abstract class RolePermission
    {
        Role role;
        Collection<Permission> permissions;
    }

    Collection<UserRoleAssignment> userRoleAssignmentCollection;
    Collection<RolePermission> rolePermissioncollection;


    abstract void assign(Role role, User user);

    abstract void revoke(Role role, User user);

    abstract Collection<UserRoleAssignment> getUserRoleAssignments();

    abstract Collection<User> getAllUsers();

    abstract Collection<User> getUsers(Role role);

    abstract Collection<Role> getRoles(User user);

    /**
     *
     * @param u the user to find permissions for.
     * @return all permissions the given user has.
     *
     * post:
     *     if (getRoles(u).contains(Role.INSTRUCTOR))
     *          forall(Permission p; return.contains(p))
     */
    abstract Collection<Permission> getPerms(User u);

    abstract void grantRolePerm(Role role, Permission perm);
}
