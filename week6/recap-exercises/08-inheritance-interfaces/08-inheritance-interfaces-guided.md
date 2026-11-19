Topics: inheritance, polymorphism, abstract classes, interfaces

---

# Lab: Fleet Roster: Inheritance and Interfaces (Guided recap)

## Scenario / Context

A Vice City fleet manager tracks different vehicles through one shared roster. They need vehicle-specific descriptions and a common service reminder.

## Learning Goals

- Implement an abstract superclass and subclasses.
- Use an interface and polymorphism with a mixed list.
- Evaluate inheritance versus an interface contract.
- Debug constructor delegation and overrides.

## Prerequisites

A JDK, classes, constructors, methods, and lists. Create a separate `Main` class.

# Lab Parts

## Part 1: Define a fleet vehicle

### What you will do

Inheritance models an is-a relationship. An abstract class cannot be instantiated directly; a concrete subclass implements its abstract methods. `super` calls a parent constructor.

Inside `Main`, define abstract `Vehicle` with a private name, a constructor, `getName()`, and abstract `describe()`. Add `Car` and `Bike` subclasses whose constructors call `super(name)` and whose overrides return `Car: <name>` and `Bike: <name>` respectively.

### Success criteria

A car named `Comet` describes itself as `Car: Comet`; a bike named `Sparrow` as `Bike: Sparrow`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Give each subclass the shared name through the parent constructor.

</details>

<details>
<summary>Hint 2</summary>

Use `extends Vehicle` and annotate overrides.

</details>

<details>
<summary>Hint 3</summary>

A constructor can start with `super(name);`.

</details>

## Part 2: Add a service contract

### What you will do

An interface describes a capability. A default method supplies shared behavior, while each implementing class supplies its own service interval.

Define interface `Serviceable` with abstract `int serviceDays()` and default method `reminder()` returning `"Service in "` plus the days plus `" days"`. Have both subclasses implement it: car = 30 days, bike = 14 days.

### Success criteria

A car reminder is `Service in 30 days`; a bike reminder is `Service in 14 days`.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

The common reminder calls the varying interval method.

</details>

<details>
<summary>Hint 2</summary>

Each concrete class implements `Serviceable`.

</details>

<details>
<summary>Hint 3</summary>

Use `default String reminder() { return ... serviceDays() ...; }`.

</details>

## Part 3: Display a mixed fleet

### What you will do

A superclass reference can point to a subclass object. The overridden method runs according to the object's actual type. Check a type before casting to an interface.

Place both objects in a `List<Vehicle>` and print each `describe()` result. For each item, check `instanceof Serviceable` before casting and printing its reminder.

### Success criteria

Both descriptions and their matching reminders appear; dynamic dispatch selects the correct override.

### Hints (progressive — hidden by default)

<details>
<summary>Hint 1</summary>

Iterate through the shared vehicle type.

</details>

<details>
<summary>Hint 2</summary>

Use `instanceof` before the cast.

</details>

<details>
<summary>Hint 3</summary>

Inside the check, call `((Serviceable) vehicle).reminder()`.

</details>

# Bonus Challenge (Optional)

Refactor the hierarchy to avoid the cast and explain the trade-off for vehicles that cannot be serviced.

# Reflection Questions

1. Why make `Vehicle` abstract?
2. What is the trade-off of placing service behavior in an interface?
3. What happens if a new vehicle does not implement `Serviceable`?
4. What information would help diagnose an incorrect service interval?
5. How would you debug a subclass calling the wrong constructor?
6. How would you verify which `describe` implementation runs?
7. How would you add a boat with a different service interval?
8. Where else would a mixed list and interface contract help?
