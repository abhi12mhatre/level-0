import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        boolean start = true, restart = false;
        double num = 0, count = 0, result = 0;
        String operator = "=";
        Scanner sc = new Scanner(System.in);
        while (start) {
            if (restart == true) {
                num = 0;
                count = 0;
                result = 0;
            }

            System.out.print("enter the number: ");
            num += sc.nextDouble();
            count++;
            System.out.print("to get result press '=', to add more numbers press '+': ");
            operator = sc.next();
            switch (operator) {
                case "=":
                    result = num / count;
                    System.out.println("the average of " + num + " is " + result);
                    start = false;
                    break;
                case "+":
                    continue;
                default:
                    System.err.println("wrong input.Loop restarting.");
                    restart = true;
            }
        }
        sc.close();
    }
}
