package accesscontrol;

import accesscontrol.Subject;
import util.GraderData;

public interface User extends GraderData, Subject {
   public abstract String getId();
   public abstract String getFirstName();
   public abstract String getLastName();
}
