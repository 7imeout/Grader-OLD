package edit;

/**
 * Encapsulates undo and redo operations that undoes or redoes user's command
 * stored in <code><strong>CommandHistory</strong></code>.
 */
public abstract class UndoRedo {
   /**
    * Undoes one latest user command.
    */
   public abstract void undo();

   /**
    * Redoes one latest undone command.
    */
   public abstract void redo();
}
