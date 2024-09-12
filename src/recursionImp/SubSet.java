package recursionImp;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);

        ans.removeIf(List::isEmpty);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer  = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr){
            int size = outer.size();

            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
