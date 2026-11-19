Topics: exceptions, buffered file reading and writing

---

# Lab: Dispatch Log: Files and Exceptions (Independent recap)

## Scenario / Context

A Vice City dispatch desk records delivery distances in a text file. The dispatcher needs a total and a clear message when the file is unavailable.

## Learning Goals

- Write and read text using buffered streams.
- Parse and total file contents.
- Distinguish missing files from malformed data.
- Evaluate resource management and error reporting.

## Prerequisites

A JDK, strings, loops, and methods. Run from a writable project folder. This exercise creates or replaces `dispatch-distances.txt` in that folder; choose a fresh folder.

# Lab Parts

## Part 1: Write a log

### What you will do

Create or replace `dispatch-distances.txt` with three lines: `12`, `8`, and `5`, using `BufferedWriter` and `FileWriter`. Close the writer with try-with-resources.

### Success criteria

The file contains exactly those three numeric lines in order.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Open the file before writing lines.

</details>

<details>
<summary>Hint 2</summary>

Write each number as text and add a newline.

</details>

<details>
<summary>Hint 3</summary>

Use `try (BufferedWriter writer = new BufferedWriter(new FileWriter(path)))`.

</details>

## Part 2: Read and total

### What you will do

Write `static int totalFile(String path) throws IOException`. Read each line with `BufferedReader` and `FileReader`, parse each as an integer, and return the sum. Print the total for the log.

### Success criteria

The program prints `Total: 25`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Read until there is no next line.

</details>

<details>
<summary>Hint 2</summary>

Initialize an accumulator before the loop.

</details>

<details>
<summary>Hint 3</summary>

Use `while ((line = reader.readLine()) != null)` and add `Integer.parseInt(line)`.

</details>

## Part 3: Report failures

### What you will do

In `main`, handle `IOException` for file operations and `NumberFormatException` for invalid numeric lines with distinct messages. After reading the valid log, attempt to read `missing-dispatch-file.txt`, which must not exist. To test malformed data, temporarily change one of the values your program writes to `oops` and run again; then restore it.

### Success criteria

For the missing file, output starts with `File error:` and the program does not print a fake total. If a line is malformed, print `Invalid distance:` and the parsing error.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Catch the specific failure types separately.

</details>

<details>
<summary>Hint 2</summary>

Keep the missing-file operation inside a try block.

</details>

<details>
<summary>Hint 3</summary>

Use `catch (IOException e)` and print `e.getMessage()`.

</details>

# Bonus Challenge (Optional)

Include the line number in a malformed-distance message while preserving the original exception.

# Reflection Questions

1. Why use buffered readers and writers?
2. What is the trade-off of overwriting the log?
3. What happens when a distance line is malformed?
4. What information would help diagnose a file access failure?
5. How would you debug a total missing the last line?
6. How would you isolate a file error from a parsing error?
7. How would you process a file too large to fit in memory?
8. Where else would line-by-line processing be useful?
