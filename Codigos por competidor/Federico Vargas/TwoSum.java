package Problemas.Leetcode;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] res_index = new int[2];
		int sum = 0;
		int first;
		int second;
			
		
		 principal: while (true) {
			//First
			for (int i = 0; i < nums.length; i++) {
				first = nums[i];
				
				//Second
				for (int j = i+1; j < nums.length; j++) {
					second = nums[j];
					
					sum = first+second;
					if(sum == target) {
						
						res_index[0] = i;
						res_index[1] = j;
						
						break principal;
					}	
					
				}
			}
		}

		return res_index;
		
		
	}
	
	
}
