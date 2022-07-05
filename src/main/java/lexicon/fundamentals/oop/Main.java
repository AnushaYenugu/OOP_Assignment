package lexicon.fundamentals.oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person anusha=new Person(01,"Anusha","Yenugu","anusha@gmail.com");
        System.out.println(anusha.getSummary());
        anusha.setEmail(null);
        System.out.println(anusha.getEmail());

        //LocalDate todayDate= LocalDate.now();
        LocalDate deadLine=LocalDate.parse("2022-06-30");

        ToDoItem fixIssue=new ToDoItem(101,"Fix Issue","Need to fix the production issues",deadLine,true,anusha);
        System.out.println("To Do Item summary "+fixIssue.getSummaryToDoItem());
        LocalDate changeDeadLine=LocalDate.now().plusDays(4);
        fixIssue.setDeadLine(changeDeadLine);
        System.out.println(fixIssue.getDeadLine());

        ToDoItemTask toDoItemTask=new ToDoItemTask(1000,true,fixIssue,anusha);
        System.out.println(toDoItemTask.getSummaryToDoTask());
    }
}