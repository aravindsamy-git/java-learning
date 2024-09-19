package leetcode;

public class Problem66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add 1 and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0 and we continue to the next digit
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9 (e.g., 999 -> 1000)
        // We need to create a new array with an extra digit at the front (for the carry)
        int[] result = new int[digits.length + 1];
        result[0] = 1;  // The first digit should be 1 (carry from the addition)

        // All other digits are already 0, so we can return the result array
        return result;
    }
}
