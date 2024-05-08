import java.util.stream.Stream;

public class Main1stMay20241317 {
    //    Program to find first repeating letter in  a string.
    public static void main(String[] args) {
        var str = "This is a test string";
        System.out.println(
                Stream.of(str.split(""))
                        .filter(s -> !s.equalsIgnoreCase(" "))
                        .filter(s -> str.lastIndexOf(s) > str.indexOf(s))
                        .findFirst()
                        .orElse("No duplicate"));
    }
}
