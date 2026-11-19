# Solution: Fleet Roster: Inheritance and Interfaces

Save as `Main.java` and run in a separate project.

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    interface Serviceable {
        int serviceDays();
        default String reminder() { return "Service in " + serviceDays() + " days"; }
    }
    static abstract class Vehicle {
        private final String name;
        Vehicle(String name) { this.name = name; }
        String getName() { return name; }
        abstract String describe();
    }
    static class Car extends Vehicle implements Serviceable {
        Car(String name) { super(name); }
        @Override String describe() { return "Car: " + getName(); }
        @Override public int serviceDays() { return 30; }
    }
    static class Bike extends Vehicle implements Serviceable {
        Bike(String name) { super(name); }
        @Override String describe() { return "Bike: " + getName(); }
        @Override public int serviceDays() { return 14; }
    }
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(new Car("Comet"), new Bike("Sparrow"));
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle.describe()); // Dynamic dispatch picks the subclass method.
            if (vehicle instanceof Serviceable) {
                System.out.println(((Serviceable) vehicle).reminder());
            }
        }
    }
}
```
