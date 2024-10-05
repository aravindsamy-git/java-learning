package leetcode;

import java.util.ArrayList;

public class Problem567 {

    public static void main(String[] args) {
        String a = "ab";
        String b = "eidboaoo";

        ArrayList<String> list = permutationList("",a);
        System.out.println(ispersent(list,b));
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

    static boolean ispersent(ArrayList<String> list,String s2){
        for (int i = 0; i < list.size(); i++) {
            if (s2.contains(list.get(i))){
                return true;
            }
        }
        return false;
    }
}
