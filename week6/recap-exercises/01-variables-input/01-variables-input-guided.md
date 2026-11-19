Topics: variables, operators, input, and output

---

# Lab: Vice City Dispatch: Variables and Input (Guided recap)

## Scenario / Context

A Vice City delivery team needs a fuel-cost estimate before dispatching a car. The dispatcher cares because inaccurate estimates make planning harder.

## Learning Goals

- Declare values with appropriate Java types.
- Read input and format a calculated result.
- Evaluate integer division and casts.
- Debug input and numeric conversion errors.

## Prerequisites

A JDK and an IDE or terminal. Create a Java class named `Main`. Run each lab in its own project or folder.

# Lab Parts

## Part 1: Model a delivery

### What you will do

Variables have a type, name, and value. `final` prevents reassignment. `String` stores text; primitive types include numbers and booleans.

Declare `String driver = "Luz"`, `int miles = 25`, `int milesPerGallon = 10`, `double pricePerGallon = 3.50`, and `boolean ready = true`. Add a `final` constant `CITY` with value `"Vice City"`. Print the driver, city, and readiness.

### Success criteria

The output identifies Luz, Vice City, and `true`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Choose a type based on each value.

</details>

<details>
<summary>Hint 2</summary>

Text uses double quotes; booleans use `true` or `false`.

</details>

<details>
<summary>Hint 3</summary>

Declare the city as `final String CITY = ...;`.

</details>

## Part 2: Calculate the fuel cost

### What you will do

Integer division discards the fractional part. Widen an operand to `double` before dividing. `printf` can format decimal values.

Calculate gallons using the existing distance and efficiency. Calculate cost using the price per gallon. Print gallons and cost with exactly two decimal places using `Locale.US` for a decimal point. Then print the whole-number miles per gallon after adding 1 with an increment operator.

### Success criteria

The results are `2.50` gallons, `$8.75`, and `11` miles per gallon. Calculate before incrementing.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Consider the types on both sides of `/`.

</details>

<details>
<summary>Hint 2</summary>

Cast an operand before division, not the result afterward.

</details>

<details>
<summary>Hint 3</summary>

Use `(double) miles / milesPerGallon` and a `%.2f` format.

</details>

## Part 3: Accept another trip

### What you will do

`Scanner` reads from `System.in`. `nextLine()` preserves spaces; `nextInt()` reads an integer. When reading a line after a number, consume the remaining newline first.

Use one `Scanner` to read a driver's full name as a line, then a distance in whole miles. With the original efficiency of 10 and price of 3.50, print the name and estimated cost to two decimals using `Locale.US`. The input is valid and distance is nonnegative.

### Success criteria

For input lines `Mara Vale` and `30`, the output includes `Mara Vale: $10.50`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Read the name and distance in the requested order.

</details>

<details>
<summary>Hint 2</summary>

Create one `Scanner` and use `nextLine()` before `nextInt()`.

</details>

<details>
<summary>Hint 3</summary>

Calculate `distance / 10.0 * 3.50`; print with `%.2f`.

</details>

# Bonus Challenge (Optional)

Reject a zero or negative efficiency and explain the error to the dispatcher.

# Reflection Questions

1. Why did you choose `int` for miles and `double` for price?
2. What precision trade-off comes with using `double` for money?
3. What happens if a real driver enters text instead of a distance?
4. What information could help diagnose a failed calculation without exposing a driver's name?
5. How would you identify integer division as the cause of an incorrect fuel estimate?
6. How would you isolate input errors from calculation errors?
7. How would you represent a trip with fractional miles?
8. How could the same calculation apply to another delivery business?
