# Java 11
## CHAPTER 18

### CONCURRENCY
The property of executing multiple threads and processes at the same time is referred to as concurrency.

CALLING RUN() INSTEAD OF START()
Be careful with code that attempts to start a thread by calling run() instead of start(). Calling run() on a Thread or a Runnable does
not actually start a new thread. While the following code snippets  will compile, none will actually execute a task on a separate thread:
```
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

####EXAM
- Starts at page 1139
- Review 
- Solutions 