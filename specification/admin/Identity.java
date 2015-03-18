package admin;

/**
 * Represents a login name (i.e. a Cal Poly username), and its domain (i.e. Cal Poly).
 */
public abstract class Identity {
    
    /**
     * The login name (i.e. a Cal Poly username)
     */
   String name;

    /**
     * The domain for this identity (i.e. Cal Poly)
     */
   String domain;
}
