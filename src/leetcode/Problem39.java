package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    public static void findCombinations(int[] candidates, int target, List<List<Integer>> result, List<Integer> currentCombination, int start){

        if(target == 0){
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] > target){
                continue;
            }

            currentCombination.add(candidates[i]);

            findCombinations(candidates,(target - candidates[i]),result,currentCombination,i);

            currentCombination.remove(candidates[i]);
        }
    }
}
