package LearningPath4.Course3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class p3 {

    // Task - Level 1: Create indexOf function
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // return -1 if the value is not found
    }

    // Task - Level 2: Interface ListIterator<E>
    public static void listIteratorExample(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("Iterating over the list using ListIterator:");
        while (iterator.hasNext()) {
            System.out.println("Next element: " + iterator.next());
        }
        while (iterator.hasPrevious()) {
            System.out.println("Previous element: " + iterator.previous());
        }
    }

    // Task - Level 3: Doubly linked list in Collections
    public static void doublyLinkedListExample() {
        LinkedList<String> doublyLinkedList = new LinkedList<>();
        doublyLinkedList.add("Node 1");
        doublyLinkedList.add("Node 2");
        doublyLinkedList.add("Node 3");

        System.out.println("Doubly Linked List:");
        for (String node : doublyLinkedList) {
            System.out.println(node);
        }

        // Adding and removing elements
        doublyLinkedList.addFirst("Node 0");
        doublyLinkedList.addLast("Node 4");
        System.out.println("After adding elements:");
        for (String node : doublyLinkedList) {
            System.out.println(node);
        }

        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        System.out.println("After removing elements:");
        for (String node : doublyLinkedList) {
            System.out.println(node);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a task to perform:");
        System.out.println("1. Task Level 1: indexOf function");
        System.out.println("2. Task Level 2: ListIterator Example");
        System.out.println("3. Task Level 3: Doubly Linked List Example");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Task Level 1: indexOf function
                System.out.println("Task Level 1: Find the index of an element in an array.");
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();
                int[] arr = new int[size];

                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }

                System.out.print("Enter the value to search for: ");
                int value = scanner.nextInt();
                int index = indexOf(arr, value);

                if (index == -1) {
                    System.out.println("Value not found in the array.");
                } else {
                    System.out.println("Value found at index: " + index);
                }
                break;

            case 2:
                // Task Level 2: ListIterator Example
                LinkedList<Integer> list = new LinkedList<>();
                System.out.println("Task Level 2: ListIterator Example");
                System.out.println("Enter the number of elements in the list:");
                int n = scanner.nextInt();

                System.out.println("Enter the elements:");
                for (int i = 0; i < n; i++) {
                    list.add(scanner.nextInt());
                }

                listIteratorExample(list);
                break;

            case 3:
                // Task Level 3: Doubly Linked List Example
                System.out.println("Task Level 3: Doubly Linked List Example");
                doublyLinkedListExample();
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
