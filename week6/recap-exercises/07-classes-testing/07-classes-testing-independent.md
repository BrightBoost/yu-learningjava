Topics: classes, encapsulation, BigDecimal, static, unit testing

---

# Lab: Garage Accounts: Classes and Testing (Independent recap)

## Scenario / Context

A Vice City garage tracks prepaid customer balances. The owner needs objects that protect balances and repeatable tests for payment rules.

## Learning Goals

- Implement an encapsulated class with overloaded constructors and methods.
- Calculate money with `BigDecimal` and model a has-a relationship.
- Design boundary tests using arrange, act, and assert.
- Evaluate instance and static state.

## Prerequisites

A JDK, methods, and objects. For Part 3, use a project already configured with JUnit Jupiter (JUnit 5). Put the main class in `Main.java` and tests in `MainTest.java` in the respective source folders.

# Lab Parts

## Part 1: Create a wallet

### What you will do

Inside `Main`, create a `static` nested class `Wallet` with private `BigDecimal balance`. Provide `Wallet()` starting at `0.00`, `Wallet(BigDecimal opening)`, `getBalance()`, and `credit(BigDecimal amount)`. Reject negative opening balances and negative credits with `IllegalArgumentException`. Demonstrate a wallet opened with `10.00`, then credited `2.50`.

### Success criteria

The balance prints `12.50`. Negative opening balances and credits throw `IllegalArgumentException`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Keep the balance private and validate before changing it.

</details>

<details>
<summary>Hint 2</summary>

The no-argument constructor can delegate to the other constructor.

</details>

<details>
<summary>Hint 3</summary>

Use `this(new BigDecimal("0.00"))` and `balance = balance.add(amount)`.

</details>

## Part 2: Add a customer

### What you will do

Inside `Main`, create `Customer` with a name and a `Wallet` field supplied to its constructor. Add `describe()` and overloaded `describe(String prefix)`; the no-argument method uses prefix `"Customer"`. Add static `Wallet.zero()` returning a new empty wallet. Display `Customer Luz: $12.50` and a zero balance.

### Success criteria

The customer description is `Customer Luz: $12.50`; the empty wallet shows `0.00`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Pass the existing wallet into the customer.

</details>

<details>
<summary>Hint 2</summary>

The no-argument overload can call the other overload.

</details>

<details>
<summary>Hint 3</summary>

Build the description from the prefix, name, and `wallet.getBalance()`.

</details>

## Part 3: Test the rules

### What you will do

Write JUnit 5 tests for: adding `2.50` to `10.00`; a negative credit throwing `IllegalArgumentException`; and two separate zero wallets not sharing their balance. Use arrange, act, assert, and run all three tests.

### Success criteria

All three tests pass; the negative-credit test uses `assertThrows`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Create fresh wallets in each test.

</details>

<details>
<summary>Hint 2</summary>

Use `new BigDecimal("2.50")` rather than a floating-point literal.

</details>

<details>
<summary>Hint 3</summary>

Try `assertThrows(IllegalArgumentException.class, () -> wallet.credit(...))`.

</details>

# Bonus Challenge (Optional)

Add tests for negative opening balances and zero-value credits. Explain why those boundaries matter.

# Reflection Questions

1. Why is the wallet balance private?
2. What trade-off does `BigDecimal` introduce compared with `double`?
3. What could happen if invalid credit amounts enter a real system?
4. What information could help diagnose a rejected credit without revealing a balance?
5. How would you debug a balance that did not change after `add`?
6. How would you isolate a constructor problem from a credit problem?
7. How would you extend the wallet to support withdrawals?
8. Where else could the customer-has-a-wallet design apply?
