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

    @Test

    public void testToDoItemEqualsMethod(){
        LocalDate today=LocalDate.now();
        int toDoItemId=101;
        String title="Fix Issue";
        String taskDescription="Need to fix the production issues";
        LocalDate deadLine=today;
        boolean finished=true;
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        ToDoItem toDoItem=new ToDoItem(toDoItemId,title,taskDescription,deadLine,finished,anusha);
        ToDoItem toDoItem1=new ToDoItem(toDoItemId,title,taskDescription,deadLine,finished,anusha);

        Assertions.assertTrue(toDoItem.getToDoItemId()==toDoItem1.getToDoItemId());
        Assertions.assertTrue(toDoItem.getTitle().equals(toDoItem1.getTitle()));
        Assertions.assertTrue(toDoItem.getTaskDescription().equals(toDoItem1.getTaskDescription()));
        Assertions.assertTrue(toDoItem.getDeadLine().equals(toDoItem1.getDeadLine()));
        Assertions.assertTrue(toDoItem.isFinished()==toDoItem1.isFinished());

    }

    @Test
    public void testToDoItemHashcodeWhenEquals(){
        LocalDate today=LocalDate.now();
        int toDoItemId=101;
        String title="Fix Issue";
        String taskDescription="Need to fix the production issues";
        LocalDate deadLine=today;
        boolean finished=true;
        Person anusha=new Person(1,"Anusha","Yenugu","anusha@gmail.com");
        ToDoItem toDoItem=new ToDoItem(toDoItemId,title,taskDescription,deadLine,finished,anusha);
        ToDoItem toDoItem1=new ToDoItem(toDoItemId,title,taskDescription,deadLine,finished,anusha);




        Assertions.assertTrue(toDoItem.getTitle().hashCode()==toDoItem1.getTitle().hashCode());
        Assertions.assertTrue(toDoItem.getTaskDescription().hashCode()==toDoItem1.getTaskDescription().hashCode());
        Assertions.assertTrue(toDoItem.getDeadLine().hashCode()==toDoItem1.getDeadLine().hashCode());
        Assertions.assertTrue(toDoItem.isFinished());


    }
}
