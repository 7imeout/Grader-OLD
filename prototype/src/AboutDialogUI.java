import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutDialogUI extends JDialog {

    public AboutDialogUI() {
        initUI();
    }

    private final void initUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(Box.createVerticalGlue());

        panel.add(Box.createRigidArea(new Dimension(0, 0)));

        JPanel studentDeletePanel = new JPanel();
        studentDeletePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        studentDeletePanel.setLayout(new BoxLayout(studentDeletePanel, BoxLayout.X_AXIS));

        studentDeletePanel.add(new JLabel("Grader Project"));
        studentDeletePanel.add(Box.createRigidArea(new Dimension(10, 0)));

        panel.add(studentDeletePanel);


        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));



        JButton cancelButton = new JButton("Close");
        cancelButton.setBounds(0, 0, 0, 0);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        bottom.add(cancelButton);
        bottom.add(Box.createRigidArea(new Dimension(0, 0)));

        panel.add(bottom);

        setTitle("About");
        setModal(true);
        setResizable(false);
        setSize(380, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void showAboutDialogUI() {
        AboutDialogUI catFrame = new AboutDialogUI();
        catFrame.setVisible(true);
    }

}