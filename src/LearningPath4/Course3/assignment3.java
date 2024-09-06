package LearningPath4.Course3;

import java.util.*;

public class assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the algorithm to run:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Heap Sort");
        System.out.println("5. Binary Search");
        System.out.println("6. Hash Table Implementation");
        System.out.println("7. Graph Representation");
        System.out.println("8. Depth-First Search (DFS)");
        System.out.println("9. Breadth-First Search (BFS)");
        System.out.println("10. Dijkstra's Algorithm");
        System.out.println("11. Fibonacci Sequence");
        System.out.println("12. Longest Common Subsequence");
        System.out.println("13. Knapsack Problem");
        System.out.println("14. Huffman Coding");
        System.out.println("15. Algorithm Analysis");
        System.out.println("16. Space Complexity Analysis");
        System.out.println("17. Interpolation Search");
        System.out.println("18. Exponential Search");
        System.out.println("19. Bellman-Ford Algorithm");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bubbleSortDemo();
                break;
            case 2:
                mergeSortDemo();
                break;
            case 3:
                quickSortDemo();
                break;
            case 4:
                heapSortDemo();
                break;
            case 5:
                binarySearchDemo();
                break;
            case 6:
                hashTableDemo();
                break;
            case 7:
                graphRepresentationDemo();
                break;
            case 8:
                dfsDemo();
                break;
            case 9:
                bfsDemo();
                break;
            case 10:
                dijkstraDemo();
                break;
            case 11:
                fibonacciDemo();
                break;
            case 12:
                lcsDemo();
                break;
            case 13:
                knapsackDemo();
                break;
            case 14:
                huffmanCodingDemo();
                break;
            case 15:
                algorithmAnalysisDemo();
                break;
            case 16:
                spaceComplexityAnalysisDemo();
                break;
            case 17:
                interpolationSearchDemo();
                break;
            case 18:
                exponentialSearchDemo();
                break;
            case 19:
                bellmanFordDemo();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    // Bubble Sort
    private static void bubbleSortDemo() {
        System.out.println("Bubble Sort:");
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    private static void mergeSortDemo() {
        System.out.println("Merge Sort:");
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Quick Sort
    private static void quickSortDemo() {
        System.out.println("Quick Sort:");
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Heap Sort
    private static void heapSortDemo() {
        System.out.println("Heap Sort:");
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // Binary Search
    private static void binarySearchDemo() {
        System.out.println("Binary Search:");
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        int result = binarySearch(arr, key);
        System.out.println("Element " + key + " is at index " + result);
    }

    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Hash Table Implementation
    private static void hashTableDemo() {
        System.out.println("Hash Table Implementation:");
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);

        System.out.println("Hash Table: " + hashTable);

        // Retrieval
        System.out.println("Value for key 'B': " + hashTable.get("B"));

        // Deletion
        hashTable.remove("A");
        System.out.println("Hash Table after removing key 'A': " + hashTable);
    }

    // Graph Representation
    private static void graphRepresentationDemo() {
        System.out.println("Graph Representation:");
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("Adjacency List: " + graph.getAdjacencyList());
        System.out.println("Adjacency Matrix: ");
        graph.printAdjacencyMatrix();
    }

    static class Graph {
        private final int vertices;
        private final LinkedList<Integer>[] adjacencyList;
        private final int[][] adjacencyMatrix;

        @SuppressWarnings("unchecked")
        public Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            adjacencyMatrix = new int[vertices][vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjacencyList[source].add(destination);
            adjacencyList[destination].add(source);
            adjacencyMatrix[source][destination] = 1;
            adjacencyMatrix[destination][source] = 1;
        }

        public Map<Integer, List<Integer>> getAdjacencyList() {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < vertices; i++) {
                map.put(i, adjacencyList[i]);
            }
            return map;
        }

        public void printAdjacencyMatrix() {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Depth-First Search (DFS)
    private static void dfsDemo() {
        System.out.println("Depth-First Search (DFS):");
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        boolean[] visited = new boolean[4];
        dfs(graph, 0, visited);
    }

    private static void dfs(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : graph.adjacencyList[vertex]) {
            if (!visited[adj]) {
                dfs(graph, adj, visited);
            }
        }
    }

    // Breadth-First Search (BFS)
    private static void bfsDemo() {
        System.out.println("Breadth-First Search (BFS):");
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        boolean[] visited = new boolean[4];
        bfs(graph, 0, visited);
    }

    private static void bfs(Graph graph, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adj : graph.adjacencyList[vertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }

    // Dijkstra's Algorithm
    private static void dijkstraDemo() {
        System.out.println("Dijkstra's Algorithm:");
        int[][] graph = {
                {0, 4, 0, 0, 0, 0},
                {4, 0, 8, 0, 0, 0},
                {0, 8, 0, 7, 0, 4},
                {0, 0, 7, 0, 9, 14},
                {0, 0, 0, 9, 0, 10},
                {0, 0, 4, 14, 10, 0}
        };
        dijkstra(graph, 0);
    }

    private static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Fibonacci Sequence
    private static void fibonacciDemo() {
        System.out.println("Fibonacci Sequence:");
        int n = 10; // For example, first 10 numbers
        System.out.println("Recursive:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println("\nDynamic Programming:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciDP(i) + " ");
        }
        System.out.println();
    }

    private static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private static int fibonacciDP(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    // Longest Common Subsequence
    private static void lcsDemo() {
        System.out.println("Longest Common Subsequence:");
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int result = lcs(X, Y);
        System.out.println("Length of LCS is " + result);
    }

    private static int lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] L = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[m][n];
    }

    // Knapsack Problem
    private static void knapsackDemo() {
        System.out.println("Knapsack Problem:");
        int W = 50; // Maximum weight of knapsack
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int n = values.length;
        int result = knapsack(W, weights, values, n);
        System.out.println("Maximum value in Knapsack = " + result);
    }

    private static int knapsack(int W, int[] weights, int[] values, int n) {
        int[][] K = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    K[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    K[i][w] = Math.max(values[i - 1] + K[i - 1][w - weights[i - 1]], K[i - 1][w]);
                } else {
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        return K[n][W];
    }

    // Huffman Coding
    private static void huffmanCodingDemo() {
        System.out.println("Huffman Coding:");
        String text = "this is an example for huffman encoding";
        HuffmanCoding huffman = new HuffmanCoding();
        Map<Character, String> huffmanCode = huffman.buildHuffmanTree(text);
        System.out.println("Huffman Codes: " + huffmanCode);

        String encodedString = huffman.encode(text, huffmanCode);
        System.out.println("Encoded String: " + encodedString);

        String decodedString = huffman.decode(encodedString, huffmanCode);
        System.out.println("Decoded String: " + decodedString);
    }

    static class HuffmanCoding {
        private final Map<Character, Integer> freqMap = new HashMap<>();
        private final Map<Character, String> huffmanCode = new HashMap<>();

        public Map<Character, String> buildHuffmanTree(String text) {
            // Build frequency map
            for (char c : text.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            // Build priority queue
            PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.freq));
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
            }

            // Build Huffman Tree
            while (pq.size() > 1) {
                HuffmanNode left = pq.poll();
                HuffmanNode right = pq.poll();
                HuffmanNode newNode = new HuffmanNode('\0', left.freq + right.freq, left, right);
                pq.add(newNode);
            }

            // Build Huffman Code Map
            HuffmanNode root = pq.peek();
            buildHuffmanCode(root, "");
            return huffmanCode;
        }

        private void buildHuffmanCode(HuffmanNode root, String code) {
            if (root != null) {
                if (root.left == null && root.right == null) {
                    huffmanCode.put(root.character, code);
                }
                buildHuffmanCode(root.left, code + '0');
                buildHuffmanCode(root.right, code + '1');
            }
        }

        public String encode(String text, Map<Character, String> huffmanCode) {
            StringBuilder sb = new StringBuilder();
            for (char c : text.toCharArray()) {
                sb.append(huffmanCode.get(c));
            }
            return sb.toString();
        }

        public String decode(String encodedString, Map<Character, String> huffmanCode) {
            Map<String, Character> reverseHuffmanCode = new HashMap<>();
            for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
                reverseHuffmanCode.put(entry.getValue(), entry.getKey());
            }

            StringBuilder sb = new StringBuilder();
            StringBuilder code = new StringBuilder();
            for (char c : encodedString.toCharArray()) {
                code.append(c);
                if (reverseHuffmanCode.containsKey(code.toString())) {
                    sb.append(reverseHuffmanCode.get(code.toString()));
                    code.setLength(0);
                }
            }
            return sb.toString();
        }

        static class HuffmanNode {
            char character;
            int freq;
            HuffmanNode left;
            HuffmanNode right;

            HuffmanNode(char character, int freq) {
                this(character, freq, null, null);
            }

            HuffmanNode(char character, int freq, HuffmanNode left, HuffmanNode right) {
                this.character = character;
                this.freq = freq;
                this.left = left;
                this.right = right;
            }
        }
    }

    // Algorithm Analysis
    private static void algorithmAnalysisDemo() {
        System.out.println("Algorithm Analysis:");
        int[] array = {10, 5, 2, 8, 15};
        long startTime, endTime;

        // Bubble Sort
        int[] bubbleArray = array.clone();
        startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endTime - startTime) + " ns");

        // Quick Sort
        int[] quickArray = array.clone();
        startTime = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length - 1);
        endTime = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endTime - startTime) + " ns");
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Space Complexity Analysis
    private static void spaceComplexityAnalysisDemo() {
        System.out.println("Space Complexity Analysis:");
        int[] array = new int[10000];
        System.out.println("Space Complexity of Array: O(n)");
    }

    // Interpolation Search
    private static void interpolationSearchDemo() {
        System.out.println("Interpolation Search:");
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 70;
        int index = interpolationSearch(sortedArray, target);
        System.out.println("Element found at index: " + index);
    }

    private static int interpolationSearch(int[] array, int target) {
        int lo = 0, hi = array.length - 1;
        while (lo <= hi && target >= array[lo] && target <= array[hi]) {
            int pos = lo + ((target - array[lo]) * (hi - lo)) / (array[hi] - array[lo]);
            if (array[pos] == target) {
                return pos;
            }
            if (array[pos] < target) {
                lo = pos + 1;
            } else {
                hi = pos - 1;
            }
        }
        return -1;
    }

    // Exponential Search
    private static void exponentialSearchDemo() {
        System.out.println("Exponential Search:");
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int index = exponentialSearch(sortedArray, target);
        System.out.println("Element found at index: " + index);
    }

    private static int exponentialSearch(int[] array, int target) {
        if (array[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < array.length && array[i] <= target) {
            i *= 2;
        }

        return binarySearch(array, i / 2, Math.min(i, array.length - 1), target);
    }

    private static int binarySearch(int[] array, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    // Bellman-Ford Algorithm
    private static void bellmanFordDemo() {
        System.out.println("Bellman-Ford Algorithm:");
        int V = 5;
        int[][] graph = {
                {0, -1, 4, 0, 0},
                {0, 0, 3, 2, 2},
                {0, 0, 0, 5, 0},
                {0, 0, 0, 0, 3},
                {0, 0, 0, 0, 0}
        };
        int[] distances = bellmanFord(graph, 0, V);
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + distances[i]);
        }
    }

    private static int[] bellmanFord(int[][] graph, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
        }

        // Check for negative weight cycles
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                }
            }
        }

        return dist;
    }

    // Depth-First Search (DFS) Traversal
    private static void dfsTraversalDemo() {
        System.out.println("Depth-First Search (DFS) Traversal:");
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        boolean[] visited = new boolean[5];
        System.out.print("DFS Traversal: ");
        dfsTraversal(graph, 0, visited);
        System.out.println();
    }

    private static void dfsTraversal(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : graph.adjacencyList[vertex]) {
            if (!visited[adj]) {
                dfsTraversal(graph, adj, visited);
            }
        }
    }

    // Breadth-First Search (BFS) Traversal
    private static void bfsTraversalDemo() {
        System.out.println("Breadth-First Search (BFS) Traversal:");
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        boolean[] visited = new boolean[5];
        System.out.print("BFS Traversal: ");
        bfsTraversal(graph, 0, visited);
        System.out.println();
    }

    private static void bfsTraversal(Graph graph, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adj : graph.adjacencyList[vertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }
}
