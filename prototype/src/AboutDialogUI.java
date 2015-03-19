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

        JPanel aboutPanel = new JPanel();
        aboutPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        aboutPanel.setLayout(new BoxLayout(aboutPanel, BoxLayout.X_AXIS));

        aboutPanel.add(new JLabel("Grader Project"));
        aboutPanel.add(Box.createRigidArea(new Dimension(10, 0)));

        panel.add(aboutPanel);


        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));



        JButton closeButton = new JButton("Close");
        closeButton.setBounds(0, 0, 0, 0);
        closeButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
              dispose();
           }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        bottom.add(closeButton);
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