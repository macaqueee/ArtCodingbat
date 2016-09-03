package db;

import model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macaque on 03.09.2016.
 */
public class DataContainer {

    private List<Task> database = DataFactory.fillTasks();

    public DataContainer() {
    }

    public List<Task> getTasks(){
        return database;
    }
}
