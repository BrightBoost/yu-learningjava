# Solution: Garage Board: Collections and Loops

Save as `Main.java` and run in a separate project.

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> roster = new ArrayList<>(Arrays.asList("coupe", "bike", "van"));
        roster.set(2, "truck");
        roster.remove("bike");
        roster.add("scooter");
        System.out.println(roster + ", size " + roster.size());
        Map<String, Integer> prices = new HashMap<>();
        prices.put("coupe", 50);
        prices.put("truck", 80);
        System.out.println("Truck: " + prices.get("truck"));
        System.out.println("Scooter present: " + prices.containsKey("scooter"));
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        List<String> selected = new ArrayList<>();
        int count = 0;
        int loopTotal = 0;
        for (String name : roster) {
            if (name.length() >= 5) {
                selected.add(name.toUpperCase(Locale.ROOT));
                count++;
                loopTotal += name.length();
            }
        }
        Collections.sort(selected);
        // A separate indexed loop checks the total from the for-each loop.
        int checkedTotal = 0;
        for (int i = 0; i < roster.size(); i++) {
            String name = roster.get(i);
            if (name.length() >= 5) {
                checkedTotal += name.length();
            }
        }
        System.out.println(selected);
        System.out.println("Count: " + count + ", totals: " + loopTotal + ", " + checkedTotal);
    }
}
```
