public class CountString {
    static int letter, space, number, other;

    public static void main(String[] args) {
        String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if ((a >= 'A') && (a <= 'Z')) {
                letter++;
            } else if ((a >= 'a') && (a <= 'z')) {
                letter++;
            } else if ((a >= '0') && (a <= '9')) {
                number++;
            } else if (a == ' ') {
                space++;
            } else
                other++;
        }
        System.out.println("letter: " + letter);
        System.out.println("number: " + number);
        System.out.println("space: " + space);
        System.out.println("other: " + other);
    }
}
