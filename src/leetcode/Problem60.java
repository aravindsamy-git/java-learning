package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Problem60 {
    public static void main(String[] args) {
        System.out.println(getPermutation(9,15));
    }

    public static String getPermutationM(int n, int k) {
        String p = createNumber(n);
        ArrayList<String> permutation = permutationList("",p);
        ArrayList<Integer> numberList = convertAndSort(permutation);

        System.out.println(numberList);

        return String.valueOf(numberList.get(k - 1));
    }

    public static String createNumber(int n) {
        StringBuilder numStr = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            numStr.append(i);
        }

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
            String s = p.substring(i);
            ans.addAll(permutationList(f + ch + s,up.substring(1)));
        }

        return ans;
    }

    public static ArrayList<Integer> convertAndSort(ArrayList<String> stringList) {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (String str : stringList) {
            numberList.add(Integer.parseInt(str));
        }

        Collections.sort(numberList);

        return numberList;
    }

    public static String getPermutation(int n, int k) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k--;

        StringBuilder result = new StringBuilder();

        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial *= i;
        }

        for (int i = 0; i < n; i++) {
            int index = k / factorial;
            result.append(numbers.get(index));
            numbers.remove(index);

            k %= factorial;
            if (i < n - 1) {
                factorial /= (n - 1 - i);
            }
        }

        return result.toString();
    }
}