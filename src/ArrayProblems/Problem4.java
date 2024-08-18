package ArrayProblems;

public class Problem4 {
	
	public int[] FindTwoNumber(int[] nums ,int  target) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1 ; j < nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					return new int[] {nums[i],nums[j]};
				}
			}
		}
		
		return new int[]{};
	}

	public static void main(String[] args) {
		Problem4 solution = new Problem4();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.FindTwoNumber(nums, target);
        if (result.length > 0) {
            System.out.println("Numbers found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No numbers found.");
        }
	}

}
