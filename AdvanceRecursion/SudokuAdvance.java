package AdvanceRecursion;

public class SudokuAdvance {
    //isSafe func
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row and column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board) {
        // Start solving Sudoku from the top-left cell
        return solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        // Base condition: If we have filled all rows, the Sudoku is solved
        if (row == board.length) {
            return true;
        }

        // Calculate coordinates for the next cell to process
        int nextRow = 0;
        int nextCol = 0;
        if (col == board.length - 1) {
            nextRow = row + 1;
            nextCol = 0;
        } else {
            nextRow = row;
            nextCol = col + 1;
        }

        // If the current cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        } else {
            // Try placing numbers from 1 to 9
            for (int num = 1; num <= 9; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = (char) (num + '0');
                    if (solve(board, nextRow, nextCol)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // Backtrack
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SudokuAdvance sudokuSolver = new SudokuAdvance();

        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Sudoku board before solving:");
        printBoard(board);

        boolean solved = sudokuSolver.helper(board);

        if (solved) {
            System.out.println("\nSudoku board after solving:");
            printBoard(board);
        } else {
            System.out.println("\nNo solution exists.");
        }
    }

    // Helper method to print the Sudoku board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
