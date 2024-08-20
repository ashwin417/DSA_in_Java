//Problem Statement 1:
//        Perform the Following Tasks & Submit for SME Evaluation (Mandatory for all USERs):
//        1. Create a Java Application to Work with different collections - Arrays, Linked List, Double
//        Linked List and Circular Linked List.
//        2. "Create a data structure two Stacks that represents two stacks. Implementation of two
//        Stacks should use only one array, i.e., both stacks should use the same array for storing
//        elements. Following functions must be supported by two Stacks.
//        push1(int x) –> pushes x to first stack
//        push2(int x) –> pushes x to second stack
//        pop1() –> pops an element from first stack and return the popped element.
//        pop2() –> pops an element from second stack and return the popped element”.
//        3. Write a Java Program to Perform Binary Search using Recursion
//        MAIN OVERALL WHOLE ASSIGNMENT
//        Write a Java Program to work with Queue, Stack, LinkedList, Doubly Linked List, Array List,
//        HashSet.

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your operation:\n" +
                "1. Array\n" +
                "2. Linkedlist\n" +
                "3. Stack\n" +
                "4. Queue\n" +
                "5. HashSet\n" +
                "Enter your choice here:");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                Arrayfunc();
                break;
            case 2:
                Linkedlistfunc();
                break;
            case 3:
                stackfunc();
                break;
            case 4:
                queuefunc();
                break;
            case 5:
                Hashsetfunc();
                break;
            default:
                break;

        }
    }

    // Function for array
    public static void Arrayfunc() {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Entered array numbers are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }

//End of Array function

// LinkedList

    public static void Linkedlistfunc() {

        System.out.println();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int lop;
        do {
            System.out.println("Enter your operation for Linkedlist:" +
                    "1. Add" +
                    "2. Delete" +
                    "3. Print" +
                    "4. Exit LinkedList");
            lop = sc.nextInt();
            switch (lop)
            {
                case 1: linkedlist.add(sc.nextInt());
                break;
                case 2: linkedlist.remove(sc.nextInt());
                break;
                case 3: System.out.println(linkedlist);
                break;
                default: break;
            }
        }while(lop!=4);


//        // Doubly Linkedlist
//        DoublyLinkedList dll = new DoublyLinkedList();
//        for (int i = 0; i < 10; i++) {
//            dll.add(array[i]);
//        }
//        System.out.println("Doubly Linkedlist is: ");
//        dll.print();
    }

    public static void stackfunc() {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int sop;
        do {
            System.out.println("Enter your operation for Stack:" +
                    "1. Push" +
                    "2. Pop" +
                    "3. Print" +
                    "4. Exit Stack");
            sop = sc.nextInt();
            switch (sop)
            {
                case 1: stack.push(sc.nextInt());
                break;
                case 2: stack.pop();
                break;
                case 3: System.out.println(stack);
                break;
                default: break;
            }
        }while(sop!=4);
    System.out.println("Trying two stacks with one array...");

    }
    public static void queuefunc() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int qop;
        do {
            System.out.println("Enter your operation for Queue:" +
                    "1. Add" +
                    "2. Remove" +
                    "3. Print" +
                    "4. Exit Queue");
            qop = sc.nextInt();
            switch (qop)
            {
                case 1: queue.add(sc.nextInt());
                    break;
                case 2: queue.remove();
                    break;
                case 3: System.out.println(queue);
                    break;
                default: break;
            }
        }while (qop!=4);
    }
    public static void Hashsetfunc() {
        System.out.println();
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int hop;
        do {
            System.out.println("Enter your operation for Hashset:" +
                    "1. Add" +
                    "2. Delete" +
                    "3. Print" +
                    "4. Exit Hashset");
            hop = sc.nextInt();
            switch (hop) {
                case 1: hashSet.add(sc.nextInt());
                break;
                case 2:  System.out.print("Enter the Element to be removed:");
                    int element = sc.nextInt();
                    hashSet.remove(element);
                    break;
                case 3: System.out.println(hashSet);
                break;
                default: break;
            }
        }while(hop!=4);
    }


}

//// Classes for Doubly Linkedlist
//class Node {
//    int data;
//    Node next;
//    Node prev;
//    public Node(int data) {
//        this.data = data;
//    }
//}
//
//class DoublyLinkedList{
//    Node head;
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        }
//        else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//            newNode.prev = current;
//        }
//    }
//    public void print() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}

// End for Doubly LinkedList