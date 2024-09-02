package Module3.Course2.assignment4;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class ParallelUniverseExplorer {

    private static final List<String> sequentialTimeline = List.of("Event1", "Event2", "Event3", "Event4", "Event5");
    private static final List<String> parallelTimelines = List.of("Timeline1-Event1", "Timeline1-Event2", "Timeline2-Event1", "Timeline2-Event2");
    private static final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

    public static void main(String[] args) {
        simulateSequentialExploration();

        simulateParallelExploration();

        simulateReactiveCommunication();
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

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
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
        };

        publisher.subscribe(subscriber);

        parallelTimelines.forEach(publisher::submit);

            publisher.close();
    }
}

