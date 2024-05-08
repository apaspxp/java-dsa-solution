import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main9thMay20240038 {
    public static void main(String[] args) {
//        Given an integer array, check if it contains a subarray having zero-sum.
        int[] intArray = new int[]{3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
//                               0 3  7   0  3  4  7  8   4   2   0
//      (9, 3), (7, 5), (5, 2), (2, 0), (9, 0), (3, 1)
        int target = 0;
        subArrayWithTarget(intArray, target);
    }

    public static void subArrayWithTarget(int[] intArray, int target) {
        Map<Integer, List<Integer>> cumulativeSum = new HashMap<>();
        List<Integer> indexes = new ArrayList<>();
        indexes.add(-1);
        cumulativeSum.put(0, indexes);
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            if (cumulativeSum.containsKey(sum - target)) {
                System.out.println("Starting index(s): " + cumulativeSum.get(sum - target).stream().map(j -> String.valueOf(j + 1)).collect(Collectors.joining(", ")) + ", ending index: " + i);
            }

            if (cumulativeSum.containsKey(sum)) {
                List<Integer> integerList = cumulativeSum.get(sum);
                integerList.add(i);
                cumulativeSum.put(sum, integerList);
            } else {
                List<Integer> integerList = new ArrayList<>();
                integerList.add(i);
                cumulativeSum.put(sum, integerList);
            }
        }
    }
}
