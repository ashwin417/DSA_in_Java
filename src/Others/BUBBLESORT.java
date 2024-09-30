package Others;

public class BUBBLESORT {
    public static void main(String[] args) {
        int[] arr = {25,6,3,28,19,30,1};
        int n = arr.length;
        System.out.println("Before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        bubblesort(arr,n);
    }

    public static void bubblesort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }    }
}
