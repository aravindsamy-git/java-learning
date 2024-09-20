package leetcode;

public class Problem214 {

    public static String shortestPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        StringBuilder S = new StringBuilder(s);

        while (i < j){

            if (S.charAt(i) == S.charAt(j)){
                i++;
                j--;
                System.out.println("same");
                continue;
            }

            S.insert(i,S.charAt(j));
            i++;
        }

        return new String(S);
    }

}
