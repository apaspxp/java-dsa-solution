import java.util.HashMap;
import java.util.Map;

public class Main9thMay20240140 {
    public static void main(String[] args) {
//        Given a limited range array of size n containing elements between 1 and n-1 with one element repeating, find the duplicate number in it without using any extra space.
//        int[] intArray = new int[]{1, 2, 3, 4, 4};
        int[] intArray = new int[]{1, 2, 3, 4, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if (map.containsKey(intArray[i])) {
                System.out.println("Duplicate element is " + intArray[i]);
            } else {
                map.put(intArray[i], 1);
            }
        }
    }
}
