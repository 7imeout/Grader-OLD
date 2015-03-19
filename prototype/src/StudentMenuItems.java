
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentMenuItems implements MenuItemProvider {

    private ArrayList<JMenuItem> studentMenuItems;

    public StudentMenuItems() {
        studentMenuItems = new ArrayList<JMenuItem>();
        createMenuItems();
    }
    
    private void createMenuItems(){
       studentMenuItems.add(addNewStudentMenu());
       studentMenuItems.add(addGroupStudentsMenu());
       studentMenuItems.add(addManageStudentsMenu());
       studentMenuItems.add(addDeleteStudentMenu());
       studentMenuItems.add(addSynchronizeMenu());
    }

    private JMenuItem addNewStudentMenu()
    {
        JMenuItem mnuNewStudent = new JMenuItem("New Student");
        mnuNewStudent.setMnemonic('N');
        mnuNewStudent.setAccelerator(
            KeyStroke.getKeyStroke('N', ActionEvent.ALT_MASK));
        mnuNewStudent.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                AddStudentUI.showAddStudentUI();
            }
        });

        return mnuNewStudent;
    }

    private JMenuItem addGroupStudentsMenu()
    {
        JMenuItem mnuGroupStudents = new JMenuItem("Group Students");
        mnuGroupStudents.setMnemonic('G');
        mnuGroupStudents.setAccelerator(
            KeyStroke.getKeyStroke('G', ActionEvent.ALT_MASK));
        mnuGroupStudents.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                ///add code here to pull up accroding menu
            }
        });

        return mnuGroupStudents;
    }

    private JMenuItem addManageStudentsMenu()
    {
        JMenuItem mnuManageStudents = new JMenuItem("Manage Students");
        mnuManageStudents.setMnemonic('M');
        mnuManageStudents.setAccelerator(
            KeyStroke.getKeyStroke('M', ActionEvent.ALT_MASK));
        mnuManageStudents.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                ModifyStudentUI.showAddStudentUI();
            }
        });

        return mnuManageStudents;
    }

    private JMenuItem addDeleteStudentMenu()
    {
        JMenuItem mnuDeleteStudent = new JMenuItem("Delete Student");
        mnuDeleteStudent.setMnemonic('D');
        mnuDeleteStudent.setAccelerator(
            KeyStroke.getKeyStroke('D', ActionEvent.ALT_MASK));
        mnuDeleteStudent.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                DeleteStudentUI.showDeleteStudentUI();
            }
        });

        return mnuDeleteStudent;
    }

    private JMenuItem addSynchronizeMenu()
    {
        JMenuItem mnuSynchronize = new JMenuItem("Synchronize Roster");
        mnuSynchronize.setMnemonic('Y');
        mnuSynchronize.setAccelerator(
            KeyStroke.getKeyStroke('Y', ActionEvent.ALT_MASK));
        mnuSynchronize.addActionListener(new ActionListener()
        {
            // Anonymous inner classes are used here for brevity, but should be
            // named classes in production code.
            public void actionPerformed(ActionEvent e)
            {
                //add code here to pull up accroding menu
            }
        });

        return mnuSynchronize;
    }

    

    public ArrayList<JMenuItem> getMenuItems(){
        return studentMenuItems;
    }
}