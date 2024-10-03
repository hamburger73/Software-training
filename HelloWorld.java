import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Nice to meet you, " + name);
        System.out.println("Give me a number and i'll double it");
        // Note: I can put anything I want here
        Double x = scanner.nextDouble();
        System.out.println("The new answer is: " + (2 * x));
        //Take in two numbers from the scanner

        System.out.println("Enter the first number. ");
        Double y = scanner.nextDouble();
        System.out.println("Enter the second number. ");
        Double z = scanner.nextDouble();
        //and add them together, and print the output
        System.out.println("The answer is, " + (y+z));
        
    
    }
    }