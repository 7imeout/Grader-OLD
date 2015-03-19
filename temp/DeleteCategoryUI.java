import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class DeleteCategoryUI extends JDialog {

	public DeleteCategoryUI() {
        initUI();
	}

    private final void initUI() {
		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(Box.createVerticalGlue());

		panel.add(Box.createRigidArea(new Dimension(0, 30)));

		JPanel message1Panel = new JPanel();
        message1Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        message1Panel.setLayout(new BoxLayout(message1Panel, BoxLayout.X_AXIS));

        message1Panel.add(new JLabel(
        		"Are you sure you want to delete this category?"
        	));

        panel.add(message1Panel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JPanel message2Panel = new JPanel();
        message2Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        message2Panel.setLayout(new BoxLayout(message2Panel, BoxLayout.X_AXIS));

        message2Panel.add(new JLabel(
        		"Deleting this category will also delete all"
        	));

        message2Panel.add(Box.createRigidArea(new Dimension(35, 0)));

        panel.add(message2Panel);

        panel.add(Box.createRigidArea(new Dimension(0, 3)));

        JPanel message3Panel = new JPanel();
        message3Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        message3Panel.setLayout(new BoxLayout(message3Panel, BoxLayout.X_AXIS));

        message3Panel.add(new JLabel(
        		"subcategories, assignments, and scores."
        	));

        message3Panel.add(Box.createRigidArea(new Dimension(35, 0)));

        panel.add(message3Panel);

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton yesButton = new JButton("Yes");
		yesButton.setBounds(0, 0, 80, 30);
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   // System.exit(0);
            dispose();
			}
		});

		bottom.add(yesButton);

		JButton noButton = new JButton("No");
		noButton.setBounds(0, 0, 80, 30);
		noButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   // System.exit(0);
            dispose();
			}
		});

		panel.add(Box.createRigidArea(new Dimension(0, 15)));

		bottom.add(noButton);
		bottom.add(Box.createRigidArea(new Dimension(25, 0)));

		panel.add(bottom);

		panel.add(Box.createRigidArea(new Dimension(0, 25)));

		setTitle("Delete Category");
		setModal(true);
		setResizable(false);
		setSize(380, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showDeleteCategoryUI() {  
        DeleteCategoryUI catFrame = new DeleteCategoryUI();
        catFrame.setVisible(true);
    }
}