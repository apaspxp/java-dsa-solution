public class ReveseString {
    public static void main(String[] args) {
        String name = "Supriya Panigrahi";
        StringBuilder reversedName = new StringBuilder(name);
        reversedName = reversedName.reverse();
        String reversedString = reversedName.toString();
        System.out.println("Reversed name:" + reversedString);
    }
}
