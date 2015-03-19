import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by mryu on 3/11/15.
 */
public interface MenuItemProvider {

   /**
    * Returns all menu items this provider provides.
    * @return all menu items this provider provides.
    */
   public ArrayList<JMenuItem> getMenuItems();

   /**
    * Returns all right-click context menu items this provider provides.
    * @return all right-click context menu items this provider provides.
    */
   public ArrayList<JMenuItem> getContextMenuItems();
}
