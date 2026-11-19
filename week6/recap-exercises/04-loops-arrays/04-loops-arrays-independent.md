Topics: loops, arrays, copying, sorting

---

# Lab: Garage Inventory: Loops and Arrays (Independent recap)

## Scenario / Context

A Vice City mechanic needs a mileage report and a sorted copy that preserves the original inventory.

## Learning Goals

- Traverse an array and compute a total.
- Copy and sort an array.
- Compare loop styles and stopping conditions.
- Debug array bounds and loop control.

## Prerequisites

A JDK, conditions, and methods. Create a separate `Main` class.

# Lab Parts

## Part 1: Count down

### What you will do

Print `3`, `2`, `1` using a `while` loop. Then use a `do-while` loop to print `Garage open` once, with a condition that is false after the first iteration.

### Success criteria

The countdown appears in descending order and `Garage open` appears once.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Start at 3 and move toward 1.

</details>

<details>
<summary>Hint 2</summary>

Decrease the counter each iteration.

</details>

<details>
<summary>Hint 3</summary>

Use `while (count > 0)` and `count--`.

</details>

## Part 2: Summarize mileage

### What you will do

Create `int[] miles = {120, 80, 150, 100}`. Use a for-each loop to compute and print the total. Use an indexed `for` loop to print only the first value greater than 100, then stop.

### Success criteria

The total is `450` and the first value above 100 is `120`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Start the total at zero.

</details>

<details>
<summary>Hint 2</summary>

Use `miles.length` as the index limit.

</details>

<details>
<summary>Hint 3</summary>

After finding a match, print it and use `break;`.

</details>

## Part 3: Sort a copy

### What you will do

Write `static int[] sortedCopy(int[] values)` that returns a sorted independent copy. Print the sorted copy and the original array after calling it.

### Success criteria

The sorted copy is `[80, 100, 120, 150]`; the original remains `[120, 80, 150, 100]`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Do not sort the input itself.

</details>

<details>
<summary>Hint 2</summary>

Copy the full length before sorting.

</details>

<details>
<summary>Hint 3</summary>

Use `Arrays.copyOf(values, values.length)`, then sort the copy.

</details>

# Bonus Challenge (Optional)

Make the reporting method handle an empty array without an index error.

# Reflection Questions

1. When does a `do-while` help compared with a `while`?
2. Why copy the array before sorting?
3. What could break with an empty mileage array?
4. What information would help diagnose a bad mileage total?
5. How would you debug a loop that never finishes?
6. How would you find an off-by-one error in the indexed loop?
7. How would you handle thousands of mileage records?
8. Where else would preserving an original array matter?
