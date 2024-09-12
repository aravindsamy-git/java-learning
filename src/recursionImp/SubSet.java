package recursionImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subset(arr);

        ans.removeIf(List::isEmpty);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer  = new ArrayList<>();

        Arrays.sort(arr);
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++){

            start = 0;

            if (i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }

            end = outer.size() - 1;

            int size = outer.size();

            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
