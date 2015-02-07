package accesscontrol;

import util.GraderData;

import java.util.Collection;

/**
 * An identifiable human granted a Role in the Grader Application.
 */
public interface User extends GraderData {
   String getId();
   Collection<Identity> getIdentities();
   String getFirstName();
   String getLastName();
}
