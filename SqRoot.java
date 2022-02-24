import java.util.Scanner;

public class SqRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        double num = sc.nextDouble();
        System.out.println("square root of " + num + " is " + Math.sqrt(num));
        sc.close();

    }
}
