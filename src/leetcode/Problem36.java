package leetcode;
import java.util.HashSet;
import java.util.Set;

public class Problem36 {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        // Sets to keep track of seen numbers in rows, columns, and boxes
        Set<String> seen = new HashSet<>();

        // Loop through the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];

                // Only process if the current cell is not empty (i.e., not '.')
                if (currentVal != '.') {
                    // Row check
                    if (!seen.add(currentVal + " in row " + i)) {
                        return false;
                    }

                    // Column check
                    if (!seen.add(currentVal + " in column " + j)) {
                        return false;
                    }

                    // Box check
                    int boxIndex = (i / 3) * 3 + j / 3; // Calculate the box number
                    if (!seen.add(currentVal + " in box " + boxIndex)) {
                        return false;
                    }
                }
            }
        }
        return true; // If no violations found, the board is valid
    }
}
