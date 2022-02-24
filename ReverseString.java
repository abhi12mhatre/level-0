public class ReverseString {
    public static void main(String[] args) {
        String input = "This string will be reversed.";
        StringBuilder string = new StringBuilder();
        string.append(input);
        string.reverse();
        System.out.println(string);
    }
}