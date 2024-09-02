package Module3.Course2.assignment2;

import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();
    private static final List<String> sequentialTimeline = List.of("Event1", "Event2", "Event3", "Event4", "Event5");

    public static void main(String[] args) {
        sequentialTimeline.forEach(event -> System.out.println("Sequentially exploring: " + event));

        ParallelExplorationTask task = new ParallelExplorationTask(sequentialTimeline, 0, sequentialTimeline.size());
        pool.invoke(task);
    }

    private static class ParallelExplorationTask extends RecursiveAction {
        private static final int THRESHOLD = 2;
        private List<String> timeline;
        private int start, end;

        public ParallelExplorationTask(List<String> timeline, int start, int end) {
            this.timeline = timeline;
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Parallel exploring: " + timeline.get(i));
                }
            } else {
                int middle = (start + end) / 2;
                ParallelExplorationTask leftTask = new ParallelExplorationTask(timeline, start, middle);
                ParallelExplorationTask rightTask = new ParallelExplorationTask(timeline, middle, end);

                leftTask.fork();
                rightTask.fork();

                leftTask.join();
                rightTask.join();
            }
        }
    }
}
