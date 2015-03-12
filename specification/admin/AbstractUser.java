package admin;

import java.util.Collection;

public abstract class AbstractUser implements User
{

    @Override
    public String getId();

    @Override
    public Collection<Identity> getIdentities();

    @Override
    public String getFirstName()
    {
        return null;
    }

    @Override
    public String getLastName()
    {
        return null;
    }
}
