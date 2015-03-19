import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class AddStudentUI extends JDialog {

	public AddStudentUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel studentNamePanel = new JPanel();
        studentNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentNamePanel.setLayout(new BoxLayout(studentNamePanel, BoxLayout.X_AXIS));

        studentNamePanel.add(new JLabel("Student Name:"));
        studentNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField studentNameField = new JTextField(15);
        studentNameField.setMaximumSize(studentNameField.getPreferredSize());

        studentNamePanel.add(studentNameField);

        panel.add(studentNamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel emplPanel = new JPanel();
        emplPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        emplPanel.setLayout(new BoxLayout(emplPanel, BoxLayout.X_AXIS));

        emplPanel.add(Box.createRigidArea(new Dimension(38, 0)));
        emplPanel.add(new JLabel("EMPL ID:"));
        emplPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField emplField = new JTextField(15);
        emplField.setMaximumSize(emplField.getPreferredSize());

        emplPanel.add(emplField);

        panel.add(emplPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel studentNicknamePanel = new JPanel();
        studentNicknamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentNicknamePanel.setLayout(new BoxLayout(studentNicknamePanel, BoxLayout.X_AXIS));

        studentNicknamePanel.add(Box.createRigidArea(new Dimension(26, 0)));
        studentNicknamePanel.add(new JLabel("Nickname:"));
        studentNicknamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField studentNicknameField = new JTextField(15);
        studentNicknameField.setMaximumSize(studentNicknameField.getPreferredSize());

        studentNicknamePanel.add(studentNicknameField);

        panel.add(studentNicknamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel studentGroupPanel = new JPanel();
        studentGroupPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentGroupPanel.setLayout(new BoxLayout(studentGroupPanel, BoxLayout.X_AXIS));

        studentGroupPanel.add(Box.createRigidArea(new Dimension(51, 0)));
        studentGroupPanel.add(new JLabel("Group:"));
        studentGroupPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField studentGroupField = new JTextField(15);
        studentGroupField.setMaximumSize(studentGroupField.getPreferredSize());

        studentGroupPanel.add(studentGroupField);

        panel.add(studentGroupPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel studentEmailPanel = new JPanel();
        studentEmailPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentEmailPanel.setLayout(new BoxLayout(studentEmailPanel, BoxLayout.X_AXIS));

        studentEmailPanel.add(Box.createRigidArea(new Dimension(55, 0)));
        studentEmailPanel.add(new JLabel("Email:"));
        studentEmailPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField studentEmailField = new JTextField(15);
        studentEmailField.setMaximumSize(studentEmailField.getPreferredSize());

        studentEmailPanel.add(studentEmailField);

        panel.add(studentEmailPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel studentPhonePanel = new JPanel();
        studentPhonePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentPhonePanel.setLayout(new BoxLayout(studentPhonePanel, BoxLayout.X_AXIS));

        studentPhonePanel.add(Box.createRigidArea(new Dimension(52, 0)));
        studentPhonePanel.add(new JLabel("Phone:"));
        studentPhonePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField studentPhoneField = new JTextField(15);
        studentPhoneField.setMaximumSize(studentPhoneField.getPreferredSize());

        studentPhonePanel.add(studentPhoneField);

        panel.add(studentPhonePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addStudentButton = new JButton("Add Student");
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

		setTitle("New Student");
		setModal(true);
		setResizable(false);
		setSize(380, 380);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showAddStudentUI() {  
        AddStudentUI catFrame = new AddStudentUI();
        catFrame.setVisible(true);
    }
}