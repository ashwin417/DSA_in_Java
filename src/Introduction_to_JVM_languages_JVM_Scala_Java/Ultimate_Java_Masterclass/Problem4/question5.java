package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem4;

import java.util.LinkedList;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("The Linked List is : "+list);
        System.out.println("Enter the element to append in the list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        list.addLast(n);
        System.out.println("The Linked List after appending is : "+list);
    }
}
