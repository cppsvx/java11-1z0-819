# Java 11
## CHAPTER 7
### METHODS AND ENCAPSULATION

####ACCESS MODIFIERS
**private** The private modifier means the method can be called only from
within the same class.

**Default** (Package-Private) Access With default access, the method can
be called only from classes in the same package. This one is tricky
because there is no keyword for default access. You simply omit the
access modifier.

**protected** The protected modifier means the method can be called only
from classes in the same package or subclasses. You’ll learn about
subclasses in Chapter 8, "Class Design."

**public** The public modifier means the method can be called from any
class.

####OPTIONAL MODIFIERS
**abstract** The abstract modifier is used when a method body is not
provided. It will be covered in Chapter 9.

**final** The final modifier is used when a method is not allowed to be
overridden by a subclass. It will also be covered in Chapter 8.

**synchronized** The synchronized modifier is used with multithreaded
code. It is on the 1Z0-816 exam, but not the 1Z0-815 exam.

**native** The native modifier is used when interacting with code written in
another language such as C++. It is not on either OCP 11 exam.

**strictfp** The strictfp modifier is used for making floating-point
calculations portable. It is not on either OCP 11 exam.


####EXAM
1 - 
2 -
3 - 4
13. E. If a variable is static final, it must be set exactly once, and it must
    be in the declaration line or in a static initialization block. Line 4 doesn’t
    compile because bench is not set in either of these locations. Line 15
    doesn’t compile because final variables are not allowed to be set after
    that point. Line 11 doesn’t compile because name is set twice: once in the
    declaration and again in the static block. Line 12 doesn’t compile
    because rightRope is set twice as well. Both are in static initialization
    blocks.