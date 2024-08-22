package Ultimate_Java_Masterclass.Problem3;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings to compare: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.equals(str2))
            System.out.println("Both are the same according to \"equals\"");
        else
            System.out.println("Both are not the same according to \"equals\"");

        if(str1 == str2)
            System.out.println("Both are the same according to \"==\"");
        else
            System.out.println("Both are not the same according to \"==\"");

        if (str2.compareTo(str1) == 0)
            System.out.println("Both are the same according to \"compareTo\"");
        else
            System.out.println("Both are not the same according to \"compareTo\"");
    }
}
