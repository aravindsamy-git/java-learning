package leetcode;

public class Problem28 {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) {
            return 0;
        }

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
