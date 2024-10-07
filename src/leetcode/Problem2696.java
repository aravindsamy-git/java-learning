package leetcode;

public class Problem2696 {


    public static int minLength(String s) {

        String current = s;

        while (current.contains("AB") || current.contains("CD")) {
            current = current.replace("AB", "");  // Remove first substring
            current = current.replace("CD", "");  // Remove second substring
        }

        return current.length();

    }
}
