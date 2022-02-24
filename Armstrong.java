public class Armstrong {
    // 153 = 1*1*1 + 5*5*5 + 3*3*3

    public static void main(String[] args) {
        int num = 153;
        int mul = 1;
        int result = 0;
        for (int i = num; i > 0; i = i / 10) {
            for (int j = num; j > 0; j = j / 10) {
                mul *= i % 10;
            }
            result += mul;
            mul = 1;
        }
        if (num == result) {
            System.out.println("Armstrong number");
        } else
            System.out.println("not Armstrong number");
    }
}
