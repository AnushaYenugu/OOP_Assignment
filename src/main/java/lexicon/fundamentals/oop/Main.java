package lexicon.fundamentals.oop;

import lexicon.fundamentals.oop.model.AppUserDAOImplementation;
import lexicon.fundamentals.oop.model.PersonDAOImplementation;
import lexicon.fundamentals.oop.model.ToDoItemDAOImplementation;
import lexicon.fundamentals.oop.model.ToDoItemTaskDAOImplementation;

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

        AppUser sree=new AppUser("Sree Divisha1","isha",AppRole.ROLE_APP_USER);
        AppUser sree1=new AppUser("Sree Divisha2","divisha",AppRole.ROLE_APP_USER);

        System.out.println(sree.getUserName());
        System.out.println(sree.equals(sree1));
        System.out.println(sree.hashCode(sree1));
        System.out.println(sree.getUserName().hashCode());
        System.out.println(sree1.getUserName().hashCode());


        AppUserDAOImplementation appUserDAOImplementation=new AppUserDAOImplementation();
        appUserDAOImplementation.persist(sree);
        appUserDAOImplementation.persist(sree1);
        System.out.println(appUserDAOImplementation.findByUsername("Sree Divisha1"));
        System.out.println(appUserDAOImplementation.findAll());
        appUserDAOImplementation.remove("Sree Divisha1");
        System.out.println(appUserDAOImplementation.findAll());

        PersonDAOImplementation personDAOImplementation=new PersonDAOImplementation();
        personDAOImplementation.persist(anusha);
        System.out.println(personDAOImplementation.findById(01));
        System.out.println(personDAOImplementation.findByEmail("anusha@gmail.com"));
        personDAOImplementation.remove(01);
        System.out.println(personDAOImplementation.findAll());


        ToDoItemDAOImplementation toDoItemDAOImplementation=new ToDoItemDAOImplementation();
        toDoItemDAOImplementation.persist(fixIssue);
        System.out.println(toDoItemDAOImplementation.findById(101));
        System.out.println(toDoItemDAOImplementation.findAllByDoneStatus(false));
        System.out.println(toDoItemDAOImplementation.findByDeadLineAfter(deadLine));
        System.out.println(toDoItemDAOImplementation.findByDeadLineBefore(changeDeadLine));
        System.out.println("Find by person Id");
        System.out.println(toDoItemDAOImplementation.findByPersonId(1));
        toDoItemDAOImplementation.remove(101);
        System.out.println(toDoItemDAOImplementation.findAll());


        ToDoItemTaskDAOImplementation toDoItemTaskDAOImplementation=new ToDoItemTaskDAOImplementation();
        toDoItemTaskDAOImplementation.persist(toDoItemTask);
        System.out.println(toDoItemTaskDAOImplementation.findById(1000));
        System.out.println(toDoItemTaskDAOImplementation.findByAssignedStatus(true));
        System.out.println("Find by Person Id");
        System.out.println(toDoItemTaskDAOImplementation.findByPersonId(1));
        System.out.println("Find all");
        System.out.println(toDoItemTaskDAOImplementation.findAll());
        toDoItemTaskDAOImplementation.remove(1000);
        System.out.println(toDoItemTaskDAOImplementation.findAll());


    }
}