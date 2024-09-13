package Others;

import java.util.Arrays;

public class exponentialsearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 22, 33, 44, 58, 66, 69, 70};
        int length = arr.length;
        int value = 44;
        int outcome = exponential(arr, length, value);
        if (outcome < 0) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }
    public static int exponential(int[] arr, int length, int value) {
        if(arr[0]==value) {
            return 0;
        }
        int i =1;
        while (i < length && arr[i]<=value) {
            i=i*2;
        }
        return Arrays.binarySearch(arr, i);
    }
}
