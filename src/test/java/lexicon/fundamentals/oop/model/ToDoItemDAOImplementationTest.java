package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.Person;
import lexicon.fundamentals.oop.ToDoItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoItemDAOImplementationTest {
    private ToDoItemDAOImplementation toDoItemDAOImplementationTest;


    @BeforeEach
    void setup(){
        toDoItemDAOImplementationTest =new ToDoItemDAOImplementation();

    }

    private void setupToDoItem(){
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        ToDoItem toDoItem=new ToDoItem(100,"Prod Issue","Its a production issue at model package",deadLine,false,anusha);
        toDoItemDAOImplementationTest.persist(toDoItem);
       // toDoItemDAOImplementation.persist(toDoItem);
    }

    @Test
    void persistTest() {
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        ToDoItem toDoItem=new ToDoItem(100,"Prod Issue","Its a production issue at model package",deadLine,false,anusha);
        ToDoItem result=toDoItemDAOImplementationTest.persist(toDoItem);
        assertEquals(toDoItemDAOImplementationTest.toDoItems.size(),1);
        assertEquals(result.getToDoItemId(),100);
    }

    @Test
    void findById() {
        setupToDoItem();
        ToDoItem result=toDoItemDAOImplementationTest.findById(100);
        assertEquals(result.getToDoItemId(),100);
    }

    @Test
    void findAll() {
        setupToDoItem();
        Collection<ToDoItem> result=toDoItemDAOImplementationTest.findAll();
        assertEquals(1,result.size());




    }

    @Test
    void findAllByDoneStatus() {
        setupToDoItem();
        Collection<ToDoItem>findBystatus=toDoItemDAOImplementationTest.findAllByDoneStatus(false);
        assertEquals(findBystatus.size(),1);

    }

    @Test
    void findByTitleContains() {
        setupToDoItem();
        Collection<ToDoItem> findByTitles=toDoItemDAOImplementationTest.findByTitleContains("Prod Issue");
        assertEquals(findByTitles.size(),1);
           }

    @Test
    void findByPersonId() {
        setupToDoItem();
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        ToDoItem toDoItem=new ToDoItem(100,"Prod Issue","Its a production issue at model package",deadLine,false,anusha);
        ToDoItem result=toDoItemDAOImplementationTest.persist(toDoItem);

        Collection<ToDoItem> findByPersons=toDoItemDAOImplementationTest.findByPersonId(1);
         assertEquals(1, findByPersons.size());

    }

    @Test
    void findByDeadLineBefore() {
        setupToDoItem();
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        Collection<ToDoItem> findByDeadLineBefore=toDoItemDAOImplementationTest.findByDeadLineBefore(deadLine);
        assertEquals(1,findByDeadLineBefore.size());
            }

    @Test
    void findByDeadLineAfter() {
       // setupToDoItem();
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        ToDoItem toDoItem=new ToDoItem(100,"Prod Issue","Its a production issue at model package",deadLine,false,anusha);
        ToDoItem result=toDoItemDAOImplementationTest.persist(toDoItem);


       // LocalDate deadLine=LocalDate.parse("2022-08-13");
        Collection<ToDoItem> findByDeadLineAfter=toDoItemDAOImplementationTest.findByDeadLineAfter(deadLine);
        assertEquals(1,findByDeadLineAfter.size());
      //  assertEquals(toDoItem,toDoItemDAOImplementationTest.toDoItems.contains(toDoItem));
    }

    @Test
    void remove() {
       // setupToDoItem();
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        LocalDate deadLine=LocalDate.parse("2022-08-13");
        ToDoItem toDoItem=new ToDoItem(100,"Prod Issue","Its a production issue at model package",deadLine,false,anusha);
        ToDoItem result=toDoItemDAOImplementationTest.persist(toDoItem);

        assertEquals(toDoItemDAOImplementationTest.toDoItems.size(),1);
        toDoItemDAOImplementationTest.remove(100);
        assertEquals(toDoItemDAOImplementationTest.toDoItems.size(),0);
    }
}