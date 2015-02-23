package user.command;

import command.ReadCommand;
import admin.User;
import course.CourseAccessor;

/**
 * Encapsulates all operations that handle a user's request
 * to access different users' personal data in Grader program.
 */
public abstract class AccessUserPersonalData implements ReadCommand<User, CourseAccessor> {
}
