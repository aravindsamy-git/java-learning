package leetcode;

import java.util.ArrayList;

public class Problem17 {

    // Array of string mappings starting from digit 2
    static String[] keypad = {
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public static void main(String[] args) {
        System.out.println(pad("","23"));
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        digit = digit - 2;

        String letters = keypad[digit];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(pad(p + ch, up.substring(1)));
        }

        return list;
    }
}
