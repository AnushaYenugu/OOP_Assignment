package lexicon.fundamentals.oop.sequencer;

public class PersonIdSequencer {
    static int currentId;
    public static int nextId(){
        currentId=currentId+1;
        return currentId;

    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}
