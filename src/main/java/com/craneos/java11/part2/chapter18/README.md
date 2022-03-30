# Java 11
## CHAPTER 18

### CONCURRENCY
The property of executing multiple threads and processes at the same time is referred to as concurrency.

CALLING RUN() INSTEAD OF START()
Be careful with code that attempts to start a thread by calling run() instead of start(). Calling run() on a Thread or a Runnable does
not actually start a new thread. While the following code snippets  will compile, none will actually execute a task on a separate thread:
```java
System.out.println("begin");
(new ReadInventoryThread()).run();
(new Thread(new PrintData())).run();
(new ReadInventoryThread()).run();
System.out.println("end");
```

In general, **you should extend the Thread class only under specific
circumstances**, such as when you are creating your own priority‐based
thread. In most situations, you should implement the Runnable interface
rather than extend the Thread class.

### INCREASING CONCURRENCY WITH POOLS
**SINGLE THREAD**
The single‐thread executor will wait for a thread to become available before running the next  task

| Method | Description |
| ------ | ------ |
| ExecutorService newSingleThreadExecutor() | Creates a single‐threaded executor that uses a singleworker thread operating off an unbounded queue. Results are processed sequentially in the order in which they are submitted. | 
| ScheduledExecutorService newSingleThreadScheduledExecutor() |Creates a single‐threaded executor that can schedule commands to run after a given delay or to execute periodically |

**THREAD POOL**
A pooled‐thread executor can execute the next task concurrently. If
the pool runs out of available threads, the task will be queued by the
thread executor and wait to be completed.

| Method | Description |
| ------ | ------ |
| ExecutorService newCachedThreadPool() | Creates a thread pool that creates new threads as needed but will reuse previously constructed threads when they are available |
| ExecutorService newFixedThreadPool(int) | Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue |
| ScheduledExecutorService newScheduledThreadPool(int) | Creates a thread pool that can schedule commands to run after a given delay or to execute periodically |

### ATOMIC CLASSES
| Method | Description |
| ------ | ------ |
| AtomicBoolean | A boolean value that may be updated atomically | 
| AtomicInteger | An int value that may be updated atomically |
| AtomicLong | A long value that may be updated atomically |

| Method | Operator | Description |
| ------ | ------ | ------ |
| get() | get  | Retrieves the current value | 
| set() | = | Sets the given value, equivalent to the assignment = operator |
| getAndSet() | get and = | Atomically sets the new value and returns the old value |
| incrementAndGet() | ++value | For numeric classes, atomic pre‐increment operation equivalent to ++value |
| getAndIncrement() | value++ | For numeric classes, atomic post‐increment operation equivalent to value++ |
| decrementAndGet() | --value | For numeric classes, atomic pre‐decrement operation equivalent to ‐‐value |
| getAndDecrement() | value-- | For numeric classes, atomic post‐decrement operation equivalent to value‐‐


### CONCURRENT CLASSES
You should use a concurrent collection class anytime that you are going to
have multiple threads modify a collections object outside a synchronized
block or method, even if you don't expect a concurrency problem.

| Method | Description | Elements ordered? | Sorted | Blocking |
| ------ | ------ | ------ | ------ | ------ |
| ConcurrentHashMap | ConcurrentMap | No | No | No
| ConcurrentLinkedQueue | Queue | Yes | No | No
| ConcurrentSkipListMap | ConcurrentMap SortedMap NavigableMap | Yes | Yes | No
| ConcurrentSkipListSet | SortedSet NavigableSet | Yes | Yes | No
| CopyOnWriteArrayList | List | Yes | No | No
| CopyOnWriteArraySet | Set | No | No | No
| LinkedBlockingQueue | BlockingQueue | Yes | No | Yes

### BLOCKING QUEUES
**LinkedBlockingQueue**, which implements the **BlockingQueue** interface. The BlockingQueue is just like
a regular Queue, except that it includes methods that will wait a specific amount of time to complete an
operation.

| Method | Description |
| ------ | ------ |
| offer(E e,long timeout, TimeUnit unit) | Adds an item to the queue, waiting the specified time and returning false if the time elapses before space is available | 
| poll(long timeout, TimeUnit unit) | Retrieves and removes an item from the queue, waiting the specified time and returning null if the time elapses before the item is available |

### UNDERSTANDING LIVENESS
Liveness is the ability of an application to be able to execute in a timely manner.

- **Deadlock**. Deadlock occurs when two or more threads are blocked forever, each waiting on the other.
- **Starvation**. Starvation occurs when a single thread is perpetually denied access to a shared resource or lock.
- **Livelock**. Livelock occurs when two or more threads are conceptually blocked forever, although they 
are each still active and trying to complete their task. Livelock is a special case of resource starvation
in which two or more threads actively try to acquire a set of locks, are unable to do so, and restart part 
of the process.

### RACE CONDITIONS
A race condition is an undesirable result that occurs when two tasks, which should be completed
sequentially, are completed at the same time. We encountered examples of race conditions earlier in
the chapter when we introduced synchronization. E.g.:

```
Olivia and Sophia, are signing up for an account on the zoo's new visitor website. Both of them
want to use the same username, ZooFan, and they each send requests to create the account at the
same time. Possible Outcomes for This Race Condition:
- Both users are able to create accounts.
- Both users are unable to create an account, returning an error message to both users.
- One user is able to create the account, while the other user receives an error message.
```

### PARALLEL STREAMS
Any stream operation that is based on order, including findFirst(),  limit(), or skip(), may 
actually perform more slowly in a parallel environment.

----------------------- ------------------------------------
![Tip](../../../../../../resources/icons/--) important

----------------------------------------------------------------

####EXAM
- Starts at page 1139
- Review 1217
- Solutions 1551