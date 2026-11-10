## 📖 Your OOP Exercise: Library Shelf!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create an `Author` class with a `String name` field.
2. Create a `Book` class with:
   - `String title`
   - `Author author`
   - `boolean available`
3. Add a `printDetails()` method to `Book` that prints its title, author's name, and availability.
4. Create a `LibraryShelf` class with an initialized `ArrayList<Book>` field. Remember to import `java.util.ArrayList`.
5. Add an `addBook(Book book)` method and a `printBooks()` method. The latter should call `printDetails()` for each book.
6. Add a `borrowBook(String title)` method:
   - Look for a book whose title matches using `.equals(...)`.
   - If you find it and it is available, set `available` to `false` and print a success message.
   - If you find it but it is unavailable, print that it has already been borrowed.
   - If no book matches, print that it was not found.
   - Stop searching once you find a match. For this exercise, use different titles for the books.
7. In `App`'s `main` method, create authors and at least two available books. Add the books to a shelf.
8. Borrow one book, try borrowing it again, and try a title that does not exist. Print the shelf afterward to check its state.

### 💡 Bonus

Add a method for returning a borrowed book.
