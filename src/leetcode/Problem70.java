package leetcode;

public class Problem70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

    public static int climbStairs(int target){
        if(target == 0){
            return 1;
        }
        int count = 0;
        if(target >= 2){
            count = count + climbStairs(target - 2);
        }
        if (target >= 1){
            count = count + climbStairs(target - 1);
        }
        return count;
    }
}
