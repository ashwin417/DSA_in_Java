package LearningPath4.Course3;

import java.util.*;

// Task - Level 1: Implementing a graph
class Graph {
    private final Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int v, int w) {
        adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
        adjList.computeIfAbsent(w, k -> new ArrayList<>()).add(v); // Undirected graph
    }

    // Task - Level 2: Breadth-First Search (BFS)
    public void BFS(int start) {
        System.out.println("Breadth-First Search starting from node " + start);
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Task - Level 2: Depth-First Search (DFS)
    public void DFS(int start) {
        System.out.println("Depth-First Search starting from node " + start);
        boolean[] visited = new boolean[adjList.size()];
        DFSUtil(start, visited);
        System.out.println();
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjList.get(v)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Task - Level 3: Shortest Path Algorithm (using BFS for simplicity)
    public void shortestPath(int start, int end) {
        System.out.println("Finding shortest path from " + start + " to " + end);
        boolean[] visited = new boolean[adjList.size()];
        int[] distance = new int[adjList.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();

            for (int neighbor : adjList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[vertex] + 1;
                    queue.add(neighbor);

                    if (neighbor == end) {
                        System.out.println("Shortest path length is " + distance[neighbor]);
                        return;
                    }
                }
            }
        }

        System.out.println("No path found.");
    }
}

// Task - Level 3: Fibonacci function using recursion
class Fibonacci {
    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}

public class p6 {
    public static void main(String[] args) {
        // Task - Level 1: Graph implementation
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        // Task - Level 2: Breadth-First Search and Depth-First Search
        System.out.println("Graph Traversal:");
        graph.BFS(0);
        graph.DFS(0);

        // Task - Level 3: Shortest path algorithm
        graph.shortestPath(0, 6);

        // Task - Level 3: Fibonacci using recursion
        int n = 10; // Finding the 10th Fibonacci number
        System.out.println("Fibonacci number for n=" + n + ": " + Fibonacci.fibonacciRecursion(n));
    }
}

