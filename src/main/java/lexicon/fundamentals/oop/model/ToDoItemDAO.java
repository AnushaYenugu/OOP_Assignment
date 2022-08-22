package lexicon.fundamentals.oop.model;
import lexicon.fundamentals.oop.ToDoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface ToDoItemDAO {
    public ToDoItem persist(ToDoItem toDoTem);
    public ToDoItem findById(int id);
    public Collection<ToDoItem> findAll();
    public Collection<ToDoItem> findAllByDoneStatus(boolean done);
    public Collection<ToDoItem> findByTitleContains(String title);
    public Collection<ToDoItem> findByPersonId(int personId);
    public Collection<ToDoItem> findByDeadLineBefore(LocalDate date);
    public Collection<ToDoItem> findByDeadLineAfter(LocalDate date);
    public void remove(int id);
}
