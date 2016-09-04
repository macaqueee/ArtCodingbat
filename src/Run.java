import controller.TaskController;
import db.DataContainer;
import menu.console.Menu;

/**
 * Created by macaque on 03.09.2016.
 */
public class Run {

    public static void main(String[] args) {
        DataContainer dataContainer = new DataContainer();
        TaskController testTaskController = new TaskController(dataContainer);
        Menu menu = new Menu(testTaskController);

        menu.runMenu();
    }
}
