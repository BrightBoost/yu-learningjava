Topics: lists, maps, loops, sorting

---

# Lab: Garage Board: Collections and Loops (Independent recap)

## Scenario / Context

A Vice City garage tracks a changing vehicle roster and service prices. Staff need lookups and summaries without manually checking every entry.

## Learning Goals

- Update and iterate through a list and map.
- Select, transform, and sort values using loops.
- Check a total with a second loop.
- Evaluate lookup and ordering choices.

## Prerequisites

A JDK, arrays, loops, methods, and strings. Create a separate `Main` class.

# Lab Parts

## Part 1: Manage the roster

### What you will do

Create a `List<String>` backed by `ArrayList` containing `"coupe"`, `"bike"`, and `"van"`. Change `"van"` to `"truck"`, remove `"bike"`, add `"scooter"`, and print the list and its size.

### Success criteria

The list is `[coupe, truck, scooter]` and its size is `3`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Lists are ordered and indexed from zero.

</details>

<details>
<summary>Hint 2</summary>

Replace the third entry before removing bike.

</details>

<details>
<summary>Hint 3</summary>

Use `roster.set(2, "truck")` and `roster.remove("bike")`.

</details>

## Part 2: Track prices

### What you will do

Create a `Map<String, Integer>` backed by `HashMap`. Add coupe = 50 and truck = 80. Print the truck price and whether scooter exists. Iterate through entries and print each key and value; do not assume map order.

### Success criteria

Truck costs `80`, scooter is absent, and both map entries are displayed.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Use vehicle names as keys.

</details>

<details>
<summary>Hint 2</summary>

Use `entrySet()` to visit names and prices.

</details>

<details>
<summary>Hint 3</summary>

Loop over `Map.Entry<String, Integer>` values from `prices.entrySet()`.

</details>

## Part 3: Summarize with loops

### What you will do

From the final roster, use a for-each loop to select names of at least five characters, uppercase them using `Locale.ROOT`, and add them to a new list. Count the matching names and add their original lengths. Sort the new list. Use a separate indexed loop to calculate the same length total.

### Success criteria

The selected names are `[COUPE, SCOOTER, TRUCK]`, the count is `3`, and both length totals are `17`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Start with an empty list and zero values for the count and total.

</details>

<details>
<summary>Hint 2</summary>

Inside the for-each loop, check `name.length() >= 5` before adding the uppercase name.

</details>

<details>
<summary>Hint 3</summary>

For each match, use `count++` and `total += name.length()`. After the loop, use `Collections.sort(selected)`.

</details>

# Bonus Challenge (Optional)

Preserve insertion order when displaying prices and explain your choice.

# Reflection Questions

1. Why use a list for the vehicle roster?
2. What ordering trade-off does `HashMap` make?
3. What happens when a requested price is missing?
4. What information would help diagnose a bad loop result?
5. How would you debug an accidentally removed list element?
6. How would you debug a mismatch between the two loop totals?
7. How might the price lookup change for many vehicles?
8. Where else could selecting and counting list items be useful?
