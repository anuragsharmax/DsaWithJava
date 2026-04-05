import java.util.*;

public class TicTacToe {

    static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    static boolean checkWin(char[][] b, char player) {

        for (int i = 0; i < 3; i++) {
            if (b[i][0] == player && b[i][1] == player && b[i][2] == player)
                return true;
            if (b[0][i] == player && b[1][i] == player && b[2][i] == player)
                return true;
        }

        if (b[0][0] == player && b[1][1] == player && b[2][2] == player)
            return true;

        if (b[0][2] == player && b[1][1] == player && b[2][0] == player)
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++)
            Arrays.fill(board[i], ' ');

        char currentPlayer = 'X';
        int moves = 0;

        while (true) {

            printBoard(board);
            System.out.println("Player " + currentPlayer + " turn:");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                System.out.println("Invalid move!");
                continue;
            }

            board[row][col] = currentPlayer;
            moves++;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (moves == 9) {
                printBoard(board);
                System.out.println("Draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}