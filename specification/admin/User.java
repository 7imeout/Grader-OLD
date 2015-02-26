package admin;

import util.GraderObject;

import java.util.Collection;

/**
 * An identifiable human granted a Role in the Grader Application.
 */
public abstract class User implements GraderObject {

   String id;
   Collection<Identity> identities;
   String firstName;
   String lastName;

   abstract String getId();
   abstract Collection<Identity> getIdentities();
   abstract String getFirstName();
   abstract String getLastName();
}
