package Module3.Course2.assignment5;

import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

public class ParallelUniverseExplorer {
    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = List.of("Event1", "Event2", "Event3", "Event4", "Event5");
    private static final List<String> parallelTimelines = List.of("Timeline1-Event1", "Timeline1-Event2", "Timeline2-Event1", "Timeline2-Event2");
    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
    private static final Object sharedResource = new Object();

    public static void main(String[] args) {
        simulateSequentialExploration();

        simulateParallelExploration();

        simulateReactiveCommunication();

        simulateThreadSynchronization();
    }

    private static void simulateSequentialExploration() {
        System.out.println("Sequential Exploration:");
        sequentialTimeline.forEach(event -> System.out.println("Sequentially exploring: " + event));
    }

    private static void simulateParallelExploration() {
        System.out.println("\nParallel Exploration:");
        parallelTimelines.parallelStream().forEach(event -> System.out.println("Parallel exploring: " + event));
    }

    private static void simulateReactiveCommunication() {
        System.out.println("\nReactive Communication:");

        publisher.subscribe(new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1); // Request one item at a time
            }

            @Override
            public void onNext(String item) {
                System.out.println("Subscriber received: " + item);
                subscription.request(1); // Request the next item
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error occurred: " + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("All events processed.");
            }
        });

        parallelTimelines.forEach(publisher::submit);

        publisher.close();
    }

    private static void simulateThreadSynchronization() {
        System.out.println("\nThread Synchronization:");

        Thread t1 = new Thread(() -> {
            synchronized (sharedResource) {
                System.out.println("Thread 1: Working with the shared resource.");
                try {
                    System.out.println("Thread 1: Waiting...");
                    sharedResource.wait(); // Wait for the notification
                    System.out.println("Thread 1: Resumed.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (sharedResource) {
                System.out.println("Thread 2: Preparing to notify Thread 1.");
                sharedResource.notify(); // Notify the waiting thread
                System.out.println("Thread 2: Notified Thread 1.");
            }
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3: Entering spin-wait.");
            for (int i = 0; i < 5; i++) {
                Thread.onSpinWait();
                System.out.println("Thread 3: Spin-waiting... " + i);
            }
            System.out.println("Thread 3: Spin-wait complete.");
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
