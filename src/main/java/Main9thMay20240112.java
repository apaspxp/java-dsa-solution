import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main9thMay20240112 {
    public static void main(String[] args) {
//        Given a binary array, sort it in linear time and constant space. The output should print all zeros, followed by all ones.
        int[] intArray = new int[]{1, 0, 1, 0, 1, 0, 0, 1};
//        Arrays.stream(intArray)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .flatMap(entry -> IntStream.rangeClosed(1, entry.getValue().intValue())
//                        .boxed()
//                        .map(i -> entry.getKey())
//                )
//                .forEach(System.out::println);
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if (countMap.containsKey(intArray[i])) {
                int count = countMap.get(intArray[i]);
                count++;
                countMap.put(intArray[i], count);
            } else {
                countMap.put(intArray[i], 1);
            }
        }
        for (int i = 0; i < countMap.get(0); i++) {
            System.out.println(0);
        }
        for (int i = 0; i < countMap.get(1); i++) {
            System.out.println(1);
        }
    }
}
