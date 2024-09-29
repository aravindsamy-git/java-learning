package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Problem60 {
    public static void main(String[] args) {
        System.out.println(getPermutation(4,9));
    }

    public static String getPermutation(int n, int k) {
        String p = createNumber(n);
        ArrayList<String> permutation = permutationList("",p);
        ArrayList<Integer> numberList = convertAndSort(permutation);

        return String.valueOf(numberList.get(k - 1));
    }

    public static String createNumber(int n) {
        StringBuilder numStr = new StringBuilder();

        // Append numbers from 1 to n to the StringBuilder
        for (int i = 1; i <= n; i++) {
            numStr.append(i);
        }

        // Convert the resulting string to an integer
        return numStr.toString();
    }

    static ArrayList<String> permutationList(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationList(f + ch + s,up.substring(1)));
        }

        return ans;
    }

    public static ArrayList<Integer> convertAndSort(ArrayList<String> stringList) {
        ArrayList<Integer> numberList = new ArrayList<>();

        // Convert each String to an Integer and add to numberList
        for (String str : stringList) {
            numberList.add(Integer.parseInt(str));
        }

        // Sort the list of integers
        Collections.sort(numberList);

        return numberList;
    }
}