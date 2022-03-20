# Java 11
## CHAPTER 15

### FUNCTIONAL PROGRAMMING

Functional interfaces used in this chapter

| Functional interfaces |  Return type | Method name | #parameters |
| ------ | ------ | ------ | ------ |
| Supplier\<T\> | T | get() | 0 |
| Consumer\<T\> | void | accept(T) | 1(T) |
| BiConsumer<T, U> | void | accept(T,U) | 2(T,U) |
| Predicate\<T\> | boolean | test(T) | 1(T) |
| BiPredicate<T,U> | boolean | test(T,U) | 2(T,U) |
| Function<T, R> | R | apply(T) | 1(T) |
| BiFunction<T,U,R> | R | apply(T,U) | 2(T,U) |
| UnaryOperator\<T\> | T | apply(T) | 1(T) |
| BinaryOperator\<T\> | T | apply(T,T) | 2(T,T) |

### STREAMS
#### USING COMMON TERMINAL OPERATIONS

| Method | What happens for infinite streams | Return value | Reduction |
| ------ | ------ | ------ | ------ |
| count() | DNT (Does not terminate) | long | Yes |
| min() | DNT | Optional<T> | Yes |
| max() | DNT | Optional<T> | No |
| findAny() | Terminates | Optional<T> | No |
| findFirst() | Terminates | Optional<T> | No |
| allMatch() | Sometimes terminates | boolean | No |
| anyMatch() | Sometimes terminates | boolean | No |
| noneMatch() | Sometimes terminates | boolean | No |
| forEach() | DNT | void | No |
| reduce() | DNT | Varies | Yes |
| collect() | DNT | Varies | Yes |

#### COLLECTING RESULTS
| Collector | Description | Return value when passed to collect |
| ------ | ------ | ------ |
| averagingDouble(ToDoubleFunction f) | Calc average for the three core primitive types | Double |
| averagingInt(ToIntFunction f) | " | " |
| averagingLong(ToLongFunction f) | " | " |
| counting() | Counts the number of elements | Long |
| groupingBy(Function f) | Creates a map grouping by the specified function with the optional map type supplier and optional downstream collector | Map<K, List<T>> |
| groupingBy(Function f, Collector dc) | " | " |
| groupingBy(Function f, Supplier s, Collector dc) | " | " |
| joining(CharSequence cs) | Creates a single String using cs as a delimiter between elements if one is specified | String |
| maxBy(Comparator c) | Finds the largest/smallest elements | Optional<T> |
| minBy(Comparator c) | " | " |
| mapping(Function f, Collector dc) | Adds another level of collectors | Collector |
| partitioningBy(Predicate p) | Creates a map grouping by the specified predicate with the optional further downstream collector | Map<Boolean, List<T>> |
| partitioningBy(Predicate p, Collector dc) | " | " |
| summarizingDouble(ToDoubleFunction f) | Calculates average, min, max, and so on | DoubleSummaryStatistics |
| summarizingInt(ToIntFunction f) | " | IntSummaryStatistics |
| summarizingLong(ToLongFunction f) | " | LongSummaryStatistics |
| summingDouble(ToDoubleFunction f) | Calculates the sum for our three core primitive types | Double |
| summingInt(ToIntFunction f) | " | Integer |
| summingLong(ToLongFunction f) | " | Long |
| toList() | Creates an arbitrary type of list or set | List |
| toSet() | " | Set |
| toCollection(Supplier s) | Creates a Collection of thespecified type | Collection |
| toMap(Function k, Function v) | Creates a map using functionsto map the keys, values, an optional merge function, and an optional map type supplier | Map |
| toMap(Function k, Function v, BinaryOperator m) | " | " |
| toMap(Function k, Function v, BinaryOperator m, Supplier s) | " | " |


### NOTES
IMPORTANT NOTE
```
On the exam, you might see long or complex pipelines as answer 
choices. If this happens, focus on the differences between the
answers. Those will be your clues to the correct answer. This
approach will also save you time from not having to study the whole
pipeline on each option.
```

####EXAM
- Starts at page 926
- Review 1005
- Solutions 1538