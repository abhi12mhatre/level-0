public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.printf("before swap, a = %d,b = %d \n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("after swap, a = %d,b = %d \n", a, b);
    }
}
