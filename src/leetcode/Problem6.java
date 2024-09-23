package leetcode;

public class Problem6 {
    public static void main(String[] args) {
        String input1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(zigzagTraverse(input1, numRows1)); // Output: "PAHNAPLSIIGYIR"

        String input2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(zigzagTraverse(input2, numRows2)); // Output: "PINALSIGYAHRPI"

        String input3 = "A";
        int numRows3 = 1;
        System.out.println(zigzagTraverse(input3, numRows3)); // Output: "A"
    }

    public static String zigzagTraverse(String str, int n) {
        if (n == 1 || n >= str.length()) {
            return str;
        }

        StringBuilder[] rows = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : str.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction at the top and bottom
            if (currentRow == 0 || currentRow == n - 1) {
                goingDown = !goingDown;
            }

            // Move up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Build the final string from all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
