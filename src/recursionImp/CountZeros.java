package recursionImp;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(30401));
    }

    static int countZeros(int n){
        return helper(n,0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int digit = n % 10;

        if (digit == 0) {
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
}
