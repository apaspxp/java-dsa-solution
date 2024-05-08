import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Main8thMay20242359 {
    public static void main(String[] args) {
//        Given an unsorted integer array, find a pair with the given sum in it.
        int[] intArray = new int[]{8, 7, 2, 5, 3, 1, 8};
        int target = 10;
//        findNumberPair(intArray, target); //Time complexity O(N^2)
        findNumberPairByTraversingOnce(intArray, target); //Time complexity O(N)
    }

    private static void findNumberPair(int[] intArray, int target) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] + intArray[j] == target) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
    }

    private static void findNumberPairByTraversingOnce(int[] intArray, int target) {
        Map<Integer, List<Integer>> parking = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if (parking.containsKey(target - intArray[i])) {
                System.out.println("Starting index: " + parking.get(target - intArray[i]) + ", ending index: " + i);
            }
            if (parking.containsKey(intArray[i])) {
                List<Integer> integerList = parking.get(intArray[i]);
                integerList.add(i);
                parking.put(intArray[i], integerList);
            } else {
                List<Integer> integerList = new ArrayList<>();
                integerList.add(i);
                parking.put(intArray[i], integerList);
            }
        }
//        parking.forEach((k, v) -> System.out.println("Key: " + k + ", value: " + v));
    }
}
