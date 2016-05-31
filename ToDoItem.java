package sample;

/**
 * Created by Ben on 5/31/16.
 */
public class ToDoItem {
    String text;
    Boolean isDone;

    public ToDoItem(Boolean isDone, String text) {
        this.isDone = isDone;
        this.text = text;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "text='" + text + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
