package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.Person;
import lexicon.fundamentals.oop.ToDoItem;
import lexicon.fundamentals.oop.ToDoItemTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ToDoItemDAOImplementation implements ToDoItemDAO{
    Collection<ToDoItem> toDoItems=new ArrayList<>();
    Collection<Person> persons=new ArrayList<>();

    @Override
    public ToDoItem persist(ToDoItem toDoItem) {
        toDoItems.add(toDoItem);
        return toDoItem;
    }

    @Override
    public ToDoItem findById(int id) {
        for (ToDoItem toDoItemById: toDoItems) {
            if(toDoItemById.getToDoItemId()==id){
                return toDoItemById;
            }

        }
        return null;
    }

    @Override
    public Collection<ToDoItem> findAll() {
           return toDoItems;
    }

    @Override
    public Collection<ToDoItem> findAllByDoneStatus(boolean done) {
        Collection<ToDoItem> finishedItems = new ArrayList<>();
        for (ToDoItem toDoItemByStatus: toDoItems) {
            if(toDoItemByStatus.isFinished() == done){
                finishedItems.add(toDoItemByStatus);
            }
        }
        return finishedItems;
    }

    @Override
    public Collection<ToDoItem> findByTitleContains(String title) {
        Collection<ToDoItem> findByTitles=new ArrayList<>();
        for (ToDoItem toDoItemByTitle: toDoItems) {
            if(toDoItemByTitle.getTitle().equals(title)){
                findByTitles.add(toDoItemByTitle);
            }
        }
        return findByTitles;
    }

    @Override
    public Collection<ToDoItem> findByPersonId(int personId) {
        Collection<ToDoItem> findByPersonIds=new ArrayList<>();
           for (ToDoItem toDoItemByPersonId: toDoItems) {
               if(toDoItemByPersonId.getCreator().getId()==personId){
                    findByPersonIds.add(toDoItemByPersonId);
            }
                    }
        return findByPersonIds;
    }

    @Override
    public Collection<ToDoItem> findByDeadLineBefore(LocalDate date) {
        Collection<ToDoItem> findByLocalDatesBefore=new ArrayList<>();
        for (ToDoItem toDoItemByDate: toDoItems) {
           if(toDoItemByDate.getDeadLine().isBefore(date)){
               findByLocalDatesBefore.add(toDoItemByDate);
           }
        }
        return findByLocalDatesBefore;
    }

    @Override
    public Collection<ToDoItem> findByDeadLineAfter(LocalDate date) {
        Collection<ToDoItem> findByDeadLinesAfter=new ArrayList<>();
        for (ToDoItem toDoItemByDate: toDoItems) {
            if(toDoItemByDate.getDeadLine().isAfter(date)){
                findByDeadLinesAfter.add(toDoItemByDate);
            }
        }
        return findByDeadLinesAfter;
    }

    @Override
    public void remove(int id) {
            Iterator<ToDoItem> removeToDOItem=toDoItems.iterator();
            while(removeToDOItem.hasNext()){
                if(removeToDOItem.next().getToDoItemId()==id){
                    removeToDOItem.remove();
                }
            }
    }
}