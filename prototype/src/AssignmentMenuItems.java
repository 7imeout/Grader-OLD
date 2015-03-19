
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.ArrayList;

public class AssignmentMenuItems implements MenuItemProvider {

   private ArrayList<JMenuItem> assignmentMenuItems;

   private ArrayList<JMenuItem> categoryContextMenuItems;
   private ArrayList<JMenuItem> assignmentContextMenuItems;

   public AssignmentMenuItems() {
      assignmentMenuItems = new ArrayList<JMenuItem>();

      categoryContextMenuItems = new ArrayList<JMenuItem>();
      assignmentContextMenuItems = new ArrayList<JMenuItem>();
      createMenuItems();
   }

   private void createMenuItems() {
      assignmentMenuItems.add(addNewAssignmentMenu());
      assignmentMenuItems.add(addNewAssignmentCatMenu());
      assignmentMenuItems.add(addDeleteAssignmentCatMenu());
      assignmentMenuItems.add(addEditAssignmentCatMenu());
      assignmentMenuItems.add(addSubmitAssignmentMenu());

      categoryContextMenuItems.add(addEditAssignmentCatMenu());
      categoryContextMenuItems.add(addDeleteAssignmentCatMenu());

      assignmentContextMenuItems.add(addEditAssignmentMenu());
      assignmentContextMenuItems.add(addDeleteAssignmentMenu());
   }

   private JMenuItem addNewAssignmentMenu() {
      final JMenuItem mnuNewAssignment = new JMenuItem("New Assignment ...");
      mnuNewAssignment.setMnemonic('A');
      mnuNewAssignment.setAccelerator(
            KeyStroke.getKeyStroke('A', ActionEvent.ALT_MASK));
      mnuNewAssignment.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            //add code here to pull up accroding menu
            mnuNewAssignment.setEnabled(false);
         }
      });

      return mnuNewAssignment;
   }

   private JMenuItem addNewAssignmentCatMenu() {
      JMenuItem mnuNewAssignmentCat = new JMenuItem("New Category ...");
      mnuNewAssignmentCat.setMnemonic('C');
      mnuNewAssignmentCat.setAccelerator(
            KeyStroke.getKeyStroke('C', ActionEvent.ALT_MASK));
      mnuNewAssignmentCat.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            AddCategoryUI.showAddCategoryUI();
         }
      });

      return mnuNewAssignmentCat;
   }

   private JMenuItem addDeleteAssignmentMenu() {
      JMenuItem mnuDeleteAssCat = new JMenuItem("Delete Assignment");
      mnuDeleteAssCat.setMnemonic('D');
      mnuDeleteAssCat.setAccelerator(
            KeyStroke.getKeyStroke('D', ActionEvent.ALT_MASK));
      mnuDeleteAssCat.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            DeleteAssignmentUI.showDeleteAssignmentUI();
         }
      });

      return mnuDeleteAssCat;
   }

   private JMenuItem addEditAssignmentMenu() {
      JMenuItem mnuEditAssCat = new JMenuItem("Edit Assignment ...");
      mnuEditAssCat.setMnemonic('K');
      mnuEditAssCat.setAccelerator(
            KeyStroke.getKeyStroke('K', ActionEvent.ALT_MASK));
      mnuEditAssCat.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu

         }
      });

      return mnuEditAssCat;
   }

   private JMenuItem addDeleteAssignmentCatMenu() {
      JMenuItem mnuDeleteAssCat = new JMenuItem("Delete Selected Category");
      mnuDeleteAssCat.setMnemonic('D');
      mnuDeleteAssCat.setAccelerator(
            KeyStroke.getKeyStroke('D', InputEvent.ALT_MASK +
                  InputEvent.CTRL_MASK));
      mnuDeleteAssCat.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            DeleteCategoryUI.showDeleteCategoryUI();
         }
      });

      return mnuDeleteAssCat;
   }

   private JMenuItem addEditAssignmentCatMenu() {
      JMenuItem mnuEditAssCat = new JMenuItem("Edit Category ...");
      mnuEditAssCat.setMnemonic('K');
      mnuEditAssCat.setAccelerator(
            KeyStroke.getKeyStroke('K', InputEvent.ALT_MASK +
                  InputEvent.CTRL_MASK));
      mnuEditAssCat.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            EditCategoryUI.showEditCategoryUI();
         }
      });

      return mnuEditAssCat;
   }

   private JMenuItem addSubmitAssignmentMenu() {
      final JMenuItem mnuSubmitAssignment = new JMenuItem("Submit Assignment ...");
      mnuSubmitAssignment.setMnemonic('M');
      mnuSubmitAssignment.setAccelerator(
            KeyStroke.getKeyStroke('M', ActionEvent.ALT_MASK));
      mnuSubmitAssignment.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            //add code here to pull up accroding menu
            mnuSubmitAssignment.setEnabled(false);
         }
      });

      return mnuSubmitAssignment;
   }


   public ArrayList<JMenuItem> getMenuItems() {
      return assignmentMenuItems;
   }

   public ArrayList<JMenuItem> getCategoryContextMenuItems() {
      return categoryContextMenuItems;
   }

   public ArrayList<JMenuItem> getContextMenuItems() {
      return assignmentContextMenuItems;
   }
}