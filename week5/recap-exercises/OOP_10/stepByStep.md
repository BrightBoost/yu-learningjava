## ⚔️ Your OOP Exercise: Adventure Game!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create an `Item` class with `String name` and `int healingAmount` fields.
2. Create a `Player` class with:
   - `String name`
   - `int health`
   - `int maxHealth`
   - An initialized `ArrayList<Item>` inventory. Remember to import `java.util.ArrayList`.
3. Add a `pickUp(Item item)` method that adds an item to the inventory.
4. Add a `printInventory()` method that prints each item's name and healing amount. Print a message if the inventory is empty.
5. Add a `useItem(String itemName)` method:
   - Find the first item with a matching name using `.equals(...)`.
   - Add its healing amount to health, without exceeding `maxHealth`. `Math.min(...)` may help.
   - Remove that item from the inventory and print what happened.
   - If no matching item exists, print a message.
   - Stop after using the first matching item.
6. In `App`'s `main` method, create a player with health `70` and maximum health `100`. Add two healing items with different names.
7. Use an item that heals `40`. Check that health becomes `100`, not `110`, and that the item is gone.
8. Try using the same item again and check that the missing-item message appears.

### 💡 Bonus

Give some items a healing value of `0` and describe what they might be used for in a future version of the game.
