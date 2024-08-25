package AlgorithmsImp;

public class FloorProblem {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 10, 22, 34, 45, 56, 73};
        int target = 3;
        int index = celling(arr, target);
        System.out.println(arr[index]);
    }

    static int celling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return end;
    }
}
