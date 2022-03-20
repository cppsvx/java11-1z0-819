# Java 11
## CHAPTER 15

#### EXAM
Which of the following classes contain at least one compiler error? (Choose all that apply.)
```
class Danger extends RuntimeException {
   public Danger(String message) {
      super();
   }
   public Danger(int value) {
      super((String) null);
   }
}
class Catastrophe extends Exception {
   public Catastrophe(Throwable c) throws RuntimeException{
      super(new Exception());
      c.printStackTrace();
   }
}
class Emergency extends Danger {
   public Emergency() {}
   public Emergency(String message) {
      super(message);
   }
}
```
```
1. Danger
2. Catastrophe
3. Emergency
4. All of these classes compile correctly.
5. The answer cannot be determined from the information given.
```

2. Which of the following are common types to localize? (Choose all that apply.)
```
A) Dates
B) Lambda expressions
C) Class names
D) Currency
E) Numbers
F) Variable names
```