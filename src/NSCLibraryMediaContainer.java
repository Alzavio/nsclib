import java.util.ArrayList;

public class NSCLibraryMediaContainer<T> {
    ArrayList<T> list = new ArrayList<T>();
    private int currentIndex;

    public void add(T Object) {
        if (Object instanceof Book || Object instanceof DVD || Object instanceof Magazine) {
            list.add(Object);
        }
    }
    public void remove(T Object) {
        list.remove(Object);
    }
    public void display() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
