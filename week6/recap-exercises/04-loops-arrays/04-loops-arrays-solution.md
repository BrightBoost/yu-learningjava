# Solution: Garage Inventory: Loops and Arrays

Save as `Main.java` and run in a separate project.

```java
import java.util.Arrays;

public class Main {
    static int[] sortedCopy(int[] values) {
        int[] copy = Arrays.copyOf(values, values.length);
        Arrays.sort(copy); // Sorting the copy leaves the input untouched.
        return copy;
    }

    public static void main(String[] args) {
        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        do {
            System.out.println("Garage open");
        } while (false);
        int[] miles = {120, 80, 150, 100};
        int total = 0;
        for (int value : miles) total += value;
        System.out.println("Total: " + total);
        for (int i = 0; i < miles.length; i++) {
            if (miles[i] > 100) {
                System.out.println("First above 100: " + miles[i]);
                break;
            }
        }
        System.out.println(Arrays.toString(sortedCopy(miles)));
        System.out.println(Arrays.toString(miles));
    }
}
```
