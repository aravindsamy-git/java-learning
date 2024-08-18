package ArrayProblems;

public class Problem3 {
	
	public int FindMax(int [] nums) {
		
		int max = Integer.MIN_VALUE;
		
		for(int num: nums) {
			if(num > max) {
				max = num;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {

		Problem3 problem = new Problem3();
		
		int [] nums1 = {1, 3, 5, 7, 9};
		System.out.println(problem.FindMax(nums1));
		
		int[] nums2 = {-10, -5, -3, -1};
        System.out.println(problem.FindMax(nums2));
	}

}
