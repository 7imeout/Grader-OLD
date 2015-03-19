import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class FilterUI extends JDialog {

	public FilterUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue());

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel studentPanel = new JPanel();
        studentPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentPanel.setLayout(new BoxLayout(studentPanel, BoxLayout.X_AXIS));

        studentPanel.add(new JLabel("Student"));
        studentPanel.add(Box.createRigidArea(new Dimension(15, 0)));

        JCheckBox studentField = new JCheckBox();
        studentField.setSelected(true);
        studentField.setMaximumSize(studentField.getPreferredSize());

        studentPanel.add(studentField);

        panel.add(studentPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel studentNamePanel = new JPanel();
        studentNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentNamePanel.setLayout(new BoxLayout(studentNamePanel, BoxLayout.X_AXIS));

        studentNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        studentNamePanel.add(new JLabel("Student Name"));
        studentNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox studentNameField = new JCheckBox();
        studentNameField.setSelected(true);
        studentNameField.setMaximumSize(studentNameField.getPreferredSize());

        studentNamePanel.add(studentNameField);

        panel.add(studentNamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel emplPanel = new JPanel();
        emplPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emplPanel.setLayout(new BoxLayout(emplPanel, BoxLayout.X_AXIS));

        emplPanel.add(Box.createRigidArea(new Dimension(32, 0)));
        emplPanel.add(new JLabel("Student ID"));
        emplPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox emplField = new JCheckBox();
        emplField.setSelected(true);
        emplField.setMaximumSize(emplField.getPreferredSize());

        emplPanel.add(emplField);

        panel.add(emplPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel categoryPanel = new JPanel();
        categoryPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        categoryPanel.setLayout(new BoxLayout(categoryPanel, BoxLayout.X_AXIS));

        categoryPanel.add(new JLabel("Category"));
        categoryPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox categoryField = new JCheckBox();
        categoryField.setSelected(true);
        categoryField.setMaximumSize(categoryField.getPreferredSize());

        categoryPanel.add(categoryField);

        panel.add(categoryPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel gradePanel = new JPanel();
        gradePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        gradePanel.setLayout(new BoxLayout(gradePanel, BoxLayout.X_AXIS));

        gradePanel.add(Box.createRigidArea(new Dimension(13, 0)));
        gradePanel.add(new JLabel("Grades"));
        gradePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox gradeField = new JCheckBox();
        gradeField.setSelected(true);
        gradeField.setMaximumSize(gradeField.getPreferredSize());

        gradePanel.add(gradeField);

        panel.add(gradePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel rawPanel = new JPanel();
        rawPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        rawPanel.setLayout(new BoxLayout(rawPanel, BoxLayout.X_AXIS));

        rawPanel.add(Box.createRigidArea(new Dimension(37, 0)));
        rawPanel.add(new JLabel("Raw Score"));
        rawPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox rawField = new JCheckBox();
        rawField.setSelected(true);
        rawField.setMaximumSize(rawField.getPreferredSize());

        rawPanel.add(rawField);

        panel.add(rawPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel letterPanel = new JPanel();
        letterPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        letterPanel.setLayout(new BoxLayout(letterPanel, BoxLayout.X_AXIS));

        letterPanel.add(Box.createRigidArea(new Dimension(26, 0)));
        letterPanel.add(new JLabel("Letter Grade"));
        letterPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JCheckBox letterField = new JCheckBox();
        letterField.setSelected(true);
        letterField.setMaximumSize(letterField.getPreferredSize());

        letterPanel.add(letterField);

        panel.add(letterPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addStudentButton = new JButton("Confirm");
        addStudentButton.setBounds(0, 0, 80, 30);
        addStudentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               // System.exit(0);
            dispose();
            }
        });

        bottom.add(addStudentButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(0, 0, 80, 30);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               // System.exit(0);
            dispose();
            }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        bottom.add(cancelButton);
        bottom.add(Box.createRigidArea(new Dimension(28, 0)));

        panel.add(bottom);

        setTitle("Filter");
        setModal(true);
        setResizable(false);
        setSize(300, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showFilterUI() {  
        FilterUI catFrame = new FilterUI();
        catFrame.setVisible(true);
    }

}