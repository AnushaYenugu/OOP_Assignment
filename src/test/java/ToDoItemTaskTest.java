import lexicon.fundamentals.oop.Person;
import lexicon.fundamentals.oop.ToDoItem;
import lexicon.fundamentals.oop.ToDoItemTask;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ToDoItemTaskTest {
    @Test
   public void testToDoItemtask(){
        int toDoTaskId=1000;
        boolean assigned=true;
        LocalDate deadLine=LocalDate.now();
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        ToDoItem toDoItem=new ToDoItem(101,"Fix Issue","Need to fix the production issues",deadLine,true,anusha);
        ToDoItemTask toDoItemTask=new ToDoItemTask(1000,true,toDoItem,anusha);

    }
}
