package db;

import model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macaque on 03.09.2016.
 */
public class DataFactory {



    public static List<Task> fillTasks (){

        Task task1 = new Task("src/resources/Task1/origin/task1.java","Task1",5);
        Task task2 = new Task("src/resources/Task2/origin/task2.java","Task2",4);
        Task task3 = new Task("src/resources/Task3/origin/task3.java","Task3",2);

        List<Task> listTasks = new ArrayList<>();
        listTasks.add(task1);
        listTasks.add(task2);
        listTasks.add(task3);

        return listTasks;
    }
}
