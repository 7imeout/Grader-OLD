package accesscontrol;

import java.util.Collection;

public interface Subject {
   public Collection<Identity> getIdentities();
}
