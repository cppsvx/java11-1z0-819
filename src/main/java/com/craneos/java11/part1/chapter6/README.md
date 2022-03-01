# Java 11
## CHAPTER 6
### LAMBDAS AND FUNCTIONAL INTERFACES

* Lambda expressions, or lambdas, allow passing around blocks of code.
  The full syntax looks like this:
```
(String a, String b) -> { return a.equals(b); }
```
The parameter types can be omitted. When only one parameter is specified
without a type the parentheses can also be omitted.
* The braces and return statement can be omitted for a single statement, making the short form as
  follows:
```
a -> a.equals(b)
```
* Lambdas are passed to a method expecting an instance of a functional
  interface.
* A functional interface is one with a single abstract method. Predicate is a
  common interface that returns a boolean and takes any type.
* Consumer takes any type and doesn’t return a value.
* Supplier returns a value and  does not take any parameters.
* 'Comparator' takes two parameters and returns an int.
* A lambda can define parameters or variables in the body as long as their
  names are different from existing local variables. The body of a lambda is
  allowed to use any instance or class variables. Additionally, it can use any
  local variables or method parameters that are effectively final.

#### METHODS
| Keyword     | Type      |
| ------------| ------------- |
| **removeIf()** | on a List and a Set takes a Predicate. |
| **sort()**     | a List interface takes a Comparator.  |
| **forEach()**  | on a List and a Set interface both take a Consumer. |