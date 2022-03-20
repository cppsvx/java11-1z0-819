# Java 11
## CHAPTER 15

#### EXAM
1. What could be the output of the following?
```
var stream = Stream.iterate("", (s) -> s + "1");
System.out.println(stream.limit(2).map(x -> x + "2"));
```
   
```
A) 12112
B) 212
C) 212112
D) java.util.stream.ReferencePipeline$3@4517d9a3
E) The code does not compile.
F) An exception is thrown.
G) The code hangs.
```

2. What could be the output of the following?
```
Predicate<String> predicate = s -> s.startsWith("g");
var stream1 = Stream.generate(() -> "growl!");
var stream2 = Stream.generate(() -> "growl!");
var b1 = stream1.anyMatch(predicate);
var b2 = stream2.allMatch(predicate);
System.out.println(b1 + " " + b2);
```
```
A) true false
B) true true
C) java.util.stream.ReferencePipeline$3@4517d9a3
D) The code does not compile.
E) An exception is thrown.
F) The code hangs.
```

3. What could be the output of the following?
```
Predicate<String> predicate = s -> s.length()>3;
var stream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
var b1 = stream.noneMatch(predicate);
var b2 = stream.anyMatch(predicate);
System.out.println(b1 + " " + b2);
```
```
A) false false
B) false true
C) java.util.stream.ReferencePipeline$3@4517d9a3
D) The code does not compile.
E) An exception is thrown.
F) The code hangs.
```

4. Which are true statements about terminal operations in a stream that runs
   successfully? (Choose all that apply.)
```
A) At most, one terminal operation can exist in a stream pipeline.
B) Terminal operations are a required part of the stream pipeline in order to
   get a result.
C) Terminal operations have Stream as the return type.
D) The peek() method is an example of a terminal operation.
E) The referenced Stream may be used after calling a terminal operation.
```

5. Which of the following sets result to 8.0? (Choose all that apply.)
```
A) double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));
   
B) double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));
   
C) double result = LongStream.of(6L, 8L, 10L)
   .mapToInt(x -> (int) x)
   .boxed()
   .collect(Collectors.groupingBy(x -> x))
   .keySet()
   .stream()
   .collect(Collectors.averagingInt(x -> x));
   
D) double result = LongStream.of(6L, 8L, 10L)
    .mapToInt(x -> (int) x)
    .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
    .keySet()
    .stream()
    .collect(Collectors.averagingInt(x -> x));
    
E) double result = LongStream.of(6L, 8L, 10L)
    .mapToInt(x -> x)
    .boxed()
    .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
    .keySet()
    .stream()
    .collect(Collectors.averagingInt(x -> x));
    
F) double result = LongStream.of(6L, 8L, 10L)
    .mapToInt(x -> (int) x)
    .boxed()
    .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
    .keySet()
    .stream()
    .collect(Collectors.averagingInt(x -> x));
```