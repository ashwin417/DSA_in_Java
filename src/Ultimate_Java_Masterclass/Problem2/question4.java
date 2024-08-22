//Write a Java program to create an array of 5 integers. Initialize it. Print all values in even cells in the array using for loop

package Ultimate_Java_Masterclass.Problem2;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers at even positions are: ");
        for (int i = 0; i < 5; i+=2) {
            System.out.print(arr[i] + ",");
        }

    }
}
