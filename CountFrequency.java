import java.util.HashMap;

public class CountFrequency {

    
    public static void main(String[] args) {

        int arr[] = { 1, 3, 9, 4, 6, 4, 5, 6, 3, 5, 2, 1, 10 };

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i : arr) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        for (int key : hs.keySet()) {
            System.out.println("Element " + key + ":  " + hs.get(key));
        }

    }
}
