
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class ClassMenuItems implements MenuItemProvider {

    private ArrayList<JMenuItem> classMenuItems;

    public ClassMenuItems() {
        classMenuItems = new ArrayList<JMenuItem>();
        createMenuItems();
    }
    
    private void createMenuItems(){
            classMenuItems.add(addNewMenu());
            classMenuItems.add(addManageMenu());
            classMenuItems.add(addSchemeMenu());
            classMenuItems.add(addPolicyMenu());
            classMenuItems.add(addQuarterMenu());
    }

    private JMenuItem addNewMenu()
    {
        final JMenuItem mnuNew = new JMenuItem("New Class...");
        mnuNew.setMnemonic('N');
        mnuNew.setAccelerator(
            KeyStroke.getKeyStroke('N', KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK));
        mnuNew.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
               mnuNew.setEnabled(false);
               AddClassUI.showAddClassUI;
            }
        });

        return mnuNew;
    }

    private JMenuItem addManageMenu()
    {
        final JMenuItem mnuManage = new JMenuItem("Manage Class...");
        mnuManage.setMnemonic('M');
        mnuManage.setAccelerator(
            KeyStroke.getKeyStroke('M', KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK));
        mnuManage.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                ///add code here to pull up accroding menu
               mnuManage.setEnabled(false);
            }
        });

        return mnuManage;
    }

    private JMenuItem addSchemeMenu()
    {
        final JMenuItem mnuScheme = new JMenuItem("Grade Scheme...");
        mnuScheme.setMnemonic('E');
        mnuScheme.setAccelerator(
              KeyStroke.getKeyStroke('E', KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK));
        mnuScheme.addActionListener(new ActionListener() {
           // Anonymous inner classes are used here for brevity, but should be
           // named classes in production code.
           public void actionPerformed(ActionEvent e) {
              //add code here to pull up accroding menu
              mnuScheme.setEnabled(false);
           }
        });

        return mnuScheme;
    }

    private JMenuItem addPolicyMenu()
    {
        final JMenuItem mnuPolicy = new JMenuItem("Late Policy...");
        mnuPolicy.setMnemonic('P');
        mnuPolicy.setAccelerator(
            KeyStroke.getKeyStroke('P', KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK));
        mnuPolicy.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
               mnuPolicy.setEnabled(false);
            }
        });

        return mnuPolicy;
    }

    private JMenuItem addQuarterMenu()
    {
        final JMenuItem mnuQuarter = new JMenuItem("Change Quarter...");
        mnuQuarter.setMnemonic('Q');
        mnuQuarter.setAccelerator(
            KeyStroke.getKeyStroke('Q', KeyEvent.CTRL_MASK + KeyEvent.SHIFT_MASK));
        mnuQuarter.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
               mnuQuarter.setEnabled(false);
            }
        });

        return mnuQuarter;
    }


    public ArrayList<JMenuItem> getMenuItems(){
        return classMenuItems;
    }

   public ArrayList<JMenuItem> getContextMenuItems() {
      return new ArrayList<JMenuItem>();
   }
}