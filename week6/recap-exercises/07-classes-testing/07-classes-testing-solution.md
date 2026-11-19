# Solution: Garage Accounts: Classes and Testing

Save as `Main.java` in the main source folder of a JUnit 5 project.

```java
import java.math.BigDecimal;

public class Main {
    static class Wallet {
        private BigDecimal balance;
        Wallet() { this(new BigDecimal("0.00")); }
        Wallet(BigDecimal opening) {
            if (opening.signum() < 0) throw new IllegalArgumentException("Negative opening balance");
            balance = opening;
        }
        BigDecimal getBalance() { return balance; }
        void credit(BigDecimal amount) {
            if (amount.signum() < 0) throw new IllegalArgumentException("Negative credit");
            balance = balance.add(amount); // BigDecimal operations return new values.
        }
        static Wallet zero() { return new Wallet(); }
    }

    static class Customer {
        private final String name;
        private final Wallet wallet; // A customer has a wallet.
        Customer(String name, Wallet wallet) {
            this.name = name;
            this.wallet = wallet;
        }
        String describe() { return describe("Customer"); }
        String describe(String prefix) { return prefix + " " + name + ": $" + wallet.getBalance(); }
    }

    public static void main(String[] args) {
        Wallet wallet = new Wallet(new BigDecimal("10.00"));
        wallet.credit(new BigDecimal("2.50"));
        System.out.println("Balance: " + wallet.getBalance());
        System.out.println(new Customer("Luz", wallet).describe());
        System.out.println("Zero: " + Wallet.zero().getBalance());
    }
}
```

Save as `MainTest.java` in the test source folder. Run through your IDE or the project's existing test command.

```java
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void creditAddsMoney() {
        Main.Wallet wallet = new Main.Wallet(new BigDecimal("10.00")); // Arrange
        wallet.credit(new BigDecimal("2.50")); // Act
        assertEquals(new BigDecimal("12.50"), wallet.getBalance()); // Assert
    }

    @Test
    void negativeCreditIsRejected() {
        Main.Wallet wallet = new Main.Wallet();
        assertThrows(IllegalArgumentException.class, () -> wallet.credit(new BigDecimal("-0.01")));
    }

    @Test
    void walletsHaveSeparateBalances() {
        Main.Wallet first = Main.Wallet.zero();
        Main.Wallet second = Main.Wallet.zero();
        first.credit(new BigDecimal("1.00"));
        assertEquals(new BigDecimal("0.00"), second.getBalance());
    }
}
```
