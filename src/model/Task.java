package model;

/**
 * Created by macaque on 03.09.2016.
 */
public class Task {

    private String path;
    private String name;
    private int difficulty;

    public Task(String path, String name, int difficulty) {
        this.path = path;
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Task: " + getName() + " ,difficulty: " +
                        + getDifficulty();
    }
}
