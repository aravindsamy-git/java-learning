package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem46 {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> permuatationList (List<Integer> p , List<Integer> up ) {

        if (up.isEmpty()){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p));
            return result;
        }

        int current = up.get(0);

        List<List<Integer>> permutations = new ArrayList<>();

        for (int i = 0; i < p.size(); i++) {
            List<Integer> newProcessed = new ArrayList<>(p);
            newProcessed.add(i, current);

            List<Integer> newUnprocessed = new ArrayList<>(p);
            newUnprocessed.remove(0);

            permutations.addAll(permuatationList(newProcessed, newUnprocessed));
        }

        return permutations;
    }
}
