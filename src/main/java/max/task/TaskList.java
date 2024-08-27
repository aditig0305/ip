package max.task;

import max.exception.MaxException;
import max.task.Task;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> storedTasks;

    public TaskList(ArrayList<Task> al) {
        storedTasks = al;
    }

    public TaskList() {
        storedTasks = new ArrayList<>();
    }

    public void deleteTask(int index) throws MaxException {
        if (index >= storedTasks.size() || index < 0) {
            throw new MaxException("This task does not exist! Deletion unsuccessful.");
        }
        storedTasks.remove(index);
    }

    public int getSize() {
        return storedTasks.size();
    }

    public void addTask(Task task) {
        storedTasks.add(task);
    }

    public Task getTask(int index) {
        return storedTasks.get(index);
    }

    public ArrayList<Task> getTasks() {
        return storedTasks;
    }

    public ArrayList<Task> find(String toFind) {
        ArrayList<Task> filteredTasks = new ArrayList<>();
        for (Task t : storedTasks) {
            if (t.getDescription().contains(toFind)) {
                filteredTasks.add(t);
            }
        }
        return filteredTasks;
    }
}
