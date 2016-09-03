package controller;

import controller.interfaces.ITaskController;
import model.Task;

/**
 * Created by macaque on 03.09.2016.
 */
public class TaskController implements ITaskController {


    @Override
    public void showTasks(){

    }

    @Override
    public Task addTask(){
        return null;
    }

    @Override
    public boolean removeTask(){
        return true;
    }

    @Override
    public boolean performTask() {
        return false;
    }

    @Override
    public Task takeTask() {
        return null;
    }

}
