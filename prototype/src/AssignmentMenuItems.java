
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AssignmentMenuItems implements MenuItemProvider {

   private ArrayList<JMenuItem> assignmentMenuItems;

   public AssignmentMenuItems() {
      assignmentMenuItems = new ArrayList<JMenuItem>();
      createMenuItems();
   }

   private void createMenuItems() {
      assignmentMenuItems.add(addNewAssignmentMenu());
      assignmentMenuItems.add(addNewAssignmentCatMenu());
      assignmentMenuItems.add(addDeleteAssignmentCatMenu());
      assignmentMenuItems.add(addEditAssignmentCatMenu());
      assignmentMenuItems.add(addSubmitAssignmentMenu());
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

   private JMenuItem addDeleteAssignmentCatMenu() {
      JMenuItem mnuDeleteAssCat = new JMenuItem("Delete Selected Category");
      mnuDeleteAssCat.setMnemonic('D');
      mnuDeleteAssCat.setAccelerator(
            KeyStroke.getKeyStroke('D', ActionEvent.ALT_MASK));
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
            KeyStroke.getKeyStroke('K', ActionEvent.ALT_MASK));
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
}