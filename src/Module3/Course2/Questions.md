### Assignment – 1

Duration:30 minutes

"Write a java program which accepts multiple employees details ,

1)Create thread class

2)make the use of runnable interface in it."


### Assignment 2

Skill Description:

Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
essential concepts, tools, and techniques required for efficient parallel and reactive programming.

Problem Statement 2:
Extend the program to perform a sequential exploration of a timeline using Sequential Streams.
Implement a method that simulates sequential exploration tasks.

Code:

```
import java.util.List;
public class ParallelUniverseExplorer {
private static final ForkJoinPool pool = new ForkJoinPool();
private static final List<String> sequentialTimeline = List.of(/* sequential timeline data */);
public static void main(String[] args) {
// TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
// TODO: Simulate sequential exploration
}
// TODO: Implement methods for sequential exploration
}
```
Learning Outcomes:

- Apply Sequential Streams for sequential exploration.
- Develop skills in simulating sequential exploration tasks.
This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
reactive communication, and ensuring thread synchronization for shared resources

### Assignment 3

Skill Description:

Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
essential concepts, tools, and techniques required for efficient parallel and reactive programming.

Problem Statement 3:
Enhance the program to perform parallel exploration of multiple timelines using Parallel Streams.
Implement a method that simulates parallel exploration tasks.

Code:
```
import java.util.List;
public class ParallelUniverseExplorer {
private static final ForkJoinPool pool = new ForkJoinPool();
private static final List<String> sequentialTimeline = List.of(/* sequential timeline data */);
private static final List<String> parallelTimelines = List.of(/* parallel timeline data */);
public static void main(String[] args) {
// TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
// TODO: Simulate sequential exploration
// TODO: Simulate parallel exploration
}
// TODO: Implement methods for parallel exploration
}
```
Learning Outcomes:
```
• Utilize Parallel Streams for parallel exploration.
• Develop skills in simulating parallel exploration tasks.
```
This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
reactive communication, and ensuring thread synchronization for shared resources.

### Assignment 4

Skill Description:

Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
essential concepts, tools, and techniques required for efficient parallel and reactive programming

Problem Statement 4:

Problem Statement Description: Extend the program to implement reactive communication
between timelines using Reactive Streams. Utilize Publisher and SubmissionPublisher to
communicate between timelines.

Codings:
```
import java.util.concurrent.SubmissionPublisher;
public class ParallelUniverseExplorer {
private static final ForkJoinPool pool = new ForkJoinPool();
private static final List<String> sequentialTimeline = List.of(/* sequential timeline data */);
private static final List<String> parallelTimelines = List.of(/* parallel timeline data */);
private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
public static void main(String[] args) {
// TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
// TODO: Simulate sequential exploration
// TODO: Simulate parallel exploration
// TODO: Implement reactive communication between timelines
}
// TODO: Implement methods for reactive communication
}
```
Learning Outcomes:
```
• Apply Reactive Streams for inter-timeline communication.
• Gain proficiency in utilizing Publisher and SubmissionPublisher.
```
This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
reactive communication, and ensuring thread synchronization for shared resources.

### Assignment 5

```angular2html
Skill Description:
Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
essential concepts, tools, and techniques required for efficient parallel and reactive programming.
Problem Statement 5:
Problem Statement Description: Introduce thread synchronization techniques using Object#wait(),
notify(), and onSpinWait() to manage shared resources in the exploration process.
Codings:
public class ParallelUniverseExplorer {
 private static final ForkJoinPool pool = new ForkJoinPool();
 private static final List<String> sequentialTimeline = List.of(/* sequential timeline data */);
 private static final List<String> parallelTimelines = List.of(/* parallel timeline data */);
 private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
 private static final Object sharedResource = new Object();
 public static void main(String[] args) {
 // TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
 // TODO: Simulate sequential exploration
 // TODO: Simulate parallel exploration
 // TODO: Implement reactive communication between timelines
 // TODO: Introduce thread synchronization for shared resources
 }
 // TODO: Implement methods for thread synchronization
}
Learning Outcomes:
• Apply thread synchronization techniques for managing shared resources.
• Gain proficiency in using Object#wait(), notify(), and onSpinWait().
This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
reactive communication, and ensuring thread synchronization for shared resources.
```

### Assignment6

```angular2html
Skill Description:
Gain hands-on expertise in Java Concurrency and Multithreading by immersing yourself in the
captivating narrative of the "Parallel Universe Explorer." Through a series of tasks, you'll master
essential concepts, tools, and techniques required for efficient parallel and reactive programming.
Problem Statement 1:
Simulate the initialization of the Parallel Universe Explorer. Utilize ForkJoinPool to create a pool of
threads for parallel tasks and initialize the explorer with a set of tasks represented by
RecursiveAction.
Code:
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
public class ParallelUniverseExplorer {
 private static final ForkJoinPool pool = new ForkJoinPool();
 public static void main(String[] args) {
 // TODO: Initialize the Parallel Universe Explorer with RecursiveAction tasks
 }
 // TODO: Implement RecursiveAction tasks for initializing the explorer
}
Learning Outcomes:
• Apply ForkJoinPool for parallel task execution.
• Gain proficiency in initializing tasks using RecursiveAction.
This assignment provides a comprehensive journey into Java Concurrency and Multithreading,
allowing students to navigate the challenges of the "Parallel Universe Explorer" and gain practical
skills in initializing parallel tasks, exploring timelines sequentially and in parallel, implementing
reactive communication, and ensuring thread synchronization for shared resources
```