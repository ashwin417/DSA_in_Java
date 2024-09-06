package LearningPath4.Course3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task - Level 1: Create a HashMap and add key-value pairs
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 91);
        studentGrades.put("Eva", 88);

        System.out.println("Unsorted HashMap: " + studentGrades);

        // Task - Level 2: Search the HashMap using various methods
        System.out.println("\nTask - Level 2: Searching in HashMap");

        System.out.print("Enter a name to check if it exists (containsKey): ");
        String keySearch = scanner.nextLine();
        if (studentGrades.containsKey(keySearch)) {
            System.out.println(keySearch + " exists in the HashMap with grade: " + studentGrades.get(keySearch));
        } else {
            System.out.println(keySearch + " does not exist in the HashMap.");
        }

        System.out.print("Enter a grade to check if it exists (containsValue): ");
        int valueSearch = scanner.nextInt();
        if (studentGrades.containsValue(valueSearch)) {
            System.out.println("The grade " + valueSearch + " exists in the HashMap.");
        } else {
            System.out.println("The grade " + valueSearch + " does not exist in the HashMap.");
        }

        // Task - Level 3: Create an unsorted HashMap and then create a sorted TreeMap
        System.out.println("\nTask - Level 3: Sorting the HashMap");

        // Create a TreeMap from the HashMap (this automatically sorts by key)
        TreeMap<String, Integer> sortedMap = new TreeMap<>(studentGrades);
        System.out.println("Sorted TreeMap (by key): " + sortedMap);

        // Sorting the TreeMap by values using Comparator
        TreeMap<String, Integer> sortedByValueMap = new TreeMap<>(
                Comparator.comparing(studentGrades::get)
        );
        sortedByValueMap.putAll(studentGrades);

        // Display the sorted TreeMap (by value)
        System.out.println("Sorted TreeMap (by value): ");
        for (Map.Entry<String, Integer> entry : sortedByValueMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        scanner.close();
    }
}
