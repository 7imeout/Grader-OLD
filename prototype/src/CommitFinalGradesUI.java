import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class CommitFinalGradesUI extends JDialog {

	public CommitFinalGradesUI() {
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
        		"Submit final grades to school's registrar?"
        	));

        panel.add(message1Panel);

        panel.add(Box.createRigidArea(new Dimension(0, 3)));


		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton yesButton = new JButton("Yes");
		yesButton.setBounds(0, 0, 80, 30);
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			
        	CommitFinalGradesFinishedUI.showFinished();
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
		

		panel.add(bottom);

		panel.add(Box.createRigidArea(new Dimension(0, 25)));

		setTitle("Commit Final Grades");
		setModal(true);
		setResizable(false);
		setSize(380, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showCommitFinalGradesUI() {
        CommitFinalGradesUI catFrame = new CommitFinalGradesUI();
        catFrame.setVisible(true);
    }
}