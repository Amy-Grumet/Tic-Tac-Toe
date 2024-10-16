public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();


        while (!board.isFull()) {
            Thread playerThread = new Thread(new Player(board, 'X'));
            playerThread.start();  // Start player input
            try {
                playerThread.join();  // Wait for player's move to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (board.checkWin('X') || board.isFull()) {
                break;
            }

            Thread aiThread = new Thread(new AI(board, 'O'));
            aiThread.start();  // Start AI move
            try {
                aiThread.join();  // Wait for AI's move to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (board.checkWin('O')) {
                break;
            }
        }

        System.out.println("It's a draw!");
    }
}
