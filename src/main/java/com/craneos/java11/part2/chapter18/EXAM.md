# Java 11
## CHAPTER 18

1. Given an instance of a Stream s and a Collection c, which are valid
   ways of creating a parallel stream? (Choose all that apply.)
```
A) new ParallelStream(s)
B) c.parallel()
C) s.parallelStream()
D) c.parallelStream()
E) new ParallelStream(c)
F) s.parallel()
```


2. Given that the sum of the numbers from 1 (inclusive) to 10 (exclusive) is 45, what are the possible
results of executing the following program? (Choose all that apply.)
```java
import java.util.concurrent.locks.*;
import java.util.stream.*;
public class Bank {
   private Lock vault = new ReentrantLock();
   private int total = 0;
   public void deposit(int value) {
      try {
         vault.tryLock();
         total += value;
      } finally {
         vault.unlock();
      }
   }
   public static void main(String[] unused) {
      var bank = new Bank();
      IntStream.range(1, 10).parallel()
      .forEach(s -> bank.deposit(s));
      System.out.println(bank.total);
   } }
```
```
A) 45 is printed.
B) A number less than 45 is printed. 
C) A number greater than 45 is printed. 
D) An exception is thrown.
E) None of the above, as the code does not compile
```

3. Which of the following statements about the Callable call() and Runnable run() methods are correct?
(Choose all that apply.)
```
A) Both can throw unchecked exceptions. 
B) Callable takes a generic method argument.
C) Callable can throw a checked exception.
D) Both can be implemented with lambda expressions. 
E) Runnable returns a generic type. 
F) Callable returns a generic type.
G) Both methods return void.
```

4. Which lines need to be changed to make the code compile? (Choose all that apply.)
```java
ExecutorService service = // w1
Executors.newSingleThreadScheduledExecutor();
service.scheduleWithFixedDelay(() -> {
  System.out.println("Open Zoo");
  return null; // w2
  }, 0, 1, TimeUnit.MINUTES);
var result = service.submit(() -> // w3
System.out.println("Wake Staff"));
System.out.println(result.get()); // w4
```
```
A) It compiles and runs without issue.
B) Line w1
C) Line w2
D) Line w3
E) Line w4
F) It compiles but throws an exception at runtime.
G) None of the above
```

5. What statement about the following code is true?
```java
   var value1 = new AtomicLong(0);
   final long[] value2 = {0};
   IntStream.iterate(1, i -> 1).limit(100).parallel()
      .forEach(i -> value1.incrementAndGet());
   IntStream.iterate(1, i -> 1).limit(100).parallel()
      .forEach(i -> ++value2[0]);
   System.out.println(value1+" "+value2[0]);
```
```
A) It outputs 100 100.
B) It outputs 100 99.
C) The output cannot be determined ahead of time.
D) The code does not compile.
E) It compiles but throws an exception at runtime.
F) It compiles but enters an infinite loop at runtime.
G) None of the above
```

6. Which statements about the following code are correct? (Choose all that apply.)
```java
public static void main(String[] args) throws Exception {
   var data = List.of(2,5,1,9,8);
   data.stream().parallel()
   .mapToInt(s -> s)
   .peek(System.out::println)
   .forEachOrdered(System.out::println);
}
```
```
A) The peek() method will print the entries in the order: 1 2 5 8 9.
B) The peek() method will print the entries in the order: 2 5 1 9 8.
C) The peek() method will print the entries in an order that cannot be determined 
   ahead of time.
D) The forEachOrdered() method will print the entries in the order: 1 2 5 8 9.
E) The forEachOrdered() method will print the entries in the order: 2 5 1 9 8.
F) The forEachOrdered() method will print the entries in an order that cannot be 
   determined ahead of time.
G) The code does not compile.
```

7. Fill in the blanks: __________ occur(s) when two or more threads are blocked forever but 
both appear active. __________ occur(s) when two or more threads try to complete a related task
at the same time, resulting in invalid or unexpected data.
```
A) Livelock, Deadlock 
B) Deadlock, Starvation
C) Race conditions, Deadlock
D) Livelock, Race conditions
E) Starvation, Race conditions
F) Deadlock, Livelock
```