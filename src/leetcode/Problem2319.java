package leetcode;
import java.util.Scanner;

public class Problem2319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        int[][] grid = new int[n][n];

        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        boolean isValid = checkXMatrix(grid);

        System.out.println(isValid ? "true" : "false");

        scanner.close();
    }

    public static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - 1 - j) {
                    if (grid[i][j] == 0) return false;
                } else {
                    if (grid[i][j] != 0) return false;
                }
            }
        }

        return true;
    }
}
