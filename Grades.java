import java.util.Scanner;

public class Grades {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        // get number of students
        System.out.println("How any students?");
        // Get their grades
        int[] grades = new int[students];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Please enter your grade");
            grades[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int average = sum / grades.length;
        System.out.println("The average is " + average);
    }
}
