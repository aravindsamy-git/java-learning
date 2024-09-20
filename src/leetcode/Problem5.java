package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem5 {

    public static void main(String[] args) {
        String[] list = getAllSubstring("babad");

        for (int i = list.length - 1; i > 0; i--) {
            if (checkPalindrom(list[i])){
                System.out.println(list[i]);
                break;
            }
        }
    }

    public static String[] getAllSubstring(String s){
        ArrayList<String> list = new ArrayList<>();

        for (int length = 1; length <= s.length(); length++) {
            for (int i = 0; i <= s.length() - length; i++) {
                list.add(s.substring(i, i + length));
            }
        }

        String[] substringsArray = list.toArray(new String[0]);

        return substringsArray;

    }

    public static boolean checkPalindrom(String s){

        for (int i = 0; i < s.length()/2; i++) {

            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if(start != end){
                return false;
            }
        }

        return true;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
