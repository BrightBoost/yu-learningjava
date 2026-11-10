## 🏫 Your OOP Exercise: School!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create `Student` and `Teacher` classes. Give each a `String name` field.
2. Create a `Course` class with:
   - `String name`
   - `Teacher teacher`
   - An initialized `ArrayList<Student>` for enrolled students. Remember to import `java.util.ArrayList`.
3. Add an `enroll(Student student)` method to `Course`. For this exercise, only enroll a given student once per course.
4. Add a `printDetails()` method that prints the course name, teacher's name, and every enrolled student's name. Show a message when there are no students.
5. Create a `School` class with a name and an initialized `ArrayList<Course>`. Remember the import here too.
6. Add methods to add a course and print all course details.
7. Add a method that returns the total number of **enrollments** across all courses. A student taking two courses counts twice.
8. In `App`'s `main` method, create two teachers, three students, and two courses. Enroll two students in the first course and two in the second, with one student attending both.
9. Add the courses to the school. Print the school and check that the total is **four enrollments**.

### 💡 Bonus

Try a different combination of courses for a student. How does that affect the total number of enrollments?
