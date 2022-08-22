package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.ToDoItemTask;

import java.util.Collection;

public interface ToDoItemTaskDAO {
    public ToDoItemTask persist(ToDoItemTask toDoItemTask);
    public ToDoItemTask findById(int id);
    public Collection<ToDoItemTask> findAll();
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status);
    public Collection<ToDoItemTask> findByPersonId(int personId);
    public void remove(int id);

}
