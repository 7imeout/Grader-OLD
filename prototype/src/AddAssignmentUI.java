import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class AddAssignmentUI extends JDialog {

	public AddAssignmentUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel catNamePanel = new JPanel();
        catNamePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        catNamePanel.setLayout(new BoxLayout(catNamePanel, BoxLayout.X_AXIS));

        catNamePanel.add(new JLabel("Assignment Name:"));
        catNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField catNameField = new JTextField(15);
        catNameField.setMaximumSize(catNameField.getPreferredSize());

        catNamePanel.add(catNameField);

        panel.add(catNamePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel weightPanel = new JPanel();
        weightPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        weightPanel.setLayout(new BoxLayout(weightPanel, BoxLayout.X_AXIS));

        weightPanel.add(Box.createRigidArea(new Dimension(72, 0)));
        weightPanel.add(new JLabel("Weight:"));
        weightPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField weightField = new JTextField(15);
        weightField.setMaximumSize(weightField.getPreferredSize());

        weightPanel.add(weightField);

        panel.add(weightPanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel totalScorePanel = new JPanel();
        totalScorePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        totalScorePanel.setLayout(new BoxLayout(totalScorePanel, BoxLayout.X_AXIS));

        totalScorePanel.add(Box.createRigidArea(new Dimension(45, 0)));
        totalScorePanel.add(new JLabel("Total Score:"));
        totalScorePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        JTextField totalScoreField = new JTextField(15);
        totalScoreField.setMaximumSize(totalScoreField.getPreferredSize());

        totalScorePanel.add(totalScoreField);

        panel.add(totalScorePanel);

        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel catDropPanel = new JPanel();
        catDropPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        catDropPanel.setLayout(new BoxLayout(catDropPanel, BoxLayout.X_AXIS));

        catDropPanel.add(Box.createRigidArea(new Dimension(62, 0)));
        catDropPanel.add(new JLabel("Category:"));
        catDropPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] items = {"","Projects", "Tests", "Homework"};

        JComboBox catDropBox = new JComboBox(items);

        catDropBox.setMaximumSize(new Dimension(198, 30));

        catDropPanel.add(catDropBox);

        panel.add(catDropPanel);

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton addCatButton = new JButton("Add Assignment");
		addCatButton.setBounds(0, 0, 80, 30);
		addCatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   dispose();
			}
		});

		bottom.add(addCatButton);

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

		setTitle("New Assignment");
		setModal(true);
		setResizable(false);
		setSize(450, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showAddAssignmentUI() {
        AddAssignmentUI addAsgnFrame = new AddAssignmentUI();
        addAsgnFrame.setVisible(true);
    }
}