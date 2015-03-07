package command;

import accesscontrol.Role;
import accesscontrol.Subject;

import java.util.Collection;

/**
 * An operation that requires permission. The Command is executed if and
 * only if the subject that issued it is a assigned a Role contained in
 * getAuthorizedRole().
 */
public interface Command
{
   public boolean isAuthorized(CommandTarget target, Subject subject);
}