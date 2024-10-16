import java.util.Random;

public class AI implements Runnable {
    private final Board board;
    private final char symbol;
    private final Random random = new Random();

    public AI(Board board, char symbol) {
        this.board = board;
        this.symbol = symbol;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);  // pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);

            if (board.makeMove(row, col, symbol)) {
                System.out.println("AI (" + symbol + ") made a move at (" + row + ", " + col + ")");
                board.printBoard();
                if (board.checkWin(symbol)) {
                    System.out.println("AI (" + symbol + ") wins!");
                    System.exit(0);
                }
                break;  // End turn
            }
        }
    }
}
