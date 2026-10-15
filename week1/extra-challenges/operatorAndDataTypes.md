# Java Basics: Numbers, Types & Operators

**Hands-on coding challenges**  
**Topics:** variables, `int`, `double`, `boolean`, arithmetic, integer division, modulo, comparisons, casting, and `System.out.println()`.

## The rules

- Write your code inside `main`. You only need variables, calculations, and output.
- Do **not** use `if` statements, loops, arrays, custom methods, or user input.
- Do **not** use Java's date/time libraries.
- You may change the starting values to test your code, but don't hard-code the answers.
- Before running a program, predict what it will print. Then test it.
- Complete the core challenges first. The stretch challenges are optional.

---

## 1. The Time Machine

**Your mission:** Build a simple 24-hour clock calculator. Starting with an hour, a minute, and a number of minutes to add, calculate the new hour and minute.

For example, starting at **22:45** and adding **150 minutes** should give **01:15**.

```java
public class TimeMachine {
    public static void main(String[] args) {
        int hours = 22;
        int minutes = 45;
        int minutesToAdd = 150;

        // Calculate the new hour and minute.
        // Print the result.
    }
}
```

**Requirements:**

- Your solution must handle crossing midnight.
- Use calculations only: no `if` statements.

**Test cases:**

| Starting time | Minutes to add | Expected time |
| ------------- | -------------: | ------------- |
| 10:20         |             50 | 11:10         |
| 14:50         |             25 | 15:15         |
| 22:45         |            150 | 01:15         |
| 23:59         |              2 | 00:01         |
| 08:15         |           3000 | 10:15         |

**Stretch challenge:** Calculate how many _complete days_ have passed when you add 10,000 minutes.

---

## 2. The Movie Marathon

You watch three movies lasting **125**, **98**, and **142** minutes.

1. Calculate the total duration in minutes.
2. Convert the duration into whole hours and leftover minutes.
3. Print a result such as `6 hours and 5 minutes`.

**Stretch challenge:** The marathon starts at **19:30**. At what time does it finish on a 24-hour clock?

## 3. The Pizza Party

There are **23 people**. Everyone wants **3 slices** of pizza, and each pizza has **8 slices**.

1. Calculate how many slices you need in total.
2. Calculate the minimum number of whole pizzas to order.
3. Calculate how many slices will be left over.

**Important:** You cannot order part of a pizza. Don't use `Math.ceil()`, `if`, or floating-point arithmetic for the pizza count.

**Stretch challenge:** Make your calculation work for **31 people**, **2 slices each**, and **6 slices per pizza** by changing only the input variables.

## 4. The ATM

An ATM needs to dispense **387 euros**. It can dispense denominations of **50, 20, 10, 5, and 1 euro**.

Calculate how many of each denomination to give, using the fewest total pieces. Print the quantity of each.

**Starter values:**

```java
int amount = 387;
int fifty = 50;
int twenty = 20;
int ten = 10;
int five = 5;
int one = 1;
```

**Stretch challenge:** Change the amount to **999 euros** without rewriting the calculations.

---

## 5. The Shopping Receipt

You buy three items costing **12.95 euros**, **8.50 euros**, and **24.99 euros**.

1. Calculate the total cost.
2. Apply a **15% discount**.
3. Calculate the discounted cost per person when **3 people** split the bill equally.
4. Print the result.

**Investigation:** Try storing the prices as `double`. Then try storing all prices in whole cents as `int`. What is different? Why might a shop prefer the second approach?

**Stretch challenge:** Calculate the total discount in cents and the remaining cents when the discounted total is split three ways. Decide what to do about cents that cannot be split equally.

## 6. The Speed Camera

A car travels **185 kilometres** in **2 hours and 30 minutes**.

1. Calculate the total travel time in hours.
2. Calculate the average speed in kilometres per hour.
3. Store the speed in a variable that can hold decimal values.

**Investigation:** Try this expression and inspect its result:

```java
int hours = 2;
int minutes = 30;
double duration = hours + minutes / 60;
```

Why might it not do what you expected? Change the expression so it calculates the correct duration. Explore the difference between `60`, `60.0`, and casting.

**Stretch challenge:** Express the average speed in metres per second as well.

## 7. The Mysterious Number

You are given a four-digit positive integer:

```java
int number = 5837;
```

1. Extract each digit into a separate `int` variable.
2. Print the thousands, hundreds, tens, and ones digits.
3. Rebuild the digits in reverse order, producing **7385**.

**Rule:** Do not convert the number into a `String`.

**Stretch challenge:** Find the sum of the four digits.

## 8. The Day of the Week

Represent weekdays with numbers, starting at **0 for Monday** and ending at **6 for Sunday**.

Today is Tuesday, represented by `1`.

1. Calculate the weekday number **100 days from now**.
2. Print the number of the resulting weekday.
3. Make sure your calculation also works for **10,000 days**.

**Stretch challenge:** Calculate the weekday number **15 days ago**. Investigate what Java's `%` operator does with negative numbers.

## 9. The PIN Validator

For this challenge, a valid PIN is an integer between **1000 and 9999**, inclusive.

1. Store a PIN in an `int` variable.
2. Use comparison and logical operators to calculate whether it is valid.
3. Store the result in a `boolean` and print it.

**Rule:** No `if` statements, no strings, and no conditional (`?:`) operator.

**Stretch challenge:** A PIN is valid only if it has four digits, is even, and is not `1234`. Express all three conditions in a single boolean expression.

---

## Quick Java Prediction Puzzles

**Before running each snippet, write down the exact output.** Then run it and explain why Java behaves that way.

### Puzzle A

```java
int a = 7;
int b = 2;
System.out.println(a / b);
```

### Puzzle B

```java
int a = 7;
int b = 2;
System.out.println((double) a / b);
```

### Puzzle C

```java
System.out.println(10 + 20 + " apples");
```

### Puzzle D

```java
System.out.println("Apples: " + 10 + 20);
```

### Puzzle E

```java
int x = 5;
System.out.println(x++);
System.out.println(x);
```

### Puzzle F

```java
double price = 19.99;
int wholeEuros = (int) price;
System.out.println(wholeEuros);
```

---

## Final self-check

- Can you explain the difference between `int` division and `double` division?
- Can you describe what `%` gives you?
- Can you predict what happens when an `int` is divided by another `int`?
- Can you choose appropriate data types for money, time, speed, and true/false results?
- Can you combine comparisons using `&&`, `||`, and `!`?
- Can you solve a calculation without reaching for an `if` statement?

**Tip:** A program that works for one set of numbers isn't necessarily correct. Change the inputs and try unusual values!
