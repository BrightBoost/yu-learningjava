Topics: generics, bounded types, packages

---

# Lab: Supply Depot: Generics and Packages (Independent recap)

## Scenario / Context

A Vice City supply depot stores different named items. Its inventory tool needs compile-time type safety and a package that keeps its classes organized.

## Learning Goals

- Implement a generic class and generic method.
- Apply an upper bound to a generic type.
- Organize and run Java code in a package.
- Evaluate type safety in a reusable design.

## Prerequisites

A JDK, classes, interfaces, lists, and methods. Create `src/recap/InventoryApp.java` in a new project folder.

# Lab Parts

## Part 1: Define a named item

### What you will do

In package `recap`, create public `InventoryApp` with nested interface `Named` declaring `String getName()`. Add nested classes `Tool` and `Snack`, each implementing `Named` and storing a name passed to its constructor.

### Success criteria

`new Tool("Wrench").getName()` returns `Wrench`; `new Snack("Chips").getName()` returns `Chips`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Start the source file with its package declaration.

</details>

<details>
<summary>Hint 2</summary>

Both item types need their own name and implementation.

</details>

<details>
<summary>Hint 3</summary>

Declare `interface Named { String getName(); }` inside `InventoryApp`.

</details>

## Part 2: Make a typed shelf

### What you will do

Add nested generic class `Shelf<T extends Named>` backed by a `List<T>`, with `add(T item)` and `firstName()` returning the first item's name. `firstName()` must throw `IllegalStateException("Shelf is empty")` when no items exist. Create separate tool and snack shelves and print their first names. Call `firstName()` on a new empty shelf, catch the exception, and print its message.

### Success criteria

The tool shelf prints `Wrench`, the snack shelf prints `Chips`, and an empty shelf reports `Shelf is empty`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Each shelf needs its own list.

</details>

<details>
<summary>Hint 2</summary>

Check `isEmpty()` before accessing index zero.

</details>

<details>
<summary>Hint 3</summary>

Declare `class Shelf<T extends Named>` and use `items.get(0).getName()`.

</details>

## Part 3: Write a generic method and run the package

### What you will do

Add `static <T> int count(List<T> items)` and use it to print the size of a two-item string list. Compile with `javac -d out src/recap/InventoryApp.java` and run with `java -cp out recap.InventoryApp`.

### Success criteria

The count is `2`, and the packaged program runs from the project folder.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

The method does not need to know the element type.

</details>

<details>
<summary>Hint 2</summary>

Put `<T>` before the return type.

</details>

<details>
<summary>Hint 3</summary>

Return `items.size()` from `static <T> int count(List<T> items)`.

</details>

# Bonus Challenge (Optional)

Extend the shelf with a name lookup that reports a missing item without returning a misleading item.

# Reflection Questions

1. Why use a `Named` interface for both item types?
2. What is the trade-off of restricting `Shelf` to named items?
3. What happens when a shelf is empty?
4. What information would help diagnose a package launch failure?
5. How would you debug a missing `getName` implementation?
6. How would you distinguish a compile error from a classpath error?
7. How would you extend the shelf to support another named item?
8. Where else could a bounded generic collection help?
