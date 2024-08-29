package leetcode;

public class Problem14 {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        int index = 0;

        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        while (index < minLength) {
            char currentChar = strs[0].charAt(index);

            int i = 1;
            while (i < strs.length) {
                if (strs[i].charAt(index) != currentChar) {
                    return prefix.toString();
                }
                i++;
            }

            prefix.append(currentChar);
            index++;
        }

        return prefix.toString();
    }
}
