import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EditCategoryUI extends JDialog {

   public EditCategoryUI() {
      initUI();
   }

   private final void initUI() {
      JPanel panel = new JPanel();
      getContentPane().add(panel);

      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      panel.add(Box.createVerticalGlue());

      panel.add(Box.createRigidArea(new Dimension(0, 10)));

      JPanel categorySelectPanel = new JPanel();
      categorySelectPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
      categorySelectPanel.setLayout(new BoxLayout(categorySelectPanel, BoxLayout.X_AXIS));

      String[] categories = {"None", "Tests", "Homework", "Projects"};
      JComboBox categorySelectBox = new JComboBox(categories);
      categorySelectBox.setMaximumSize(categorySelectBox.getPreferredSize());

      JLabel categorySelectField = new JLabel("Parent Category:");
      categorySelectField.setMaximumSize(new Dimension(200, 100));

      categorySelectPanel.add(Box.createRigidArea(new Dimension(35, 0)));
      categorySelectPanel.add(categorySelectField);
      categorySelectPanel.add(categorySelectBox);
      categorySelectPanel.add(Box.createRigidArea(new Dimension(110, 0)));

      panel.add(categorySelectPanel);

      panel.add(Box.createRigidArea(new Dimension(10, 0)));

      JPanel catNamePanel = new JPanel();
      catNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
      catNamePanel.setLayout(new BoxLayout(catNamePanel, BoxLayout.X_AXIS));

      catNamePanel.add(new JLabel("Category Name:"));
      catNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

      JTextField catNameField = new JTextField(15);
      catNameField.setMaximumSize(catNameField.getPreferredSize());

      catNamePanel.add(catNameField);

      panel.add(catNamePanel);

      panel.add(Box.createRigidArea(new Dimension(0, 10)));

      JPanel weightPanel = new JPanel();
      weightPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
      weightPanel.setLayout(new BoxLayout(weightPanel, BoxLayout.X_AXIS));

      weightPanel.add(Box.createRigidArea(new Dimension(53, 0)));
      weightPanel.add(new JLabel("Weight:"));
      weightPanel.add(Box.createRigidArea(new Dimension(10, 0)));

      JTextField weightField = new JTextField(15);
      weightField.setMaximumSize(weightField.getPreferredSize());

      weightPanel.add(weightField);

      panel.add(weightPanel);

      JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

      JButton saveChangesButton = new JButton("Save Changes");
      saveChangesButton.setBounds(0, 0, 80, 30);
      saveChangesButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            dispose();
         }
      });

      bottom.add(saveChangesButton);

      JButton cancelButton = new JButton("Cancel");
      cancelButton.setBounds(0, 0, 80, 30);
      cancelButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            dispose();
         }
      });

      panel.add(Box.createRigidArea(new Dimension(0, 15)));

      bottom.add(cancelButton);
      bottom.add(Box.createRigidArea(new Dimension(25, 0)));

      panel.add(bottom);

      setTitle("Edit Category");
      setModal(true);
      setResizable(false);
      setSize(380, 190);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }

   public static void showEditCategoryUI() {
      EditCategoryUI catFrame = new EditCategoryUI();
      catFrame.setVisible(true);
   }
}