package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem2;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Addition  2. Subtraction  3. Multiplication  4. Division\nEnter your operation choice: ");
        int op = sc.nextInt();
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Result after Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Result after Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Result after Multiplication: " + (num1 * num2));
                break;
            case 4:
                if(num2!=0)
                { System.out.print("Result after Division: " + (num1 / num2));}
                else System.out.print("Denominator is zero");
                break;
            default: System.out.println("Invalid operation");
        }
    }
}
