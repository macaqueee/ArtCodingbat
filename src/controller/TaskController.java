package controller;

import controller.interfaces.ITaskController;
import db.DataContainer;
import model.Task;
import utils.cmd.ShellExecution;

import java.io.File;
import java.io.IOException;

/**
 * Created by macaque on 03.09.2016.
 */
public class TaskController implements ITaskController {

    private DataContainer dataContainer;
    private final String COPY_PATH = "src/resources/";

    public TaskController(DataContainer dataContainer) {
        this.dataContainer = dataContainer;
    }

    @Override
    public void showTasks(){
        for (Task task : dataContainer.getTasks() ) {
            System.out.println(task.toString());
        }

    }

    @Override
    public Task takeTask(int taskNum) {
        Task task = dataContainer.getTasks().get(taskNum);
        File taskFile = new File(task.getPath());
        File copyTaskFile = new File(COPY_PATH + task.getName() + "/copy/copy" + task.getName() +".java");

        try {
            FileController.makeFilesCopy(taskFile, copyTaskFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return task;
    }

    @Override
    public boolean performTask(String path) {
        String command = "javac " + path;
        String result = ShellExecution.executeCommand(command);
        System.out.println(result);
        return true;
    }

    @Override
    public Task addTask(){
        return null;
    }

    @Override
    public boolean removeTask(){
        return true;
    }

}
