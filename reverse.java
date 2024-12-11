
import java.util.Arrays;

public class reverse {

    public static int[] usingRecursion(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return usingRecursion(arr, start + 1, end - 1);
    }

    public static void reverseMethod1(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[n - 1 - i];
        }
        System.out.println(Arrays.toString(res));

    }

    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        reverseMethod1(arr);

        System.out.print(Arrays.toString(usingRecursion(arr, 0, arr.length - 1)) + " ");

    }

}
