import java.util.HashSet;

public class removeDuplicate {

    public static void anothermethod(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }

            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 9, 4, 6, 4, 5, 6, 3, 5, 2, 1, 10 };

        // HashSet<Integer> hs = new HashSet<>();
        // for (int i : arr) {
        // hs.add(i);
        // }
        // System.out.println(hs);

        anothermethod(arr);
    }

}
