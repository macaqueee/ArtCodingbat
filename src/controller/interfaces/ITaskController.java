package controller.interfaces;

import model.Task;

/**
 * Created by macaque on 03.09.2016.
 */
public interface ITaskController {

    void showTasks();
    Task addTask();
    boolean removeTask();
    boolean performTask();
    Task takeTask();
}
