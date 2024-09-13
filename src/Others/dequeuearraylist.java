package Others;


import java.util.ArrayList;

public class dequeuearraylist {
    private static ArrayList<Integer> deque;

    public dequeuearraylist() {
        deque = new ArrayList<>();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void insertFront(int value) {
        deque.add(0, value);
        System.out.println("Inserted front: " + value);
    }

    public void insertRear(int value) {
        deque.add(value);
        System.out.println("Inserted rear: " + value);
    }

    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = deque.remove(0);
        System.out.println("Removed front: " + value);
        return value;
    }

    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = deque.remove(deque.size() - 1);
        System.out.println("Removed rear: " + value);
        return value;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return deque.get(0);
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return deque.get(deque.size() - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Deque elements: " + deque);
    }

    public static void main(String[] args) {
        dequeuearraylist deq = new dequeuearraylist();

        deq.insertRear(10);
        deq.insertRear(20);
        deq.insertFront(5);
        deq.insertRear(30);
        deq.insertFront(3);

        deq.display();

        System.out.println("Removing from front: " + deq.removeFront());
        System.out.println("Removing from rear: " + deq.removeRear());


    }
}
