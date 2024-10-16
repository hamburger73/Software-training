import java.util.Scanner;

public class Calculator_nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[10];
        int counter = 0;
        while (counter < 10) {
            System.out.println("Enter the first number");
            double x = scanner.nextDouble();
            System.out.println("Enter the second number");
            double y = scanner.nextDouble();
            System.out.println("Enter your equation (+ - * /)");
            String equ = scanner.next();

            if (equ.equals("-")) {
                System.out.println("The answer is:" + (x - y));
                num[counter] = x - y;
            }

            else if (equ.equals("+")) {

                System.out.println("The answer is:" + (x + y));
                num[counter] = x + y;
            }

            else if (equ.equals("/")) {

                System.out.println("The answer is:" + (x / y));
                num[counter] = x / y;
            }

            else if (equ.equals("*")) {

                System.out.println("The answer is:" + (x * y));
                num[counter] = x * y;
            }

            else if (equ.equals("q")) {
                break;
            }
            counter++;
        }
        for (Double num2 : num) {
            System.out.println(num2);
        }
    }

}
