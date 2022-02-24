import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        String operator = "=";

        System.out.print("enter the 1st number: ");
        num1 = sc.nextDouble();
        result = num1;

        while (isTrue) {
            System.out.print("to get result press \" = \" , to continue the operation enter the operator: ");
            operator = sc.next();
            if (!operator.equals("=")) {
                System.out.print("enter the next number: ");
                num2 = sc.nextDouble();
                switch (operator) {
                    case "+":
                        result += num2;
                        break;
                    case "-":
                        result -= num2;
                        break;
                    case "*":
                        result *= num2;
                        break;
                    case "/":
                        result /= num2;
                        break;
                    case "%":
                        result %= num2;
                        break;
                    default:
                        System.out.println("invalid operator");
                        System.out.println(operator);
                        break;
                }
            } else {
                System.out.println("the result is: " + result);
                isTrue = false;
            }
        }
        sc.close();
    }
}