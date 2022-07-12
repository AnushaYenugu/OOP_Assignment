package lexicon.fundamentals.oop;

public class ToDoItemTask {

    private int toDoTaskId;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;


    public ToDoItemTask(int toDoTaskId, boolean assigned, ToDoItem toDoItem, Person assignee) {
        this.toDoTaskId = toDoTaskId;
        this.assigned = assigned;
        this.toDoItem = toDoItem;
        this.assignee = assignee;
    }

    public void setToDoTaskId(int toDoTaskId) {
        this.toDoTaskId = toDoTaskId;
    }

    public void setAssigned(boolean assigned) {
        this.assigned=assigned;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        this.toDoItem = toDoItem;

    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        if(getAssignee()!=null){
            this.assigned=true;
        }
        else
        {
            this.assigned=false;
        }

    }

    public int getToDoTaskId() {
        return toDoTaskId;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public ToDoItem getToDoItem() {
        return toDoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public String toString() {
        return "To Do Task Id: " + getToDoTaskId() + "," + " " + toDoItem;
    }

    public boolean equals(Object object) {
        if(object==this){
            return true;
        }
        if(object==null || object.getClass()!=this.getClass()){
            return false;
        }

        ToDoItemTask toDoItemTask=(ToDoItemTask) object;
        return toDoTaskId==toDoItemTask.toDoTaskId && (assigned==toDoItemTask.assigned || assigned==toDoItemTask.isAssigned());

    }

    public int hashCode(Object o) {
        final int prime=31;
        int result=1;
        result=prime*result+toDoTaskId;
        result=assigned?1:0;
        return result;
    }
}
