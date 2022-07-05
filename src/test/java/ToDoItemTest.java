import lexicon.fundamentals.oop.ToDoItem;
import lexicon.fundamentals.oop.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ToDoItemTest {

    @Test
    public void testToDoItemGetmethods(){
        LocalDate today=LocalDate.now();
        int toDoItemId=101;
        String title="Fix Issue";
        String taskDescription="Need to fix the production issues";
        LocalDate deadLine=today;
        boolean finished=true;
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        ToDoItem toDoItem=new ToDoItem(toDoItemId,title,taskDescription,deadLine,finished,anusha);

        Assertions.assertEquals(toDoItemId,toDoItem.getToDoItemId());
        Assertions.assertEquals(title,toDoItem.getTitle());
        Assertions.assertEquals(taskDescription,toDoItem.getTaskDescription());
        Assertions.assertEquals(deadLine,toDoItem.getDeadLine());
        Assertions.assertEquals(finished,toDoItem.isFinished());
        Assertions.assertEquals(anusha,toDoItem.getCreator());
        Assertions.assertEquals(anusha.getFirstName(), toDoItem.getCreator().getFirstName());
    }
}
