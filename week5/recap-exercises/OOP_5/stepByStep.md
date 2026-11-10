## ☕ Your OOP Exercise: Coffee Shop Order!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create a `Drink` class with `String name` and `double price` fields. The price is for one drink.
2. Create an `Order` class with:
   - `String customerName`
   - `Drink drink`
   - `int quantity`
3. Add a `calculateTotal()` method that **returns** the drink's price multiplied by the quantity.
4. Add a `printSummary()` method that prints the customer's name, drink name, quantity, and total. Call `calculateTotal()` from this method.
5. In `App`'s `main` method, create at least two drinks and two orders. Give each order a drink and a positive quantity.
6. Print both summaries. For example, two drinks costing `3.50` each should produce a total of `7.0`.

### 💡 Bonus

Have both orders use the same drink. Change the drink's price and see what happens to their totals.
