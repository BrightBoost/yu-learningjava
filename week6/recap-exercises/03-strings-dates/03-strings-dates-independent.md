Topics: strings, StringBuilder, parsing, dates

---

# Lab: Crew Roster: Strings and Dates (Independent recap)

## Scenario / Context

A Vice City coordinator needs consistent badges and readable appointment dates so the crew can identify mismatched records.

## Learning Goals

- Transform and compare strings.
- Parse and format a date and number.
- Evaluate normalized string comparisons.
- Debug parsing and indexing errors.

## Prerequisites

A JDK, variables, and methods. Create a separate `Main` class.

# Lab Parts

## Part 1: Clean a name

### What you will do

Given `"  luz rivera  "`, trim outside spaces, convert to uppercase using `Locale.ROOT`, and print the cleaned name, its length, and its first character.

### Success criteria

The output includes `LUZ RIVERA`, length `10`, and first character `L`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Store the transformed string before inspecting it.

</details>

<details>
<summary>Hint 2</summary>

Trim before reading the first character.

</details>

<details>
<summary>Hint 3</summary>

Use `trim().toUpperCase(Locale.ROOT)` and `charAt(0)`.

</details>

## Part 2: Build a badge

### What you will do

Use `StringBuilder` to build `LUZ RIVERA | Driver | #42` from the cleaned name, the role, and the number. Compare the cleaned name with `"luz rivera"` ignoring case and display the boolean.

### Success criteria

The badge matches exactly, and the comparison prints `true`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Append each piece in the required order.

</details>

<details>
<summary>Hint 2</summary>

Spaces around the vertical bars are significant.

</details>

<details>
<summary>Hint 3</summary>

Chain `.append(" | ")` calls and finish with `.toString()`.

</details>

## Part 3: Parse appointment details

### What you will do

Parse `"42"` as an `int` and `"2026-12-05"` as a `LocalDate`. Format the date as `05/12/2026` using `DateTimeFormatter` and print both results.

### Success criteria

The parsed number is `42` and the formatted date is `05/12/2026`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Parsing and formatting are separate operations.

</details>

<details>
<summary>Hint 2</summary>

Use `LocalDate.parse` before applying a formatter.

</details>

<details>
<summary>Hint 3</summary>

Use `DateTimeFormatter.ofPattern("dd/MM/yyyy")`.

</details>

# Bonus Challenge (Optional)

Handle an empty name and an invalid date with explicit, useful messages.

# Reflection Questions

1. Why store the cleaned name in a new variable?
2. When is a `StringBuilder` useful?
3. What happens when a real appointment date is invalid?
4. What information could help diagnose a parsing error?
5. How would you debug a badge beginning with a space?
6. How would you distinguish a parse failure from a formatting error?
7. How would you support a different display format?
8. Where else could case-insensitive comparison be useful?
