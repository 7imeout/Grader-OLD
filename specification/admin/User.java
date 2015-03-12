package admin;

import util.GraderObject;

import java.util.Collection;

/**
 * An identifiable human granted a Role in the Grader Application.
 */
public abstract class User implements GraderObject {

   /**
    * ID number for the <code>User</code>.
    */
   String id;

   /**
    * Collection of every <code>Identity</code> held users in the Course.
    */
   Collection<Identity> identities;

   /**
    * First name of the <code>User</code>.
    */
   String firstName;

   /**
    * Last name of the <code>User</code>.
    */
   String lastName;

   /**
    * Accessor for an <code>Identity</code> for this <code>User</code>.
    * @return <code>Identity</code> for this <code>User</code>.

     pre: id != null &&
        identities.contains(id)
     post:
        (id' == id)
    */
   abstract String getId();

   /**
    * Accessor for every <code>Identity</code> for this <code>User</code>.
    * @return <code>Identity</code> Collection for this <code>User</code>.

      pre: identities != null
      post:
         (id' == id)
    */
   abstract Collection<Identity> getIdentities();

   /**
    * Accessor for the <code>firstName</code> for this <code>User</code>.
    * @return <code>firstName</code> of this <code>User</code>.

      pre: firstName != null
      post:
         (id' == id)
    */
   abstract String getFirstName();

   /**
    * Accessor for the <code>lastName</code> for this <code>User</code>.
    * @return <code>lastName</code> of this <code>User</code>.

      pre: lastName != null
      post:
         (id' == id)
    */
   abstract String getLastName();
}