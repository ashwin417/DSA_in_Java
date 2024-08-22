package Ultimate_Java_Masterclass.Problem1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to program of sum of two numbers!!!");
        System.out.print("Enter number:");
        int num1 = sc.nextInt();
        System.out.print("Enter number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}


//Output :
//Welcome to program of sum of two numbers!!!
//Enter number:56
//Enter number:61
//The sum is: 117
//
//Process finished with exit code 0