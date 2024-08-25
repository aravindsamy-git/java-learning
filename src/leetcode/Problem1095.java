package leetcode;

interface MountainArray {
    int get(int index);
    int length();
}

public class Problem1095 {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);

        int leftIndex = binarySearch(mountainArr, target, 0, peak, true);

        int rightIndex = binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);

        if (leftIndex == -1 && rightIndex == -1) {
            return -1;
        }

        if (leftIndex == -1) {
            return rightIndex;
        }

        if (rightIndex == -1) {
            return leftIndex;
        }

        return Math.min(leftIndex, rightIndex);
    }

    private int findPeak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAscending) {
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                result = mid;
                if (isAscending) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if ((isAscending && midValue < target) || (!isAscending && midValue > target)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return result;
    }
}
