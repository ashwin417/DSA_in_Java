package Ultimate_Java_Masterclass.Problem3;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 to concatenate with String1 : ");
        String str2 = sc.nextLine();

        String str3 = str1 + str2;
        System.out.println("Concatenated String is : "+str3);
    }
}
