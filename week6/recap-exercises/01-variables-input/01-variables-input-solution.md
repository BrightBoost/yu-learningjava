# Solution: Vice City Dispatch: Variables and Input

Save this example as `Main.java` in a separate project. Run it using your IDE. Enter `Mara Vale` and `30` on separate lines when prompted.

```java
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        final String CITY = "Vice City";
        String driver = "Luz";
        int miles = 25;
        int milesPerGallon = 10;
        double pricePerGallon = 3.50;
        boolean ready = true;
        System.out.printf("%s in %s, ready: %b%n", driver, CITY, ready);

        // Cast before division so 25 / 10 keeps the fractional gallon.
        double gallons = (double) miles / milesPerGallon;
        double cost = gallons * pricePerGallon;
        System.out.printf(Locale.US, "%.2f gallons, $%.2f%n", gallons, cost);
        milesPerGallon++;
        System.out.println("Updated efficiency: " + milesPerGallon);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter driver name, then miles:");
        String nextDriver = input.nextLine();
        int nextMiles = input.nextInt();
        // The second trip deliberately uses the original efficiency.
        double nextCost = nextMiles / 10.0 * pricePerGallon;
        System.out.printf(Locale.US, "%s: $%.2f%n", nextDriver, nextCost);
    }
}
```
