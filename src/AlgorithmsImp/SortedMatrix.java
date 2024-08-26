package AlgorithmsImp;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.toString(search(arr,10)));
    }

    //search in the row provided between the col provided
    static int[] binarySearch(int[][] matrix, int row , int cstart, int cend , int target ){

        while(cstart <= cend){

            int mid = cstart + (cend - cstart)/2;

            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }

            if(matrix[row][mid] < target){
                cstart = mid + 1;
            }
            else {
                cend = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){

        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix,0,0,cols - 1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = cols / 2;

        // run the loop till two are remaining

        while (rStart < (rEnd - 1)){

            int rmid = rStart + (rEnd - rStart) / 2;

            if(matrix[rmid][cmid] == target){
                return new int[]{rmid,cmid};
            }

            if(matrix[rmid][cmid] > target){
                rEnd = rmid;
            }
            else {
                rStart = rmid;
            }
        }

        //now we have two rows

        if(matrix[rStart][cmid] == target){
            return new int[] {rStart,cmid};
        }

        if (matrix[rStart + 1][cmid] == target){
            return new int[] {rStart + 1, cmid};
        }

        //Deciding which half
            
        if (target <= matrix[rStart][cmid - 1]) {
            return binarySearch(matrix,rStart,0,cmid - 1,target);
        }
        if (target >= matrix[rStart][cmid + 1] && matrix[rStart][cols - 1] >= target) {
            return binarySearch(matrix,rStart,cmid + 1,cols - 1,target);
        }
        if (target <= matrix[rStart + 1][cmid - 1]) {
            return binarySearch(matrix,rStart + 1,0,cmid - 1,target);
        }
        else {
            return binarySearch(matrix,rStart + 1,cmid + 1,cols - 1,target);
        }

    }
}
