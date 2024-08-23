//Write a java program to take two integer variables a and b and store 10 and 3 respectively and print the remainder without using modulus operator.


package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        int remainder = a;
        while (remainder >= b) {
            remainder = remainder - b;
        }
        System.out.println("Remainder is " + remainder);

    }
}

//Output:
//Enter number a : 10
//Enter number b : 3
//Remainder is 1
//
//Process finished with exit code 0