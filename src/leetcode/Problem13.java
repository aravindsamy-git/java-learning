package leetcode;

public class Problem13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int value = 0;
        int i = 0;

        while (i < s.length()) {
            char current = s.charAt(i);

            if (current == 'M') {
                value += 1000;
                i++;
            } else if (current == 'D') {
                value += 500;
                i++;
            } else if (current == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    value += 400;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    value += 900;
                    i += 2;
                } else {
                    value += 100;
                    i++;
                }
            } else if (current == 'L') {
                value += 50;
                i++;
            } else if (current == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    value += 40;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    value += 90;
                    i += 2;
                } else {
                    value += 10;
                    i++;
                }
            } else if (current == 'V') {
                value += 5;
                i++;
            } else if (current == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    value += 4;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    value += 9;
                    i += 2;
                } else {
                    value += 1;
                    i++;
                }
            }
        }

        return value;
    }
}
