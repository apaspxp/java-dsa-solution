import java.util.*;
import java.util.stream.Collectors;

public class Main13thMay20242058 {
    public static void main(String[] args) {
//        Given an integer array, find the maximum length subarray having a given sum.
        int[] intArray = new int[]{5, 6, -5, 5, 3, 5, 3, -2, 0};
        int target = 8;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        map.put(0, list);
        int sum = 0;
        String maxLengthArray = "";
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            if (map.containsKey(sum - target)) {
//                System.out.println("Starting index(s): " + map.get(sum - target).stream().map(j -> String.valueOf(j + 1)).collect(Collectors.joining(", ")) + ", ending index: " + i);
                for (int j : map.get(sum - target)) {
                    var stringBuilder = new StringBuilder();
                    for (int k = j + 1; k <= i; k++) {
                        stringBuilder.append((stringBuilder.isEmpty() ? "" : ", ") + intArray[k]);
                    }
                    if (stringBuilder.length() > maxLengthArray.length()) {
                        maxLengthArray = "{" + stringBuilder.toString() + "}";
                    }
                }
            }

            if (map.containsKey(sum)) {
                List<Integer> list1 = map.get(sum);
                list1.add(i);
                map.put(sum, list1);
            } else {
                List<Integer> list2 = new ArrayList<>();
                list2.add(i);
                map.put(sum, list2);
            }
        }
        System.out.println(maxLengthArray);
    }
}
