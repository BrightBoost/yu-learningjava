## 💅 Your OOP Exercise: Beauty Salon!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create a `Customer` class with a `String name` field.
2. Create a `Service` class with `String name` and `double price` fields.
3. Create an `Appointment` class with:
   - `Customer customer`
   - `Service service`
   - `String time`, such as `"10:30"`
4. Add a `printDetails()` method to `Appointment` that prints the time, customer, service, and service price.
5. Create a `Salon` class with a `String name` and an initialized `ArrayList<Appointment>`. Remember to import `java.util.ArrayList`.
6. Add methods to:
   - Add an appointment.
   - Print the salon name and all appointment details.
   - Return the total of all booked service prices.
7. In `App`'s `main` method, create at least two customers, two services, and three appointments. Add them to the salon.
8. Print the appointments and the total. If the three services cost `20`, `30`, and `20`, the total should be `70.0`.

### 💡 Bonus

Print only the appointments for a particular customer.
