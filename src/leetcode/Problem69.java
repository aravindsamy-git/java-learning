package leetcode;

public class Problem69 {

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0; // Edge case: The square root of 0 is 0.
        }

        int left = 1; // Start the search from 1 (smallest positive square root).
        int right = x; // The maximum possible square root is x (i.e., sqrt(x) <= x).
        int result = 0; // This will hold the final square root.

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the mid-point of the search range.

            // Check if mid * mid is less than or equal to x
            if (mid <= x / mid) { // Avoid overflow by using division (instead of mid * mid <= x).
                result = mid;      // If mid is a valid candidate, store it as a possible result.
                left = mid + 1;    // Move the search to the right half (look for a larger number).
            } else {
                right = mid - 1;   // Move the search to the left half (look for a smaller number).
            }
        }

        return result; // Return the largest mid such that mid^2 <= x.
    }

}
