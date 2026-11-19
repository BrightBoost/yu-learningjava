# Solution: Dispatch Log: Files and Exceptions

Save as `Main.java` and run in a fresh writable project folder. The program replaces `dispatch-distances.txt`; it expects `missing-dispatch-file.txt` not to exist.

```java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static int totalFile(String path) throws IOException {
        int total = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String path = "dispatch-distances.txt";
        try {
            // Close the writer before opening the reader.
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                for (String line : new String[] {"12", "8", "5"}) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Total: " + totalFile(path));
            System.out.println("Total: " + totalFile("missing-dispatch-file.txt"));
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid distance: " + e.getMessage());
        }
    }
}
```
