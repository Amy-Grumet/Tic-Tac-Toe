import java.util.Arrays;

public class Board{
    private final char[][] grid = new char[3][3];


    public Board(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = ' ';
            }
        }
    }

    public synchronized void printBoard(){
        System.out.println("-------------");
        for(int i = 0; i < 3; i++){ // create 3 rows
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " | "); // create three columns
            }
            System.out.println("\n-------------");
        }
    }

    public synchronized boolean makeMove(int row, int col, char player) {
        if (grid[row][col] == ' ') {
            grid[row][col] = player;
            return true;
        }
        return false;
    }

    public synchronized boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) return true;
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) return true;
        }
        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) return true;
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) return true;
        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') return false;
            }
        }
        return true;
    }
}