package AlgorithmsImp;

public class BinarySearchImp {

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,22,34,45,56,73};
        int target = 56;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
