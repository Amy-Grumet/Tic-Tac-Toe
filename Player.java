import java.util.Scanner;
import java.util.InputMismatchException;

public class Player implements Runnable {
    private final Board board;
    private final char symbol;

    public Player(Board board, char symbol) {
        this.board = board;
        this.symbol = symbol;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int row = -1, col = -1;

            // Get valid input for the row
            while (true) {
                System.out.print("Enter the row (0, 1, or 2): ");
                try {
                    row = scanner.nextInt();  // Read row input
                    if (row >= 0 && row <= 2) break;  // Valid input
                    else System.out.println("Invalid input. Please enter a number between 0 and 2.");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();  // Clear the invalid input
                }
            }

            // Get valid input for the column
            while (true) {
                System.out.print("Enter the column (0, 1, or 2): ");
                try {
                    col = scanner.nextInt();  // Read column input
                    if (col >= 0 && col <= 2) break;  // Valid input
                    else System.out.println("Invalid input. Please enter a number between 0 and 2.");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();  // Clear the invalid input
                }
            }

            // Attempt to make a move
            if (board.makeMove(row, col, symbol)) {
                System.out.println("You (" + symbol + ") made a move at (" + row + ", " + col + ")");
                board.printBoard();
                // Check if the player has won
                if (board.checkWin(symbol)) {
                    System.out.println("Player " + symbol + " wins!");
                    System.exit(0);  // End the game
                }
                break;  // End the turn
            } else {
                System.out.println("That position is already taken. Try again.");
            }
        }
    }
}

