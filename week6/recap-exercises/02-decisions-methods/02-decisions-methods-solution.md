# Solution: Delivery Desk: Decisions and Methods

Save as `Main.java` and run in a separate project.

```java
public class Main {
    static int distanceFee(int miles) {
        if (miles <= 10) return 5;
        return 10;
    }

    static int vehicleFee(String type) {
        switch (type) {
            case "bike": return 2;
            case "car": return 4;
            default: return -1;
        }
    }

    static String quote(String type, int miles) {
        int fee = vehicleFee(type);
        // Check the sentinel before producing a price.
        if (fee == -1) return "Unsupported vehicle";
        return "Total: $" + (fee + distanceFee(miles));
    }

    public static void main(String[] args) {
        System.out.println(distanceFee(10) + ", " + distanceFee(11));
        System.out.println(vehicleFee("bike") + ", " + vehicleFee("car") + ", " + vehicleFee("boat"));
        System.out.println(quote("bike", 10));
        System.out.println(quote("boat", 11));
    }
}
```
