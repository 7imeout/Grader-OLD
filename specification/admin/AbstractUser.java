package admin;

import java.util.Collection;

public abstract class AbstractUser extends User
{

    @Override
    public abstract String getId();

    @Override
    public abstract Collection<Identity> getIdentities();

    @Override
    public abstract String getFirstName();

    @Override
    public abstract String getLastName();
}
