package collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> list = new ArrayList<>();
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean add(T item) {
        if(list.size() >= maxSize) {
            return false;
        }
        list.add(item);
        return true;
    }

    public List<T> getItems() {
        return List.copyOf(list);
    }

    @Override
    public String toString() {
        String items = "";
        for(T item : list) {
            items += item + " - ";
        }
        return "FixedList{" +
                "list=" + items +
                ", maxSize=" + maxSize +
                '}';
    }
}
