package lexicon.fundamentals.oop.sequencer;

public class ToDoItemTaskIdSequencer {
    static int currentId;
    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ToDoItemTaskIdSequencer.currentId = currentId;
    }

    public static int nextId(){
        currentId=currentId+1;
        return currentId;
    }



}
