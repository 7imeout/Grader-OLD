import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class AddClassUI extends JDialog {

	public AddClassUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel classNamePanel = new JPanel();
        classNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        classNamePanel.setLayout(new BoxLayout(classNamePanel, BoxLayout.X_AXIS));

        classNamePanel.add(new JLabel("Class Name:"));
        classNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField classNameField = new JTextField(15);
        classNameField.setMaximumSize(classNameField.getPreferredSize());

        classNamePanel.add(classNameField);

        panel.add(classNamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addClassButton = new JButton("Create Spreadsheet");
		addClassButton.setBounds(0, 0, 80, 30);
		addClassButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   dispose();
			}
		});

		bottom.add(addClassButton);

		bottom.add(Box.createRigidArea(new Dimension(28, 0)));

		panel.add(bottom);

		setTitle("New Class");
		setModal(true);
		setResizable(false);
		setSize(380, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showAddClassUI() {  
        AddClassUI catFrame = new AddClassUI();
        catFrame.setVisible(true);
    }

}