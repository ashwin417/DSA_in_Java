package Ultimate_Java_Masterclass.Problem4;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Entered Integer Numbers are " + a + ", " + b);
        System.out.println("Swapping both using Generic class...");
        doswap(a, b);

        System.out.println("Enter String 1:");
        sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();
        System.out.println("Entered Strings are " + s1 + " and " +s2);
        doswap(s1, s2);
    }

    public static <T> void doswap(T x, T y) {
        T temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping = "+x+", "+y);
    }
}
