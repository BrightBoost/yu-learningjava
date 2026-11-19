# Solution: Crew Roster: Strings and Dates

Save as `Main.java` and run in a separate project.

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String cleaned = "  luz rivera  ".trim().toUpperCase(Locale.ROOT);
        System.out.println(cleaned + ", length " + cleaned.length() + ", first " + cleaned.charAt(0));
        // The builder combines the pieces into one badge.
        String badge = new StringBuilder(cleaned).append(" | ").append("Driver")
                .append(" | #").append(42).toString();
        System.out.println(badge);
        System.out.println(cleaned.equalsIgnoreCase("luz rivera"));
        int number = Integer.parseInt("42");
        LocalDate date = LocalDate.parse("2026-12-05");
        System.out.println(number + ", " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
```
