package leetcode;
import java.util.ArrayList;
import java.util.List;

public class Problem37 {
    public static void main(String[] args) {
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
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        if (completed(board)) {
            printBoard(board);
            return;
        }

        int[] emptyCell = findFirstEmptyCell(board);
        if (emptyCell == null) {
            return;
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, i, row, col)) {
                board[row][col] = (char) ('0' + i);
                solveSudoku(board);
                board[row][col] = '.';
            }
        }
    }

    public static boolean completed(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] findFirstEmptyCell(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static boolean isSafe(char[][] board, int num, int row, int col) {
        char ch = (char) ('0' + num);

        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == ch) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == ch) {
                return false;
            }
        }

        int k = (int) Math.sqrt(board.length);
        int startRow = row - (row % k);
        int startCol = col - (col % k);

        for (int i = startRow; i < startRow + k; i++) {
            for (int j = startCol; j < startCol + k; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
