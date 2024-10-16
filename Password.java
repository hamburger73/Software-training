import java.util.Random;
import java.util.Scanner;

public class Password {

    public static void main(String...args) {
        Scanner scanner = new Scanner (System.in);
        int guess = 0;
        int count = 0;
        Random r = new Random();
        int password = r.nextInt(100);
        while (guess != password) {
            count++;
            System.out.println("Enter the password >:|");
            guess = scanner.nextInt();
            
            if (guess < password) {
                System.out.println("The number you guessed is too low!");}
            else if (guess > password) {
                System.out.println("The number you guessed is too high!");
            }
            
            
        }
        System.out.println("CHOP SHOP");
        System.out.println("You have guessed " + count + " times!" );
    }
}
