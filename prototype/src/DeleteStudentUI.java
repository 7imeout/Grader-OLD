import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class DeleteStudentUI extends JDialog {

	public DeleteStudentUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel studentDeletePanel = new JPanel();
        studentDeletePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentDeletePanel.setLayout(new BoxLayout(studentDeletePanel, BoxLayout.X_AXIS));

        studentDeletePanel.add(new JLabel("Are you sure you want to delete this student?"));
        studentDeletePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        panel.add(studentDeletePanel);

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addStudentButton = new JButton("Confirm");
		addStudentButton.setBounds(0, 0, 80, 30);
		addStudentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
            dispose();
			}
		});

		bottom.add(addStudentButton);

		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(0, 0, 80, 30);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
            dispose();
			}
		});

		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		bottom.add(cancelButton);
		bottom.add(Box.createRigidArea(new Dimension(28, 0)));

		panel.add(bottom);

		setTitle("Delete Student");
		setModal(true);
		setResizable(false);
		setSize(380, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showDeleteStudentUI() {
        DeleteStudentUI catFrame = new DeleteStudentUI();
        catFrame.setVisible(true);
    }
}