package Module3.Course2.assignment6;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelUniverseExplorer {

    private static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {
        ExplorerInitializationTask rootTask = new ExplorerInitializationTask(0, 10);

        pool.invoke(rootTask);

        System.out.println("Parallel Universe Explorer initialized.");
    }

    static class ExplorerInitializationTask extends RecursiveAction {
        private static final int THRESHOLD = 3;
        private int start;
        private int end;

        ExplorerInitializationTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if ((end - start) <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    System.out.println("Initializing part of the explorer: " + i);
                }
            } else {
                int mid = (start + end) / 2;
                ExplorerInitializationTask leftTask = new ExplorerInitializationTask(start, mid);
                ExplorerInitializationTask rightTask = new ExplorerInitializationTask(mid, end);

                leftTask.fork();
                rightTask.fork();

                leftTask.join();
                rightTask.join();
            }
        }
    }
}
