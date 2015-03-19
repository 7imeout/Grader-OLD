
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HelpMenuItems implements MenuItemProvider {

    private ArrayList<JMenuItem> helpMenuItems;

    public HelpMenuItems() {
        helpMenuItems = new ArrayList<JMenuItem>();
        createMenuItems();
    }

    private void createMenuItems(){
        studentMenuItems.add(aboutMenu());
    }

    private JMenuItem aboutMenu()
    {
        JMenuItem mnuAbout = new JMenuItem("About");
        mnuAbout.setMnemonic('N');
        mnuAbout.setAccelerator(
                KeyStroke.getKeyStroke('N', ActionEvent.ALT_MASK));
        mnuAbout.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                AboutDialogUI.showAboutDialogUI();
            }
        });

        return mnuAbout;
    }


    public ArrayList<JMenuItem> getMenuItems(){
        return helpMenuItems;
    }
}