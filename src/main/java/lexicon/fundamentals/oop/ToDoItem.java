package lexicon.fundamentals.oop;

import java.time.LocalDate;

public class ToDoItem {

    private int toDoItemId;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean finished;
    Person creator;

    public ToDoItem(int toDoItemId, String title, String taskDescription, LocalDate deadLine, boolean finished, Person creator) {
        this.toDoItemId = toDoItemId;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.finished = finished;
        this.creator = creator;
    }

    public void setToDoItemId(int toDoItemId) {
        this.toDoItemId = toDoItemId;
    }

    public void setTitle(String title) {
        if (title == null) {
            System.out.println("Title cannot be empty or null");
        } else {
            this.title = title;
        }

    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            System.out.println("Dead Line  cannot be null ");
            this.deadLine=LocalDate.now();
        }
        else {
            this.deadLine = deadLine;
        }


    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }


    public int getToDoItemId() {
        return toDoItemId;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isFinished() {
        return finished;
    }

    public Person getCreator() {
        return creator;
    }

    public String getSummaryToDoItem() {
        return "Item Id: " + getToDoItemId() + "  " + " Title: " + getTitle() + "  " + "Task Description: " + getTaskDescription() + "  " + " Dead Line: " + getDeadLine() + " " + " Over Due: " + isOverDue() + "  " + creator.getSummary();
    }


    public boolean isOverDue() {
        boolean value=false;
        LocalDate today = LocalDate.now();
//        today.isAfter();
        int result = today.compareTo(deadLine);
        if (result == 0 || result < 0) {
            value=false;
        } else if (result > 0) {
            value= true;
        }
        return value;
    }
}






