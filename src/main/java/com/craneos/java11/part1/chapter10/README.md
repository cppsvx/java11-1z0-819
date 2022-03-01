# Java 11
## CHAPTER 9
### ADVANCED CLASS DESIGN

RUNTIMEEXCEPTION CLASSES
RuntimeException and its subclasses are **UNCHECKED** exceptions that don’t
have to be handled or declared. They can be thrown by the programmer or
by the JVM. Common RuntimeException classes include the following:
- ArithmeticException Thrown when code attempts to divide by zero
- ArrayIndexOutOfBoundsException Thrown when code uses an illegal
index to access an array
- ClassCastException Thrown when an attempt is made to cast an object
to a class of which it is not an instance
- NullPointerException Thrown when there is a null reference where an
object is required
- IllegalArgumentException Thrown by the programmer to indicate that a
method has been passed an illegal or inappropriate argument
- NumberFormatException Subclass of IllegalArgumentException thrown
when an attempt is made to convert a string to a numeric type but the
string doesn’t have an appropriate format


TRY / CATCH
- Remember that only a try-with-resources statement is permitted to
omit both the catch and finally blocks. A traditional try statement
must have either or both. You can easily distinguish between the two
by the presence of parentheses, (), after the try keyword
  
- AUTOCLOSEABLE
  You can’t just put any random class in a try-with-resources
  statement. Java requires classes used in a try-with-resources
  implement the AutoCloseable interface, which includes a void
  close() method. You’ll learn more about resources that implement
  this method when you study for the 1Z0-816 exam.
####EXAM
- Starts at page 552
- Review 587
- Solutions 1509
####ANSWER
1. B, E
2. A,B,C,D,E,