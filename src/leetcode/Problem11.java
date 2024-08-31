package leetcode;

public class Problem11 {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int minHeight = Math.min(height[left], height[right]);
        int maxArea = 0;

        while (right > left) {
            maxArea = Math.max(maxArea, (right - left) * minHeight);

            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;

            minHeight = Math.min(height[left], height[right]);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water that can be contained: " + maxArea(height));
    }
}
