package leetcode;

public class Problem66 {

    public int[] plusOne(int[] digits) {

        It looks like you're working on a problem where you need to add one to a number represented as an array of digits. Here’s how you can implement the plusOne function in Java:

        Problem:
        The input is an array of digits representing a non-negative integer. You need to add one to this number and return the result as a new array of digits.

        Solution:
        Start from the least significant digit (the last element of the array).
        Add 1 to this digit.
                Handle any carry if the digit becomes 10 (i.e., set the digit to 0 and carry over 1 to the next digit).
        If after processing all digits, there is still a carry (e.g., 999 becomes 1000), you need to expand the array to accommodate the new digit.
                Code:
        java
        Copy code
        class Solution {
            public int[] plusOne(int[] digits) {
                // Start from the last digit and move backwards
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
