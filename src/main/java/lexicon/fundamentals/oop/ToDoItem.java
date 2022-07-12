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
    @Override
    public String toString() {
        return "Item Id: " + getToDoItemId() + "  " + " Title: " + getTitle() + "  " + "Task Description: " + getTaskDescription() + "  " + " Dead Line: " + getDeadLine() + " " + " Over Due: " + isOverDue() ;
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



    public boolean equals(Object object) {
        if(object==this){
            return true;
        }
        if(object==null || object.getClass()!=this.getClass()){
            return false;
        }

        ToDoItem toDoItem=(ToDoItem) object;
        return toDoItemId==toDoItem.toDoItemId && (taskDescription.equals(toDoItem.taskDescription) || (taskDescription!=null && taskDescription.equals(toDoItem.getTaskDescription())))
                && (title.equals(toDoItem.title) || (title!=null && title.equals(toDoItem.getTitle())))
                && (deadLine.equals(toDoItem.deadLine) || (deadLine!=null && deadLine.equals(toDoItem.getDeadLine())))
                && (finished==toDoItem.finished) || (finished==toDoItem.isFinished());


    }


    public int hashCode(Object o) {
        final int prime=31;
        int result=1;
        result=prime*result+toDoItemId;
        result=prime*result+((taskDescription==null)?0:taskDescription.hashCode());
        result=prime*result+((title==null)?0:title.hashCode());
        result=prime*result+((deadLine==null)?0:deadLine.hashCode());


        return result;
    }
}






