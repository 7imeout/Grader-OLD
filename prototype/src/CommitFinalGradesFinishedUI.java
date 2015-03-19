import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   

public class CommitFinalGradesFinishedUI extends JDialog {

	public CommitFinalGradesFinishedUI() {
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
        		"Final have been submitted"
        	));

        panel.add(message1Panel);

        panel.add(Box.createRigidArea(new Dimension(0, 3)));

     

        

        

		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton yesButton = new JButton("OK");
		yesButton.setBounds(0, 0, 80, 30);
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			   // System.exit(0);
            dispose();
			}
		});

		bottom.add(yesButton);

		

		panel.add(bottom);

		panel.add(Box.createRigidArea(new Dimension(0, 25)));

		setTitle("Submitted");
		setModal(true);
		setResizable(false);
		setSize(380, 190);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showFinished() {  
        CommitFinalGradesFinishedUI catFrame = new CommitFinalGradesFinishedUI();
        catFrame.setVisible(true);
    }
}