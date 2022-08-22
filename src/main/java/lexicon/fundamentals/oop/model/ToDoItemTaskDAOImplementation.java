package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.Person;
import lexicon.fundamentals.oop.ToDoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ToDoItemTaskDAOImplementation implements  ToDoItemTaskDAO{
    Collection<ToDoItemTask> toDoItemTasks=new ArrayList<>();
    @Override
    public ToDoItemTask persist(ToDoItemTask toDoItemTask) {
        toDoItemTasks.add(toDoItemTask);
        return  toDoItemTask;
    }

    @Override
    public ToDoItemTask findById(int id) {
        for (ToDoItemTask toDoItemTaskById: toDoItemTasks) {
            if(toDoItemTaskById.getToDoTaskId()==id){
                return toDoItemTaskById;
            }

        }
        return null;
    }

    @Override
    public Collection<ToDoItemTask> findAll() {
        return toDoItemTasks;
    }

    @Override
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status) {
        Collection<ToDoItemTask> findByAssignes=new ArrayList<>();
        for (ToDoItemTask toDoItemTaskByStatus: toDoItemTasks) {
            if (toDoItemTaskByStatus.isAssigned()==status){
                findByAssignes.add(toDoItemTaskByStatus);
            }

        }
        return findByAssignes;
    }

    @Override
    public Collection<ToDoItemTask> findByPersonId(int personId) {
        Collection<ToDoItemTask> findByPersonIds=new ArrayList<>();
        for (ToDoItemTask toDoItemTaskByPersonId: toDoItemTasks) {
            if(toDoItemTaskByPersonId.getAssignee().getId()==personId){
                    findByPersonIds.add(toDoItemTaskByPersonId);
            }

        }
        return findByPersonIds;
    }

    @Override
    public void remove(int id) {

        Iterator<ToDoItemTask> removeToDoItemTask=toDoItemTasks.iterator();
        while(removeToDoItemTask.hasNext()){
            if(removeToDoItemTask.next().getToDoTaskId()==id){
                removeToDoItemTask.remove();
            }
        }

    }
}
