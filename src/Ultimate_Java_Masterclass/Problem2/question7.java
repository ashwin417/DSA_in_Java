package Ultimate_Java_Masterclass.Problem2;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime : ");
        int n = sc.nextInt();
        if(primeornot(n))
            System.out.println("The number is prime ");
        else System.out.println("The number is not prime ");
    }

     public static boolean primeornot(int n){
        if(n<=1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
