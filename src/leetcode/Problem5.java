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


}
