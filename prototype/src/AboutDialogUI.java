import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutDialogUI extends JDialog {

    public static void showAboutDialogUI() {
       JOptionPane.showMessageDialog(null,
             "Grader Project GUI Prototype\n\n" +
                   "Team Node --\n\n" +
                   "Matt Bleifer\n" +
                   "Grant Campanelli\n" +
                   "Michael Murphy\n" +
                   "Mike Ryu\n" +
                   "Grant Plaster\n" +
                   "Scotty Beauchamp\n", "About",
             JOptionPane.INFORMATION_MESSAGE);
    }

}