public class Capital {
    public static void main(String[] args) {
        String str = "This string will be reversed.";
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String a : s) {
            String b = a.substring(0, 1);
            sb.append(b.toUpperCase() + a.substring(1) + " ");
        }
        System.out.println(sb);

    }
}
