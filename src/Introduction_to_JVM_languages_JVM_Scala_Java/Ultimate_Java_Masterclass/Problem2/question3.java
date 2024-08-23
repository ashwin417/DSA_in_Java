package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem2;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b)
        {
            if (a>c)
                System.out.println(a + " is the greatest number ");
            else
                System.out.println(c + " is the greatest number ");
        }
        else
        {
            if(b>c)
                System.out.println(b + " is the greatest number ");
            else
                System.out.println(c + " is the greatest number ");
        }
    }
}
