package ArrayProblems;

public class Problem8 {

    public static void main(String[] args) {

        int [] arr = {12,345,2,6};
        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] nums){
        int count = 0;

        for (int num : nums){
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even (int num){
        int numberofDigits = digits(num);
        return numberofDigits % 2 == 0;
    }

    static int digits(int num){
        return (int)Math.floor(Math.log10(num)) + 1;
    }
}
