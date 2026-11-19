Topics: precise instructions, binary, Java tools, debugging, responsible AI

---

# Lab: Dispatch Console: Programming Basics (Guided recap)

## Scenario / Context

A Vice City dispatch team is introducing a small Java console. New team members need to explain how it runs, interpret a binary code, and fix a calculation before relying on it.

## Learning Goals

- Explain the roles of the JDK, compiler, and JVM.
- Convert between decimal and binary using Java.
- Diagnose an integer-division error.
- Evaluate an AI-generated coding suggestion before use.

## Prerequisites

A JDK and an IDE or terminal. Create a separate `Main` class.

# Lab Parts

## Part 1: Describe the journey

### What you will do

The JDK supplies development tools, including the compiler. `javac` compiles Java source to bytecode. The JVM executes bytecode. Precise instructions make each step reproducible.

Write a program that prints one sentence for each of these roles: JDK, `javac`, and JVM. Then write down the ordered steps you use to create, compile, and run your program in your environment.

### Success criteria

The output identifies the JDK as development tools, `javac` as the compiler, and the JVM as the bytecode runtime. Your written steps distinguish compilation from execution.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Think about writing, translating, and executing code.

</details>

<details>
<summary>Hint 2</summary>

The compiler produces bytecode, not the final printed output.

</details>

<details>
<summary>Hint 3</summary>

Try a sentence beginning `javac compiles Java source to ...`.

</details>

## Part 2: Read a binary code

### What you will do

Binary uses place values that are powers of two. `Integer.toBinaryString` represents a decimal integer in binary. `Integer.parseInt` can interpret text in a specified base.

Convert decimal `13` to binary and binary text `"10110"` to decimal. Print both results and explain the place values for `10110`.

### Success criteria

The results are `1101` and `22`. The place values for `10110` add up to `16 + 4 + 2`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Each binary digit represents a power of two.

</details>

<details>
<summary>Hint 2</summary>

Use the integer conversion methods for both directions.

</details>

<details>
<summary>Hint 3</summary>

Try `Integer.parseInt("10110", 2)`.

</details>

## Part 3: Debug a calculation

### What you will do

Dividing two `int` values uses integer division even when the result is assigned to a `double`. Convert an operand before division to preserve the fraction.

A suggested calculation is `int tickets = 5; int people = 2; double each = tickets / people;`. Predict its output, implement and fix it, and print the corrected value. Explain one way to check an AI-generated suggestion without sharing private data.

### Success criteria

The original expression evaluates to `2.0`; the corrected result is `2.5`. Your explanation includes an independent check such as testing a known example or consulting Java documentation.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Identify the types used by the division itself.

</details>

<details>
<summary>Hint 2</summary>

Changing the result type alone is too late.

</details>

<details>
<summary>Hint 3</summary>

Try `(double) tickets / people` and compare against `5 / 2.0`.

</details>

# Bonus Challenge (Optional)

Add a check for zero people that reports an error instead of calculating a result.

# Reflection Questions

1. Why is compilation separate from executing bytecode?
2. What is the advantage of writing precise setup instructions?
3. What would happen if binary input contained a digit other than 0 or 1?
4. What information would help diagnose a missing JDK?
5. How did the operand types explain the original calculation?
6. How would a known example help reveal an AI suggestion's mistake?
7. How could you convert a different binary code?
8. What private information should stay out of an AI prompt?
