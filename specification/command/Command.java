package command;

import accesscontrol.Role;

import java.util.Collection;

/**
 * An operation that requires permission. The Command is executed if and
 * only if the subject that issued it is a assigned a Role contained in
 * getAuthorizedRole().
 */
public interface Command
{
   public Collection<Role> getAuthorizedRoles();
}