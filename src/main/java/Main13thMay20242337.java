import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main13thMay20242337 {
    public static void main(String[] args) {
//        Given a binary array containing 0’s and 1’s, find the largest subarray with equal numbers of 0’s and 1’s.
        int[] intArray = new int[]{0, 0, 1, 0, 1, 0, 0};
        int target = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        map.put(0, list);
        int sum = 0;
        String maxLengthArray = "";
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i] == 0 ? -1 : intArray[i];
            if (map.containsKey(sum - target)) {
                for (int j : map.get(sum - target)) {
                    var stringBuilder = new StringBuilder();
                    for (int k = j + 1; k <= i; k++) {
                        stringBuilder.append((stringBuilder.isEmpty() ? "" : ", ") + intArray[k]);
                    }
                    if (stringBuilder.length() >= maxLengthArray.length()) {
                        maxLengthArray = stringBuilder.toString();
                        System.out.println("{" + maxLengthArray + "}");
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
//        System.out.println(maxLengthArray);
    }
}
