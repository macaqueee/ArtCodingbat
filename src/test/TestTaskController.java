package test;

import controller.TaskController;
import db.DataContainer;
import model.Task;

/**
 * Created by macaque on 03.09.2016.
 */
public class TestTaskController {

    public static void main(String[] args) {
        DataContainer dataContainer = new DataContainer();


        TaskController testTaskController = new TaskController(dataContainer);
        testTaskController.showTasks();
        Task task = testTaskController.takeTask(0);


    }
}
