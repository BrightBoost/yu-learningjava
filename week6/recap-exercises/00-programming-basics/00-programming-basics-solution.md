# Solution: Dispatch Console: Programming Basics

Save as `Main.java` in a separate folder. With a JDK on your path, create the file, compile with `javac Main.java`, and run with `java Main`.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("The JDK provides Java development tools.");
        System.out.println("javac compiles Java source to bytecode.");
        System.out.println("The JVM executes Java bytecode.");

        System.out.println(Integer.toBinaryString(13)); // 1101
        System.out.println(Integer.parseInt("10110", 2)); // 16 + 4 + 2 = 22

        int tickets = 5;
        int people = 2;
        double original = tickets / people; // Integer division happens before assignment.
        double corrected = (double) tickets / people;
        System.out.println("Original: " + original);
        System.out.println("Corrected: " + corrected);
    }
}
```

An AI suggestion can be checked against a known example or Java documentation. Use fictional test data rather than sharing private information.
