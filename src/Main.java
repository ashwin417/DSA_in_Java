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

    public static void Linkedlistfunc()
    {
        Scanner sc = new Scanner(System.in);

        // Singly Linked List Operations
        LinkedList<Integer> linkedlist = new LinkedList<>();
        int lop;
        do {
            System.out.println("Enter your operation for LinkedList:\n" +
                    "1. Add\n" +
                    "2. Delete\n" +
                    "3. Print\n" +
                    "4. Exit LinkedList");
            lop = sc.nextInt();
            switch (lop) {
                case 1:
                    System.out.println("Enter element to add:");
                    linkedlist.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element to delete:");
                    linkedlist.remove((Integer) sc.nextInt());
                    break;
                case 3:
                    System.out.println("LinkedList: " + linkedlist);
                    break;
                default:
                    break;
            }
        } while (lop != 4);

        // Doubly Linked List Operations
        DoublyLinkedList dll = new DoublyLinkedList();
        int dlop;
        do {
            System.out.println("\nEnter your operation for Doubly LinkedList:\n" +
                    "1. Add\n" +
                    "2. Delete\n" +
                    "3. Print\n" +
                    "4. Exit Doubly LinkedList");
            dlop = sc.nextInt();
            switch (dlop) {
                case 1:
                    System.out.println("Enter element to add:");
                    dll.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element to delete:");
                    dll.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Doubly LinkedList: ");
                    dll.print();
                    break;
                default:
                    break;
            }
        } while (dlop != 4);

        // Circular Linked List Operations
        CircularLinkedList cll = new CircularLinkedList();
        int clop;
        do {
            System.out.println("\nEnter your operation for Circular LinkedList:\n" +
                    "1. Add\n" +
                    "2. Delete\n" +
                    "3. Print\n" +
                    "4. Exit Circular LinkedList");
            clop = sc.nextInt();
            switch (clop) {
                case 1:
                    System.out.println("Enter element to add:");
                    cll.add(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element to delete:");
                    cll.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Circular LinkedList: ");
                    cll.print();
                    break;
                default:
                    break;
            }
        } while (clop != 4);
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
    Main.Twostacksarray();
    }

    public static void Twostacksarray(){
        TwoStacks ts = new TwoStacks(5);
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter your operation for Two Stacks:\n" +
                    "1. Push to Stack 1\n" +
                    "2. Push to Stack 2\n" +
                    "3. Pop from Stack 1\n" +
                    "4. Pop from Stack 2\n" +
                    "5. Print both Stacks\n" +
                    "6. Exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter value to push to Stack 1:");
                    ts.push1(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value to push to Stack 2:");
                    ts.push2(sc.nextInt());
                    break;
                case 3:
                    int popped1 = ts.pop1();
                    if (popped1 != -1) {
                        System.out.println("Popped from Stack 1: " + popped1);
                    }
                    break;
                case 4:
                    int popped2 = ts.pop2();
                    if (popped2 != -1) {
                        System.out.println("Popped from Stack 2: " + popped2);
                    }
                    break;
                case 5:
                    ts.printStacks();
                    break;
                default:
                    if (option != 6) {
                        System.out.println("Invalid option, please try again.");
                    }
            }
        } while (option != 6);

    }
    static class TwoStacks {
        int size;
        int top1, top2;
        int[] arr;

        TwoStacks(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = size;
        }

        void push1(int x) {
            if (top1 < top2 - 1) {
                arr[++top1] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }

        void push2(int x) {
            if (top1 < top2 - 1) {
                arr[--top2] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }

        int pop1() {
            if (top1 >= 0) {
                return arr[top1--];
            } else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }

        int pop2() {
            if (top2 < size) {
                return arr[top2++];
            } else {
                System.out.println("Stack Underflow");
                return -1;
            }
        }
        void printStacks() {
            System.out.print("Stack 1: ");
            for (int i = 0; i <= top1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.print("Stack 2: ");
            for (int i = size - 1; i >= top2; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
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
class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }

    private Node head, tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found");
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

        class CircularLinkedList {
            class Node {
                int data;
                Node next;
                Node(int data) {
                    this.data = data;
                }
            }

            private Node head, tail;

            public void add(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                    tail.next = head; // Circular link
                } else {
                    tail.next = newNode;
                    tail = newNode;
                    tail.next = head; // Circular link
                }
            }

            public void delete(int data) {
                if (head == null) {
                    System.out.println("List is empty");
                    return;
                }
                Node current = head, prev = null;
                do {
                    if (current.data == data) {
                        if (current == head) {
                            tail.next = head.next;
                            head = head.next;
                        } else if (current == tail) {
                            prev.next = head;
                            tail = prev;
                        } else {
                            prev.next = current.next;
                        }
                        return;
                    }
                    prev = current;
                    current = current.next;
                } while (current != head);
                System.out.println("Element not found");
            }

            public void print() {
                if (head == null) {
                    System.out.println("List is empty");
                    return;
                }
                Node current = head;
                do {
                    System.out.print(current.data + " ");
                    current = current.next;
                } while (current != head);
                System.out.println();
            }
        }
// End for Doubly LinkedList