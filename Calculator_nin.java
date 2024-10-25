import java.util.Scanner;

public class Calculator_nin {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

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
                num[counter] = subtract(x, y);
                System.out.println("The answer is:" + num[counter]);
            }

            else if (equ.equals("+")) {

                num[counter] = add(x, y);
                System.out.println("The answer is:" + num[counter]);
            }

            else if (equ.equals("/")) {

                num[counter] = divide(x, y);
                System.out.println("The answer is:" + num[counter]);
            }

            else if (equ.equals("*")) {

                num[counter] = multiply(x, y);
                System.out.println("The answer is:" + num[counter]);
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
