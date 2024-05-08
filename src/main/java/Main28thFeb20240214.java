import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main28thFeb20240214 {
    public static void main(String[] args) {
        var grid = new ArrayList<List<Integer>>();
        grid.add(0, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));
        grid.add(1, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));
        grid.add(2, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));
        grid.add(3, List.of(3, 1, 7, 4, 2, 6, 5, 4, 8));
        grid.add(4, List.of(3, 1, 7, 4, 2, 6, 5, 4, 8));
        grid.add(5, List.of(3, 1, 7, 4, 2, 6, 5, 4, 8));
        grid.add(6, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));
        grid.add(7, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));
        grid.add(8, List.of(1, 2, 0, 4, 2, 6, 5, 4, 8));

        grid.stream()
                .skip(0)
                .limit(3)
                .map(sublist -> sublist.subList(0, 3))
                .forEach(System.out::println);
        System.out.println("---------");
        grid.stream()
                .skip(0)
                .limit(3)
                .map(sublist -> sublist.subList(3, 6))
                .forEach(System.out::println);
        System.out.println("---------");
        grid.stream()
                .skip(0)
                .limit(3)
                .map(sublist -> sublist.subList(6, 9))
                .forEach(System.out::println);
        System.out.println("---------");
        grid.stream()
                .skip(3)
                .limit(3)
                .map(sublist -> sublist.subList(0, 3))
                .forEach(System.out::println);
        System.out.println("---------");
        grid.stream()
                .skip(3)
                .limit(3)
                .map(sublist -> sublist.subList(3, 6))
                .forEach(System.out::println);
    }
}
