import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GraphMenuItems implements MenuItemProvider {

   private ArrayList<JMenuItem> graphMenuItems;

   public GraphMenuItems() {
      graphMenuItems = new ArrayList<JMenuItem>();
      createMenuItems();
   }

   private void createMenuItems() {
      graphMenuItems.add(addHistographMenu());
      graphMenuItems.add(addPieChartMenu());
   }

   private JMenuItem addHistographMenu() {
      final JMenuItem mnuHistograph = new JMenuItem("Histogram");
      mnuHistograph.setMnemonic('H');
      mnuHistograph.setAccelerator(
            KeyStroke.getKeyStroke('H', ActionEvent.ALT_MASK));
      mnuHistograph.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            //add code here to pull up accroding menu
            System.out.println("Histogram Clicked");
         }
      });

      return mnuHistograph;
   }

   private JMenuItem addPieChartMenu() {
      final JMenuItem mnuPieChart = new JMenuItem("Pie Chart");
      mnuPieChart.setMnemonic('P');
      mnuPieChart.setAccelerator(
            KeyStroke.getKeyStroke('P', ActionEvent.ALT_MASK));
      mnuPieChart.addActionListener(new ActionListener() {
         // Anonymous inner classes are used here for brevity, but should be
         // named classes in production code.
         public void actionPerformed(ActionEvent e) {
            ///add code here to pull up accroding menu
            System.out.println("Pie Chart Clicked");
         }
      });

      return mnuPieChart;
   }


   public ArrayList<JMenuItem> getMenuItems() {
      return graphMenuItems;
   }

   public ArrayList<JMenuItem> getContextMenuItems() {
      return new ArrayList<JMenuItem>();
   }
}