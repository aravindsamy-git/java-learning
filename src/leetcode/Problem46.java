package leetcode;
import java.util.List;
import java.util.ArrayList;

public class Problem46 {

    public static void main(String[] args) {
        int current = 1;

        // Create a mutable list
        List<Integer> list = new ArrayList<>(List.of(2, 3, 4));

        for (int i = 0; i < list.size(); i++) {
            list.add(i, current); // Add 'current' at position 'i'
            System.out.println(list);
            list.remove(i); // Remove 'current' from position 'i' to restore original state
        }
    }

    public static List<List<Integer>> permuatationList (List<Integer> p , List<Integer> up ) {

        if (up.isEmpty()){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(p));
            return result;
        }

        int current = up.get(0);

        for (int i = 0; i < p.size(); i++) {
            p.add(i,current);
        }

        return new ArrayList<>();
    }
}
