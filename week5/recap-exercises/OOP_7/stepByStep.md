## 🛒 Your OOP Exercise: Shopping Basket!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create a `Product` class with `String name` and `double price` fields.
2. Create a `Basket` class with an initialized `ArrayList<Product>` field. Remember to import `java.util.ArrayList`.
3. Add an `addProduct(Product product)` method that adds a product to the list.
4. Add a `calculateTotal()` method that:
   - Starts a `double` total at zero.
   - Loops through the products and adds each price.
   - Returns the total.
5. Add a `printBasket()` method that prints each product's name and price, followed by the total.
6. In `App`'s `main` method, create a basket and add products costing `2.00`, `3.50`, and `1.50`. Check that the total is `7.0`.
7. Print an empty basket too. Its total should be `0.0`.

### 💡 Bonus

Add the same product object twice. Is its price counted once or twice?
