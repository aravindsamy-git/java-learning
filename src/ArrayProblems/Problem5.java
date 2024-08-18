package ArrayProblems;

public class Problem5 {
	
	public int findMajority(int[] nums) {
	    int majorityElement = nums[0];
	    int count = 1;

	    for (int i = 1; i < nums.length; i++) {
	        if (count == 0) {
	            majorityElement = nums[i];
	            count = 1;
	        } else if (nums[i] == majorityElement) {
	            count++;
	        } else {
	            count--;
	        }
	    }

	    count = 0;
	    for (int num : nums) {
	        if (num == majorityElement) {
	            count++;
	        }
	    }

	    if (count > nums.length / 2) {
	        return majorityElement;
	    }

	    throw new IllegalArgumentException("No majority element found");
	}

	public static void main(String[] args) {
	    Problem5 problem = new Problem5();

	    int[] nums1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
	    try {
	        System.out.println("Majority Element: " + problem.findMajority(nums1));
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }

	    int[] nums2 = {1, 2, 3, 4, 5, 1};
	    try {
	        System.out.println("Majority Element: " + problem.findMajority(nums2));
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}

}
