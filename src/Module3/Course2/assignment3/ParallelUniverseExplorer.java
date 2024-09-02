package Module3.Course2.assignment3;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = List.of("Event1", "Event2", "Event3", "Event4", "Event5");
    private static final List<String> parallelTimelines = List.of("Timeline1-Event1", "Timeline1-Event2", "Timeline2-Event1", "Timeline2-Event2");

    public static void main(String[] args) {
        simulateSequentialExploration();

        simulateParallelExploration();
    }

    private static void simulateSequentialExploration() {
        System.out.println("Sequential Exploration:");
        sequentialTimeline.forEach(event -> System.out.println("Sequentially exploring: " + event));
    }

    private static void simulateParallelExploration() {
        System.out.println("\nParallel Exploration:");
        parallelTimelines.parallelStream().forEach(event -> System.out.println("Parallel exploring: " + event));
    }
}
