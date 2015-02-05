package user;

import accesscontrol.Identity;
import util.GraderData;

public abstract class User implements GraderData {
   public abstract String getId();
   public abstract Identity getLoginId();
   public abstract String getFirstName();
   public abstract String getLastName();
}
