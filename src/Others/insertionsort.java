package Others;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {6,3,9,22,23,1,5};
        System.out.println("Before Sorting"); display(arr);
        sort(arr);
    }
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > min) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = min;
        }
        System.out.println("\nAfter Sorting"); display(arr);
    }
}
