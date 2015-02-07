package command;

import accesscontrol.Role;

import java.util.Collection;

public interface Command
{
   public Collection<Role> getAuthorizedRoles();
}