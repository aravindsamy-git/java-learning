package leetcode;
import java.util.*;

public class Problem51 {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(solveNQueens(board,0));
    }

    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return solveNQueens(board, 0);
    }

    private static List<List<String>> solveNQueens(boolean[][] board, int row) {
        List<List<String>> result = new ArrayList<>();
        if (row == board.length) {
            result.add(getString(board));
            return result;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                result.addAll(solveNQueens(board, row + 1));
                board[row][col] = false;
            }
        }

        return result;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static List<String> getString(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder rowString = new StringBuilder();
            for (boolean element : row) {
                if (element) {
                    rowString.append("Q");
                } else {
                    rowString.append(".");
                }
            }
            result.add(rowString.toString());
        }
        return result;
    }
}
