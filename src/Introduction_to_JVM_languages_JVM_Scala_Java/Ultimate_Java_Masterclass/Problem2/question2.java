package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        System.out.println("Enter N to calculate sum upto N numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
        int sumofdiv = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumofdiv = sumofdiv + i;
            }
        }
        System.out.println("The sum of Divisors is: " + sumofdiv);

    }
}
