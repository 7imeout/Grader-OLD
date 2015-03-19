
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EditMenuItems implements  MenuItemProvider {

    private ArrayList<JMenuItem> editMenuItems;

    public EditMenuItems() {
        editMenuItems = new ArrayList<JMenuItem>();
        createMenuItems();
    }
    
    private void createMenuItems(){
            editMenuItems.add(addUndoMenu());
            editMenuItems.add(addRedoMenu());
            editMenuItems.add(addCutMenu());
            editMenuItems.add(addCopyMenu());
            editMenuItems.add(addPasteMenu());
            editMenuItems.add(addDeleteMenu());
            editMenuItems.add(addFindMenu());
            editMenuItems.add(addClearMenu());
            editMenuItems.add(addFilterMenu());
            editMenuItems.add(addPreferencesMenu());
    }

    private JMenuItem addUndoMenu()
    {
        JMenuItem mnuUndo = new JMenuItem("Undo");
        mnuUndo.setMnemonic('Z');
        mnuUndo.setAccelerator(
            KeyStroke.getKeyStroke('Z', ActionEvent.CTRL_MASK));
        mnuUndo.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuUndo;
    }

    private JMenuItem addRedoMenu()
    {
        JMenuItem mnuRedo = new JMenuItem("Redo");
        mnuRedo.setMnemonic('Y');
        mnuRedo.setAccelerator(
            KeyStroke.getKeyStroke('Y', ActionEvent.CTRL_MASK));
        mnuRedo.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                ///add code here to pull up accroding menu
            }
        });

        return mnuRedo;
    }

    private JMenuItem addCutMenu()
    {
        JMenuItem mnuCut = new JMenuItem("Cut");
        mnuCut.setMnemonic('X');
        mnuCut.setAccelerator(
            KeyStroke.getKeyStroke('X', ActionEvent.CTRL_MASK));
        mnuCut.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuCut;
    }

    private JMenuItem addCopyMenu()
    {
        JMenuItem mnuCopy = new JMenuItem("Copy");
        mnuCopy.setMnemonic('C');
        mnuCopy.setAccelerator(
            KeyStroke.getKeyStroke('C', ActionEvent.CTRL_MASK));
        mnuCopy.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuCopy;
    }

    private JMenuItem addPasteMenu()
    {
        JMenuItem mnuPaste = new JMenuItem("Paste");
        mnuPaste.setMnemonic('V');
        mnuPaste.setAccelerator(
            KeyStroke.getKeyStroke('V', ActionEvent.CTRL_MASK));
        mnuPaste.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuPaste;
    }

    private JMenuItem addDeleteMenu()
    {
        JMenuItem mnuDelete = new JMenuItem("Delete");
        mnuDelete.setMnemonic('D');
        mnuDelete.setAccelerator(
            KeyStroke.getKeyStroke('D', ActionEvent.CTRL_MASK));
        mnuDelete.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuDelete;
    }

    private JMenuItem addFindMenu()
    {
        JMenuItem mnuFind = new JMenuItem("Find...");
        mnuFind.setMnemonic('F');
        mnuFind.setAccelerator(
            KeyStroke.getKeyStroke('F', ActionEvent.CTRL_MASK));
        mnuFind.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuFind;
    }

    private JMenuItem addClearMenu()
    {
        JMenuItem mnuClear = new JMenuItem("Clear");
        mnuClear.setMnemonic('R');
        mnuClear.setAccelerator(
            KeyStroke.getKeyStroke('R', ActionEvent.CTRL_MASK));
        mnuClear.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuClear;
    }

    private JMenuItem addFilterMenu()
    {
        JMenuItem mnuFilter = new JMenuItem("Filter...");
        mnuFilter.setMnemonic('T');
        mnuFilter.setAccelerator(
            KeyStroke.getKeyStroke('T', ActionEvent.CTRL_MASK));
        mnuFilter.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuFilter;
    }

    private JMenuItem addPreferencesMenu()
    {
        JMenuItem mnuPref = new JMenuItem("Preferences...");
        mnuPref.setMnemonic('P');
        mnuPref.setAccelerator(
            KeyStroke.getKeyStroke('P', ActionEvent.CTRL_MASK));
        mnuPref.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuPref;
    }

    public ArrayList<JMenuItem> getMenuItems(){
        return editMenuItems;
    }

   @Override
   public ArrayList<JMenuItem> getContextMenuItems() {
      return new ArrayList<JMenuItem>();
   }
}