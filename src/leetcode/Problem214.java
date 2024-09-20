package leetcode;

public class Problem214 {

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abcd"));
    }

    public  static String shortestPalindrome(String s) {
        StringBuilder rev = new StringBuilder(s).reverse();  // Reverse the string
        String revStr = rev.toString();

        // Create a string that appends original string and reversed string with a separator
        String combined = s + "#" + revStr;

        // Find the longest palindromic prefix
        int[] lps = computeLPS(combined);  // Get longest prefix which is also suffix

        // Characters to add from the reverse string (remaining part)
        String toAdd = revStr.substring(0, s.length() - lps[lps.length - 1]);

        return toAdd + s;  // Prepend to original string
    }

    private static int[] computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
