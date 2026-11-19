# Solution: Supply Depot: Generics and Packages

Save as `src/recap/InventoryApp.java`. Run the compile and launch commands in Part 3 of either lab.

```java
package recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryApp {
    interface Named { String getName(); }
    static class Tool implements Named {
        private final String name;
        Tool(String name) { this.name = name; }
        @Override public String getName() { return name; }
    }
    static class Snack implements Named {
        private final String name;
        Snack(String name) { this.name = name; }
        @Override public String getName() { return name; }
    }
    static class Shelf<T extends Named> {
        private final List<T> items = new ArrayList<>();
        void add(T item) { items.add(item); }
        String firstName() {
            if (items.isEmpty()) throw new IllegalStateException("Shelf is empty");
            return items.get(0).getName(); // The bound guarantees this method exists.
        }
    }
    static <T> int count(List<T> items) { return items.size(); }
    public static void main(String[] args) {
        Shelf<Tool> tools = new Shelf<>();
        tools.add(new Tool("Wrench"));
        Shelf<Snack> snacks = new Shelf<>();
        snacks.add(new Snack("Chips"));
        System.out.println(tools.firstName());
        System.out.println(snacks.firstName());
        try {
            System.out.println(new Shelf<Tool>().firstName());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Count: " + count(Arrays.asList("one", "two")));
    }
}
```
