public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        String str = "absdba";

        int newNum = 1;
        String newStr = null;

        while (num > 0) {
            newNum *= num / 10;
            num = num / 10;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }

        newStr = sb.toString();

        if (num == newNum)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome number");
        if (str.equals(newStr))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
