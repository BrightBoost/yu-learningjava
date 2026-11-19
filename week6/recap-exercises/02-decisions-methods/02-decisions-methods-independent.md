Topics: conditionals, switch, static methods

---

# Lab: Delivery Desk: Decisions and Methods (Independent recap)

## Scenario / Context

A Vice City courier desk needs consistent quotes. Customer service needs clear answers for supported and unsupported vehicles.

## Learning Goals

- Implement branching with `if` and `switch`.
- Write static methods with parameters and return values.
- Evaluate boundary conditions in delivery fees.
- Debug string comparisons and unsupported choices.

## Prerequisites

A JDK, variables, operators, and console output. Create a separate `Main` class.

# Lab Parts

## Part 1: Rate a distance

### What you will do

Write `static int distanceFee(int miles)`. Return `5` when miles are 0 through 10 inclusive, otherwise return `10`. In `main`, display results for 10 and 11. Assume nonnegative input.

### Success criteria

The displayed fees are `5` and `10` in that order.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Identify the inclusive boundary.

</details>

<details>
<summary>Hint 2</summary>

Use `<=` and return a value from both paths.

</details>

<details>
<summary>Hint 3</summary>

Start with `if (miles <= 10) return 5;`.

</details>

## Part 2: Choose a vehicle

### What you will do

Write `static int vehicleFee(String type)`. Use a `switch` for `"bike"` = 2 and `"car"` = 4; return -1 for any other value. Display results for bike, car, and boat.

### Success criteria

The displayed vehicle fees are `2`, `4`, and `-1`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Treat the input as a choice among named options.

</details>

<details>
<summary>Hint 2</summary>

Include a `default` case for unsupported choices.

</details>

<details>
<summary>Hint 3</summary>

A case may use `case "bike": return 2;`.

</details>

## Part 3: Build a quote

### What you will do

Write `static String quote(String type, int miles)`. Return `"Unsupported vehicle"` if the vehicle fee is -1; otherwise return `"Total: $"` followed by the sum of both fees. Display quotes for bike at 10 miles and boat at 11 miles.

### Success criteria

The quotes are `Total: $7` and `Unsupported vehicle`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Reuse both earlier methods.

</details>

<details>
<summary>Hint 2</summary>

Check the vehicle fee before calculating the total.

</details>

<details>
<summary>Hint 3</summary>

Store `vehicleFee(type)` in a local variable, then branch on `-1`.

</details>

# Bonus Challenge (Optional)

Write boundary tests for 0, 10, and 11 miles and justify which other invalid inputs should be rejected.

# Reflection Questions

1. Why is 10 included in the lower fee?
2. What is the trade-off of using `-1` for an unsupported vehicle?
3. What could happen if a customer enters negative miles?
4. What information would help diagnose a rejected vehicle choice?
5. How would you debug an incorrect result at 10 miles?
6. How would you isolate an error in the vehicle fee from the distance fee?
7. How would you change the method for multiple distance brackets?
8. Where else could this quote structure be useful?
