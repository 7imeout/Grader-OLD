/**
 * This is a simple driver for the GraderUI prototype.  All it has is a
 * main method that constructs the top-level GUI, and calls setVisible(true) on
 * it.  This is the standard way that GUI windows are brought up on the screen.
 */
public class GraderAppMain {

   /**
    * Construct a CalendarToolUI and make it visible.
    */
   public static void main(String[] args) {
      new GraderUI().setVisible(true);
   }

}