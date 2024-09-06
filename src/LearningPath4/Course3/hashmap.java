package LearningPath4.Course3;

import java.util.*;

public class hashmap {

    public static void main(String[] args) {
        // Task - Level 1: Creating HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentMap.put(101, "Mujya");
        studentMap.put(102, "Jeffi");
        studentMap.put(103, "Persis");
        studentMap.put(104, "Jeffery");
        studentMap.put(105, "Momo");

        System.out.println("Unordered HashMap: " + studentMap);

        // Task - Level 2: Searching the HashMap using various methods
        // a. containsKey()
        int searchKey = 102;
        if (studentMap.containsKey(searchKey)) {
            System.out.println("HashMap contains the key: " + searchKey);
        } else {
            System.out.println("HashMap does not contain the key: " + searchKey);
        }

        // b. containsValue()
        String searchValue = "Alice";
        if (studentMap.containsValue(searchValue)) {
            System.out.println("HashMap contains the value: " + searchValue);
        } else {
            System.out.println("HashMap does not contain the value: " + searchValue);
        }

        // c. get()
        int getKey = 103;
        String value = studentMap.get(getKey);
        System.out.println("The value associated with key " + getKey + " is: " + value);

        // Task - Level 3: Creating an unsorted HashMap and adding unordered key-value pairs
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Orange", 3);
        unsortedMap.put("Mango", 8);
        unsortedMap.put("Pineapple", 4);

        System.out.println("\nUnsorted HashMap (Fruit Quantities): " + unsortedMap);

        // Creating a TreeMap to sort the key-value pairs based on the keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

        // Printing the sorted TreeMap using entrySet()
        System.out.println("\nSorted TreeMap (by Keys):");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Sorting the values (fruits based on their quantities)
        System.out.println("\nSorted by Values (Quantities):");
        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
