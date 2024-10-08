package AlgorithmsImp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{10,25,35,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 25;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] search(int[][] matrix, int target){

        int r = 0;
        int c = matrix.length - 1 ;

        while (r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }

            if(matrix[r][c] > target){
                c--;
            }

            if(matrix[r][c] < target){
                r++;
            }
        }

        return new int[] {-1,-1};
    }
}
