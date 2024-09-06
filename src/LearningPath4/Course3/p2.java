package LearningPath4.Course3;

import java.util.Arrays;
import java.util.Scanner;

public class p2 {

    // Task - Level 3: Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
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
            if (arr[j] < pivot) {
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

    // Task - Level 3: Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, middle + 1, rightArr, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Task - Level 3: Shell Sort
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    // Task - Level 1: Initialize the student grades array
    public static void initializeStudentGrades(int[] grades) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student grades:");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }
    }

    // Task - Level 2: Search for duplicate in an array
    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr); // Sorting to make comparison easier
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] studentGrades = new int[numStudents];

        // Task - Level 1: Initialize the array
        initializeStudentGrades(studentGrades);

        // Task - Level 2: Search for duplicate in the array
        if (containsDuplicate(studentGrades)) {
            System.out.println("The array contains duplicate values.");
        } else {
            System.out.println("The array does not contain duplicate values.");
        }

        // Task - Level 3: Sorting options
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Quick Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Shell Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                quickSort(studentGrades, 0, studentGrades.length - 1);
                System.out.println("Sorted array using Quick Sort:");
                break;
            case 2:
                mergeSort(studentGrades, 0, studentGrades.length - 1);
                System.out.println("Sorted array using Merge Sort:");
                break;
            case 3:
                shellSort(studentGrades);
                System.out.println("Sorted array using Shell Sort:");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display sorted array
        System.out.println(Arrays.toString(studentGrades));
    }
}
