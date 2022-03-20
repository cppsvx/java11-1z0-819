# Java 11
## CHAPTER 14

### GENERICS AND COLLECTIONS

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

### Method References

There are four formats for method references:
- Static methods
- Instance methods on a particular instance
- Instance methods on a parameter to be determined at runtime
- Constructors

### Collections
There are four main interfaces in the Java Collections Framework:
- List: A list is an ordered collection of elements that allows duplicate entries. 
Elements in a list can be accessed by an int index.
- Set: A set is a collection that **does not allow duplicate entries**.
- Queue: A queue is a collection that orders its elements in a specific order for processing. 
A typical queue processes its elements in a first‐in, firstout order, but other orderings are possible.
- Map: A map is a collection that maps keys to values, with **no duplicate keys allowed**. The elements in a map are key/value pairs.
```
            COLLECTION
                |
      -------------------------------------
      |                       |           |
     List                   Queue        Set                           Map
  -----------       -----------       ------------               ---------------
  |         |       |                 |          |               |             |
ArrayList  LinkedList               HashSet    TreeSet         HashMap       TreeMap
```
Notice that **Map doesn't implement the Collection interface**. B**ut it is
considered part of the Java Collections Framework**, even though it isn't
technically a Collection. It is a collection (note the lowercase), though, in
that it contains a group of objects. The reason why maps are treated
differently is that they need different methods due to being key/value
pairs.



####EXAM
- Starts at page 840
- Review 
- Solutions

####ANSWERS