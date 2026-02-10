package Backtracking;

/*
NOTES: N-QUEENS PROBLEM (BACKTRACKING)

1. Problem statement:
   Place N queens on an N x N chessboard such that:
   - No two queens share the same row
   - No two queens share the same column
   - No two queens share the same diagonal

2. Core idea used:
   Backtracking (recursion with undoing choices)

   Pattern:
   - Choose a position
   - Recurse to the next row
   - If it fails, undo the choice and try another option

3. Why one queen per row?
   - If we ensure exactly one queen per row,
     row conflicts are automatically avoided.
   - We only need to check:
       a) column
       b) left diagonal
       c) right diagonal

4. What this code demonstrates:
   - How backtracking works in a real problem
   - How recursion explores all possibilities
   - How state (board) is modified and restored

5. IMPORTANT (Brutally Honest):
   - This problem is NOT frequently asked to be fully coded in interviews.
   - Understanding the idea is far more important than memorizing the code.
   - This implementation is for learning and concept clarity.
*/

import java.util.*;

public class NQueen {

    public static void main(String[] args) {
        int n = 4;   // Change this value to test different board sizes

        List<List<String>> solutions = solveNQueens(n);

        // Print all valid solutions
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    // Entry function to start solving the N-Queens problem
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        // Chess board representation
        // '.' means empty cell
        // 'Q' means queen placed
        char[][] board = new char[n][n];

        // Initialize board with empty cells
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start placing queens from the first row
        placeQueen(0, board, result);

        return result;
    }

    // Recursive backtracking function
    // Tries to place a queen in the given row
    private static void placeQueen(int row, char[][] board, List<List<String>> result) {

        int n = board.length;

        // BASE CASE:
        // If all rows are filled, we found a valid configuration
        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {

            // Check if the current position is safe
            if (isSafe(row, col, board)) {

                // STEP 1: CHOOSE
                board[row][col] = 'Q';

                // STEP 2: EXPLORE
                placeQueen(row + 1, board, result);

                // STEP 3: UNDO (BACKTRACK)
                board[row][col] = '.';
            }
        }
    }

    // Checks whether placing a queen at (row, col) is safe
    private static boolean isSafe(int row, int col, char[][] board) {

        int n = board.length;

        // Check the column above the current row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // If no conflicts found, the position is safe
        return true;
    }

    // Converts the board into List<String> format
    // This is done only when a valid solution is found
    private static List<String> constructBoard(char[][] board) {

        List<String> configuration = new ArrayList<>();

        for (char[] row : board) {
            configuration.add(new String(row));
        }

        return configuration;
    }
}
