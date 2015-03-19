import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GraderUI extends JFrame {

   private JMenuBar menuBar;
   private JPanel masterPanel;

   public GraderUI() throws HeadlessException {
      setupFrame();
      constructMenuBar();
      constructTopLevelPanels();

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      pack();
   }

   private void setupFrame() {
      setTitle("Node Grader (Prototype)");
   }

   private void constructMenuBar() {
      menuBar = new JMenuBar();

      JMenu file = new JMenu("File");
      file.setMnemonic(KeyEvent.VK_F);
      JMenu edit = new JMenu("Edit");
      edit.setMnemonic(KeyEvent.VK_E);
      JMenu course = new JMenu("Class");
      course.setMnemonic(KeyEvent.VK_C);
      JMenu student = new JMenu("Student");
      student.setMnemonic(KeyEvent.VK_S);
      JMenu assignment = new JMenu("Assignment");
      assignment.setMnemonic(KeyEvent.VK_A);
      JMenu graph = new JMenu("Graph");
      graph.setMnemonic(KeyEvent.VK_G);
      JMenu help = new JMenu("Help");
      help.setMnemonic(KeyEvent.VK_H);

      addAllMenuItems(file, new FileMenuItems());
      addAllMenuItems(edit, new EditMenuItems());
      addAllMenuItems(course, new ClassMenuItems());
      addAllMenuItems(student, new StudentMenuItems());
      addAllMenuItems(graph, new GraphMenuItems());
      addAllMenuItems(assignment, new AssignmentMenuItems());


      menuBar.add(file);
      menuBar.add(edit);
      menuBar.add(course);
      menuBar.add(student);
      menuBar.add(assignment);
      menuBar.add(graph);
      menuBar.add(help);

      this.setJMenuBar(menuBar);
   }

   private void addAllMenuItems(JMenu menu, MenuItemProvider provider) {
      for (JMenuItem item : provider.getMenuItems()) {
         menu.add(item);
      }
   }

   private void constructTopLevelPanels() {
      masterPanel = new GraderMasterPanel();

      this.getContentPane().add(masterPanel);
   }
}