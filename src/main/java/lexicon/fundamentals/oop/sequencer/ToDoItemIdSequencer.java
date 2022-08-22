package lexicon.fundamentals.oop.sequencer;

public class ToDoItemIdSequencer {
    static int currentId;

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        ToDoItemIdSequencer.currentId = currentId;
    }

    public static int currentId(){
        currentId=currentId+1;
        return currentId;
    }
}
