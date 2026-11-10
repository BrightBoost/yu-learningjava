## ✨ Your OOP Exercise: Beauty Salon Booking System!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create these classes and fields:
   - `Customer`: `String name`
   - `Service`: `String name`, `double price`
   - `Appointment`: `Customer customer`, `Service service`, `String time`
   - `Stylist`: `String name`, initialized `ArrayList<Appointment>`
   - `Salon`: `String name`, initialized `ArrayList<Stylist>`

   Remember to import `java.util.ArrayList` in each class that uses it.

2. In `Appointment`, add a `printDetails()` method that prints the time, customer's name, service name, and price.
3. In `Stylist`, add a `bookAppointment(Appointment appointment)` method:
   - Check the stylist's existing appointments for the same time using `.equals(...)`.
   - If the time is already booked, print a message and do **not** add the appointment.
   - Otherwise, add it and print a confirmation.
   - For this exercise, assume every appointment occupies one named time slot; you don't need to calculate durations. Use the same format for every time, such as `"10:30"`.
4. Add a `printSchedule()` method to `Stylist` that prints the stylist's name and their appointments. Show a message for an empty schedule.
5. Add a method to `Stylist` that returns the total price of their accepted appointments.
6. In `Salon`, add methods to add a stylist, print all schedules, and return the total value of bookings across all stylists.
7. In `App`'s `main` method, create two stylists, at least two customers, and at least two services.
8. Book two different times with the first stylist. Try to book a third appointment at one of those same times; check that it is rejected.
9. Book that same time with the second stylist; check that it is accepted because it is a different stylist.
10. Print both schedules and the salon total. Check that the rejected appointment is not included in the total.

### 💡 Bonus

Add a method to cancel an appointment and check that its time becomes available again.
