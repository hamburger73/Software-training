import java.util.Scanner;

public class TicTacToe {

    // Function that takes a scanner, a board and either X or O ask for two numbers
    // - row and column
    // Function that checks to see if the three letters given all match
    // puts letter in square (if not occupied)

    // Print board
    public static int num(Scanner scanner, String text) {
        System.out.println(text);
        int x = scanner.nextInt();
        return x;
    }

    public static move(Scanner scanner, char[][] board) {
        
    }

    // Checks if there is a letter in the space vv

    public static boolean checkXorO(int space1, int space2, char[][] board) {
        if (board[space1][space2] == 'X' || board[space1][space2] == 'O') {
            return true;
            System.out.println("There is an X or O in this space, select another spot.")
        }
        else{
            return false;
            System.out.println("There is no X or O in this space.")
        }
        
    }

    // Put letter in square!!!

    public static boolean allsame(char[][] board) {

    }

    // Function that checks a board to see if it has three in row vv (add to it)

    public static boolean threerow(char [][] board) {
        if (board )
    }

    // Board!! vv

    public static void main(String args) {
        char[][] board = new char[][] {
                new char[3],
                new char[3],
                new char[3]
        };
    }
}