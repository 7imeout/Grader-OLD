
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FileMenuItems implements MenuItemProvider {

   private ArrayList<JMenuItem> fileMenuItems;

   public FileMenuItems() {
      fileMenuItems = new ArrayList<JMenuItem>();
      createMenuItems();
   }

   private void createMenuItems() {
      fileMenuItems.add(addSaveMenu());
      fileMenuItems.add(addPublishMenu());
      fileMenuItems.add(addCommitMenu());
   }

   private JMenuItem addSaveMenu() {
      JMenuItem mnuSave = new JMenuItem("Save");
      mnuSave.setMnemonic('S');
      mnuSave.setAccelerator(
            KeyStroke.getKeyStroke('S', ActionEvent.ALT_MASK));
      mnuSave.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            //add code here to pull up accroding menu
         }
      });

      return mnuSave;
   }

   private JMenuItem addPublishMenu() {
      JMenuItem mnuPublish = new JMenuItem("Publish Student View...");
      mnuPublish.setMnemonic('P');
      mnuPublish.setAccelerator(
            KeyStroke.getKeyStroke('P', ActionEvent.ALT_MASK));
      mnuPublish.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
         }
      });

      return mnuPublish;
   }

   private JMenuItem addCommitMenu() {
      JMenuItem mnuCommit = new JMenuItem("Commit Final Grades...");
      mnuCommit.setMnemonic('C');
      mnuCommit.setAccelerator(
            KeyStroke.getKeyStroke('C', ActionEvent.ALT_MASK));
      mnuCommit.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
             CommitFinalGradesUI.showCommitFinalGradesUI();
         }
      });

      return mnuCommit;
   }


   public ArrayList<JMenuItem> getMenuItems() {
      return fileMenuItems;
   }

   public ArrayList<JMenuItem> getContextMenuItems() {
      return new ArrayList<JMenuItem>();
   }
}