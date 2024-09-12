package recursionImp;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseqArray("","abc"));
    }

    static void subseq(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }

    static ArrayList<String> subseqArray(String p, String up){

        if(up.isEmpty()){
            if(p.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                return list;
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        }

        char ch = up.charAt(0);

        ArrayList<String> Left = subseqArray(p+ch,up.substring(1));
        ArrayList<String> Right =  subseqArray(p,up.substring(1));

        Left.addAll(Right);
        return Left;
    }

}
