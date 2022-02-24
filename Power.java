import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        double num = sc.nextDouble();
        System.out.println("enter the power: ");
        double power = sc.nextDouble();
        System.out.println(num + " to the power " + power + " is " + Math.pow(num, power));
        sc.close();
    }
}
