import java.util.Scanner;

public class Driver {
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your age?");
    double age = scanner.nextDouble();
    if (age >= 16) {
        System.out.println("You can drive!");
    } else if (age >= 15.5) {
        System.out.println("You can drive WITH supervision!");
    }else {
        System.out.println("You can NOT drive");
    }
}
}