import java.util.Scanner;

public class Calculator_nin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        Double x = scanner.nextDouble();
        System.out.println("Enter the second number");
        Double y = scanner.nextDouble();
        System.out.println("Enter your equation (+ - * /)");
        String equ = scanner.next();

        if (equ.equals("-")) {
            System.out.println("The answer is:" + (x - y));
        }

        if (equ.equals("+")) {
            
        System.out.println("The answer is:" + (x + y));
        }

        if (equ.equals("/")) {
            
        System.out.println("The answer is:" + (x / y));
        }

        if (equ.equals("*")) {
            
        System.out.println("The answer is:" + (x * y));
        }

    }

}
