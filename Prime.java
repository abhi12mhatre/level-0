public class Prime {
    public static void main(String[] args) {
        int num = 11;
        int count = 0;
        for (int i = num; i > 2; i--) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println("not prime");
        } else
            System.out.println("prime");

    }
}
