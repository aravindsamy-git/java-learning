package leetcode;

public class Problem67 {

    public static void main(String[] args) {

    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;  // Pointer for string a
        int j = b.length() - 1;  // Pointer for string b
        int carry = 0;  // Carry initialized to 0

        // Process both strings from right to left
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;  // Add carry to the sum

            // If there's a bit in a, add it to the sum
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // If there's a bit in b, add it to the sum
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the sum % 2 to the result (this is the current bit)
            result.append(sum % 2);

            // Update carry (either 0 or 1)
            carry = sum / 2;
        }

        // The result is in reverse order, so reverse it
        return result.reverse().toString();
    }
}
