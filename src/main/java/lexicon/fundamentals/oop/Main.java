package lexicon.fundamentals.oop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person anusha=new Person(01,"Anusha","Yenugu","anusha@gmail.com");
        System.out.println(anusha);
        anusha.setEmail(null);
        System.out.println(anusha.getEmail());

        //LocalDate todayDate= LocalDate.now();
        LocalDate deadLine=LocalDate.parse("2022-06-30");

        ToDoItem fixIssue=new ToDoItem(101,"Fix Issue","Need to fix the production issues",deadLine,true,anusha);
        System.out.println("To Do Item summary "+fixIssue);
        LocalDate changeDeadLine=LocalDate.now().plusDays(4);
        fixIssue.setDeadLine(changeDeadLine);
        System.out.println(fixIssue.getDeadLine());

        ToDoItemTask toDoItemTask=new ToDoItemTask(1000,true,fixIssue,anusha);
        System.out.println(toDoItemTask);

        AppUser sree=new AppUser("Sree Divisha","isha",AppRole.ROLE_APP_USER);
        AppUser sree1=new AppUser("Sree Divisha","divisha",AppRole.ROLE_APP_USER);

        System.out.println(sree.getUserName());
        System.out.println(sree.equals(sree1));
        System.out.println(sree.hashCode(sree1));
        System.out.println(sree.getUserName().hashCode());
        System.out.println(sree1.getUserName().hashCode());

    }
}